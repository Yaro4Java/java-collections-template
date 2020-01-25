package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.SimpleTextStatisticsAnalyzer;
import com.epam.izh.rd.online.service.StreamApiTextStatisticsAnalyzer;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.epam.izh.rd.online.helper.Direction.ASC;
import static com.epam.izh.rd.online.helper.Direction.DESC;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        {/***** DEBUGGING SimpleTextStatisticsAnalyzer METHODS *****/

            System.out.println("\n***** DEBUGGING SimpleTextStatisticsAnalyzer METHODS *****\n");

            SimpleTextStatisticsAnalyzer textAnalyzer = new SimpleTextStatisticsAnalyzer();

            String textToBeAnalyzed = "This is simple text!!! It should be analyzed. Just do your job, Analyzer. " +
                    "Please, do it right!";

            System.out.println("1.Testing getWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("getWords() returns: " + textAnalyzer.getWords(textToBeAnalyzed));

            textToBeAnalyzed = "OK, easy. Now just drop the gun. I said drop the gun, ***!!!";
            System.out.println("\n2.Testing getUniqueWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("getUniqueWords() returns: " + textAnalyzer.getUniqueWords(textToBeAnalyzed));

            textToBeAnalyzed = "Let's do it!";
            System.out.println("\n3.Testing countSumLengthOfWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Total length of all words from the text = " +
                                textAnalyzer.countSumLengthOfWords(textToBeAnalyzed));

            textToBeAnalyzed = "Ten, nine, eight, seven, six, five, four, three, two, one, zero, ignition.";
            System.out.println("\n4.Testing countNumberOfWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Number of words in the text = " +
                                textAnalyzer.countNumberOfWords(textToBeAnalyzed));

            textToBeAnalyzed = "Do not trouble trouble until trouble troubles you.";
            System.out.println("\n5.Testing countNumberOfWordsRepetitions() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Number of words repetitions in the text = " +
                    textAnalyzer.countNumberOfWordsRepetitions(textToBeAnalyzed));


            textToBeAnalyzed = "I am unsorted. Try to sort me if you can. Ready, steady, go!!!";
            System.out.println("\n6.Testing sortWordsByLength() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Sorting from short to long = " +
                    textAnalyzer.sortWordsByLength(textToBeAnalyzed, ASC));
            System.out.println("Sorting from long to short = " +
                    textAnalyzer.sortWordsByLength(textToBeAnalyzed, DESC));


            System.out.println("\n***** END OF DEBUGGING SimpleTextStatisticsAnalyzer METHODS *****\n");

        }/***** END OF DEBUGGING SimpleTextStatisticsAnalyzer METHODS *****/


        {/***** DEBUGGING StreamApiTextStatisticsAnalyzer METHODS *****/

            System.out.println("\n***** DEBUGGING StreamApiTextStatisticsAnalyzer METHODS *****\n");

            StreamApiTextStatisticsAnalyzer streamApiTextAnalyzer = new StreamApiTextStatisticsAnalyzer();

            String textToBeAnalyzed = "So, what are we gonna do this time?";

            System.out.println("1.Testing getWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("getWords() returns: " + streamApiTextAnalyzer.getWords(textToBeAnalyzed));

            textToBeAnalyzed = "You repeat words because you are nervous." +
                                " Just calm down. Just calm down. Just calm down.";
            System.out.println("\n2.Testing getUniqueWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("getUniqueWords() returns: " + streamApiTextAnalyzer.getUniqueWords(textToBeAnalyzed));

            textToBeAnalyzed = "We are one.";
            System.out.println("\n3.Testing countSumLengthOfWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Total length of all words from the text = " +
                    streamApiTextAnalyzer.countSumLengthOfWords(textToBeAnalyzed));

            textToBeAnalyzed = "I consist of five words.";
            System.out.println("\n4.Testing countNumberOfWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Number of words in the text = " +
                    streamApiTextAnalyzer.countNumberOfWords(textToBeAnalyzed));

            textToBeAnalyzed = "333 333 333 333 333.";
            System.out.println("\n5.Testing countNumberOfUniqueWords() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Number of unique words in the text = " +
                    streamApiTextAnalyzer.countNumberOfUniqueWords(textToBeAnalyzed));

            textToBeAnalyzed = "This is a long echo, echo, echo, echo, echo...";
            System.out.println("\n6.Testing countNumberOfWordsRepetitions() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Number of words repetitions in the text = " +
                    streamApiTextAnalyzer.countNumberOfWordsRepetitions(textToBeAnalyzed));


            textToBeAnalyzed = "OK, that is enough for now.";
            System.out.println("\n7.Testing sortWordsByLength() method:");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("Sorting from short to long = " +
                    streamApiTextAnalyzer.sortWordsByLength(textToBeAnalyzed, ASC));
            System.out.println("Sorting from long to short = " +
                    streamApiTextAnalyzer.sortWordsByLength(textToBeAnalyzed, DESC));


            System.out.println("\n***** END OF DEBUGGING StreamApiTextStatisticsAnalyzer METHODS *****\n");

        }/***** END OF DEBUGGING StreamApiTextStatisticsAnalyzer METHODS *****/


        {/***** FREE STYLE ACTIONS TO DEBUG SOMETHING *****/

            System.out.println("\n***** FREE STYLE ACTIONS TO DEBUG SOMETHING *****\n");

            List list = new ArrayList();
            ArrayList arrayList = new ArrayList();
            LinkedList linkedList = new LinkedList();
            Vector vector = new Vector();
            Stack stack = new Stack();
            Deque deque;
            ArrayDeque arrayDeque = new ArrayDeque();

            Main.method(vector);


            System.out.println("\n***** END OF FREE STYLE ACTIONS TO DEBUG SOMETHING *****\n");

        }/***** END OF FREE STYLE ACTIONS TO DEBUG SOMETHING *****/


        {/***** PLAYING WITH STREAMS *****/

            System.out.println("\n***** PLAYING WITH STREAMS *****\n");

            String collect = IntStream.range(1, 21)
                    .mapToObj(i -> "a" + i)
                    .map(String::toUpperCase)
                    .filter((String str) -> str.length() == 2)
                    //.filter()
                    //.sorted(Comparator.reverseOrder())
                    //.collect(Collectors.joining("-"));
                    .collect(Collectors.joining(" "));

            System.out.println(collect);


            System.out.println("\n***** END OF PLAYING WITH STREAMS *****\n");

        }/***** END OF PLAYING WITH STREAMS *****/



    }

    private static void method( List parameter ) {
        System.out.println("\nMethod is working. Parameter is " + parameter);
    }
}
