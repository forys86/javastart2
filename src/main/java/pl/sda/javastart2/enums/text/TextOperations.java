package pl.sda.javastart2.enums.text;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class TextOperations {
    public static void main(String[] args) {
        classicConcat("abc",10_000);
        builderConcat("abs",100_000);
        isAnagram("eleMent0", "\"leetenm\" ");
        isPallindrome("kajak");
    }

    private static void isPallindrome(String word) {


    }

    private static void isAnagram(String word1, String word2) {
        word1=word1.replaceAll("\\W","").toLowerCase();
        word2=word2.replaceAll("\\W","").toLowerCase();

        char[] chars1 = word1.toCharArray();
        char[] chars2= word1.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean result = Arrays.equals(chars1,chars2);

    }

    private static void builderConcat(String text, int iterations) {
    Instant start = Instant.now();
    StringBuilder stringBuilder =new StringBuilder();
    for (int i =0; i<iterations; i++){
        stringBuilder.append(text);
        }
        System.out.println(Duration.between(start, Instant.now()));
    }


    private static void classicConcat(String text, int iterations) {

        Instant start= Instant.now();
        String result="";

        for (int i=0; i<iterations; i++){
            result= result+text;
        }
        System.out.println(Duration.between(start,Instant.now()));
        System.out.println(result);
    }
}
