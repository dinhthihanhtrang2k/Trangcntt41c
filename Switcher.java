import java.util.Vector;

public class Switcher implements InterfaceSwithable{
    private Vector devices;
    private boolean state;
    
    public Switcher(){
        devices= new Vector();
        state=true;
    }
    
    public boolean getSate(boolean x){
        return state;
    }
    
    public boolean getState() {
        return state;
    }

    public void setState(boolean x) {
        state = x;
    }

    public void addDevice() {

    }

    public void turnOn() {

    }

    public void turnOff() {

    }
}
