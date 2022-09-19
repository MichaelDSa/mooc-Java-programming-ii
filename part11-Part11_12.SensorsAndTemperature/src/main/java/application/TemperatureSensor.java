package application;
import java.util.Random;

/**
 *
 * @author dsa21
 */
public class TemperatureSensor implements Sensor {    
    private Random randTemp;
    private boolean isOn;
    
    public TemperatureSensor() {
        this.randTemp = new Random();        
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() throws IllegalStateException{
        if(this.isOn() == false) {
            throw new IllegalStateException("the Sensor must be turned on before it can be read.");
        }
        return this.randTemp.nextInt(60)-30;
    }
    
}
