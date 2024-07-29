package com.bughunter.bree.code;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
public class Vertex<T> {

    private final T data;
    private boolean visited;
    private boolean beingVisited;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Vertex<T>> neighbors = new HashSet<>();

    public void addNeighbor(Vertex<T> vertex) {
        neighbors.add(vertex);
    }

}