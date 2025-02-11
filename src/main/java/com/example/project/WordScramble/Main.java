package com.example.project.WordScramble;

public class Main {
    public static void main(String[] args) {
        String result1 = WordScramble.scrambleWord("TAN");
        System.out.println(result1);
        String result2 = WordScramble.scrambleWord("ABRACADABRA");
        System.out.println(result2);
        String result3 = WordScramble.scrambleWord("WHOA");
        System.out.println(result3);
        String result4 = WordScramble.scrambleWord("AARDVARK");
        System.out.println(result4);
        String result5 = WordScramble.scrambleWord("EGGS");
        System.out.println(result5);
        String result6 = WordScramble.scrambleWord("A");
        System.out.println(result6);
        String result7 = WordScramble.scrambleWord("");
        System.out.println(result7);
    }
}
