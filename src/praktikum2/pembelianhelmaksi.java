
package praktikum2;
public class pembelianhelmaksi {
    public static void main(String[] args) {
        pembelianhelm h1 = new pembelianhelm();
        h1.nama="GM";
        h1.hrgasatuan=300000;
        h1.jmlhpembelian=2;
        
        h1.cetakInfo();
        System.out.println("total pembelian"+h1.totalpembelian());
        h1.cetaktotal();
        
        
    }
}
