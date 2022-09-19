
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Data> dataList = new ArrayList<>();
        try {
        dataList = Files.lines(Paths.get("literacy.csv"))
                .map(a -> a.split(","))
                .map(b -> new Data(b[2], b[3], b[4], b[5]))
                .collect(Collectors.toCollection(ArrayList::new));
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }   
        
//        dataList.stream().sorted((a, b) -> {
//            return a.compareTo(b);
//                }).forEach(c -> System.out.println(c));

        Collections.sort(dataList, (c1, c2) -> c1.compareTo(c2));
        
        dataList.forEach(dl -> System.out.println(dl));

    }
}
