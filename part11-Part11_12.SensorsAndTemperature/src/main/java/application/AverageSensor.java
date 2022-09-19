package application;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author dsa21
 */
public class AverageSensor implements Sensor {    
    private ArrayList<Sensor> addedSensors;
    private ArrayList<Integer> tempReads;
    
    public AverageSensor() {
        this.addedSensors = new ArrayList<>();
        this.tempReads = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
//        int j = addedSensors.size();
        for(Sensor i : addedSensors) {
            if(i.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {        
        this.addedSensors.forEach(a -> a.setOn());
    }

    @Override
    public void setOff() {       
        this.addedSensors.forEach(a -> a.setOff());
    }

    @Override
    public int read() throws IllegalStateException{
        if(this.isOn() != true || this.addedSensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor must be on, and addedSensors must not be empty.");
        }
        int read = this.addedSensors.stream().mapToInt(a -> a.read()).sum() / addedSensors.size();
        this.tempReads.add(read);
        return read;
        
    }
    
    public void addSensor(Sensor toAdd) {
        this.addedSensors.add(toAdd);
    }
    
    public List<Integer> readings()  {
        
//        if(this.isOn()) {
//            this.addedSensors.forEach(a -> 
//            {                
//                if(a.isOn() && !this.addedSensors.isEmpty() && !a.getClass().equals(StandardSensor.class)); {
//                    tempReads.add(a.read());
//                }
//            });
//        }
        return tempReads;
        
    }
    
}
