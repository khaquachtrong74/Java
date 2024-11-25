package com.excersice3.Question5;

public class main {
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm nhân viên.");
            System.out.println("2. Xoá nhân viên.");
            System.out.println("3. Tra cứu nhân viên.");
            System.out.println("4. Hiển thị danh sách nhân viên.");
            System.out.println("5. Tính lương nhân viên.");
            System.out.println("6. Thoát.");
            System.out.print("Mời bạn chọn chức năng: ");
            choice = Integer.parseInt(CauHinhQ5.SC.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin nhân viên:");
                    System.out.print("Họ tên: ");
                    String hoTen = CauHinhQ5.SC.nextLine();
                    System.out.print("Chứng minh nhân dân: ");
                    String cmnd = CauHinhQ5.SC.nextLine();
                    System.out.print("Quê quán: ");
                    String queQuan = CauHinhQ5.SC.nextLine();
                    System.out.print("Giới tính: ");
                    String gioiTinh = CauHinhQ5.SC.nextLine();
                    System.out.print("Số điện thoại: ");
                    String soDienThoai = CauHinhQ5.SC.nextLine();
                    System.out.print("Bộ phận (A, B, C hoặc để trống nếu không thuộc bộ phận nào): ");
                    String boPhan = CauHinhQ5.SC.nextLine();
                    
                    NhanVien nhanVien = quanLyNhanVien.taoNhanVien(boPhan, hoTen, cmnd, queQuan, gioiTinh, soDienThoai);
                    quanLyNhanVien.themNhanVien(nhanVien);
                    System.out.println("Thêm nhân viên thành công!");
                    break;

                case 2:
                    System.out.println("Xóa nhân viên cuối cùng được thêm.");
                    quanLyNhanVien.xoaNhanVienMoi();
                    System.out.println("Xóa thành công!");
                    break;

                case 3:
                    System.out.println("Nhập thông tin tra cứu (họ tên hoặc CMND): ");
                    String traCuu = CauHinhQ5.SC.nextLine();
                    NhanVien ketQua = quanLyNhanVien.traCuu(traCuu);
                    if (ketQua != null) {
                        System.out.println("Kết quả tìm kiếm: " + ketQua.toString());
                    } else {
                        System.out.println("Không tìm thấy nhân viên.");
                    }
                    break;

                case 4:
                    System.out.println("Danh sách nhân viên:");
                    quanLyNhanVien.hienThi();
                    break;

                case 5:
                    System.out.println("Tính lương cho các nhân viên:");
                    quanLyNhanVien.tinhTienLuong();
                    break;

                case 6:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }

            System.out.println();
        } while (choice != 6);
    }
}
