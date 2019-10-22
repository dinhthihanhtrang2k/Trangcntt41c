
import java.util.Date;


public class SV {
    protected String hoTen;
    protected int namSinh;
    protected double dtb;
    
    public  SV(String ht, int ns, double d){
        this.hoTen=ht;
        this.namSinh=ns;
        this.dtb=d;   
    }
    
    public void hienThi(){
        System.out.print(hoTen+" "+ namSinh+ " "+ dtb );
    }
}
