
public class Human implements Comparable<Human>{

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }
    
    @Override
    public int compareTo(Human compared) {
        if(this.getWage() == compared.getWage()) {
            return 0;
        } else if(this.getWage() > compared.getWage()) {
            return -1;            
        } else {
            return 1;
        }
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }
}