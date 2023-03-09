
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
<link rel="stylesheet" href="css/AddProduct.css">
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
<%
    String idx = (String)request.getParameter("idx");
    String temp="";
  
    String id="ak",pname="", manufacturer="",mfg="",exp=""; 
    int price=0;
    try{
        String pid = request.getParameter("pid");
	String url="jdbc:mysql:///drugdatabase?useSSL=false";
        String unm="root";
        String pass="040920ankit";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, unm, pass);
        Statement stmt = connection.createStatement();
                        String query="select * from product";  
                        //String qry="SELECT * FROM `products` WHERE uemail="+"'"+(String)session.getAttribute("email")+"'";
                        //PreparedStatement p=null;
                        //p=connection.prepareStatement(query);
                        //p.setString(1,idx);
                        
                        

                        ResultSet rs = stmt.executeQuery(query);
                        
                        
                        
                        
                        while(rs.next() ){
                            temp=rs.getString("pid");
                            
                            
                            if(temp.equals(idx))
             
                            {
                                  id= rs.getString("pid");
                                         pname= rs.getString("pname");
                                         manufacturer= rs.getString("manufacturer");
                                         mfg =  rs.getString("mfg");
                                         exp =  rs.getString("exp");
                                         price= rs.getInt("price");
                            }
                                       
                                         

                        }
    } 
    catch(Exception e){
        System.out.println(e);
    }
    
 
                        %>
<div class="active">
	<div class="filler"></div>
		<h2>Update product</h2>
		<form action="updateDAO.jsp" method="post">
			<div class="bigcard">
				<div class="bigcard1">
                                    
                                    <h3>Product Name</h3><input type='text' name='prname' value='<%=pname %>'   required>
					<h3>Product ID</h3><input type='text' name='prid' value='<%=id %>' readonly>
					<h3>Update Manufacturer Name</h3><input type='text' name='mfname' value='<%=manufacturer %>'  required>
					<h3>Update Manufacture Date</h3><input type="date" name="mdate" value='<%=mfg %>' placeholder="YYYY-MM-DD" onkeypress="return event.charCode>= 48 && event.charCode<= 57 || event.charCode==45" required>
					<h3>Update Expiry Date</h3><input type="date" name="edate" value='<%=exp %>' placeholder="YYYY-MM-DD" onkeypress="return ((event.charCode>= 48 && event.charCode<= 57) || event.charCode==45)" required>
    		  	</div>
  		    	<div class="bigcard2">
   					 <!--<h3>Quantity</h3><input type="number" name="quantity"  onkeypress="return event.charCode>= 48 && event.charCode<= 57" required>-->
   					 <h3>Price</h3><input type="text" name="price" value='<%=price %>' onkeypress="return event.charCode>= 48 && event.charCode<= 57" required>
   					 <p></p>
 					 <input type="submit" value="update">
				</div>
			</div>
		</form>
	</div>
                                         
                                        
                                        
                                    
                     
</body>
</html>