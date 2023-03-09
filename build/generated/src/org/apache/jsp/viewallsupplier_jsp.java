package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public final class viewallsupplier_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

int sid ; String sname , saddress , sphone , semail; 
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 style=\"text-align: center\">All suppliers List</h2>\n");
      out.write("         ");
      out.write("      \n");
      out.write("           ");

              
               
                   try{
                              
        String url="jdbc:mysql:///managementsystem?useSSL=false";
        String unm="root";
        String pass="040920ankit";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, unm, pass);
        Statement  statement = connection.createStatement();

                  
                        String query="select * from supplier";
                        ResultSet  rs = statement.executeQuery(query);
                                
                   
                      
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                      <div  style=\"    background: aliceblue;\n");
      out.write("    font-size: 14px;\"><table  class=\"table\">\n");
      out.write("                            \n");
      out.write("                                <tr>\n");
      out.write("                                    <th>supplier_id</th>\n");
      out.write("                                    <th>supplier_name</th>\n");
      out.write("                                    <th>supplier_address</th>\n");
      out.write("                                    <th>supplier_phoneno</th>\n");
      out.write("                                    <th>supplier_emailid</th>\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                                </tr>   \n");
      out.write("                                ");
                      
                      
                      while(rs.next()){
                     
                     sid= rs.getInt("sid");
                     sname= rs.getString("sname");
                     saddress= rs.getString("saddress");
                     sphone =  rs.getString("sphoneno");
                     semail= rs.getString("semail");
                     
      out.write("            \n");
      out.write("                \n");
      out.write("                                <tr>\n");
      out.write("               \n");
      out.write("                                    <td>");
      out.print(sid );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(sname );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(saddress );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(sphone );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(semail );
      out.write("</td>\n");
      out.write("                                   \n");
      out.write("                                                                 </tr>\n");
      out.write("         \n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        </table></div>\n");
      out.write("                        ");
 }catch(Exception ex){
                   
                   System.out.println("problem"+ex);
                   }
  
        
        
      out.write("  \n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            <a href=\"addsupplier.jsp\" class=\"btn btn-outline-info\">Add Suppliers</a>\n");
      out.write("              <a href=\"deletesupplier.jsp\" class=\"btn btn-outline-danger\">Delete Suppliers</a>\n");
      out.write("        <a href=\"SellerHomepage.jsp\" class=\"btn btn-outline-success\">Home</a>\n");
      out.write("        </div>                 \n");
      out.write("       \n");
      out.write("    </body>\n");
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
