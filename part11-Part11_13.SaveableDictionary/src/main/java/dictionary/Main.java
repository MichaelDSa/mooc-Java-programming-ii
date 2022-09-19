package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
//        SaveableDictionary dictionary = new SaveableDictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("ohjelmointi", "programming");
//        dictionary.delete("apina");
//        dictionary.delete("banana");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("banana"));
//        System.out.println(dictionary.translate("banaani"));
//        System.out.println(dictionary.translate("ohjelmointi"));
//        System.out.println("/////////////////////////////////\n");
//        
        SaveableDictionary d = new SaveableDictionary("words.txt");
        
        System.out.println(d.load());
        System.out.println("////////////////////////////////////\n");
      
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean readSuccessful = dictionary.load();        

        if (readSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        
        dictionary.add("Defined", "Definition");
        dictionary.add("What's my", "Definition");
        
        boolean writeSuccessful = dictionary.save();
        
        if(writeSuccessful) {
            System.out.println("Successfuly saved the dictionary to file");
        }
        System.out.println(dictionary.translate("Defined"));
        System.out.println(dictionary.translate("What's my"));
        
        
        
        
        
    }
}
