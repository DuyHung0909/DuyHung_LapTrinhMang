package java45;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("May bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh(){
        System.out.println(getLoaiPhuongTien() + " cat canh");
    }

    public void haCanh(){
        System.out.println(getLoaiPhuongTien() + " ha canh");
    }

    @Override
    public double layVanToc() {
        return 500;
    }
}
