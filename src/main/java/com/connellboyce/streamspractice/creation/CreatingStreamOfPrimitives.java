package com.connellboyce.streamspractice.creation;

import java.util.Random;
import java.util.stream.IntStream;

public class CreatingStreamOfPrimitives {

    /**
     * Demonstrate creating an exclusive integer stream
     * This will not include the top bounds
     *
     * @return IntStream from 1-2
     */
    public IntStream demoExclusiveIntStream() {
        // return LongStream.range(1, 3);
        return IntStream.range(1, 3);
    }

    /**
     * Demonstrate creating an inclusive integer stream
     * This will include the top bounds
     *
     * @return IntStream from 1-3
     */
    public IntStream demoInclusiveIntStream() {
        // return LongStream.rangeClosed(1, 3);
        return IntStream.rangeClosed(1, 3);
    }

    /**
     * Demonstrate creating a stream with random integers
     * Parameter is to declare a stream size
     *
     * @return 3 index long IntStream
     */
    public IntStream demoRandomDoubleStream() {
        Random random = new Random();
        // return random.longs(3);
        // return random.doubles(3);
        return random.ints(3);
    }
}
