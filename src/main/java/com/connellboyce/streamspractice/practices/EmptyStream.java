package com.connellboyce.streamspractice.practices;

import java.util.stream.Stream;

public class EmptyStream {
    /**
     * Demonstrate the value of Stream.empty()
     * .empty() is used to ensure there is no chance of a null pointer exception.
     * Empty and null are not the same thing, and an empty stream should not produce an exception.
     *
     * @return empty stream
     */
    public Stream<String> demoEmptyStream() {
        Stream<String> emptyStream = Stream.empty();
        return emptyStream;
    }
}
