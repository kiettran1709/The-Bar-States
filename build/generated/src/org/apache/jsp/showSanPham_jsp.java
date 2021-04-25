package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.SanPhamModel;
import java.util.ArrayList;

public final class showSanPham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <script src=\"js/jquery-3.3.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"js/popper.min.js\" ></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" ></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo01\" aria-controls=\"navbarTogglerDemo01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo01\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Ours Product</a>\n");
      out.write("                    <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"index_1.jsp\">Home<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"showSanPham.jsp\">Product</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"SanPham.jsp\" tabindex=\"-1\" aria-disabled=\"true\">Items</a>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"showSanPham.jsp\" class=\"list-group-item list-group-item-action list-group-item-primary\">Product</a>\n");
      out.write("                        <a href=\"insertSP.jsp\" class=\"list-group-item list-group-item-action list-group-item-secondary\">Add Products</a>\n");
      out.write("                        <a href=\"View.jsp\" class=\"list-group-item list-group-item-action list-group-item-success\">Account</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-danger\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-warning\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-info\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-light\">Not Avaliable</a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-dark\">Not Avaliable</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    \n");
      out.write("                    <form enctype=\"multipart/form-data\" action=\"DeleteSPServlet?yeucau=xoanhieu\" method=\"post\" >\n");
      out.write("                        <h2>Product List</h2>\n");
      out.write("\n");
      out.write("                        <table border=\"1\" style=\"text-align: center\" class=\"table table-striped\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Pick</th>\n");
      out.write("                                    <th>ID Product</th>\n");
      out.write("                                    <th>Name Of Product</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>Amount</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>ID</th>\n");
      out.write("                                    <th>Delete</th>\n");
      out.write("                                    <th>Update</th>\n");
      out.write("                                    <th>Buy Now</th>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
 ArrayList listSP = new SanPhamModel().getList();
      out.write("\n");
      out.write("                            </thead>\n");
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems( listSP);
      _jspx_th_c_forEach_0.setVar("sp");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                    <tr>\n");
            out.write("                                        <td><input type=\"checkbox\" name=\"chon\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" /> </td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getTenSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getDonGia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getSoLuong()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td><img src=\"images/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getHinh()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" width=\"100px\" height=\"100px\"></td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getMaDM()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\n");
            out.write("                                        <td><a href=\"DeleteSPServlet?yeucau=delete&txtmasp=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">Delete</a></td>\n");
            out.write("                                        <td><a href=\"SanPhamServlet2?yeucau=laythongtin&txtmasp=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">Update</a></td>\n");
            out.write("                                        <td><a href=\"GioHangServlet?yeucau=muasp&txtmasp=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.getMaSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">Buy Now</a></td>\n");
            out.write("\n");
            out.write("                                    </tr>\n");
            out.write("                                ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <input type=\"submit\" value=\"Delete Multiple\" />\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                            <footer class=\"page-footer font-small stylish-color-dark pt-4\">\n");
      out.write("\n");
      out.write("        <!-- Footer Links -->\n");
      out.write("        <div class=\"container text-center text-md-left\">\n");
      out.write("\n");
      out.write("            <!-- Grid row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <!-- Grid column -->\n");
      out.write("                <div class=\"col-md-4 mx-auto\">\n");
      out.write("\n");
      out.write("                    <!-- Content -->\n");
      out.write("                    <h5 class=\"font-weight-bold text-uppercase mt-3 mb-4\">Footer Content</h5>\n");
      out.write("                    <p><b><i>Here you can use rows and columns to organize your footer content. Lorem ipsum dolor sit amet,\n");
      out.write("                        consectetur\n");
      out.write("                        adipisicing elit.</i></b></p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Grid column -->\n");
      out.write("\n");
      out.write("                <hr class=\"clearfix w-100 d-md-none\">\n");
      out.write("\n");
      out.write("                <!-- Grid column -->\n");
      out.write("                <div class=\"col-md-2 mx-auto\">\n");
      out.write("\n");
      out.write("                    <!-- Links -->\n");
      out.write("                    <h5 class=\"font-weight-bold text-uppercase mt-3 mb-4\">Links</h5>\n");
      out.write("\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"showSanPhamTheoHang.jsp\"><b><i>Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"showSanPham.jsp\">Menu</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"insertSP.jsp\">Insert</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"giohang.jsp\">Cart</a></b></i>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Grid column -->\n");
      out.write("\n");
      out.write("                <hr class=\"clearfix w-100 d-md-none\">\n");
      out.write("\n");
      out.write("                <!-- Grid column -->\n");
      out.write("                <div class=\"col-md-2 mx-auto\">\n");
      out.write("\n");
      out.write("                    <!-- Links -->\n");
      out.write("                    <h5 class=\"font-weight-bold text-uppercase mt-3 mb-4\">Links</h5>\n");
      out.write("\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"updateSP.jsp\"><b><i>Update</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"showSanPham.jsp\">Menu</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"insertSP.jsp\">Insert</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"giohang.jsp\">Cart</a></b></i>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Grid column -->\n");
      out.write("\n");
      out.write("                <hr class=\"clearfix w-100 d-md-none\">\n");
      out.write("\n");
      out.write("                <!-- Grid column -->\n");
      out.write("                <div class=\"col-md-2 mx-auto\">\n");
      out.write("\n");
      out.write("                    <!-- Links -->\n");
      out.write("                    <h5 class=\"font-weight-bold text-uppercase mt-3 mb-4\">Links</h5>\n");
      out.write("\n");
      out.write("                    <ul class=\"list-unstyled\" >\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"updateSP.jsp\"><b><i>Update</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"showSanPham.jsp\">Menu</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"insertSP.jsp\">Insert</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a style=\"color: black\" href=\"giohang.jsp\">Cart</a></b></i>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Grid column -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid row -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer Links -->\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!-- Call to action -->\n");
      out.write("        <ul class=\"list-unstyled list-inline text-center py-2\">\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("                <h5 class=\"mb-1\">Register for free</h5>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"insert.jsp\" class=\"btn btn-warning btn-rounded\">Sign up!</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- Call to action -->\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!-- Social buttons -->\n");
      out.write("        <ul class=\"list-unstyled list-inline text-center\">\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn-floating btn-fb mx-1\" href=\"https://www.facebook.com/\">\n");
      out.write("                    <i class=\"fab fa-facebook-f\" > \n");
      out.write("                        <img src=\"images/facebook.png\" alt=\"facebook.com\" style=\"width:30px;\">\n");
      out.write("                    </i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn-floating btn-tw mx-1\" href=\"https://twitter.com/explore\">\n");
      out.write("                    <i class=\"fab fa-twitter\"> \n");
      out.write("                        <img src=\"images/twitter.png\" alt=\"twitter.com\" style=\"width:30px;\">\n");
      out.write("                    </i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn-floating btn-gplus mx-1\" href=\"https://www.google.com/\">\n");
      out.write("                    <i class=\"fab fa-google-plus-g\"> \n");
      out.write("                        <img src=\"images/shapes-and-symbols.png\" alt=\"google.com\" style=\"width:30px;\">\n");
      out.write("                    </i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn-floating btn-li mx-1\" href=\"https://www.instagram.com/?hl=vi\">\n");
      out.write("                    <i class=\"fab fa-linkedin-in\"> \n");
      out.write("                        <img src=\"images/instagram-sketched.png\" alt=\"instagram.com\" style=\"width:30px;\">\n");
      out.write("                    </i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn-floating btn-dribbble mx-1\" href=\"https://www.weibo.com/login.php\">\n");
      out.write("                    <i class=\"fab fa-dribbble\"> \n");
      out.write("                        <img src=\"images/weibo.png\" alt=\"instagram.com\" style=\"width:30px;\">\n");
      out.write("                    </i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- Social buttons -->\n");
      out.write("\n");
      out.write("        <!-- Copyright -->\n");
      out.write("        <div class=\"footer-copyright text-center py-3\"><b>© 2020 Design\n");
      out.write("                <a style=\"color: black\" href=\"https://www.facebook.com/camnguyet.215\"><i> CamNguyet</i></b></a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Copyright -->\n");
      out.write("\n");
      out.write("    </footer>\n");
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
