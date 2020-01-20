package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.SimpleTextStatisticsAnalyzer;

import java.io.IOException;
import java.net.URISyntaxException;

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


            System.out.println("\n***** END OF DEBUGGING SimpleTextStatisticsAnalyzer METHODS *****\n");

        }/***** END OF DEBUGGING SimpleTextStatisticsAnalyzer METHODS *****/
    }
}
