package com_controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com_pojo.User;
import com_service.Loginservice;
import com_serviceimpl.Loginserviceimpl;

@Controller
public class DemoController {
	/* springmvc容器调用spring容器中内容 */
	@Resource
	private Loginservice loginserviceimpl;

	@RequestMapping("Logincontroller")
	public ModelAndView Login(User user, ModelAndView mv, HttpSession session) {
		User selc = loginserviceimpl.select01(user);
		session.setAttribute("user", "selc");
		if (selc != null) {
			mv.setViewName("/WEB-INF/page/index.jsp");
		} else {
			mv.setViewName("login.jsp");
		}
		return mv;
	}

	@RequestMapping("registercontroller")
	public String Register(User user) {
		if (loginserviceimpl.selectbyname(user) == null) {
			if (loginserviceimpl.insert02(user) == 1)
				return "login.jsp";
			else
				return "register.jsp";
		} else
			return "registerfail.jsp";
	}

	@RequestMapping("{page}")
	public String main(@PathVariable String page) {
		return "/WEB-INF/page/" + page + ".jsp";
	}
}
