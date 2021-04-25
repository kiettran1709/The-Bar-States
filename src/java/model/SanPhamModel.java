/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Account;
import entities.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author home
 */
public class SanPhamModel {

    //kq = 1 : Thao tác thành công
    //kq = 0 : Thao tác không thành công
    //kq = -1 : kết nối thất bại
    public SanPhamModel() {

    }

    public ArrayList getList() {
        ArrayList<SanPham> list = new ArrayList();

        Connection cn = new MyConnect().getcn();
        if (cn == null) {
            return null;
        }
        try {
            String sql = "select * from SanPham";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham p = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getInt(4), rs.getString(5), rs.getInt(6));
                list.add(p);
            }
            ps.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //Hàm insertSanPham(SanPham a)
    public int insertSanPham(SanPham a) {
        int kq = 0;
        Connection cn = new MyConnect().getcn();
        if (cn == null) {
            return -1;
        }

        try {
            String sql = "insert into SanPham values(?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, a.getTenSP());
            ps.setInt(2, a.getDonGia());
            ps.setInt(3, a.getSoLuong());
            ps.setString(4, a.getHinh());
            ps.setInt(5, a.getMaDM());
            kq = ps.executeUpdate(); // insert thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kq;
    }

    //Hàm updateSanPham(SanPham a)
    public int updateSanPham(SanPham a) {
        int kq = 0;
        Connection cn = new MyConnect().getcn();
        if (cn == null) {
            return -1;
        }

        try {
            String sql = "update SanPham set TenSP=?,DonGia=?,SoLuong=?,Hinh=?,MaDM=? where MaSP=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, a.getTenSP());
            ps.setInt(2, a.getDonGia());
            ps.setInt(3, a.getSoLuong());
            ps.setString(4, a.getHinh());
            ps.setInt(5, a.getMaDM());
            ps.setInt(6, a.getMaSP());
            kq = ps.executeUpdate(); // update thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kq;
    }

    //Hàm delete(SanPham a)
    public int delete(SanPham a) {
        int kq = 0;
        Connection cn = new MyConnect().getcn();
        if (cn == null) {
            return -1;  // không kết nối được.
        }
        try {
            String sql = "delete from SanPham  where maSP=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, a.getMaSP());

            kq = ps.executeUpdate(); // delete thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kq;
    }

    //Hàm getSanPhamByMaSP(int masp)
    public SanPham getSanPhamByMaSP(int masp) {
        SanPham sanpham = null;

        Connection cn = new MyConnect().getcn();
        if (cn == null) {
            // không kết nối được
            return null;
        }

        try {
            String sql = "select * from SanPham where masp = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, masp);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sanpham = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanpham;

    }

}
