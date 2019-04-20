package com.ig.ssm.service;

import com.ig.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService  extends UserDetailsService {

   List<UserInfo>  findAll() throws Exception;
}
