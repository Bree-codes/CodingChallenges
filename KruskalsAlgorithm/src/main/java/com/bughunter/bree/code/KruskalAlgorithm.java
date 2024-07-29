package com.bughunter.bree.code;

import com.bughunter.bree.code.UndirectedGraph.CycleDetection;
import java.util.*;
import java.util.stream.Stream;

public class KruskalAlgorithm<T> {

    private final int nbrOfVertices;
    private final List<Vertex<T>> vertices;
    private final PriorityQueue<Edge<T>> graph;

    public KruskalAlgorithm(List<Edge<T>> graph) {
        this.graph = new PriorityQueue<>(graph);
        vertices = getVerticesInGraph(graph);
        nbrOfVertices = vertices.size();
    }

    public void run() {
        List<Edge<T>> spanningTree = new ArrayList<>();
        do {
            Edge<T> edge = graph.poll();
            resetTree(Stream.concat(spanningTree.stream(), Stream.of(edge)).toList());
            if (!new CycleDetection<T>().hasCycle(vertices)) {
                spanningTree.add(edge);
            }
        } while (spanningTree.size() < nbrOfVertices - 1);
        printTreeInfo(spanningTree);
    }

    private List<Vertex<T>> getVerticesInGraph(List<Edge<T>> edges) {
        return Stream.concat(
                edges.stream().map(Edge::getSource),
                edges.stream().map(Edge::getDestination)
        ).distinct().toList();
    }

    private void resetTree(List<Edge<T>> spanningTree) {
        vertices.forEach(vertex -> {
            vertex.setVisited(false);
            vertex.setNeighbors(new HashSet<>());
        });
        spanningTree.forEach(edge -> {
            edge.getSource().addNeighbor(edge.getDestination());
            edge.getDestination().addNeighbor(edge.getSource());
        });
    }

    private void printTreeInfo(List<Edge<T>> spanningTree) {
        Integer min = spanningTree.stream()
                .map(Edge::getWeight)
                .reduce(0, Integer::sum);

        spanningTree.forEach(System.out::println);
        System.out.println("Minimum Weight: " + min);
    }

}