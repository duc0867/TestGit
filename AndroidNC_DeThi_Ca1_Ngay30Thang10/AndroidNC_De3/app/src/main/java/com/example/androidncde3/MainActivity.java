package com.example.androidncde3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*
    Thời gian làm bài: 50 phút
    ------
    Một số qui định khi làm bài
     -tên các control chứa mã sinh viên, tên các biến chứa mã sinh viên,
     -tên các file code chứa mã sinh viên, tên package chứa mã sinh viên.
     VD: PH0001MainActivity.java; ph0001_main_activity.xml.
     -Nếu không đổi tên hết, tối đa 8 điểm. Nếu không làm xong, đúng, đầy đủ 100% yêu cầu trong 50 phút, tối đa 8 điểm.
     */
    /*
    Yêu cầu về CSDL ở câu 2:-------------------------------------------------
    Bảng TheLoai (MaTL,TenTL)
    Bang SanPham(MaSP, TenSP, SoLuongNhap,NgayNhap,DonGiaNhap)
    Bang HoaDon (MaHD, NgayBan, TenKhachHang)
    Bang HoaDonChiTiet (MaHDCT, MaSP, GiaBan)
    Các trường dữ liệu các bạn có thể tùy chọn
    */
    /*
    ----------------------------------------------
Cau 3: Tính tổng số lượng hàng nhập theo từng sản phẩm trong 1 tháng, tháng nhập vào từ bàn phím
(chú ý một sản phẩm không được nằm trong 2 thể loại)
( ví dụ: Tổng số lượng SP A: 20, Tổng số lượng SP B: 10 )(2đ)

Cau 4: Liệt kê 1 bảng bao gồm 3 trường Mã thể loại, mã sản phẩm và số lượng sản phẩm bán được trong 1 năm,
năm nhập vào từ bàn phím, ví dụ nhập năm 2021.(2đ)
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}