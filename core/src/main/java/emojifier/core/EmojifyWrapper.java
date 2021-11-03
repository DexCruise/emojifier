package emojifier.core;

import java.util.HashMap;

public class EmojifyWrapper {
    public static String emojify(String text) {
        HashMap<Character, String> dictionary = new HashMap<>(); // HashMap for replacement of text

        String alphabet = "cdefghijklmnpqrstuvwxyz"; // does not contain a, b, and o, as those can be represented as blood type characters
        char c;
        for (int i = 0; i < 23; i++) {
            c = alphabet.charAt(i);
            dictionary.put(c, ":regional_indicator_"+c+":");
        }

        dictionary.put('a', ":a:");
        dictionary.put('b', ":b:");
        dictionary.put('o', ":o2:");
        dictionary.put('!', ":exclamation:");
        dictionary.put('?', ":question:");
        dictionary.put('#', ":hash:");
        dictionary.put(' ', ":blue_square:");
        dictionary.put('0', ":zero:");
        dictionary.put('1', ":one:");
        dictionary.put('2', ":two:");
        dictionary.put('3', ":three:");
        dictionary.put('4', ":four:");
        dictionary.put('5', ":five:");
        dictionary.put('6', ":six:");
        dictionary.put('7', ":seven:");
        dictionary.put('8', ":eight:");
        dictionary.put('9', ":nine:");

        return Emojifier.emojify(text, dictionary);
    }
}
