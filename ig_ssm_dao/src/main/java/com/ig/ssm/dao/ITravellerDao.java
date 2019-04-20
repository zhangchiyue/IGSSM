package com.ig.ssm.dao;

import com.ig.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITravellerDao {

//select * from traveller where id in (select travellerId from order_traveller where orderId = '5DC6A48DD4E94592AE904930EA866AFA');
//select * from traveller where id = (select travellerId from order_traveller where orderId = '5DC6A48DD4E94592AE904930EA866AFA');
//select * from traveller t,order_traveller o where t.id = o.travellerId and o.orderId = '5DC6A48DD4E94592AE904930EA866AFA';
    @Select("select * from traveller where id in(select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
