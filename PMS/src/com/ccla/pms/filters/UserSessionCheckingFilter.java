package com.ccla.pms.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter( "/*" )
public class UserSessionCheckingFilter extends HttpFilter implements Filter {
       
   
   
	private static final long serialVersionUID = 1L;

	
	
	public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		HttpSession ses=null;
		RequestDispatcher rd=null;
		//get Session
		ses = req.getSession(false);
		if(ses!=null && ses.getAttribute("logins")!=null)
	          	chain.doFilter(req, res);
		else {
			req.setAttribute("errMsg", "Session expired please login again");
			//foward to login.jsp
			rd=req.getRequestDispatcher("/login.jsp");
			rd.forward(req,res);
	}

	}

	
	

}
