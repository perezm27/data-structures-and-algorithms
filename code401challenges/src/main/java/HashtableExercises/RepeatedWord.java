package HashtableExercises;

public class RepeatedWord {
//    Input: Write a function that accepts a lengthy string parameter.
    public static String repeatedWord(String lengthyStr){

        //need a hashtable to store my lengthy string because lookup is constant O(1)
        Hashtable duplicatesTbl = new Hashtable(30);

        //Step 1: need to break up the string
        //Step 2: account for spaces and special characters I.E .?$#$%^& etc.
        String[] wordsArr = lengthyStr.trim().toLowerCase().split("\\W+");
        String repeateWord = "";
        int numOfOccurrences = 0;

        for (int i = 0; i < wordsArr.length ; i++) {
            if(!duplicatesTbl.contains(wordsArr[i])){
                numOfOccurrences = 0;

        //Step 3: add Individual words to hashtable as Strings
                duplicatesTbl.add(wordsArr[i], String.valueOf(++numOfOccurrences));

            } else {
                numOfOccurrences++;
                repeateWord = wordsArr[i];
                duplicatesTbl.add(repeateWord, String.valueOf(numOfOccurrences));
                return repeateWord + " is a duplicate & it occurred at least " + duplicatesTbl.get(repeateWord) + " times";
            }

        }

        //Step 4: Need to keep track of how many times a single word occurs - (can increment value each time a word occurs so when we look up that
                  // key the returned value is the number of times the word occured in the sentence)
        //Step 5: return as soon as a word occurs more than once.
        return "Sorry you entered en empty String";
    }

}
