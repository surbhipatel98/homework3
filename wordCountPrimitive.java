import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class wordCountPrimitive {
    public static void main( String[] args) {
        try {
            wordCount();
        }
        catch (Exception e){
            
        }
    }
     public static void wordCount() throws Exception {
        Long start = System.currentTimeMillis();
        HashMap<String, Integer> map = new HashMap<>();
        String word;
        int count; 
        String[] arrOfStr;
        String[] arrOfStr2;
        String[] arrOfStr3;

        File file1 = new File("/Users/Surbhi/Downloads/test1.txt"); 
        Scanner sc1 = new Scanner(file1); 

        while (sc1.hasNextLine()) {
            word = sc1.nextLine();
            arrOfStr = word.split(" "); 
            for (String a : arrOfStr) {
                if(map.containsKey(a)) {
                    count = map.get(a);
                    map.replace(a, count+1);
                }
                else {
                    map.put(a, 1);
                }
            }
        }
        sc1.close();

        File file2 = new File("/Users/Surbhi/Downloads/test2.txt"); 
        Scanner sc2 = new Scanner(file2); 
  
        while (sc2.hasNextLine()) {
            word = sc2.nextLine();
            arrOfStr2 = word.split(" "); 
            for (String a : arrOfStr2) {
                if(map.containsKey(a)) {
                    count = map.get(a);
                    map.replace(a, count+1);
                }
                else {
                    map.put(a, 1);
                }
            }
        }
        sc2.close();

        File file3 = new File("/Users/Surbhi/Downloads/test3.txt"); 
        Scanner sc3 = new Scanner(file3); 
  
        while (sc3.hasNextLine()) {
            word = sc3.nextLine();
            arrOfStr3 = word.split(" ");
            for (String a : arrOfStr3) {
                if(map.containsKey(a)) {
                    count = map.get(a);
                    map.replace(a, count+1);
                }
                else {
                    map.put(a, 1);
                }
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        sc3.close();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "  " + value);
        }
     }
}