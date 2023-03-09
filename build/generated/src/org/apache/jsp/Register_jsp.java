package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t");

		String fname1=request.getParameter("fname");
		String lname1=request.getParameter("lname");
		String email1=request.getParameter("email");
		String phno1=request.getParameter("phno");
		String uid1=request.getParameter("uid");
		long phno2=Long.parseLong(phno1);
		String address1=request.getParameter("address");
		String pass1=request.getParameter("pass1");
		String pass2=request.getParameter("pass2");

		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		Connection conn=null;
		ResultSet rs=null;
	
		String query1="SELECT uid from customer WHERE uid=?";
		String query2="INSERT INTO customer(uid,pass,fname,lname,email,address,phno) VALUES(?,?,?,?,?,?,?)";

		try{		
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/drugdatabase","root","040920ankit");
			ps1=conn.prepareStatement(query1);
			ps1.setString(1,uid1);
			rs=ps1.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("RegisterError1.html");
			}
			else
			{
				if(pass1.equals(pass2))
				{
					ps2=conn.prepareStatement(query2);
					ps2.setString(1,uid1);
					ps2.setString(2,pass1);
					ps2.setString(3,fname1);
					ps2.setString(4,lname1);
					ps2.setString(5,email1);
					ps2.setString(6,address1);
					ps2.setLong(7,phno2);
					int i=ps2.executeUpdate();
					response.sendRedirect("Login.html");
				}
				else
					response.sendRedirect("RegisterError2.html");
		}
}
catch(Exception e){
	out.println(e);
}
finally{
		 try { if (rs != null) rs.close(); } catch (Exception e) {};
	    try { if (ps1 != null) ps1.close(); } catch (Exception e) {};
	    try { if (ps2 != null) ps2.close(); } catch (Exception e) {};
	    try { if (conn != null) conn.close(); } catch (Exception e) {};
}

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
