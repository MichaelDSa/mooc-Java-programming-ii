package dictionary;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author dsa21
 */
public class SaveableDictionary {
    private Map<String, String> words = new HashMap<>();
    private String filename;
    

    public SaveableDictionary() {        
    }        
    public SaveableDictionary(String file) {        
        this.filename = file;
    }
    
    public boolean load() {        
        try(Scanner read = new Scanner(Paths.get(this.filename))) {
            while(read.hasNextLine()) {
                String[] s = read.nextLine().split(":");
                add(s[0], s[1]);                  
            }            
        } catch(Exception e) {
            System.out.println("Caught Exception: " + e.toString());
            return false;
        }        
        return true;
    }
    
    public boolean save() {
//        FOR USE WITH ARRAYLIST
//        try(PrintWriter write = new PrintWriter(this.filename)) {
//            for(String i : this.words) {
//                write.println(i);
//            }
//            write.close();
//        }catch (Exception e) {
//            System.out.println("Caught Exception: " + e.toString());
//            return false;
//        }
//        return true;
//////////////////////////////////////////////////////////////////////        
        try(PrintWriter write = new PrintWriter(this.filename)) {
            for(String i : this.words.keySet()) {
                write.println(i + ":" + this.words.get(i));
            }
        } catch(Exception e) {
            System.out.println("Caught Exception" + e.toString());
            return false;
        }
        return true;
    }
    
    public void add(String words, String translation) {
        // FOR USE WITH ARRAYLIST
//        for(String i : this.words) {
//            String[] s = i.split(":");
//            if(s[0].equals(words) || s[1].equals(translation)) {
//                return;
//            }
//        }        
//
//        this.words.add(words + ":" + translation);
////////////////////THIS WORKS///////////////////////////////////////////////////////////        

        if(this.words.containsKey(words) 
            || this.words.containsKey(translation) 
            || this.words.containsValue(words) 
            || this.words.containsValue(translation)) {
            return;        
        } else {
            this.words.putIfAbsent(words, translation);
        }
               
    }
    
    public String translate(String word) {   
        //FOR USE WITH ARRAYLIST
//        for(String i : this.words) {
//            String[] s = i.split(":");
//            if(s[0].equals(word)) {
//                return s[1];
//            }else if(s[1].equals(word)) {
//                return s[0];
//            }
//        }
//
//        return null;
////////////////////this is Jereaaa's solution////////////////////////////////////
//        String translation = this.words.getOrDefault(word, null);
//        if(translation == null) {
//            translation = this.words
//                            .entrySet()
//                            .stream()
//                            .filter(v -> v.getValue().equals(word))
//                            .findAny().map(a -> a.getKey()).orElse(null);         
//        }        
//        
//        return translation;
////////////////////////////////////////////////////////////////////////////////        
        String translate = this.words.getOrDefault(word, null);
            Set<String> keys = this.words.keySet();
            for(String i : keys) {
                if(this.words.get(i).equals(word)) 
                    translate = i;
        }
            return translate;
    }
    
    public void delete(String word) {
        // ORIGINAL FOR USE WITH ARRAYLIST
//        for(int i = 0; i < this.words.size(); i++) {
//            String[] s = this.words.get(i).split(":");
//            if(s[0].equals(word) || s[1].equals(word)) {
//                this.words.remove(i);
//            }
//        }
//////////////////////BELOW IS THE SUGGESTED SOLUTION/////////////////////////////////////
//        this.words.remove(word);
//        this.words.remove(translate(word));
/////////////////BELOW WORKS///////////////////////////////////////////////////////////////
//        String k = "";
//        if(this.words.containsValue(word)) {
//            Set<String> keys = this.words.keySet();
//
//            for(String i : keys) {
//                if(this.words.get(i).equals(word)) {
//                    k = i;
//                }
//            }
//        }
//        this.words.remove(word);
//        this.words.remove(k);
//    }
////////////BELOW IS THE ONLY EXAMPLE THAT DOES NOT WORK.////////////////////////////////////
//        Iterator<String> i = (Iterator<String>) this.words.keySet();
//        while(i.hasNext()) {
//            if(this.words.get(i).equals(word)) {
//                this.words.remove(i);
//            }
//        }
/////////////BELOW WORKS!/////////////////////////////////////////////////////////////////////            
//        this.words.values().removeIf(a-> a.contains(word));
//        this.words.keySet().removeIf(a-> a.contains(word));
//    }
//////////////THIS ONE ALSO WORKS!!///////////////////////////////////////////////////////////
        this.words.entrySet().removeIf(a -> a.getKey().equals(word) || a.getValue().equals(word));
    }
    
}
