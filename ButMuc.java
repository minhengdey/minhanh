import java.util.Scanner;

public class ButMuc {
    public String tenBM, giaBan, thuongHieu, mauSac, chatLieu, loaiMuc, doMin;
    public void nhapTTButMuc(Scanner sc) {
        System.out.println("Tên bút mực:");
        String tenBM = sc.nextLine();
        this.tenBM = tenBM;
        System.out.println("Giá bán:");
        String giaBan = sc.nextLine();
        this.giaBan = giaBan;
        System.out.println("Thương hiệu:");
        String thuongHieu = sc.nextLine();
        this.thuongHieu = thuongHieu;
        System.out.println("Màu sắc:");
        String mauSac = sc.nextLine();
        this.mauSac = mauSac;
        System.out.println("Chất liệu:");
        String chatLieu = sc.nextLine();
        this.chatLieu = chatLieu;
        System.out.println("Loại mực:");
        String loaiMuc = sc.nextLine();
        this.loaiMuc = loaiMuc;
        System.out.println("Độ mịn:");
        String doMin = sc.nextLine();
        this.doMin = doMin;
    }
    public void hienThiButMuc() {
        System.out.println("Tên bút mực: " + tenBM);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Thương hiệu: " + thuongHieu);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Chất liệu: " + chatLieu);
        System.out.println("Loại mực: " + loaiMuc);
        System.out.println("Độ mịn: " + doMin);
    }
}
