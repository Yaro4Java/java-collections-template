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

            System.out.println("Testing getWords() method:\n");
            System.out.println("Text for test: \"" + textToBeAnalyzed + "\"");
            System.out.println("getWords() returns: \"" + textAnalyzer.getWords(textToBeAnalyzed));


            System.out.println("\n***** END OF DEBUGGING SimpleTextStatisticsAnalyzer METHODS *****\n");

        }/***** END OF DEBUGGING SimpleTextStatisticsAnalyzer METHODS *****/
    }
}
