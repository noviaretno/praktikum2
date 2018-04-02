
package praktikum2;
public class pembelianhelm {
    String nama;
    int hrgasatuan;
    int jmlhpembelian;

    public pembelianhelm() {
        nama="NHK";
        hrgasatuan=500000;
        jmlhpembelian=3;
    }

    public pembelianhelm(String nama, int hrgasatuan, int jmlhpembelian) {
        this.nama = nama;
        this.hrgasatuan = hrgasatuan;
        this.jmlhpembelian = jmlhpembelian;
    }
    
    
    void cetakInfo(){
        System.out.println("nama         : "+nama);
        System.out.println("harga satuan : "+hrgasatuan);
        System.out.println("jumlah pembelian : "+jmlhpembelian);
    }
    
    int totalpembelian(){
        int total;
        total=hrgasatuan*jmlhpembelian;
        return total;
    }
    
    void cetaktotal(){
        System.out.println("Totalnya = "+totalpembelian());
    }
}
