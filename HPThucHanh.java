/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class HPThucHanh extends DiemHP{
    private int db1;
    private int db2;
     private int db3;
 
    public HPThucHanh(String tenHP, int soTinChi) {
        super(tenHP, soTinChi);
       
    }
    
    public String HPThucHanh(int db1, int db2, int db3){
        this.db1=db1;
        this.db2=db2;
        this.db3=db3;
        return null;
        
    }

    public double tinhDiem() {
    
		return (double)(db1+db2+db3)/3;
 

     
    }
    
}
