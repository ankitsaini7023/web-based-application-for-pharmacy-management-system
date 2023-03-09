package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class addsupplier_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("       <style>\n");
      out.write("        #wave{\n");
      out.write("         background: #1c92d2;  /* fallback for old browsers */\n");
      out.write("background: -webkit-linear-gradient(to right, #f2fcfe, #1c92d2);  /* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("background: linear-gradient(to right, #f2fcfe, #1c92d2); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("} \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"wave\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("              <h2 style=\"text-align: center\">Add Supplier</h2>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                 <label style=\"font-weight: bold;\" >Id:</label>\n");
      out.write("            <input required=\"\" class=\"form-control\" type=\"text\" placeholder=\"enter supplie id\" name=\"sid\" >\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                 <label style=\"font-weight: bold;\" >Name:</label>\n");
      out.write("            <input required=\"\" class=\"form-control\" type=\"text\" placeholder=\"enter supplier name\" name=\"sname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                 <label style=\"font-weight: bold;\" >Address:</label>\n");
      out.write("            <input required=\"\" class=\"form-control\" type=\"text\" placeholder=\"enter supplier address\" name=\"saddress\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                 <label style=\"font-weight: bold;\" >Phone:</label>\n");
      out.write("            <input required=\"\" class=\"form-control\" type=\"text\" placeholder=\"enter supplier phoneno.\" name=\"sphoneno\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                 <label style=\"font-weight: bold;\" >Email:</label>\n");
      out.write("            <input required=\"\" class=\"form-control\" type=\"text\" placeholder=\"enter supplier email id\" name=\"semail\">\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"btn btn-outline-success\" value=\"Add Supplier\" name=\"btn\">\n");
      out.write("     \n");
      out.write("        </form>\n");
      out.write("         </div>\n");
      out.write("         <div style=\"text-align: center\">\n");
      out.write("             <a href=\"viewallsupplier.jsp\" class=\"btn btn-outline-info\">View Suppliers</a>\n");
      out.write("        <a href=\"SellerHomepage.jsp\" class=\"btn btn-outline-success\">Home</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

          if(request.getParameter("btn")!=null){
              String supplier_id = request.getParameter("sid");
              String supplier_name = request.getParameter("sname");
              String supplier_address = request.getParameter("saddress");
              String supplier_phoneno = request.getParameter("sphoneno");
              String supplier_emailid = request.getParameter("semail");
               try{
        String url="jdbc:mysql:///managementsystem?useSSL=fals";
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
      
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
