package com_interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception {
		String uri=req.getRequestURI();
		System.out.println(uri);
		if(uri.equals("/liaoliao/Logincontroller")||uri.equals("/liaoliao/registercontroller")) {
			return true;
		}
		else {
		Object attribute = req.getSession().getAttribute("user");
		if(attribute!=null)
		{
			return true;
		}
		else
		resp.sendRedirect("/liaoliao/login.jsp");
		return false;
	}
	}
}
