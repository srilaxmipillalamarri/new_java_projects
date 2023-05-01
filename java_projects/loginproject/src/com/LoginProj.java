package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginProj extends HttpServlet {
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public void init(ServletConfig config) throws ServletException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root123");
		} 
		catch (Exception ex) {
			System.out.println(ex);
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String userid = req.getParameter("userid");
		String userpwd = req.getParameter("userpwd");
		String str = "select * from users where userid=? and userpwd=?";

		try {
			pst = con.prepareStatement(str);
			pst.setString(1, userid);
			pst.setString(2, userpwd);

			rs = pst.executeQuery();

			if (rs.next()) {
				RequestDispatcher rd = req.getRequestDispatcher("shop.html");
				rd.forward(req, res);
			} else {
				res.setContentType("text/html");
				PrintWriter pw = res.getWriter();
				pw.println("<p style='color:red'>UserId and passward wrong</p>");
				RequestDispatcher rd = req.getRequestDispatcher("index.html");
				rd.include(req, res);
			}
		}

		catch (SQLException ex) {
			System.out.println(ex);

		}
	}

	public void destroy() {
		try {
			con.close();
		} catch (SQLException ex) {
			System.out.println(ex);

		}
	}
}
