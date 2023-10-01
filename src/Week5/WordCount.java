package Week5;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        String text;
        String highestOccurrenceWord = null;
        String[] splittedText;
        int count = 1;


        System.out.print("Enter your text to find which word has highest occurrence in your text: ");
        text = scan.nextLine();

        // We separate the text we receive from the user from the spaces in between words and collect it in an array.
        // In this way, we can store all the words in the text separately.
        text = text.toUpperCase();
        splittedText = text.split(" ");


        // In this for loop we iterate every word in our word array that we just seperated and by default we set their occurance counter 1.
        // But if we encounter a word that is already in our hash map, then we just increase that words occurance counter by 1.
        for (String word : splittedText){
            if (words.containsKey(word)){
                words.replace(word , words.get(word) + 1);
                continue;
            }
            words.put(word,1);
        }


        // With the help of this iterator, we iterate every (key,value) pair in our hash map.
        // We are trying to find highest occurance count in this iterator and when we find it we store both the word and the occurance count
        Iterator<Map.Entry<String, Integer>> itr = words.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String , Integer> entry =  itr.next();
            if (words.get(entry.getKey()) > count){
                count = words.get(entry.getKey());
                highestOccurrenceWord = entry.getKey();
            }
        }

        // Finally we print both values.
        System.out.println("The most repeated word in the text you gave is the word "+ highestOccurrenceWord + " with " + count + " occurrence.");

    }
}
