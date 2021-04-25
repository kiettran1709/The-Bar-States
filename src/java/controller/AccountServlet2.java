/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AccountModel;

/**
 *
 * @author home
 */
@WebServlet(name = "AccountServlet2", urlPatterns = {"/AccountServlet2"})
public class AccountServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String username = request.getParameter("txtname");
            String password = request.getParameter("txtpass");
            String yeucau = request.getParameter("yeucau");

            String page = "";
            String message = "";
            HttpSession session = request.getSession();

            Account acc = new Account(username, password);
            AccountModel acc_model = new AccountModel();

            if (yeucau.equals("Insert")) {
                int kq = acc_model.insert(acc);
                if (kq == 1) {
                    page = "View.jsp";
                    AccountModel model = new AccountModel();
                    session.setAttribute("accountList", model.getList());
                } else if (kq == 0) {
                    message = "Insert thất bại.";
                    page = "Error.jsp";
                } else if (kq == 0) {
                    message = "Kết nối database thất bại.";
                    page = "Error.jsp";
                }
            } else if (yeucau.equals("delete")) {
                int kq = acc_model.delete(acc);
                if (kq == 1) {
                    page = "View.jsp";
                    AccountModel model = new AccountModel();
                    session.setAttribute("accountList", model.getList());
                } else if (kq == 0) {
                    message = "delete thất bại.";
                    page = "Error.jsp";
                } else if (kq == 0) {
                    message = "Kết nối database thất bại.";
                    page = "Error.jsp";
                }
            } else if (yeucau.equals("laythongtin")) {
                Account account = acc_model.getAccountByUser(username);
                if (account != null) {
                    session.setAttribute("acc", account);
                    page = "update.jsp";
                } else {
                    message = "không kết nối được.";
                    page = "Error.jsp";
                }
            } else if (yeucau.equals("Update")) {
                int kq = acc_model.update(acc);
                if (kq == 1) {
                    session.setAttribute("accountList", acc_model.getList());
                    page = "View.jsp";
                } else {
                    message = "Không kết nối database được.";
                    page = "Error.jsp";
                }
            } else if (yeucau.equals("Search")) {
                session.setAttribute("accountList", acc_model.getList(username));
                page = "View.jsp";
            }

            request.setAttribute("thongbao", message);
            request.getRequestDispatcher(page).forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
