package com.connellboyce.streamspractice.practices;

import java.util.*;
import java.util.stream.Stream;

public class StreamCollection {

    /**
     * Demonstrate the ability to stream a collection
     *
     * @return stream of collection
     */
    public Stream<String> demoStreamCollection() {
        Collection<String> collection = Arrays.asList("a", "b", "c");
        return collection.stream();
    }

    /**
     * Demonstrate the ability to stream a list
     *
     * @return stream of list
     */
    public Stream<String> demoStreamList() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        return list.stream();
    }

    /**
     * Demonstrate the ability to stream a set
     *
     * @return stream of set
     */
    public Stream<String> demoStreamSet() {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        return set.stream();
    }
}
