package com.ccla.pms.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ccla.pms.error.InternalDbProblem;
import com.ccla.pms.servicedeligates.LoginService;
import com.ccla.pms.vo.LogginCheckerVo;


@WebServlet("/LoginCheckerController")
public class LoginCheckerController extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	private LoginService service;
	HttpSession session;
	
    @Override
    public void init() throws ServletException {
    	
    	service = new LoginService();
    	
    	
    
    }   
    

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		LogginCheckerVo vo =null;
		boolean flag = false;
		RequestDispatcher rd = null;
		vo = new LogginCheckerVo();
		
		vo.setUserid(req.getParameter("userId"));
		vo.setPassword(req.getParameter("password"));
		try {
			session=req.getSession();  
			session.setAttribute("logins", vo);
			flag = service.loginValidater(vo);
			if(flag) {
				rd = req.getRequestDispatcher("/Home.jsp");
				rd.forward(req,res);
			}	
			else {
				
				req.setAttribute("errMsg", "invalid Credentials");
				rd = req.getRequestDispatcher("/login.jsp");
				rd.forward(req,res);
			}
			}
			
		catch (InternalDbProblem e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
