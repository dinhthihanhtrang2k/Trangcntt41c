public class Fan extends ElectricalDevice{
    protected String speed;
    protected boolean swing;
    
    protected Fan(String m, double p, String id, boolean s, String sp, boolean sw){
        speed=sp;
        swing=sw;
        
    }
    
    
    public String getSpeed() {
        return speed;
    }
    
    public boolean isSwing() {
        return swing;
    }
    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void incSpeed() {
        System.out.println("toc do quay cua quat la 1000 vong/phut");
    }

    
    public void upDate() {
    }
}
    
    
   
    


    
}
