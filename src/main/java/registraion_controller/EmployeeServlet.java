package registraion_controller;


import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Registration_Model.Employee;
import Registration_dao.Employee_dao;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/Register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private Employee_dao employeeDao = new Employee_dao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/View/employeeRegister.jsp");
		dispatcher.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

String first_name = request.getParameter("first_name");
		String last_name  = request.getParameter("last_name");
		String user_name  = request.getParameter("user_name");
		String password   = request.getParameter("password");
	    String address    = request.getParameter("address");
	    String contact    = request.getParameter("contact");
	    
	    Employee employee = new Employee();
	    employee.setFirst_name(first_name);
	    employee.setLast_name(last_name);
	    employee.setUser_name(user_name);
	    employee.setPassword(password);
	    employee.setAddress(address);
	    employee.setContact(contact);
	    
	   try {
		employeeDao.registerEmployee(employee);
	       } catch (ClassNotFoundException e) {
		      e.printStackTrace();
	           }
	   
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/View/employeeDetail.jsp");
		dispatcher.forward(request, response);
	}

}
