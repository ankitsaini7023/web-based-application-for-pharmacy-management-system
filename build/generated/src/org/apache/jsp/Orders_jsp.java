package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class Orders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Orders</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Orders.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("\t<div class=\"topbar1\"></div>\n");
      out.write("\t<div class=\"topbar2\">\n");
      out.write("\t\t<div class=\"container1\">\n");
      out.write("\t\t\t<div class=\"logout-btn\">\n");
      out.write("\t\t\t\t<a href=\"Logout.jsp\">Logout</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"container2\">\n");
      out.write("\t\t\t<div class=\"navbar\">\n");
      out.write("\t\t\t\t<a href=\"Homepage.jsp\">HOME</a>\n");
      out.write("\t\t\t\t<a href=\"Buy.jsp\">BUY</a>\n");
      out.write("\t\t\t\t<a href=\"Orders.jsp\">ORDERS</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"active\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t");

	HttpSession httpSession = request.getSession();
    String gid=(String)httpSession.getAttribute("currentuser");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"filler\"></div>\n");
      out.write("    \n");
      out.write("    ");

    int flag=0;
	ResultSet rs=null;
	CallableStatement cs=null;
	java.sql.Connection conn=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/drugdatabase","root","1234");
		cs = conn.prepareCall("call getorders(?)");
		cs.setString(1, gid);
		rs = cs.executeQuery();
		
      out.write("<div class=\"filler2\"></div>\n");
      out.write("\t\t<table class=\"tables\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("    \t\t\t<th>Order ID</th>\n");
      out.write("    \t\t\t<th>Product ID</th>\n");
      out.write("    \t\t\t<th>Price</th>\n");
      out.write("    \t\t\t<th>Quantity</th>\n");
      out.write("    \t\t\t<th>Seller ID</th>\n");
      out.write("    \t\t\t<th>Order Date and Time</th>\n");
      out.write("  \t\t\t</tr>\n");
      out.write("\t\t");
while(rs.next()) 
		{
			
      out.write("\n");
      out.write("\t  \t\t\n");
      out.write("  \t\t\t<tr>\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getInt("oid") );
      out.write("</td>\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getString("pid") );
      out.write("</td>\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getInt("price") );
      out.write("</td>\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getInt("quantity") );
      out.write("</td>\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getString("sid") );
      out.write("</td>\n");
      out.write("    \t\t\t<td>");
      out.print(rs.getTimestamp("orderdatetime") );
      out.write("\n");
      out.write("  \t\t\t</tr>\n");
      out.write("  \t\t\t\n");
      out.write("\t\t");

	}
		
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
 
	}
	catch(Exception e)
	{
		out.println("error: "+e);
	}
		finally {
		    try { if (rs != null) rs.close(); } catch (Exception e) {};
		    try { if (cs != null) cs.close(); } catch (Exception e) {};
		    try { if (conn != null) conn.close(); } catch (Exception e) {};
	}
	
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
