package com_service;

import java.util.List;

import com_pojo.User;

public interface Loginservice {
	public User select01(User user);
	public int insert02(User user);
	public User selectbyname(User user);
}
