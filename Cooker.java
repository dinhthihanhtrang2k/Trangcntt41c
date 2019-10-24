public class Cooker extends ElectricalDevice {
   

    protected boolean cooking;
    
    public Cooker(String m, double p, String id, boolean s, boolean c){
         cooking=c;
    }
    
  
    public boolean getCooking(){
        return cooking;
    }
    
    public void setCooking(boolean x){
        cooking=x;
    }
    
    public void cook(){
        cooking=true;
    }
    
    public void warm(){
        cooking=false;
    }
}
