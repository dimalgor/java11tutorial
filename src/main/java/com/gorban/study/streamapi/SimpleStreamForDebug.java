package com.gorban.study.streamapi;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;

public class SimpleStreamForDebug {

    public static void checkStreamOfString(){
        String input = "Speedment";

        // deeemnSt
        //deem

        String result = Stream.of(input.split(""))
                .map(s -> s.charAt(0))
                .sorted(comparingInt(Character::toLowerCase))
                .limit(5)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);

    }
}
