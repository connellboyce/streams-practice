package com.connellboyce.streamspractice.practices;

import java.util.stream.Stream;

public class BuildingStreams {

    /**
     * Demonstrate building a stream manually to be a specific stream type, in this case: String
     *
     * @return stream of String
     */
    public Stream<String> buildStringStream() {
        return Stream.<String>builder().add("a").add("b").add("c").build();
    }

    /**
     * Demonstrate building a stream manually without explicitly stating what type the stream should contain
     * In this case, it will default to Object
     *
     * @return stream of Object
     */
    public Stream<Object> buildObjectStream() {
        return Stream.builder().add("a").add("b").add("c").build();
    }
}
