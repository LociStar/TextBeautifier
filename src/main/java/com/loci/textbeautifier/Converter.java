package com.loci.textbeautifier;

import com.loci.textbeautifier.fonts.EnumBase;

import java.util.Arrays;
import java.util.List;

public class Converter {

    //convert text to emoji
    public static <T> String convertToFont(String text, EnumBase aEnum) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            sb.append(aEnum.convert(text.charAt(i)));
        }
        return sb.toString();
    }

    //add suffix and prefix to every char in string
    public static String addSuffixAndPrefixToLetter(String text, String prefix, String suffix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                sb.append(" ");
            } else {
                sb.append(prefix);
                sb.append(text.charAt(i));
                sb.append(suffix);
            }
        }
        return sb.toString();
    }

    public static String addSuffixAndPrefixToLetter(String text, String prefix, String suffix, String placeholder) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                sb.append(placeholder);
            } else {
                sb.append(prefix);
                sb.append(text.charAt(i));
                sb.append(suffix);
            }
        }
        return sb.toString();
    }

    //add suffix and prefix to String
    public static String addSuffixAndPrefixToWord(String text, String prefix, String suffix) {
        List<String> words = Arrays.asList(text.split(" "));
        //replace every String in words with prefix + String + suffix
        words.replaceAll(word -> prefix + word + suffix);

        return String.join(" ", words);
    }

    public static String addSuffixAndPrefixToText(String text, String prefix, String suffix) {
        return prefix + text + suffix;
    }
}
