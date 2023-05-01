package servlet.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	
 
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<body><h1> Today is"+new Date());
		pw.println("</h1><h2>temperature converter</h2>");
		pw.println("<table border='1'><tr>" );
		pw.println("<th>fahrenheit</th><th>celsius</th></tr>");
		
		double fah,cen;
		for(int i=10; i<=100;i=i+10 )
		{
			fah=i;
			cen=(fah-32)*5.0/9.0;
		
			pw.println("<tr><td>" + fah + "</td><td>" + cen + "</td></tr>");
		}
			pw.println("</table></body>");
			pw.close();
		}
	}


