
public  abstract class DiemHP {
    protected String tenHP;
    protected int soTinChi;
    
    public DiemHP(String tenHP, int soTinChi){
        this.tenHP = tenHP;
        this.soTinChi = soTinChi;
    }
    
    public String layTenHP(){
        return tenHP;
    }
    public void sotinchi(){
    this.soTinChi = soTinChi;
    }
    public int laySoTinChi(){
        return soTinChi;
    }
    
    public abstract double tinhDiem();
   
    
    
       
        
  
}


