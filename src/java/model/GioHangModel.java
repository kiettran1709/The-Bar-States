/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entities.Item;
import entities.SanPham;
import java.util.*;
/**
 *
 * @author home
 */
public class GioHangModel {
    //1. khai báo dữ liệu
    HashMap<Integer, Item> cart; // chứa masp và món hàng mua <masp,Item>
    
    //2. Constructor

    public GioHangModel() {
        cart = new HashMap<>();
    }
    //3.Hàm thêm vào giỏ hàng
    public void addSanPham(int masp){
        
        //4. nếu mã sản phẩm có trong giỏ hàng thì chỉ tăng so lượng lên
        if(cart.containsKey(masp)){
            //Lấy Item dựa vào masp(mã sản phẩm)
            Item item = cart.get(masp);
            //Lấy số lượng ra
            int count = item.getSoluong();
            //Tăng số lượng lên một
            count = count + 1;
            //Cập nhật lại cho số lượng của Item
            item.setSoluong(count);
        }
        else{
            //5. Bỏ vào giỏ hàng
            //6. Lấy ra sản phẩm dựa vào masp (mã sản phẩm)
            SanPham sp = new SanPhamModel().getSanPhamByMaSP(masp);
            //7. Tạo 1 đối tượng Item (SanPham, Soluong=1)
            Item item = new Item(sp, 1);
            //8. Thêm vào giỏ hàng <masp, Item>
            cart.put(masp, item);
        }
        
    }
    //2. Hàm lấy ra các Items có trong ListItem
    public ArrayList<Item> getListItems(){
        // Khai báo danh sách Item
        ArrayList<Item> list = new ArrayList<>();
        // Duyệt vào giỏ hàng và thêm vào list
        for(Item i : cart.values()){
            // Thêm vào list
            list.add(i);
        }
        return list; // Trả về danh sách các item có trong list của giỏ hàng
    }
    //3. Xóa một và tất cả sản phẩm trong giỏ hàng
    public void removeSanPham(int masp){
        cart.remove(masp);
    }
    
    public void removeAllSanPham(){
        cart.clear();
    }
    //4. Hàm tổng tiền
    public int getTongTien(){
        int tien = 0;
        for(Item item : cart.values()){
            tien += (item.getSanpham().getDonGia() * item.getSoluong());
        }
        return tien;
    }
}
