/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class sinhVien {
     private String hoTen;
    private DiemHP hp1,hp2;
    private  int soTC1,soTC2;
  public  sinhVien(String hoTen,DiemHP hp1,DiemHP hp2){
    
    }

    
     public String toString(){
     return hoTen + hp1.tinhDiem()+hp2.tinhDiem() + DTB();
     }
    public double DTB(){
    return(double) (hp1.tinhDiem()*soTC1 + hp2.tinhDiem()*soTC2) / (soTC1 + soTC2);
    }
}

