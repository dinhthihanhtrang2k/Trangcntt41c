

 public class HPlythuyet extends DiemHP{
    private  int chuyenCan;
    private  int giuaKy;
    private  int cuoiKy;

    public HPlythuyet(String tenHP, int soTinChi) {
        super(tenHP, soTinChi);
        this.chuyenCan = chuyenCan;
        this.cuoiKy = cuoiKy;
        this.giuaKy = giuaKy;
    }
 
    public double tinhDiem() {
        if ((this.chuyenCan >0 && this.chuyenCan <10) 
   &&(this.giuaKy>0 && this.giuaKy <10)&&(this.cuoiKy>0 && this.cuoiKy <10));
        return (double) ((this.chuyenCan*0.1)+(this.giuaKy*0.2)+(this.cuoiKy*0.7));
   
        
        
    
  }
    

}


