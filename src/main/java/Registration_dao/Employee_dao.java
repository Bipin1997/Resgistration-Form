package Registration_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Registration_Model.Employee;

public class Employee_dao
{
	  public int registerEmployee(Employee employee) throws ClassNotFoundException{
		  String INSERT_USERS_SQL = "INSERT INTO employee" +
	      " (id , first_name, last_name , user_name , password, address, contact) VALUES" + "( ?, ?, ?, ?, ?, ?, ?);";
		  
		  int result = 0;
		  
		  Class.forName("com.mysql.jdbc.Driver");
		  
		  try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");
				  
				  PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			      
			      preparedStatement.setInt(1,1);
                  preparedStatement.setString(2, employee.getFirst_name());
			      preparedStatement.setString(3, employee.getLast_name());
			      preparedStatement.setString(4, employee.getUser_name());
			      preparedStatement.setString(5, employee.getPassword());
			      preparedStatement.setString(6, employee.getAddress());
			      preparedStatement.setString(7, employee.getContact());
			      
			      System.out.println(preparedStatement);
			      result = preparedStatement.executeUpdate();
		  } catch(SQLException e) {
				  e.printStackTrace();
		  }	  
		 return result;
	 }
}
