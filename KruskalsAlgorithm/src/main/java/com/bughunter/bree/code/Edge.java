package com.bughunter.bree.code;

import lombok.Data;

@Data
public class Edge<T> implements Comparable<Edge<T>> {

    private final Vertex<T> source;
    private final Vertex<T> destination;
    private final int weight;

    public Edge(Vertex<T> source, Vertex<T> destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        source.addNeighbor(destination);
        destination.addNeighbor(source);
    }

    @Override
    public int compareTo(Edge<T> edge) {
        return Integer.compare(weight, edge.getWeight());
    }

}