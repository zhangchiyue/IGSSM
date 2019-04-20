package com.ig.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.ig.ssm.dao.IOrdersDao;
import com.ig.ssm.domain.Orders;
import com.ig.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll() throws Exception {
        //参数pageNum是页码值 参数pageSize代表每页显示条数
        PageHelper.startPage(1,5);//这条语句必须在查询方法之前
        return ordersDao.findAll();
    }

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {

        return ordersDao.findById(ordersId);
    }
}
