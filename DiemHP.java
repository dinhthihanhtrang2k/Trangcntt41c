package diemhp;

abstract class DiemHP {
    protected String tenHP;
    protected int soTinChi;
    
    public DiemHP(String tenHP, int soTinChi){
        tenHP = tenHP;
        soTinChi = soTinChi;
    }
    
    public String layTenHP(){
        return tenHP;
    }
    
    public int laySoTinChi(){
        return soTinChi;
    }
    
    public abstract double tinhDiem();
   
    
    
       
        
  
}
