package com.connellboyce.streamspractice.practices;

import java.util.stream.Stream;

public class GenerateStream {

    /**
     * Demonstrate generating a stream using a lambda function
     * In this case, it will create a stream containing "element" as each part of the sequence.
     * This will stop when there are 10 elements in the sequence.
     * If there is no .limit() with a maximum number of items in the sequence specified, the stream will generate until the memory limit is reached.
     *
     * @return a stream of 10 "element"s
     */
    public Stream<String> demoStreamGeneration() {
        return Stream.generate(() -> "element").limit(10);
    }
}
