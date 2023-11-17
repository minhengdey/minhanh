import java.util.Scanner;

public class Sach {
    public String tieuDe, giaBan, thuongHieu, tacGia, theLoai, nhaXB, ngayXB, ngonNgu;
    public void nhapTTSach(Scanner sc) {
        System.out.println("Tiêu đề:");
        String tieuDe = sc.nextLine();
        this.tieuDe = tieuDe;
        System.out.println("Giá bán:");
        String giaBan = sc.nextLine();
        this.giaBan = giaBan;
        System.out.println("Thương hiệu:");
        String thuongHieu = sc.nextLine();
        this.thuongHieu = thuongHieu;
        System.out.println("Tác giả:");
        String tacGia = sc.nextLine();
        this.tacGia = tacGia;
        System.out.println("Thể loại:");
        String theLoai = sc.nextLine();
        this.theLoai = theLoai;
        System.out.println("Nhà xuất bản:");
        String nhaXB = sc.nextLine();
        this.nhaXB = nhaXB;
        System.out.println("Ngày xuất bản:");
        String ngayXB = sc.nextLine();
        this.ngayXB = ngayXB;
        System.out.println("Ngôn ngữ:");
        String ngonNgu = sc.nextLine();
        this.ngonNgu = ngonNgu;
    }
    public void hienThiSach() {
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Thương hiệu: " + thuongHieu);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Thể loại: " + theLoai);
        System.out.println("Nhà xuất bản: " + nhaXB);
        System.out.println("Ngày xuất bản: " + ngayXB);
        System.out.println("Ngôn ngữ: " + ngonNgu);
    }
}
