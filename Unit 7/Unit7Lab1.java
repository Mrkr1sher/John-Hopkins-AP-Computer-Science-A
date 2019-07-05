
/**
 * This program reads a text file and counts the number of characters, words, sentences, and paragraphs
 * 
 * @author Krish Thawani
 *
 */

import java.util.Scanner;
import java.io.*;

public class Unit7Lab1 {
    public static void main(String[] args) throws IOException {

        boolean word = false, character = false, sentence = false, paragraph = false;

        char options[] = args[0].toCharArray();
        for (int i = 0; i < options.length; i++) {
            if (options[i] == 'c')
                character = true;
            else if (options[i] == 'w')
                word = true;
            else if (options[i] == 's')
                sentence = true;
            else if (options[i] == 'p')
                paragraph = true;
            else
                System.out.println(options[i] + " is not a valid option!");
        }

        String line = new Scanner(new File(args[1])).useDelimiter("\\Z").next();

        if (character)
            System.out.println("Characters: " + characters(line));

        if (word)
            System.out.println("Words: " + words(line));

        if (sentence)
            System.out.println("Sentences: " + sentences(line));

        if (paragraph)
            System.out.println("Paragraphs: " + paragraphs(line));

    }

    public static int characters(String s) {
        return s.length();
    }

    public static int words(String s) {
        String[] words = s.split(" ");
        return words.length;
    }

    public static int sentences(String s) {
        String[] sentences = s.split("\\.");
        return sentences.length;

    }

    public static int paragraphs(String s) {
        String[] paragraphs = s.split("\n");
        return paragraphs.length;
    }
}