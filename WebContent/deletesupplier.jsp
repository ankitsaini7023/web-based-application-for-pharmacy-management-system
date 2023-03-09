
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>delete supplier</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
      
    </head>
    <body>
          <h2 style="text-align: center">Delete Supplier</h2>
        <div class="container">
        <form>
              <div class="form-group">
                 <label style="font-weight: bold;" >Id:</label>
            <input  required="" class="form-control" type="number" placeholder="enter supplier id" name="sid">
              </div>
            <input type="submit" class="btn btn-outline-danger" value="Delete" name="btn">
        </form>
            </div>
          <%
            if(request.getParameter("btn")!=null){
            
                int sid = Integer.parseInt(request.getParameter("sid"));
                 try{
        String url="jdbc:mysql:///managementsystem?useSSL=false";
        String unm="root";
        String pass="040920ankit";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, unm, pass);
        Statement  statement = connection.createStatement();
        String query="delete from supplier where sid = "+sid+" ";
        statement.execute(query);
    
          
         }catch(Exception ex){
                  System.out.println(ex);
              }
          }
          %>
           <div style="text-align: center">
             <a href="addsupplier.jsp" class="btn btn-outline-info">Add Suppliers</a>
              <a href="viewallsupplier.jsp" class="btn btn-outline-danger">View Suppliers</a>
        <a href="SellerHomepage.jsp" class="btn btn-outline-success">Home</a>
        </div>    
    </body>
</html>

