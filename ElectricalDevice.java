
import static java.lang.ProcessBuilder.Redirect.to;

public class ElectricalDevice implements InterfaceSwithable {
    protected String manufature;
    protected double price;
    protected String id;
    protected boolean switcher;
    
    public ElectricalDevice(String m, double p, String id, boolean s){
        manufature=m;
        price=p;
        this.id=id;
        switcher=s;
        }
    
    public void setmanufature(String x){
       manufature = x;
    }
    
    public String getamanufaceture(){
        return manufature;  
        
}
    
    public double getprice(){
        return price;
    }
    
    public void setprice(double x){
       price=x;
 
    }
    public String getid(){
        return id;
    }
    
     public void setid(String x){
       this.id=x;
     }
   
    public void setswitcher(boolean x){
       switcher=x;
       
    }
    
    public boolean getswitcher(){
        return switcher;
    }
    
    
    public String toString(){
        return id+manufature+", gia: "+price+","+ switcher;
}
    
    public void turnOn(){
        switcher=true;
    }
    
    public void turnOff(){
        switcher=false;
    }
 
}
