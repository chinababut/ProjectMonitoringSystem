package com.test.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tempuri.PassBookServicesQRSoap;
import org.tempuri.PassBookServicesQRSoapStub;
import org.tempuri.Result;

/**
 * Servlet implementation class FrontControler
 */
@WebServlet("/FrontControler")
public class FrontControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int dcode =Integer.parseInt(req.getParameter("dcode"));
		int mcode =Integer.parseInt(req.getParameter("mcode"));
		int vcode =Integer.parseInt(req.getParameter("vcode"));
		String khata = req.getParameter("khata");
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");
		PassBookServicesQRSoap s = new PassBookServicesQRSoapStub();
				Result result = s.getPattadarDetails_ByKhataNo(dcode,mcode,vcode,khata,uid,pwd);
				RequestDispatcher rd = null;
				
				rd = req.getRequestDispatcher("/Result.jsp");
				rd.forward(req,res);
				
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
