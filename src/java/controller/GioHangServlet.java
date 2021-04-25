/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.ChiTietDonHang;
import entities.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ChiTietDonHangModel;
import model.DonHangModel;
import model.GioHangModel;

/**
 *
 * @author home
 */
@WebServlet(name = "GioHangServlet", urlPatterns = {"/GioHangServlet"})
public class GioHangServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // tao 1 doi tuong
    GioHangModel model = new GioHangModel();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            // Khai báo
            String page = "";
            int masp = 0;
            if (request.getParameter("txtmasp") != null) {
                masp = Integer.parseInt(request.getParameter("txtmasp"));
            }
            String yeucau = request.getParameter("yeucau");

            if (yeucau.equals("muasp")) {
                // Thêm vào giỏ hàng
                model.addSanPham(masp);
            }
            if (yeucau.equals("bosp")) {
                //Xóa một sản phẩm
                model.removeSanPham(masp);
            }
            if (yeucau.equals("xoatatca")) {
                //Xóa tất cả sản phẩm
                model.removeAllSanPham();
            }
            if (yeucau.equals("thanhtoan")) {
                //Thanh toán giỏ hàng
                //1. lấy ngày hiện tại (ngày hệ thống) là ngày đặt hàng
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cal = Calendar.getInstance();
                String ngayDH = dateFormat.format(cal.getTime());

                DonHangModel donhang_model = new DonHangModel();
                //2. lưu xuống đơn hàng ngayDH và ở đây tại maKH = 1
                donhang_model.insertDonHang(ngayDH, 1);
                //3. Lấy maDH vừa thêm (tức là maDH lớn nhất)
                int maDH_MoiNhat = donhang_model.getMaDH_MoiNhat();
                //4. dùng vòng lặp duyệt qua giỏ hàng và thêm vào bảng ChiTietDonHang
                ChiTietDonHangModel ctdh_model = new ChiTietDonHangModel();
                ArrayList<Item> giohang = model.getListItems(); // lấy từng item trong giỏ hàng ra
                int kq = 0;
                for (Item i : giohang) {
                    ChiTietDonHang ctdh = new ChiTietDonHang(maDH_MoiNhat, i.getSanpham().getMaSP(), i.getSanpham().getDonGia(), i.getSoluong());
                    kq = ctdh_model.insertChiTietDonHang(ctdh);
                }
                model.removeAllSanPham(); // 5. sau khi thêm xuống database thì ta xóa giỏ hàng đi nhé.
                page = "Error.jsp"; //6. chuyển qua trang thongbao.jsp xuất ra maDH vữa thêm thành công.
                String message = "Mã đơn hàng quý khách đặt có mã " + maDH_MoiNhat + " đã đặt thành công. ";
                request.setAttribute("thongbao", message);
                request.getRequestDispatcher(page).forward(request, response);
                return;
            }
            //Lấy các items trong giỏ hàng và hàm tổng tiền
            //Dẫn đường trang page qua giohang.jsp để chúng hiển thị
            request.setAttribute("giohang", model.getListItems());
            request.setAttribute("tongtien", model.getTongTien());
            //Chuyển trang
            page = "giohang.jsp";
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
