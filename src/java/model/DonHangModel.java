/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Hp
 */
public class DonHangModel {

    public DonHangModel() {

    }

    //1. Lưu xuống bảng đơn hàng 
    // - mã đơn hàng : maDH tăng tự động không cần thêm
    // - ngày đặt hàng : ngayDH là ngày hiện tại
    // - mã khách hàng : maKH truyền vào
    public int insertDonHang(String ngayDH, int maKH) {
        int kq = 0;
        Connection cn = new MyConnect().getcn();
        if (cn == null) {
            return -1; // không kết nối được csdl
        }
        try {
            String sql = "insert into DonHang(NgayDatHang,maKH) "
                    + " values(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(ngayDH));
            ps.setInt(2, maKH);
            kq = ps.executeUpdate(); // thực hiện câu lệnh sql insert
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    //2. Lấy ra mã đơn hàng mới nhất(mãDH vừa thêm): tức là max của MaDH
    public int getMaDH_MoiNhat() {
        int maxMaDH = 0;
        Connection cn = new MyConnect().getcn();
        if (cn == null) {
            return -1;
        }
        try {
            String sql = "Select max(maDH) from DonHang";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maxMaDH = rs.getInt(1); // max MaDH lớn nhất
            }
            ps.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maxMaDH;
    }
}
