package com.connellboyce.streamspractice.creation;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamArray {

    /**
     * Demonstrate the ability to stream an array at the source
     * There is no declaration of the array beforehand in this method.
     *
     * @return stream of array
     */
    public Stream<String> demoArrayAsSourceOfStream() {
        return Stream.of("a", "b", "c");
    }

    /**
     * Demonstrate the ability to stream a pre-existing array
     *
     * @return stream of existing array
     */
    public Stream<String> demoStreamOfExistingArray() {
        String[] array = new String[]{"a","b","c"};
        return Arrays.stream(array);
    }

    /**
     * Demonstrate the ability to stream specific portions of an existing array
     *
     * @return stream of partial existing array
     */
    public Stream<String> demoStreamOfPartialExistingArray() {
        String[] array = new String[]{"a","b","c"};
        return Arrays.stream(array, 1, 3);
    }
}
