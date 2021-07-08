package com.connellboyce.streamspractice.creation;

import java.util.stream.Stream;

public class StreamCreationByIteration {
    /**
     * Demonstrate creating a stream by iterating
     * Starting at 40, this stream will be created by adding 2 to the previous entry in the stream until a limit is reached.
     * Similar to .generate(), if there is no limit, this will continue until memory limit is reached.
     *
     * @return 20 index long stream of integers
     */
    public Stream<Integer> iteratedStream() {
        return Stream.iterate(40, n -> n + 2).limit(20);
    }
}
