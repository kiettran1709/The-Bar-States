/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entities.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author home
 */
public class AccountModel {
    public AccountModel()
    {
        
    }
    public int loginAccount(Account a)
    {
        Connection cn = new MyConnect().getcn();
        if (cn == null)
            return -1;  // kết nối không thành công.
        try {
            String sql = "select * from account where username = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, a.getUsername());
            ResultSet rs = ps.executeQuery();
            if (rs.next()==true)
            {
                if (rs.getString(2).equals(a.getPassword()))
                {
                    return 1; //login thành công
                }
                else
                {
                    return 2; // sai mật khẩu.
                }
            }
            else
            {
                return 3; // username không tồn tại.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; // login thất bại.
    }
    
    public ArrayList getList()
    {
        ArrayList<Account> list = new ArrayList();
        
        Connection cn = new MyConnect().getcn();
        if (cn == null)
        {
            return null;
        }
        try {
            String sql = "select * from account";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Account acc = new Account(rs.getString(1), rs.getString(2));
                list.add(acc);
            }
            ps.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //Hàm getList(String Username)
    public ArrayList getList(String username)
    {
        if (username.equals(""))
            return getList();
        
        ArrayList<Account> list = new ArrayList();
        
        Connection cn = new MyConnect().getcn();
        if (cn == null)
        {
            return null;
        }
        try {
            String sql = "select * from account where username like ? ";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Account acc = new Account(rs.getString(1), rs.getString(2));
                list.add(acc);
            }
            ps.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    // hàm insert(Account a)
    public int insert(Account a)
    {
        int kq=0;
        Connection cn = new MyConnect().getcn();
        if(cn == null)
            return -1;
        
        try {
            String sql = "insert into account values(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, a.getUsername());
            ps.setString(2, a.getPassword());
            kq = ps.executeUpdate(); // insert thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
    
 
    // Hàm update(Account a)
    public int update(Account a)
    {
        int kq=0;
        Connection cn = new MyConnect().getcn();
        if(cn == null)
            return -1;
        
        try {
            String sql = "update account set password = ? where username = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, a.getPassword());
            ps.setString(2, a.getUsername());
            kq = ps.executeUpdate(); // update thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
    
    
    
    //Hàm delete(Account a)
    public int delete(Account a)
    {
        int kq=0;
        Connection cn = new MyConnect().getcn();
        if(cn == null)
            return -1;  // không kết nối được.
        
        try {
            String sql = "delete from account where username=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, a.getUsername());
            //ps.setString(2, a.getPassword());
            kq = ps.executeUpdate(); // delete thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
    
    
    //Hàm getAccountByUser(String username)
    public Account getAccountByUser(String username)
    {
        Account account = null;
        
        Connection cn = new MyConnect().getcn();
        if (cn == null)
        {
            // không kết nối được
            return null;
        }
        
        try {
            String sql = "select * from account where username=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                account = new Account(rs.getString(1),rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
                
    }
}
