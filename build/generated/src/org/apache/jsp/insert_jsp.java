package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <script src=\"js/jquery-3.3.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"js/popper.min.js\" ></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" ></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo01\" aria-controls=\"navbarTogglerDemo01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo01\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Welcome</a>\n");
      out.write("                    <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"index_1.jsp\">Home<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"showSanPham.jsp\">Product</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"insertSP.jsp\" tabindex=\"-1\" aria-disabled=\"true\">Insert</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"row mt-3\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"list-group\">\n");
      out.write("                        <a href=\"index_1.jsp\" class=\"list-group-item list-group-item-action\">Home</a>\n");
      out.write("                        <a href=\"showSanPham.jsp\" class=\"list-group-item list-group-item-action list-group-item-primary\">Product</a>\n");
      out.write("                        <a href=\"View.jsp\" class=\"list-group-item list-group-item-action list-group-item-secondary\">Account</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-success\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-danger\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-warning\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-info\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-light\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-dark\">Not Avaliable</a>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <h2>Insert Account!</h2>\n");
      out.write("                    <form action=\"AccountServlet2?yeucau=Insert\" method=\"post\" style=\"width: 100px\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"uname\">Username:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter username\" name=\"txtname\" required>\n");
      out.write("                            <div class=\"valid-feedback\">Valid.</div>\n");
      out.write("                            <div class=\"invalid-feedback\">Please fill out this field.</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">Password:</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Enter password\" name=\"txtpass\" required>\n");
      out.write("                            <div class=\"valid-feedback\">Valid.</div>\n");
      out.write("                            <div class=\"invalid-feedback\">Please fill out this field.</div>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" name=\"yeucau\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
