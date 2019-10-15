package diemhp;

 abstract class HPThucHanh extends DiemHP {
    private float db1;
    private float db2;
    private float db3;
     
     public HPThucHanh(String tenHP, int soTinChi, float db1, float db2, float db3) {
        super(tenHP, soTinChi);
        this.db1 = db1;
        this.db2 = db2;
        this.db3 = db3;
    }
     public double tinhDiem(){
         return(this.db1+this.db2+this.db3)/3;
     }
     
    
     
     
    
}
