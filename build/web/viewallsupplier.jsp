

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
      
    </head>
    <body>
        <h2 style="text-align: center">All suppliers List</h2>
         <%!int sid ; String sname , saddress , sphone , semail; %>      
           <%
              
               
                   try{
                              
        String url="jdbc:mysql:///managementsystem?useSSL=false";
        String unm="root";
        String pass="040920ankit";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, unm, pass);
        Statement  statement = connection.createStatement();

                  
                        String query="select * from supplier";
                        ResultSet  rs = statement.executeQuery(query);
                                
                   
                      %>
                       

                      <div  style="    background: aliceblue;
    font-size: 14px;"><table  class="table">
                            
                                <tr>
                                    <th>SUPPLIER ID</th>
                                    <th>SUPPLIER NAME</th>
                                    <th>SUPPLIER Address</th>
                                    <th>SUPPLIER Phoneno</th>
                                    <th>SUPPLIER EMAILID</th>
                                    
                                   
                                </tr>   
                                <%                      
                      
                      while(rs.next()){
                     
                     sid= rs.getInt("sid");
                     sname= rs.getString("sname");
                     saddress= rs.getString("saddress");
                     sphone =  rs.getString("sphoneno");
                     semail= rs.getString("semail");
                     %>            
                
                                <tr>
               
                                    <td><%=sid %></td>
                                    <td><%=sname %></td>
                                    <td><%=saddress %></td>
                                    <td><%=sphone %></td>
                                    <td><%=semail %></td>
                                   
                                                                 </tr>
         
                        <%}%>
                        </table></div>
                        <% }catch(Exception ex){
                   
                   System.out.println("problem"+ex);
                   }
  
        
        %>  
        <div style="text-align: center">
            <a href="addsupplier.jsp" class="btn btn-outline-info">Add Suppliers</a>
              <a href="deletesupplier.jsp" class="btn btn-outline-danger">Delete Suppliers</a>
        <a href="SellerHomepage.jsp" class="btn btn-outline-success">Home</a>
        </div>                 
       
    </body>
</html>
