/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SVSP extends SV {
protected String noiTT;
protected String diemTT;
    private boolean dtt;


public SVSP(String ht, int ns, double d,String ntt, String dtt){
    super(ht,ns,d);
    this.noiTT=ntt;
    this.diemTT=dtt;
}

public void hienThi(){
    System.out.print( noiTT+ "" +dtt);
}


}
