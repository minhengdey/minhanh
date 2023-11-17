import java.util.Scanner;

public class VoGhi {
    public String tenVG, giaBan, thuongHieu, soTrang, loaiVo, mauBia, chatGiay, kichThuoc;
    public void nhapTTVoGhi(Scanner sc) {
        System.out.println("Tên vở ghi:");
        String tenVG = sc.nextLine();
        this.tenVG = tenVG;
        System.out.println("Giá bán:");
        String giaBan = sc.nextLine();
        this.giaBan = giaBan;
        System.out.println("Thương hiệu:");
        String thuongHieu = sc.nextLine();
        this.thuongHieu = thuongHieu;
        System.out.println("Số trang:");
        String soTrang = sc.nextLine();
        this.soTrang = soTrang;
        System.out.println("Loại vở:");
        String loaiVo = sc.nextLine();
        this.loaiVo = loaiVo;
        System.out.println("Màu sắc bìa:");
        String mauBia = sc.nextLine();
        this.mauBia = mauBia;
        System.out.println("Chất liệu giấy:");
        String chatGiay = sc.nextLine();
        this.chatGiay = chatGiay;
        System.out.println("Kích thước:");
        String kichThuoc = sc.nextLine();
        this.kichThuoc = kichThuoc;
    }
    public void hienThiVoGhi() {
        System.out.println("Tên vở ghi: " + tenVG);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Thương hiệu: " + thuongHieu);
        System.out.println("Số trang: " + soTrang);
        System.out.println("Loại vở: " + loaiVo);
        System.out.println("Màu sắc bìa: " + mauBia);
        System.out.println("Chất liệu giấy: " + chatGiay);
        System.out.println("Kích thước: " + kichThuoc);
    }
}
