/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main.dao;

import main.entity.TaiKhoan;

/**
 *
 * @author PHONG
 */
public interface TaiKhoanDAO extends CrudDAO<TaiKhoan, String> {
    
    boolean isTenDangNhapTonTai(String tenDangNhap);
    
}
