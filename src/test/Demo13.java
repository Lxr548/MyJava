package test;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo13 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        while(in.hasNext())
        {
            String str = in.next();
            char[] c = str.toCharArray();
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (char s : c) {
                if(map.containsKey(s))
                {
                    map.put(s, map.get(s)+1);
                }else {
                    map.put(s, 1);
                }
            }
            Collection<Integer> values = map.values();
            int maxIndex = Collections.max(values);
            StringBuffer sb = new StringBuffer();
            for (char keys : c) {
                if(map.get(keys) != maxIndex)
                {
                    sb.append(keys);
                }
            }
            System.out.println(sb);
            }
        in.close();
    }
    
}
