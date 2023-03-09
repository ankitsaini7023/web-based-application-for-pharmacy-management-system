<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Orders</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/Orders.css">
</head>
<body> 
<div class="main">
	<div class="topbar1"></div>
	<div class="topbar2">
		<div class="container1">
			<div class="logout-btn">
				<a href="Logout.jsp">Logout</a>
			</div>
		</div>
	</div>
	<div class="header">
		<div class="container2">
			<div class="navbar">
				<a href="SellerHomepage.jsp">HOME</a>
				<a href="AddProduct.html">ADD</a>
				<a href="AddInventory.jsp">RESTOCK</a>
				<a href="SellerOrders.jsp">INVENTORY</a>
                                <a href="addsupplier.jsp">SUPPLIER DETAILS</a>
			</div>
		</div>
	</div>
	</div>
	<div class="active">
	<%@ page import="java.sql.*" %>
	<%@ page import="javax.sql.*" %>
	<%
	HttpSession httpSession = request.getSession();
    String guid=(String)httpSession.getAttribute("currentuser");
    %>
    <div class="filler"></div>
     <%!int price; String pid,pname , manufacturer , mfg , exp; %> 
    <%
    
	try{
		 String url="jdbc:mysql:///drugdatabase?useSSL=false";
        String unm="root";
        String pass="040920ankit";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, unm, pass);
        Statement  statement = connection.createStatement();

                  
                        String query="select * from product";
                        ResultSet  rs = statement.executeQuery(query);
		%><div class="filler2"></div>
		<table class="tables">
			<tr>
    			            <th>Product ID</th>
                                    <th>Product Name</th>
                                    <th>Manufacturer Name</th>
                                    <th>mfg Date</th>
                                    <th>Expiry Date</th>
                                    <th>Price</th>
                                    <th>Action</th>
  			</tr>
		<%while(rs.next()) 
		{
                                       
                                         pid= rs.getString("pid");
                                         pname= rs.getString("pname");
                                         manufacturer= rs.getString("manufacturer");
                                         mfg =  rs.getString("mfg");
                                         exp =  rs.getString("exp");
                                         price= rs.getInt("price");  
                                         
                                         //session.setAttribute("temp",pid);
                                          
		%>
  		
  			<tr>
    			            <td><%=pid %></td>
                                    <td><%=pname %></td>
                                    <td><%=manufacturer %></td>
                                    <td><%=mfg %></td>
                                    <td><%=exp %></td>
                                    <td><%=price %></td>
                                    <td>
                                        <a href="updateproduct.jsp?idx=<%=rs.getString("pid")%>" class="btn btn-outline-primary">Update</a>   
                                        
                                        
                                           
                                            <a href="deleteproduct.jsp" class="btn btn-outline-danger">Delete</a>
                                    </td>
  			</tr>
  			
		<%
	}
		%>
		</table>
		</div>
		<% 
	}
	catch(Exception e)
	{
		out.println("error: "+e);
	}
      
        
	%>
</body>
</html>
