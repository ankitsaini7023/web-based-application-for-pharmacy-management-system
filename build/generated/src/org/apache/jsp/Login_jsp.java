package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Login</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t");

		String uid1=request.getParameter("userid");
		String pass1=request.getParameter("password");
		String u2=request.getParameter("utype");
		int u=Integer.parseInt(u2);

		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("currentuser", uid1);

		ResultSet rs=null;
		Connection conn=null;
		PreparedStatement ps=null;

		String query2="SELECT sid,pass from Seller WHERE sid=?";
		String query1="SELECT uid,pass from customer WHERE uid=?";
		try{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/drugdatabase","root","040920ankit");
		if(u==2)
		{ 
			ps=conn.prepareStatement(query2);
			ps.setString(1,uid1);
		}	
		else if(u==1)
		{ 
			ps=conn.prepareStatement(query1);
			ps.setString(1,uid1);
		}
		rs=ps.executeQuery();
		if(rs.next())
		{
			if((rs.getString(2)).equals(pass1))
			{
				if(u==1) 
					response.sendRedirect("Homepage.jsp");
				else 
					if(u==2) 
						response.sendRedirect("SellerHomepage.jsp");
			}
			else
			{
			response.sendRedirect("LoginError1.html");
			}
		}
		else
			response.sendRedirect("LoginError2.html");
	}
	catch(Exception e){ 
		out.println(e);
	}
	finally {
  	  	try { if (rs != null) rs.close(); } catch (Exception e) {};
    	try { if (ps != null) ps.close(); } catch (Exception e) {};
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
