package com_serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com_mapper.Loginmapper;
import com_pojo.User;
import com_service.Loginservice;
@Service
public class Loginserviceimpl implements Loginservice{
	@Resource
	private Loginmapper loginmapper;

	@Override
	public User select01(User user) {
		return loginmapper.selectone(user);
	}

	@Override
	public int insert02(User user) {
		return loginmapper.insRegister(user);
	}

	@Override
	public User selectbyname(User user) {
		return loginmapper.selectname(user);
	}
	
}
