import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Khach khach = new Khach();
        Admin admin = new Admin();
        ArrayList<Sach> DSSach = new ArrayList<>();
        ArrayList<VoGhi> DSVoGhi = new ArrayList<>();
        ArrayList<ButChi> DSButChi = new ArrayList<>();
        ArrayList<ButMuc> DSButMuc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int d = 0;
        while (true) {
            System.out.println("1. Admin");
            System.out.println("2. Khách");
            System.out.println("3. Hủy");
            System.out.println("Nhập chức năng của bạn:");
            int chon1 = Integer.parseInt(sc.nextLine());
            if (chon1 == 1) {
                System.out.println("Tài khoản: ");
                String taiKhoan = sc.nextLine();
                if (taiKhoan.equals("admin")) {
                    System.out.println("Mật khẩu: ");
                    String matKhau = sc.nextLine();
                    if (matKhau.equals("admin")) {
                        while (true) {
                            System.out.println("Admin:");
                            System.out.println("1. Vở ghi.");
                            System.out.println("2. Bút chì.");
                            System.out.println("3. Bút mực.");
                            System.out.println("4. Sách.");
                            System.out.println("5. Hủy.");
                            System.out.println("Nhập sản phẩm cần chỉnh sửa:");
                            int chon2 = Integer.parseInt(sc.nextLine());
                            if (chon2 == 1) {
                                admin.VoGhi(sc, DSVoGhi);
                            }
                            else if (chon2 == 2) {
                                admin.ButChi(sc, DSButChi);
                            }
                            else if (chon2 == 3) {
                                admin.ButMuc(sc,DSButMuc);
                            }
                            else if (chon2 == 4) {
                                admin.Sach(sc, DSSach);
                            }
                            else {
                                System.out.println("Đã thoát chế độ admin!");
                                break;
                            }
                            if (admin.danhDau == 1) {
                                admin.danhDau = 0;
                                System.out.println("Đã thoát chế độ admin!");
                                break;
                            }
                            else if (admin.danhDau == 2) {
                                admin.danhDau = 0;
                                while (true) {
                                    System.out.println("Khách:");
                                    System.out.println("1. Tìm kiếm.");
                                    System.out.println("2. Xem danh sách.");
                                    System.out.println("3. Hủy.");
                                    System.out.println("Nhập lựa chọn của bạn:");
                                    int chon3 = Integer.parseInt(sc.nextLine());
                                    if (chon3 == 1) {
                                        khach.TimKiem(sc, DSVoGhi, DSButChi, DSButMuc, DSSach);
                                    }
                                    else if (chon3 == 2) {
                                        khach.xemDS(sc, DSVoGhi, DSButChi, DSButMuc, DSSach);
                                    }
                                    else {
                                        System.out.println("Đã thoát chế độ khách!");
                                        break;
                                    }
                                    if (khach.danhDau == 1) {
                                        khach.danhDau = 0;
                                        System.out.println("Đã thoát chế độ khách!");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    else System.out.println("Xin mời nhập lại!");
                }
                else System.out.println("Xin mời nhập lại!");
            }
            else if (chon1 == 2) {
                while (true) {
                    System.out.println("Khách:");
                    System.out.println("1. Tìm kiếm.");
                    System.out.println("2. Xem danh sách.");
                    System.out.println("3. Hủy.");
                    System.out.println("Nhập lựa chọn của bạn:");
                    int chon2 = Integer.parseInt(sc.nextLine());
                    if (chon2 == 1) {
                        khach.TimKiem(sc, DSVoGhi, DSButChi, DSButMuc, DSSach);
                    }
                    else if (chon2 == 2) {
                        khach.xemDS(sc, DSVoGhi, DSButChi, DSButMuc, DSSach);
                    }
                    else {
                        System.out.println("Đã thoát chế độ khách!");
                        break;
                    }
                    if (khach.danhDau == 1) {
                        khach.danhDau = 0;
                        System.out.println("Đã thoát chế độ khách!");
                        break;
                    }
                }
            }
            else {
                System.out.println("Tạm biệt! Hẹn gặp lại!");
                break;
            }
        }
    }
}