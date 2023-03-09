<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateProduct JSP</title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%@ page import="javax.sql.*" %>
	<%@ page import="java.lang.Object.*" %>
	<%
		

		String prname=request.getParameter("prname");
		String prid=request.getParameter("prid");
		String mfname=request.getParameter("mfname");
		String mdate=request.getParameter("mdate");
		String edate=request.getParameter("edate");
		String price1=request.getParameter("price");
		//String quantity1=request.getParameter("quantity");
		int price=Integer.parseInt(price1);
		//int quantity=Integer.parseInt(quantity1);

		String qry="UPDATE product SET pname=? ,manufacturer=?,mfg=?,exp=?,price=? where pid='"+prid+"'";
		
//                String query2="insert into product(pid,pname,manufacturer,mfg,exp,price) values (?,?,?,?,?,?)";
//		String query3="insert into inventory(pid,pname,sid,quantity) values (?,?,?,?)";

		ResultSet rs=null;
		Connection conn=null;
		PreparedStatement ps1=null;
		//PreparedStatement ps2=null;
		//PreparedStatement ps3=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql:///drugdatabase?useSSL=false","root","040920ankit");
			ps1=conn.prepareStatement(qry);
			ps1.setString(1,prname);
                        ps1.setString(2,mfname);
                        ps1.setString(3,mdate);
                        ps1.setString(4,edate);
                        ps1.setString(5,price1);
			int i=ps1.executeUpdate();
			if(i>0)
			{
				%>
                               <script>
                                   alert("Update Product Successfully!!");
                                   window.open('AddInventory.jsp','_self');
                                   </script>
                              <%
			}
			else
			{
				%>
                                <script>
                                    alert("Try Again!!");
                                    window.open('updateproduct.jsp','_self');
                                    </script>
                                <%
			}
	}
	catch(Exception e)
		{
		//response.sendRedirect("AddProductError2.html");
                    System.out.println(e);
		}
//	finally {
//		    try { if (rs != null) rs.close(); } catch (Exception e) {};
//		    try { if (ps1 != null) ps1.close(); } catch (Exception e) {};
//		    try { if (ps2 != null) ps2.close(); } catch (Exception e) {};
//		    try { if (ps3 != null) ps3.close(); } catch (Exception e) {};
//		    try { if (conn != null) conn.close(); } catch (Exception e) {};
//	}
%>
</body>
</html>