package com.bughunter.bree.code;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Vertex<String> vertexA = new Vertex<>("A");
        Vertex<String> vertexB = new Vertex<>("B");
        Vertex<String> vertexC = new Vertex<>("C");
        Vertex<String> vertexD = new Vertex<>("D");
        Vertex<String> vertexE = new Vertex<>("E");
        Vertex<String> vertexF = new Vertex<>("F");
        Vertex<String> vertexG = new Vertex<>("G");

        List<Edge<String>> graph1 = Arrays.asList(
                new Edge<>(vertexA, vertexB, 4),
                new Edge<>(vertexA, vertexC, 4),
                new Edge<>(vertexB, vertexC, 2),
                new Edge<>(vertexC, vertexD, 3),
                new Edge<>(vertexC, vertexF, 4),
                new Edge<>(vertexC, vertexE, 2),
                new Edge<>(vertexD, vertexF, 3),
                new Edge<>(vertexE, vertexF, 3)
        );

        List<Edge<String>> graph2 = Arrays.asList(
                new Edge<>(vertexA, vertexB, 7),
                new Edge<>(vertexA, vertexD, 5),
                new Edge<>(vertexB, vertexC, 8),
                new Edge<>(vertexB, vertexE, 7),
                new Edge<>(vertexB, vertexD, 9),
                new Edge<>(vertexC, vertexE, 5),
                new Edge<>(vertexD, vertexE, 15),
                new Edge<>(vertexD, vertexF, 6),
                new Edge<>(vertexE, vertexF, 8),
                new Edge<>(vertexE, vertexG, 9),
                new Edge<>(vertexF, vertexG, 11)
        );

        List<Edge<String>> graph3 = Arrays.asList(
                new Edge<>(vertexA, vertexB, 5),
                new Edge<>(vertexA, vertexC, 2),
                new Edge<>(vertexB, vertexC, 3),
                new Edge<>(vertexB, vertexD, 8),
                new Edge<>(vertexB, vertexE, 7),
                new Edge<>(vertexD, vertexE, 6),
                new Edge<>(vertexC, vertexE, 3)
        );

        List<Edge<String>> graph4 = Arrays.asList(
                new Edge<>(vertexA, vertexB, 5),
                new Edge<>(vertexA, vertexC, 2),
                new Edge<>(vertexB, vertexC, 4),
                new Edge<>(vertexB, vertexD, 8),
                new Edge<>(vertexB, vertexE, 7),
                new Edge<>(vertexD, vertexE, 2),
                new Edge<>(vertexC, vertexE, 3)
        );

        new KruskalAlgorithm<>(graph1).run();
        new KruskalAlgorithm<>(graph2).run();
        new KruskalAlgorithm<>(graph3).run();
        new KruskalAlgorithm<>(graph4).run();

    }
}