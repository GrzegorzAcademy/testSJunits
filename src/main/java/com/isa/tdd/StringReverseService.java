package com.isa.tdd;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverseService {

    public String reverseWords(String inputWords) {
        return Arrays.stream(inputWords.split(" "))
                .sorted()
                .collect(Collectors.joining(" ", inputWords.substring(0,1).toUpperCase(), "."));
    }
}
