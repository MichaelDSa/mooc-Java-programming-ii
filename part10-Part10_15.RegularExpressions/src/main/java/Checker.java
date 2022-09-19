

public class Checker {

    
    public boolean isDayOfWeek(String string) {
        if(string.toLowerCase().matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        } 
        return false;        
    }
    
    public boolean allVowels(String string) {
        if(string.toLowerCase().matches("(a|e|i|o|u){1,}")) return true;
        return false;
    }
    public boolean timeOfDay(String string) {
        return string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
//            return true;
//        } else if(string.matches("([2][0-3]):[0-5][0-9]:[0-5][0-9]")) {
//            return true;
//        }
//        return false;
          // This is the suggested solution:  
//        return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
        
    }
}
