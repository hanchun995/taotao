package com.taotao.sso.service;

import com.taotao.common.TaotaoResult;
import com.taotao.pojo.TbUser;

public interface UserService {

	TaotaoResult checkData(String content, Integer type);
	
	TaotaoResult createUser(TbUser user) ;
	
	TaotaoResult userLogin(String username, String password);
	
	 TaotaoResult getUserByToken(String token);
	 
	 TaotaoResult logoutByToken(String token);
}