package com.isa.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverseService {

    public String reverseWord(String word) {
        return IntStream.rangeClosed(1, word.length())
                .map(i -> word.length() - i)
                .mapToObj(word::charAt)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}