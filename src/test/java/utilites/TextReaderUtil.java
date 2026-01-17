package utilites;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextReaderUtil {
    public static List<Object[]> readExpectedValues(String path) throws IOException {
        List<Object[]> data = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(path));
        for(String line:lines){
            if(!line.isEmpty()){
                String[] values = line.split(",");
                String productName=values[0];
                int totalAmountValue = Integer.parseInt(values[1]);
                data.add(new Object[]{productName,totalAmountValue});
            }
        }
        return data;
        /*Map<String,String> mapVal = new HashMap<>();
        for(String line:lines){
            if(line.contains(",")){
                String[] parts = line.split(",");
                mapVal.put()
            }
        }*/
       /* String[] expectedResults = new String[lines.size()];
        int index = 0;
        for(String line:lines){
            expectedResults[index]=line;
            index++;
        }
        return expectedResults;*/

    }
}
