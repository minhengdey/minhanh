import java.util.Scanner;

public class ButChi {
    public String tenBC, giaBan, thuongHieu, mauSac, chatLieu, doCung;
    public void nhapTTButChi(Scanner sc) {
        System.out.println("Tên bút chì:");
        String tenBC = sc.nextLine();
        this.tenBC = tenBC;
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
        System.out.println("Độ cứng:");
        String doCung = sc.nextLine();
        this.doCung = doCung;
    }
    public void hienThiButChi() {
        System.out.println("Tên bút chì: " + tenBC);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Thương hiệu: " + thuongHieu);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Chất liệu: " + chatLieu);
        System.out.println("Độ cứng: " + doCung);
    }
}
