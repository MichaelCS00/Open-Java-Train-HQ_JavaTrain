import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class statisticalWordFrequency {
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("G:\\Java\\Sources\\TheOldManAndTheSea.txt"));

        StringBuffer sb = new StringBuffer();
        String text =null;
        while ((text=br.readLine())!= null){
            sb.append(text);     // Append the read characters to the stringbuffer
        }
        br.close();   // close the read stream

        String str = sb.toString().toLowerCase(); // convert stringBuffer to a character and convert to lowercase
        String[] words = str.split("[^(a-zA-Z)]+");  // split non-word characters, get all words
        Map<String ,Integer> map = new HashMap<String, Integer>() ;

        for(String word :words){
            if(map.get(word)==null){   // If there is no description, it is the first time, then join the map, the number of occurrences is 1
                map.put(word,1);
            }else{
                map.put(word,map.get(word)+1);  // If it exists, the number of times is 1
            }
        }

        // Sort
        List<Map.Entry<String ,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

        Comparator<Map.Entry<String,Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> left, Map.Entry<String, Integer> right) {
                return (left.getValue().compareTo(right.getValue()));
            }
        };
        // Collection default ascending 
        Collections.sort(list,comparator);

        for(int i=0;i<10;i++){// High to low output top 10
            System.out.println(list.get(list.size()-i-1).getKey() +":"+list.get(list.size()-i-1).getValue());
        }

    }
}
