
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
          <h2 style="text-align: center">Delete Product</h2>
        <div class="container">
            <form>
              <div class="form-group">
                 <label style="font-weight: bold;" > Product Id:</label>
            <input  required="" class="form-control" type="text" placeholder="enter Product id" name="pid">
              </div>
            <input type="submit" class="btn btn-outline-danger" value="Delete" name="btn">
        </form>
            </div>
          <%
            if(request.getParameter("btn")!=null){
            
                String pid =request.getParameter("pid");
                 try{
        String url="jdbc:mysql:///drugdatabase?useSSL=false";
        String unm="root";
        String pass="040920ankit";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, unm, pass);
        Statement  statement = connection.createStatement();
        String query="delete from product where pid='"+pid+"' ";
        //int i=statement.executeUpdate("DELETE FROM product pid="+id);
//out.println("Data Deleted Successfully!");
        statement.execute(query);
    
          
         }catch(Exception ex){
                  System.out.println(ex);
              }
          }
          %>
               <div style="text-align: center">
                 <a href="SellerOrders.jsp" class="btn btn-outline-info">Inventory</a>
               </div>
    </body>
</html>

