package application;

/**
 *
 * @author dsa21
 */
public class StandardSensor implements Sensor {
    private int readInt;
    
    public StandardSensor(int r) {
        this.readInt = r;
    }    
    
    @Override
    public boolean isOn() {        
        return true;
    }

    @Override
    public void setOn() {
        
    }

    @Override
    public void setOff() {
        
    }

    @Override
    public int read() {        
        return this.readInt;
    }
    
}
