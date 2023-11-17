import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    Khach khach = new Khach();
    public int danhDau = 0;
    public void Sach(Scanner sc, ArrayList<Sach> DSSach) {
        System.out.println("1. Thêm sách mới.");
        System.out.println("2. Xóa sách.");
        System.out.println("3. Sửa sách.");
        System.out.println("4. Các chức năng của khách.");
        System.out.println("5. Hủy.");
        System.out.println("Nhập lựa chọn của bạn:");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            System.out.println("Đang thêm sách:");
            Sach sach = new Sach();
            sach.nhapTTSach(sc);
            DSSach.add(sach);
            System.out.println("Đã thêm sách!");
        }
        else if (chon == 2) {
            System.out.println("Đang xóa sách:");
            for (int i = 0; i < DSSach.size(); ++i) {
                System.out.println(i + 1);
                DSSach.get(i).hienThiSach();
            }
            System.out.println("Nhập số thứ tự sách muốn xóa: ");
            int chon1 = sc.nextInt();
            DSSach.remove(chon1 - 1);
            System.out.println("Đã xóa sách!");
        }
        else if (chon == 3) {
            System.out.println("Đang sửa sách:");
            for (int i = 0; i < DSSach.size(); ++i) {
                System.out.println(i + 1 + ":");
                DSSach.get(i).hienThiSach();
            }
            System.out.println("Nhập số thứ tự sách muốn sửa: ");
            int chon1 = Integer.parseInt(sc.nextLine());
            Sach sach = new Sach();
            sach.nhapTTSach(sc);
            DSSach.set(chon1 - 1, sach);
            System.out.println("Đã sửa sách!");
        }
        else if (chon == 4) {
            System.out.println("Đã chuyển sang chức năng của khách!");
            danhDau = 2;
        }
        else {
            danhDau = 1;
            System.out.println("Đã thoát chế độ admin!");
        }
    }
    public void VoGhi (Scanner sc, ArrayList<VoGhi> DSVoGhi) {
        System.out.println("1. Thêm vở ghi.");
        System.out.println("2. Xóa vở ghi.");
        System.out.println("3. Sửa vở ghi.");
        System.out.println("4. Các chức năng của khách.");
        System.out.println("5. Hủy.");
        System.out.println("Nhập lựa chọn của bạn:");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            System.out.println("Đang thêm vở ghi:");
            VoGhi voGhi = new VoGhi();
            voGhi.nhapTTVoGhi(sc);
            DSVoGhi.add(voGhi);
            System.out.println("Đã thêm vở ghi!");
        }
        else if (chon == 2) {
            System.out.println("Đang xóa vở ghi:");
            for (int i = 0; i < DSVoGhi.size(); ++i) {
                System.out.println(i + 1);
                DSVoGhi.get(i).hienThiVoGhi();
            }
            System.out.println("Nhập số thứ tự vở ghi muốn xóa: ");
            int chon1 = sc.nextInt();
            DSVoGhi.remove(chon1 - 1);
            System.out.println("Đã xóa vở ghi!");
        }
        else if (chon == 3) {
            System.out.println("Đang sửa vở ghi:");
            for (int i = 0; i < DSVoGhi.size(); ++i) {
                System.out.println(i + 1 + ":");
                DSVoGhi.get(i).hienThiVoGhi();
            }
            System.out.println("Nhập số thứ tự vở ghi muốn sửa: ");
            int chon1 = Integer.parseInt(sc.nextLine());
            VoGhi voGhi = new VoGhi();
            voGhi.nhapTTVoGhi(sc);
            DSVoGhi.set(chon1 - 1, voGhi);
            System.out.println("Đã sửa vở ghi!");
        }
        else if (chon == 4) {
            System.out.println("Đã chuyển sang chức năng của khách!");
            danhDau = 2;
        }
        else {
            danhDau = 1;
            System.out.println("Đã thoát chế độ admin!");
        }
    }
    public void ButChi (Scanner sc, ArrayList<ButChi> DSButChi) {
        System.out.println("1. Thêm bút chì.");
        System.out.println("2. Xóa bút chì.");
        System.out.println("3. Sửa bút chì.");
        System.out.println("4. Các chức năng của khách.");
        System.out.println("5. Hủy.");
        System.out.println("Nhập lựa chọn của bạn:");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            System.out.println("Đang thêm bút chì:");
            ButChi butChi = new ButChi();
            butChi.nhapTTButChi(sc);
            DSButChi.add(butChi);
            System.out.println("Đã thêm bút chì!");
        }
        else if (chon == 2) {
            System.out.println("Đang xóa bút chì:");
            for (int i = 0; i < DSButChi.size(); ++i) {
                System.out.println(i + 1);
                DSButChi.get(i).hienThiButChi();
            }
            System.out.println("Nhập số thứ tự bút chì muốn xóa: ");
            int chon1 = sc.nextInt();
            DSButChi.remove(chon1 - 1);
            System.out.println("Đã xóa bút chì!");
        }
        else if (chon == 3) {
            System.out.println("Đang sửa bút chì:");
            for (int i = 0; i < DSButChi.size(); ++i) {
                System.out.println(i + 1 + ":");
                DSButChi.get(i).hienThiButChi();
            }
            System.out.println("Nhập số thứ tự bút chì muốn sửa: ");
            int chon1 = Integer.parseInt(sc.nextLine());
            ButChi butChi = new ButChi();
            butChi.nhapTTButChi(sc);
            DSButChi.set(chon1 - 1, butChi);
            System.out.println("Đã sửa bút chì!");
        }
        else if (chon == 4) {
            System.out.println("Đã chuyển sang chức năng của khách!");
            danhDau = 2;
        }
        else {
            danhDau = 1;
            System.out.println("Đã thoát chế độ admin!");
        }
    }
    public void ButMuc (Scanner sc, ArrayList<ButMuc> DSButMuc) {
        System.out.println("1. Thêm bút mực.");
        System.out.println("2. Xóa bút mực.");
        System.out.println("3. Sửa bút mực.");
        System.out.println("4. Các chức năng của khách.");
        System.out.println("5. Hủy.");
        System.out.println("Nhập lựa chọn của bạn:");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            System.out.println("Đang thêm bút mực:");
            ButMuc butMuc = new ButMuc();
            butMuc.nhapTTButMuc(sc);
            DSButMuc.add(butMuc);
            System.out.println("Đã thêm bút mực!");
        }
        else if (chon == 2) {
            System.out.println("Đang xóa bút mực:");
            for (int i = 0; i < DSButMuc.size(); ++i) {
                System.out.println(i + 1);
                DSButMuc.get(i).hienThiButMuc();
            }
            System.out.println("Nhập số thứ tự bút mực muốn xóa: ");
            int chon1 = sc.nextInt();
            DSButMuc.remove(chon1 - 1);
            System.out.println("Đã xóa bút mực!");
        }
        else if (chon == 3) {
            System.out.println("Đang sửa bút mực:");
            for (int i = 0; i < DSButMuc.size(); ++i) {
                System.out.println(i + 1 + ":");
                DSButMuc.get(i).hienThiButMuc();
            }
            System.out.println("Nhập số thứ tự bút mực muốn sửa: ");
            int chon1 = Integer.parseInt(sc.nextLine());
            ButMuc butMuc = new ButMuc();
            butMuc.nhapTTButMuc(sc);
            DSButMuc.set(chon1 - 1, butMuc);
            System.out.println("Đã sửa bút mực!");
        }
        else if (chon == 4) {
            System.out.println("Đã chuyển sang chức năng của khách!");
            danhDau = 2;
        }
        else {
            danhDau = 1;
            System.out.println("Đã thoát chế độ admin!");
        }
    }
}