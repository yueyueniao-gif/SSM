package com_mapper;

import java.util.List;

import com_pojo.User;

public interface Loginmapper {
	User selectone(User user);
	int insRegister(User user);
	User selectname(User user);
}
