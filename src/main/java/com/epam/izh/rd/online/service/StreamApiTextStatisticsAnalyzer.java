package com.epam.izh.rd.online.service;

import com.epam.izh.rd.online.helper.Direction;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.epam.izh.rd.online.helper.Direction.ASC;
import static com.epam.izh.rd.online.helper.Direction.DESC;
import static java.util.Collections.*;

/**
 * Данный класс обязан использовать StreamApi из функционала Java 8. Функциональность должна быть идентична
 * {@link SimpleTextStatisticsAnalyzer}.
 */
public class StreamApiTextStatisticsAnalyzer implements TextStatisticsAnalyzer {

    @Override
    public int countSumLengthOfWords(String text) {

        List<String> listOfWordsFromTheText = this.getWords(text);
        Stream<String> streamOfWordsFromTheList = listOfWordsFromTheText.stream();

        return streamOfWordsFromTheList
                .mapToInt(word -> word.length())
                .sum();
    }

    @Override
    public int countNumberOfWords(String text) {

        List<String> listOfWordsFromTheText = this.getWords(text);
        Stream<String> streamOfWordsFromTheList = listOfWordsFromTheText.stream();

        return (int) streamOfWordsFromTheList.count();
    }

    @Override
    public int countNumberOfUniqueWords(String text) {

        Set<String> setOfUniqueWordsFromTheText = this.getUniqueWords(text);
        Stream<String> streamOfWordsFromTheSet = setOfUniqueWordsFromTheText.stream();

        return (int) streamOfWordsFromTheSet.count();
    }

    @Override
    public List<String> getWords(String text) {

        Stream<String> streamOfWordsFromTheText = Stream.of(text.split("[\\p{Punct}\\s]+"));

        return streamOfWordsFromTheText.collect(Collectors.toList());
    }

    @Override
    public Set<String> getUniqueWords(String text) {

        Stream<String> streamOfWordsFromTheText = Stream.of(text.split("[\\p{Punct}\\s]+"));

        return streamOfWordsFromTheText.collect(Collectors.toSet());
    }

    @Override
    public Map<String, Integer> countNumberOfWordsRepetitions(String text) {

        List<String> listOfWordsFromTheText = this.getWords(text);
        Set<String> setOfUniqueWordsFromTheText = this.getUniqueWords(text);

        Stream<String> streamOfUniqueWordsFromTheSet = setOfUniqueWordsFromTheText.stream();

        Map<String, Integer> mapOfWordsRepetitions = streamOfUniqueWordsFromTheSet
                .collect(Collectors.toMap(word -> word, word -> Collections.frequency(listOfWordsFromTheText, word)));

        return mapOfWordsRepetitions;
    }

    @Override
    public List<String> sortWordsByLength(String text, Direction direction) {

        List<String> listOfWordsFromTheText = this.getWords(text);
        Stream<String> streamOfWordsFromTheList = listOfWordsFromTheText.stream();

        if (direction == ASC) {

            listOfWordsFromTheText = streamOfWordsFromTheList
                    .sorted(Comparator.comparingInt(word -> word.length()))
                    .collect(Collectors.toList());
        }

        if (direction == DESC) {

            listOfWordsFromTheText = streamOfWordsFromTheList
                    .sorted(reverseOrder(Comparator.comparingInt(word -> word.length())))
                    .collect(Collectors.toList());
        }

        return listOfWordsFromTheText;
    }
}
