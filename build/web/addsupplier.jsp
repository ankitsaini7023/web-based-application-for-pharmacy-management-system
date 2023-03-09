


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       <style>
        #wave{
         background: #1c92d2;  /* fallback for old browsers */
background: -webkit-linear-gradient(to right, #f2fcfe, #1c92d2);  /* Chrome 10-25, Safari 5.1-6 */
background: linear-gradient(to right, #f2fcfe, #1c92d2); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
} 
    </style>
    </head>
    <body id="wave">
         <div class="container">
              <h2 style="text-align: center">Add Supplier</h2>
        <form>
            <div class="form-group">
                 <label style="font-weight: bold;" >Id:</label>
            <input required="" class="form-control" type="text" placeholder="enter supplie id" name="sid" >
            </div>
            <div class="form-group">
                 <label style="font-weight: bold;" >Name:</label>
            <input required="" class="form-control" type="text" placeholder="enter supplier name" name="sname">
            </div>
            <div class="form-group">
                 <label style="font-weight: bold;" >Address:</label>
            <input required="" class="form-control" type="text" placeholder="enter supplier address" name="saddress">
            </div>
            
            <div class="form-group">
                 <label style="font-weight: bold;" >Phone:</label>
            <input required="" class="form-control" type="text" placeholder="enter supplier phoneno." name="sphoneno">
            </div>
            <div class="form-group">
                 <label style="font-weight: bold;" >Email:</label>
            <input required="" class="form-control" type="text" placeholder="enter supplier email id" name="semail">
            </div>
            <input type="submit" class="btn btn-outline-success" value="Add Supplier" name="btn">
     
        </form>
         </div>
         <div style="text-align: center">
             <a href="viewallsupplier.jsp" class="btn btn-outline-info">View Suppliers</a>
        <a href="SellerHomepage.jsp" class="btn btn-outline-success">Home</a>
        </div>
        
        <%
          if(request.getParameter("btn")!=null){
              String supplier_id = request.getParameter("sid");
              String supplier_name = request.getParameter("sname");
              String supplier_address = request.getParameter("saddress");
              String supplier_phoneno = request.getParameter("sphoneno");
              String supplier_emailid = request.getParameter("semail");
               try{
        String url="jdbc:mysql:///managementsystem?useSSL=false";
        String unm="root";
        String pass="040920ankit";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, unm, pass);
        Statement  statement = connection.createStatement();
        String query="insert into supplier values("+supplier_id+",'"+supplier_name+"','"+supplier_address+"','"+supplier_phoneno+"','"+supplier_emailid+"')";
        statement.execute(query);
    
          
         }catch(Exception ex){
                  System.out.println(ex);
              }
          }
      %>
    </body>
</html>

