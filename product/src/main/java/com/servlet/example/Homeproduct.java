package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home product
 */
public class Homeproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Homeproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "harikamarella", "Srinivasareddy@1967");
			PreparedStatement ps = con.prepareStatement("select * from product where ProductID=?");
			ps.setInt(1, id);
			ResultSet res = ps.executeQuery();
			if(res.next())
			{
				pw.println("id of the product : "+res.getInt(1)+"<br>product : "+res.getString(2));
			}
			else
			{
				pw.println("<br> Please enter the correct id !!");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		response.setContentType("text/html");
		RequestDispatcher req = request.getRequestDispatcher("product.html");
		req.include(request, response);

}
}

