import java.util.ArrayList;
import java.util.Scanner;

public class Khach {
    public int danhDau = 0;
    public void TimKiem(Scanner sc, ArrayList<VoGhi> DSVoGhi, ArrayList<ButChi> DSButChi, ArrayList<ButMuc> DSButMuc, ArrayList<Sach> DSSach) {
        System.out.println("1. Vở ghi.");
        System.out.println("2. Bút chì.");
        System.out.println("3. Bút mực.");
        System.out.println("4. Sách.");
        System.out.println("5. Hủy.");
        System.out.println("Nhập sản phẩm bạn muốn tìm kiếm:");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            if (DSVoGhi.size() == 0) System.out.println("Không tìm thấy!");
            else {
                System.out.println("Đang tìm vở ghi:");
                System.out.println("1. Tên vở ghi.");
                System.out.println("2. Giá bán.");
                System.out.println("3. Thương hiệu.");
                System.out.println("4. Số trang.");
                System.out.println("5. Loại vở.");
                System.out.println("6. Màu sắc bìa.");
                System.out.println("7. Chất liệu giấy.");
                System.out.println("8. Kích thước.");
                System.out.println("9. Hủy.");
                System.out.println("Nhập số thứ tự bạn muốn tìm theo: ");
                int chon1 = Integer.parseInt(sc.nextLine());
                if (chon1 == 1) {
                    System.out.println("Tên vở ghi:");
                    String tenVG = sc.nextLine();
                    for (int i = 0; i < DSVoGhi.size(); ++i) {
                        if (DSVoGhi.get(i).tenVG.equals(tenVG)) {
                            DSVoGhi.get(i).hienThiVoGhi();
                            break;
                        }
                        if (i == DSVoGhi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 2) {
                    System.out.println("Giá bán:");
                    String giaBan = sc.nextLine();
                    for (int i = 0; i < DSVoGhi.size(); ++i) {
                        if (DSVoGhi.get(i).giaBan.equals(giaBan)) {
                            DSVoGhi.get(i).hienThiVoGhi();
                            break;
                        }
                        if (i == DSVoGhi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 3) {
                    System.out.println("Thương hiệu:");
                    String thuongHieu = sc.nextLine();
                    for (int i = 0; i < DSVoGhi.size(); ++i) {
                        if (DSVoGhi.get(i).thuongHieu.equals(thuongHieu)) {
                            DSVoGhi.get(i).hienThiVoGhi();
                            break;
                        }
                        if (i == DSVoGhi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 4) {
                    System.out.println("Số trang:");
                    String soTrang = sc.nextLine();
                    for (int i = 0; i < DSVoGhi.size(); ++i) {
                        if (DSVoGhi.get(i).soTrang.equals(soTrang)) {
                            DSVoGhi.get(i).hienThiVoGhi();
                            break;
                        }
                        if (i == DSVoGhi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 5) {
                    System.out.println("Loại vở:");
                    String loaiVo = sc.nextLine();
                    for (int i = 0; i < DSVoGhi.size(); ++i) {
                        if (DSVoGhi.get(i).loaiVo.equals(loaiVo)) {
                            DSVoGhi.get(i).hienThiVoGhi();
                            break;
                        }
                        if (i == DSVoGhi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 6) {
                    System.out.println("Màu sắc bìa:");
                    String mauBia = sc.nextLine();
                    for (int i = 0; i < DSVoGhi.size(); ++i) {
                        if (DSVoGhi.get(i).mauBia.equals(mauBia)) {
                            DSVoGhi.get(i).hienThiVoGhi();
                            break;
                        }
                        if (i == DSVoGhi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 7) {
                    System.out.println("Chất liệu giấy:");
                    String chatGiay = sc.nextLine();
                    for (int i = 0; i < DSVoGhi.size(); ++i) {
                        if (DSVoGhi.get(i).chatGiay.equals(chatGiay)) {
                            DSVoGhi.get(i).hienThiVoGhi();
                            break;
                        }
                        if (i == DSVoGhi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 8) {
                    System.out.println("Kích thước:");
                    String kichThuoc = sc.nextLine();
                    for (int i = 0; i < DSVoGhi.size(); ++i) {
                        if (DSVoGhi.get(i).kichThuoc.equals(kichThuoc)) {
                            DSVoGhi.get(i).hienThiVoGhi();
                            break;
                        }
                        if (i == DSVoGhi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else {
                    danhDau = 1;
                    System.out.println("Đã thoát chế độ khách!");
                }
            }
        }
        else if (chon == 2) {
            if (DSButChi.size() == 0) System.out.println("Không tìm thấy!");
            else {
                System.out.println("Đang tìm bút chì:");
                System.out.println("1. Tên bút chì.");
                System.out.println("2. Giá bán.");
                System.out.println("3. Thương hiệu.");
                System.out.println("4. Màu sắc.");
                System.out.println("5. Chất liệu.");
                System.out.println("6. Độ cứng.");
                System.out.println("7. Hủy.");
                System.out.println("Nhập số thứ tự bạn muốn tìm theo: ");
                int chon1 = Integer.parseInt(sc.nextLine());
                if (chon1 == 1) {
                    System.out.println("Tên bút chì:");
                    String tenBC = sc.nextLine();
                    for (int i = 0; i < DSButChi.size(); ++i) {
                        if (DSButChi.get(i).tenBC.equals(tenBC)) {
                            DSButChi.get(i).hienThiButChi();
                            break;
                        }
                        if (i == DSButChi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 2) {
                    System.out.println("Giá bán:");
                    String giaBan = sc.nextLine();
                    for (int i = 0; i < DSButChi.size(); ++i) {
                        if (DSButChi.get(i).giaBan.equals(giaBan)) {
                            DSButChi.get(i).hienThiButChi();
                            break;
                        }
                        if (i == DSButChi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 3) {
                    System.out.println("Thương hiệu:");
                    String thuongHieu = sc.nextLine();
                    for (int i = 0; i < DSButChi.size(); ++i) {
                        if (DSButChi.get(i).thuongHieu.equals(thuongHieu)) {
                            DSButChi.get(i).hienThiButChi();
                            break;
                        }
                        if (i == DSButChi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 4) {
                    System.out.println("Màu sắc:");
                    String mauSac = sc.nextLine();
                    for (int i = 0; i < DSButChi.size(); ++i) {
                        if (DSButChi.get(i).mauSac.equals(mauSac)) {
                            DSButChi.get(i).hienThiButChi();
                            break;
                        }
                        if (i == DSButChi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 5) {
                    System.out.println("Chất liệu:");
                    String chatLieu = sc.nextLine();
                    for (int i = 0; i < DSButChi.size(); ++i) {
                        if (DSButChi.get(i).chatLieu.equals(chatLieu)) {
                            DSButChi.get(i).hienThiButChi();
                            break;
                        }
                        if (i == DSButChi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 6) {
                    System.out.println("Độ cứng:");
                    String doCung = sc.nextLine();
                    for (int i = 0; i < DSButChi.size(); ++i) {
                        if (DSButChi.get(i).doCung.equals(doCung)) {
                            DSButChi.get(i).hienThiButChi();
                            break;
                        }
                        if (i == DSButChi.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else {
                    danhDau = 1;
                    System.out.println("Đã thoát chế độ khách");
                }
            }
        }
        else if (chon == 3) {
            if (DSButMuc.size() == 0) System.out.println("Không tìm thấy!");
            else {
                System.out.println("Đang tìm bút mực:");
                System.out.println("1. Tên bút mực.");
                System.out.println("2. Giá bán.");
                System.out.println("3. Thương hiệu.");
                System.out.println("4. Màu sắc.");
                System.out.println("5. Chất liệu.");
                System.out.println("6. Loại mực.");
                System.out.println("7. Độ mịn.");
                System.out.println("8. Hủy.");
                System.out.println("Nhập số thứ tự bạn muốn tìm theo: ");
                int chon1 = Integer.parseInt(sc.nextLine());
                if (chon1 == 1) {
                    System.out.println("Tên bút mực:");
                    String tenBM = sc.nextLine();
                    for (int i = 0; i < DSButMuc.size(); ++i) {
                        if (DSButMuc.get(i).tenBM.equals(tenBM)) {
                            DSButMuc.get(i).hienThiButMuc();
                            break;
                        }
                        if (i == DSButMuc.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 2) {
                    System.out.println("Giá bán:");
                    String giaBan = sc.nextLine();
                    for (int i = 0; i < DSButMuc.size(); ++i) {
                        if (DSButMuc.get(i).giaBan.equals(giaBan)) {
                            DSButMuc.get(i).hienThiButMuc();
                            break;
                        }
                        if (i == DSButMuc.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 3) {
                    System.out.println("Thương hiệu:");
                    String thuongHieu = sc.nextLine();
                    for (int i = 0; i < DSButMuc.size(); ++i) {
                        if (DSButMuc.get(i).thuongHieu.equals(thuongHieu)) {
                            DSButMuc.get(i).hienThiButMuc();
                            break;
                        }
                        if (i == DSButMuc.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 4) {
                    System.out.println("Màu sắc:");
                    String mauSac = sc.nextLine();
                    for (int i = 0; i < DSButMuc.size(); ++i) {
                        if (DSButMuc.get(i).mauSac.equals(mauSac)) {
                            DSButMuc.get(i).hienThiButMuc();
                            break;
                        }
                        if (i == DSButMuc.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 5) {
                    System.out.println("Chất liệu:");
                    String chatLieu = sc.nextLine();
                    for (int i = 0; i < DSButMuc.size(); ++i) {
                        if (DSButMuc.get(i).chatLieu.equals(chatLieu)) {
                            DSButMuc.get(i).hienThiButMuc();
                            break;
                        }
                        if (i == DSButMuc.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 6) {
                    System.out.println("Loại mực:");
                    String loaiMuc = sc.nextLine();
                    for (int i = 0; i < DSButMuc.size(); ++i) {
                        if (DSButMuc.get(i).loaiMuc.equals(loaiMuc)) {
                            DSButMuc.get(i).hienThiButMuc();
                            break;
                        }
                        if (i == DSButMuc.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 7) {
                    System.out.println("Độ mịn:");
                    String doMin = sc.nextLine();
                    for (int i = 0; i < DSButMuc.size(); ++i) {
                        if (DSButMuc.get(i).doMin.equals(doMin)) {
                            DSButMuc.get(i).hienThiButMuc();
                            break;
                        }
                        if (i == DSButMuc.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else {
                    danhDau = 1;
                    System.out.println("Đã thoát chế độ khách");
                }
            }
        }
        else if (chon == 4) {
            if (DSSach.size() == 0) System.out.println("Không tìm thấy!");
            else {
                System.out.println("Đang tìm sách:");
                System.out.println("1. Tiêu đề.");
                System.out.println("2. Giá bán.");
                System.out.println("3. Thương hiệu.");
                System.out.println("4. Tác giả.");
                System.out.println("5. Thể loại.");
                System.out.println("6. Nhà xuất bản.");
                System.out.println("7. Ngày xuất bản.");
                System.out.println("8. Ngôn ngữ");
                System.out.println("9. Hủy.");
                System.out.println("Nhập số thứ tự bạn muốn tìm theo: ");
                int chon1 = Integer.parseInt(sc.nextLine());
                if (chon1 == 1) {
                    System.out.println("Tiêu đề: ");
                    String tieuDe = sc.nextLine();
                    for (int i = 0; i < DSSach.size(); ++i) {
                        if (DSSach.get(i).tieuDe.equals(tieuDe)) {
                            DSSach.get(i).hienThiSach();
                            break;
                        }
                        if (i == DSSach.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 2) {
                    System.out.println("Giá bán: ");
                    String giaBan = sc.nextLine();
                    for (int i = 0; i < DSSach.size(); ++i) {
                        if (DSSach.get(i).giaBan.equals(giaBan)) {
                            DSSach.get(i).hienThiSach();
                            break;
                        }
                        if (i == DSSach.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 3) {
                    System.out.println("Thương hiệu: ");
                    String thuongHieu = sc.nextLine();
                    for (int i = 0; i < DSSach.size(); ++i) {
                        if (DSSach.get(i).thuongHieu.equals(thuongHieu)) {
                            DSSach.get(i).hienThiSach();
                            break;
                        }
                        if (i == DSSach.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 4) {
                    System.out.println("Tác giả: ");
                    String tacGia = sc.nextLine();
                    for (int i = 0; i < DSSach.size(); ++i) {
                        if (DSSach.get(i).tacGia.equals(tacGia)) {
                            DSSach.get(i).hienThiSach();
                            break;
                        }
                        if (i == DSSach.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 5) {
                    System.out.println("Thể loại: ");
                    String theLoai = sc.nextLine();
                    for (int i = 0; i < DSSach.size(); ++i) {
                        if (DSSach.get(i).theLoai.equals(theLoai)) {
                            DSSach.get(i).hienThiSach();
                            break;
                        }
                        if (i == DSSach.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 6) {
                    System.out.println("Nhà xuất bản: ");
                    String nhaXB = sc.nextLine();
                    for (int i = 0; i < DSSach.size(); ++i) {
                        if (DSSach.get(i).nhaXB.equals(nhaXB)) {
                            DSSach.get(i).hienThiSach();
                            break;
                        }
                        if (i == DSSach.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 7) {
                    System.out.println("Ngày xuất bản: ");
                    String ngayXB = sc.nextLine();
                    for (int i = 0; i < DSSach.size(); ++i) {
                        if (DSSach.get(i).ngayXB.equals(ngayXB)) {
                            DSSach.get(i).hienThiSach();
                            break;
                        }
                        if (i == DSSach.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else if (chon1 == 8) {
                    System.out.println("Ngôn ngữ: ");
                    String ngonNgu = sc.nextLine();
                    for (int i = 0; i < DSSach.size(); ++i) {
                        if (DSSach.get(i).ngonNgu.equals(ngonNgu)) {
                            DSSach.get(i).hienThiSach();
                            break;
                        }
                        if (i == DSSach.size() - 1) System.out.println("Không tìm thấy!");
                    }
                }
                else {
                    danhDau = 1;
                    System.out.println("Đã thoát chế độ khách");
                }
            }
        }
        else {
            danhDau = 1;
            System.out.println("Đã thoát chế độ khách!");
        }
    }
    public void xemDS(Scanner sc, ArrayList<VoGhi> DSVoGhi, ArrayList<ButChi> DSButChi, ArrayList<ButMuc> DSButMuc, ArrayList<Sach> DSSach) {
        System.out.println("Nhập từ khóa bạn muốn tìm kiếm:");
        String tuKhoa = sc.nextLine();
        ArrayList<Object> DS = new ArrayList<>();
        for (var i : DSVoGhi) {
            if (i.kichThuoc.contains(tuKhoa) == true || i.mauBia.contains(tuKhoa) == true || i.chatGiay.contains(tuKhoa) == true || i.loaiVo.contains(tuKhoa) == true || i.soTrang.contains(tuKhoa) == true || i.thuongHieu.contains(tuKhoa) == true || i.giaBan.contains(tuKhoa) == true || i.tenVG.contains(tuKhoa) == true)
                DS.add(i);
        }
        for (var i : DSButChi) {
            if (i.doCung.contains(tuKhoa) == true || i.mauSac.contains(tuKhoa) == true || i.giaBan.contains(tuKhoa) == true || i.thuongHieu.contains(tuKhoa) == true || i.chatLieu.contains(tuKhoa) == true || i.tenBC.contains(tuKhoa) == true) {
                DS.add(i);
            }
        }
        for (var i : DSButMuc) {
            if (i.doMin.contains(tuKhoa) == true || i.giaBan.contains(tuKhoa) == true || i.loaiMuc.contains(tuKhoa) == true || i.mauSac.contains(tuKhoa) == true || i.thuongHieu.contains(tuKhoa) == true || i.chatLieu.contains(tuKhoa) == true || i.tenBM.contains(tuKhoa) == true) {
                DS.add(i);
            }
        }
        for (var i : DSSach) {
            if (i.ngayXB.contains(tuKhoa) == true || i.tacGia.contains(tuKhoa) == true || i.theLoai.contains(tuKhoa) == true || i.tieuDe.contains(tuKhoa) == true || i.ngonNgu.contains(tuKhoa) == true || i.giaBan.contains(tuKhoa) == true || i.nhaXB.contains(tuKhoa) == true) {
                DS.add(i);
            }
        }
        System.out.println("1. Bảng.");
        System.out.println("2. Danh sách.");
        System.out.println("3. Hủy.");
        System.out.println("Bạn muốn hiển thị kết quả dưới dạng:");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            int maxTenSP = 0, maxGiaBan = 0, maxThuongHieu = 0, maxTT = 0;
            for (var i : DS) {
                if (i instanceof VoGhi) {
                    maxTenSP = Math.max(((VoGhi) i).tenVG.length(), maxTenSP);
                    maxGiaBan = Math.max(((VoGhi) i).giaBan.length(), maxGiaBan);
                    maxThuongHieu = Math.max(((VoGhi) i).thuongHieu.length(), maxThuongHieu);
                    maxTT = Math.max(Math.max(Math.max(("- Chất liệu giấy: " + ((VoGhi) i).chatGiay).length(), ("- Số trang: " + ((VoGhi) i).soTrang).length()), Math.max(("- Loại vở: " + ((VoGhi) i).loaiVo).length(), ("- Màu sắc bìa: " + ((VoGhi) i).mauBia).length())), Math.max(("- Kích thước: " + ((VoGhi) i).kichThuoc).length(), maxTT));
                }
                else if (i instanceof ButChi) {
                    maxTenSP = Math.max(((ButChi) i).tenBC.length(), maxTenSP);
                    maxGiaBan = Math.max(((ButChi) i).giaBan.length(), maxGiaBan);
                    maxThuongHieu = Math.max(((ButChi) i).thuongHieu.length(), maxThuongHieu);
                    maxTT = Math.max(Math.max(("- Màu sắc: " + ((ButChi) i).mauSac).length(), ("- Chất liệu: " + ((ButChi) i).chatLieu).length()), Math.max(("- Độ cứng: " + ((ButChi) i).doCung).length(), maxTT));
                }
                else if (i instanceof ButMuc) {
                    maxTenSP = Math.max(((ButMuc) i).tenBM.length(), maxTenSP);
                    maxGiaBan = Math.max(((ButMuc) i).giaBan.length(), maxGiaBan);
                    maxThuongHieu = Math.max(((ButMuc) i).thuongHieu.length(), maxThuongHieu);
                    maxTT = Math.max(Math.max(Math.max(("- Màu sắc: " + ((ButMuc) i).mauSac).length(), ("- Chất liệu: " + ((ButMuc) i).chatLieu).length()), Math.max(("- Loại mực: " + ((ButMuc) i).loaiMuc).length(), ("- Độ mịn: " + ((ButMuc) i).doMin).length())), maxTT);
                }
                else {
                    maxTenSP = Math.max(((Sach) i).tieuDe.length(), maxTenSP);
                    maxGiaBan = Math.max(((Sach) i).giaBan.length(), maxGiaBan);
                    maxThuongHieu = Math.max(((Sach) i).thuongHieu.length(), maxThuongHieu);
                    maxTT = Math.max(Math.max(("- Tác giả: " + ((Sach) i).tacGia).length(), ("- Thể loại: " + ((Sach) i).theLoai).length()), Math.max(("- Ngày xuất bản: " + ((Sach) i).ngayXB).length(), maxTT));
                }
            }
            for (var i : DS) {
                if (i instanceof VoGhi) {
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", ((VoGhi) i).tenVG, ((VoGhi) i).giaBan, ((VoGhi) i).thuongHieu, "- Số trang: " + ((VoGhi) i).soTrang));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Loại vở: " + ((VoGhi) i).loaiVo));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Màu sắc bìa: " + ((VoGhi) i).mauBia));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Chất liệu giấy: " + ((VoGhi) i).chatGiay));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Kích thước: " + ((VoGhi) i).kichThuoc));
                }
                else if (i instanceof ButChi) {
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", ((ButChi) i).tenBC, ((ButChi) i).giaBan, ((ButChi) i).thuongHieu, "- Màu sắc: " + ((ButChi) i).mauSac));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Chất liệu: " + ((ButChi) i).chatLieu));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Độ cứng: " + ((ButChi) i).doCung));
                }
                else if (i instanceof ButMuc) {
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", ((ButMuc) i).tenBM, ((ButMuc) i).giaBan, ((ButMuc) i).thuongHieu, "- Màu sắc: " + ((ButMuc) i).mauSac));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Chất liệu: " + ((ButMuc) i).chatLieu));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Loại mực: " + ((ButMuc) i).loaiMuc));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Độ mịn: " + ((ButMuc) i).doMin));
                }
                else {
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", ((Sach) i).tieuDe, ((Sach) i).giaBan, ((Sach) i).thuongHieu, "- Tác giả: " + ((Sach) i).tacGia));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Thể loại: " + ((Sach) i).theLoai));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Nhà xuất bản: " + ((Sach) i).nhaXB));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Ngày xuất bản: " + ((Sach) i).ngayXB));
                    System.out.println(String.format("%-" + maxTenSP + "s" + " | " + "%-" + maxGiaBan + "s" + " | " + "%-" + maxThuongHieu + "s" + " | " + "%-" + maxTT + "s", "", "", "", "- Ngôn ngữ: " + ((Sach) i).ngonNgu));
                }
                int maxTong = maxTT + maxGiaBan + maxTenSP + maxThuongHieu;
                while (maxTong + 9 > 0) {
                    --maxTong;
                    System.out.print("-");
                }
                System.out.println("");
            }
        }
        else if (chon == 2) {
            System.out.println("Danh sách sản phẩm tìm kiếm được:");
            System.out.println("------");
            for (var i : DS) {
                if (i instanceof VoGhi) {
                    ((VoGhi) i).hienThiVoGhi();
                    System.out.println("------");
                }
                else if (i instanceof ButChi) {
                    ((ButChi) i).hienThiButChi();
                    System.out.println("------");
                }
                else if (i instanceof ButMuc) {
                    ((ButMuc) i).hienThiButMuc();
                    System.out.println("------");
                }
                else {
                    ((Sach) i).hienThiSach();
                    System.out.println("------");
                }
            }
        }
        else {
            danhDau = 1;
            System.out.println("Đã thoát chế độ khách");
        }
    }
}