package LeftJoin;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {
//    Feature Tasks
//    Write a function that LEFT JOINs two hashmaps into a single data structure.
    public static ArrayList leftJoin(HashMap synonyms, HashMap antonyms){
        ArrayList output = new ArrayList();

        for (Object key : synonyms.keySet() ) {
            output.add(key);
            output.add(synonyms.get(key));

            if (antonyms.containsKey(key)) {
                output.add(antonyms.get(key));
            }
            else{
                output.add(null);
            }
        }

        return output;
    }
}
