package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class createSaleBill_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {



    	public String glBillId;
    	public String glSalerId;
    	public String glSalerName;
    	public String purchaseDate;
    	public String dueDate;
    	
     
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("         /* Nav-bar */ \r\n");
      out.write("\r\n");
      out.write("       /* Add a black background color to the top navigation */\r\n");
      out.write("       .topnav {\r\n");
      out.write("        background-color: #333;\r\n");
      out.write("        overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Style the links inside the navigation bar */\r\n");
      out.write("        .topnav a {\r\n");
      out.write("        float: left;\r\n");
      out.write("        display: block;\r\n");
      out.write("        color: #f2f2f2;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        padding: 14px 16px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        font-size: 17px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Change the color of links on hover */\r\n");
      out.write("        .topnav a:hover {\r\n");
      out.write("        background-color: #ddd;\r\n");
      out.write("        color: black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Add an active class to highlight the current page */\r\n");
      out.write("        .topnav a.active {\r\n");
      out.write("        background-color: #ff4458;\r\n");
      out.write("        color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Hide the link that should open and close the topnav on small screens */\r\n");
      out.write("        .topnav .icon {\r\n");
      out.write("        display: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* When the screen is less than 600 pixels wide, hide all links, except for the first one (\"Home\"). Show the link that contains should open and close the topnav (.icon) */\r\n");
      out.write("        @media screen and (max-width: 600px) {\r\n");
      out.write("            .topnav a:not(:first-child) {display: none;}\r\n");
      out.write("            .topnav a.icon {\r\n");
      out.write("                float: right;\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* The \"responsive\" class is added to the topnav with JavaScript when the user clicks on the icon. This class makes the topnav look good on small screens (display the links vertically instead of horizontally) */\r\n");
      out.write("        @media screen and (max-width: 600px) {\r\n");
      out.write("            .topnav.responsive {position: relative;}\r\n");
      out.write("            .topnav.responsive a.icon {\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                right: 0;\r\n");
      out.write("                top: 0;\r\n");
      out.write("            }\r\n");
      out.write("            .topnav.responsive a {\r\n");
      out.write("                float: none;\r\n");
      out.write("                display: block;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("            }\r\n");
      out.write("        }  \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        /* Style the links inside the navigation bar */\r\n");
      out.write("      .topnav a {\r\n");
      out.write("        float: left;\r\n");
      out.write("        display: block;\r\n");
      out.write("        color: #f2f2f2;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        padding: 14px 16px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        font-size: 17px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("       /* Go up transistion */\r\n");
      out.write("\r\n");
      out.write("       .box {\r\n");
      out.write("        box-shadow: 0px 5px 10px 0px rgba(0, 0, 0, 0.5);\r\n");
      out.write("        transition: transform ease 0.5s, box-shadow ease 0.5s;\r\n");
      out.write("      }\r\n");
      out.write("      .box:hover {\r\n");
      out.write("        transform: translateY(-40px);\r\n");
      out.write("        box-shadow: 0px 10px 20px 2px rgba(0, 0, 0, 0.25);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("        /* -------------------------- */\r\n");
      out.write("\r\n");
      out.write("      /* Center to div */\r\n");
      out.write("\r\n");
      out.write("      /* zoom in transition */\r\n");
      out.write("\r\n");
      out.write("      .zoom {\r\n");
      out.write("        padding: 50px;\r\n");
      out.write("        transition: transform .6s;\r\n");
      out.write("        padding-top: 1%;\r\n");
      out.write("        padding-left: 0%;\r\n");
      out.write("        padding-right: 0%;\r\n");
      out.write("        padding-bottom: 0%;\r\n");
      out.write("        width: 100px;\r\n");
      out.write("        height: 100px; \r\n");
      out.write("        box-shadow: 0px 5px 10px 0px rgba(0, 0, 0, 0.5);\r\n");
      out.write("        color: #000000;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .zoom:hover {\r\n");
      out.write("        -ms-transform: scale(1.5); /* IE 9 */\r\n");
      out.write("        -webkit-transform: scale(1.5); /* Safari 3-8 */\r\n");
      out.write("        transform: scale(1.5);\r\n");
      out.write("        box-shadow: 0px 10px 20px 2px rgba(0, 0, 0, 0.25);\r\n");
      out.write("        background-color: rgb(110, 107, 107); \r\n");
      out.write("        color: #ddd;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Icon styling in div */\r\n");
      out.write("\r\n");
      out.write("      .div-st {\r\n");
      out.write("        font-size: 15px;\r\n");
      out.write("        font-family:'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .div-st-1 {\r\n");
      out.write("        margin: 5px;\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*     div heading styling     */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    .div-heading {\r\n");
      out.write("        margin-bottom: -10px;\r\n");
      out.write("        margin-left: 40px;\r\n");
      out.write("        margin-right: 10px;\r\n");
      out.write("        font-size: 25px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*  */\r\n");
      out.write("\r\n");
      out.write("       /* Responsive Grid Laout css from 3*/\r\n");
      out.write("    \r\n");
      out.write("       .flex-container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("            margin-bottom: -20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .flex-container > div {\r\n");
      out.write("            background-color: #ffffff; \r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            /* line-height: 75px; */\r\n");
      out.write("        \r\n");
      out.write("        }\r\n");
      out.write("        /* -------------------------- */\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      /* -------------------------- */\r\n");
      out.write("\r\n");
      out.write("      /* Go up transistion */\r\n");
      out.write("\r\n");
      out.write("      .box {\r\n");
      out.write("        box-shadow: 0px 5px 10px 0px rgba(0, 0, 0, 0.5);\r\n");
      out.write("        transition: transform ease 0.5s, box-shadow ease 0.5s;\r\n");
      out.write("      }\r\n");
      out.write("      .box:hover {\r\n");
      out.write("        transform: translateY(-40px);\r\n");
      out.write("        box-shadow: 0px 10px 20px 2px rgba(0, 0, 0, 0.25);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("        /* -------------------------- */\r\n");
      out.write("\r\n");
      out.write("      /* Center to div */\r\n");
      out.write("\r\n");
      out.write("      /* zoom in transition */\r\n");
      out.write("\r\n");
      out.write("      .zoom {\r\n");
      out.write("        padding: 50px;\r\n");
      out.write("        transition: transform .6s;\r\n");
      out.write("        padding-top: 1%;\r\n");
      out.write("        padding-left: 0%;\r\n");
      out.write("        padding-right: 0%;\r\n");
      out.write("        padding-bottom: 0%;\r\n");
      out.write("        width: 100px;\r\n");
      out.write("        height: 100px; \r\n");
      out.write("        box-shadow: 0px 5px 10px 0px rgba(0, 0, 0, 0.5);\r\n");
      out.write("        color: #000000;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .zoom:hover {\r\n");
      out.write("        -ms-transform: scale(1.5); /* IE 9 */\r\n");
      out.write("        -webkit-transform: scale(1.5); /* Safari 3-8 */\r\n");
      out.write("        transform: scale(1.5);\r\n");
      out.write("        box-shadow: 0px 10px 20px 2px rgba(0, 0, 0, 0.25);\r\n");
      out.write("        background-color: rgb(110, 107, 107); \r\n");
      out.write("        color: #ddd;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Icon styling in div */\r\n");
      out.write("\r\n");
      out.write("      .div-st {\r\n");
      out.write("        font-size: 15px;\r\n");
      out.write("        font-family:'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .div-st-1 {\r\n");
      out.write("        margin: 5px;\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*     div heading styling     */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    .div-heading {\r\n");
      out.write("        margin-bottom: -10px;\r\n");
      out.write("        margin-left: 40px;\r\n");
      out.write("        margin-right: 10px;\r\n");
      out.write("        font-size: 25px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    h1 {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        margin-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*              Form Css            */\r\n");
      out.write("\r\n");
      out.write("    * {\r\n");
      out.write("      box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    input[type=text],input[type=number], select, textarea {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      padding: 12px;\r\n");
      out.write("      border: 1px solid #ccc;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("      resize: vertical;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    label {\r\n");
      out.write("      padding: 12px 12px 12px 0;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    input[type=submit] {\r\n");
      out.write("      background-color: #04AA6D;\r\n");
      out.write("      color: white;\r\n");
      out.write("      padding: 12px 20px;\r\n");
      out.write("      border: none;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      float: right;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    input[type=submit]:hover {\r\n");
      out.write("      background-color: #45a049;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .container {\r\n");
      out.write("      border-radius: 5px;\r\n");
      out.write("      background-color: #f2f2f2;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .col-25 {\r\n");
      out.write("      float: left;\r\n");
      out.write("      width: 8%;\r\n");
      out.write("      margin-left: 1%;\r\n");
      out.write("      margin-top: 6px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .col-75 {\r\n");
      out.write("      float: right;\r\n");
      out.write("      width: 40%;\r\n");
      out.write("      margin-top: 6px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Clear floats after the columns */\r\n");
      out.write("    .row:after {\r\n");
      out.write("      content: \"\";\r\n");
      out.write("      display: table;\r\n");
      out.write("      clear: both;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*                        table css                            */\r\n");
      out.write("\r\n");
      out.write("    table {\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    tr, th, td {\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      border: 1px solid black;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*          margin between the tables and input field            */\r\n");
      out.write("\r\n");
      out.write("    .margin-1 {\r\n");
      out.write("        margin: 10px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function myFunction() {\r\n");
      out.write("          var x = document.getElementById(\"myTopnav\");\r\n");
      out.write("          if (x.className === \"topnav\") {\r\n");
      out.write("              x.className += \" responsive\";\r\n");
      out.write("          } else {\r\n");
      out.write("              x.className = \"topnav\";\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        // to check \r\n");
      out.write("        \r\n");
      out.write("        // \r\n");
      out.write("        \r\n");
      out.write("        function hideForm() {\r\n");
      out.write("        \tdocument.getElementById(\"billForm\").style.display = \"none\";\r\n");
      out.write("        \t\r\n");
      out.write("        \tdocument.getElementById(\"bill_txt\").style.display = \"none\";        \t\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        function validation1() {\r\n");
      out.write("            var product_id=document.saleBillForm1.product_id.value; \r\n");
      out.write("            var qnt=document.saleBillForm1.quantity.value; \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            console.log(\"This is string \" + qnt + \"\\nThis is int -> \" + parseInt(qnt))\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            if (product_id==\"\" ||  product_id==null) {\r\n");
      out.write("                alert(\"Product Id cannot be null or empty!\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            else if (qnt==\"\" ||  qnt==null) {\r\n");
      out.write("                alert(\"Product quantity cannot be null or empty!\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            else if (parseInt(qnt) < 0){\r\n");
      out.write("                alert(\"Product quantity must be greater than 0!\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("     \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <title>Invertory</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <div class=\"topnav\" id=\"myTopnav\">\r\n");
      out.write("      <a href=\"home.jsp\"><i class=\"fa fa-fw fa-home\" style=\"margin-bottom: 5px;\"></i> Home</a> \r\n");
      out.write("      <a href=\"products.jsp\" ><img style=\"margin-bottom: 5px; margin-right:4px;\" src=\"logos/icon_inventroy.png\">Inventory</a>\r\n");
      out.write("      <a href=\"purchase_bill_management.jsp\"><img style=\"margin-bottom: 5px; margin-right:4px;\" src=\"logos/icon_purchase_bill.png\">Purchase Bills</a>\r\n");
      out.write("      <a class=\"active\" href=\"saleBillManagement.jsp\"> <img style=\"margin-bottom: 5px; margin-right:4px;\" src=\"logos/icon_sale_bill.png\">Billing</a>\r\n");
      out.write("      <a  href=\"dealer_management.jsp\" > <img style=\"margin-bottom: 5px; margin-right:4px;\" src=\"logos/icon_dealer.png\"> Supplier</a>\r\n");
      out.write("      \r\n");
      out.write("  \r\n");
      out.write("      <a href=\"policy.jsp\"><img style=\"margin-bottom: 5px; margin-right:4px;\" src=\"logos/icon_policy.png\">policy</a>\r\n");
      out.write("      <a href=\"contact.jsp\"><img style=\"margin-bottom: 5px; margin-right:2px;\" src=\"logos/icon_contactus.png\">Contact</a>\r\n");
      out.write("      <a href=\"about.jsp\"><img style=\"margin-bottom: 5px;\" src=\"logos/icon_about.png\"> About</a> \r\n");
      out.write("      <a href=\"logout.jsp\"><img style=\"margin-bottom: 5px;\" src=\"logos/icon_logout.png\"> Logout</a>\r\n");
      out.write("  \r\n");
      out.write("      <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\r\n");
      out.write("          <i class=\"fa fa-bars\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("      \t\r\n");
      out.write("    ");

    	
    
    
    
    		
    
    	
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h1>Pharmacy Management</h1>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <h1>Create Bill</h1>\r\n");
      out.write("\r\n");
      out.write("        <hr style=\"margin-top: 20px;\">\r\n");
      out.write("        <p class=\"div-heading\"\">Purchased Medicine Info</p>\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      ");

      
      	String customerName = request.getParameter("cust_name");
	    String customerPhoneNo = request.getParameter("cust_ph");
	    String customerEmail = request.getParameter("cust_email");
	    String phurchaseDate = java.time.LocalDate.now() + "";
	    String dueDate = request.getParameter("due_date");
      
      	System.out.print("\nname =  " + customerName + 
      					"\nphone = " +customerPhoneNo + 
      					"\nemail = " + customerEmail + 
      					"\npurchaseDate = " + purchaseDate + 
      					"\ndue " + dueDate); 
      	
      	
      	if(session.getAttribute("initialStageSB").equals("true")) {
      		session.setAttribute("cust_name", customerName);
          	session.setAttribute("cust_phone", customerPhoneNo);
          	session.setAttribute("cust_email", customerEmail);
          	session.setAttribute("purchase_date", java.time.LocalDate.now()+"");
          	session.setAttribute("due_date", "2022-12-12"); 	
      	}
      
      	
      	
      	// generating the bill id 
      	
      	// taking input from table
      	
      	String userName = (String) session.getAttribute("username");
      	
      	int lastBillId = 1;	
		
		try {
			
			String query = "SELECT * FROM " + userName + "_sales";

			String url = "jdbc:mysql://localhost:3306/shopmg1";
			String uname = "root";
			String pass= "1718";
			
			Class.forName("com.mysql.jdbc.Driver");
		
			
			Connection con = DriverManager.getConnection(url, uname, pass);
			
			PreparedStatement st = con.prepareStatement(query);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				lastBillId = Integer.parseInt(rs.getString(1));
				lastBillId += 1;
				
				// setting the auto id
		      	
		      	
			}
			
			session.setAttribute("lastBillId", lastBillId+"");
			
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
      	
      	//
      
      out.print(
       " <div class=\"container\">" +
       " <table> " +
       "   <tr>  " +
       "       <td>Customer Name: " + session.getAttribute("cust_name") + " </td> <td>Bill Id: " + session.getAttribute("lastBillId")  + "</td><td>Customer Phone: " + session.getAttribute("cust_phone") + "</td> " + 
       " 	   <td>Customer Email: " + session.getAttribute("cust_email") + "</td> " +
       "   </tr>  " + 
       " </table>	");
      
      
      
      out.write("\r\n");
      out.write("      \t\t<!-- \t\t This is check product in inventory form\t\t    -->\r\n");
      out.write("      \r\n");
      out.write("              <div id=\"billForm\">\r\n");
      out.write("              \t  <form action=\"CreateSaleBillProdList\" class=\"margin-1\" name=\"saleBillForm1\" onsubmit=\"return validation1()\" >\r\n");
      out.write("                  \r\n");
      out.write("                     \r\n");
      out.write("\t\t\t          <div class=\"row\">\r\n");
      out.write("\t\t\t            <div class=\"col-25\">\r\n");
      out.write("\t\t\t              <label for=\"fname\">Product Id</label>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t            <div class=\"col-75\">\r\n");
      out.write("\t\t\t              <input type=\"number\" id=\"fname\" name=\"product_id\" placeholder=\"Enter id\">\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t            <div class=\"col-25\">\r\n");
      out.write("\t\t\t              <label for=\"lname\">Quantity</label>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t            <div class=\"col-75\">\r\n");
      out.write("\t\t\t              <input type=\"number\" id=\"lname\" name=\"quantity\" placeholder=\"Enter quantity\">\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t          </div>\r\n");
      out.write("\t\t\t          \r\n");
      out.write("\t\t\t            \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t          <div class=\"row\">\r\n");
      out.write("\t\t\t           \r\n");
      out.write("\t\t\t            <input type=\"submit\" style=\"width:50%; margin-left:20%\">\r\n");
      out.write("\t\t\t          </div>\r\n");
      out.write("                     \r\n");
      out.write("                </form>\r\n");
      out.write("                                \r\n");
      out.write("                \r\n");
      out.write("                <table>\r\n");
      out.write("                    <legend>Purchased product details</legend>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <th>Product Id</th>\r\n");
      out.write("                    <th>Product Name</th>\r\n");
      out.write("                    <th>Category</th>  \r\n");
      out.write("                   <!--  <th>MRP</th> \r\n");
      out.write("                    <th>Discount</th> -->\r\n");
      out.write("                    <th>Price</th>      \r\n");
      out.write("                    <th>Purchased Quantity</th>\r\n");
      out.write("                    <th>Total Price</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                  ");

               
               		if((session.getAttribute("initialStageSB").equals("false")) && session.getAttribute("productFoundForSaleBill").equals("true")) {
               		 	
               			ArrayList<ArrayList> products = (ArrayList<ArrayList>) session.getAttribute("proudctsInBillSB");
               			
               			out.println("<tr>");
               			for(ArrayList<String> product: products) {
               				out.println("<td>"+  product.get(0) + "</td>" +
               	                    "<td>"+  product.get(1) + "</td>" +
               	                    "<td>"+  product.get(2) + "</td>" +
               	                   // "<td>"+  product.get(3) + "</td> " +
               	                    //" <td>"+  product.get(4) + "</td>" +
               	                    "<td>"+  product.get(5) + "</td>" +
               	                    " <td>"+  product.get(6) + "</td>" +
               	                    "<td>"+  product.get(7) + "</td>" 
    
               	                    );
               				
               			out.println("</tr>");
               			}
               		}
                  
               		else if((session.getAttribute("initialStageSB").equals("false")) && session.getAttribute("productFoundForSaleBill").equals("true")) {
               			out.print("");
               		}
               
               	
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                     \r\n");
      out.write("      \t\t\t</table>\r\n");
      out.write("      \t\t\t\r\n");
      out.write("      \t\t\t\r\n");
      out.write("                <form action=\"saleBillTxt.jsp\" class=\"margin-1\" method=\"post\">\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("                      \t <input type=\"submit\" style=\"width:50%; margin-left:20%\" value=\"Make Bill\">\r\n");
      out.write("\t\r\n");
      out.write("                     \r\n");
      out.write("                </form>\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t\t\t\r\n");
      out.write("      \t\t\t\r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("             \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
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
