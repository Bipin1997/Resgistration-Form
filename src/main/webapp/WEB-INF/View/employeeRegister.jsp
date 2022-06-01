<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div align = "center"> 
    <h1>Employee Register Form</h1>
    <form action="<%= request.getContextPath() %>/Register" method ="post">
      <table style = "width : 90">
        <tr>
          <td>First Name</td>
           <td><input type = "text" name ="first_name"/></td>
         </tr>
         <tr>
          <td>Last Name</td>
           <td><input type = "text" name ="last_name"/></td>
         </tr>
         <tr>
          <td>User Name</td>
           <td><input type = "text" name ="user_name"/></td>
         </tr>
         <tr>
          <td>Password</td>
           <td><input type = "text" name ="password"/></td>
         </tr>
          <tr>
          <td>Address</td>
           <td><input type = "text" name ="address"/></td>
         </tr>
          <tr>
          <td>Contact No</td>
           <td><input type = "text" name ="contact"/></td>
         </tr>
       </table>
       <input type = "submit"  value = "Submit">
    </form>
    </div>
</body>
</html>