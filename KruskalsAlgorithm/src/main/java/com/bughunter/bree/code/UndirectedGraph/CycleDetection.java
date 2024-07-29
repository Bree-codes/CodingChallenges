package com.bughunter.bree.code.UndirectedGraph;

import com.bughunter.bree.code.Vertex;

import java.util.Arrays;
import java.util.List;

public class CycleDetection<T> {

    public boolean hasCycle(List<Vertex<T>> vertices) {
        for (Vertex<T> vertex : vertices) {
            if (!vertex.isVisited() && hasCycle(null, vertex)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasCycle(Vertex<T> caller, Vertex<T> current) {
        current.setVisited(true);
        for (Vertex<T> neighbor : current.getNeighbors()) {
            if (neighbor.isVisited() && !neighbor.equals(caller) || !neighbor.isVisited() && hasCycle(current, neighbor)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        Vertex<String> vertexA = new Vertex<>("A");
        Vertex<String> vertexB = new Vertex<>("B");
        Vertex<String> vertexC = new Vertex<>("C");
        Vertex<String> vertexD = new Vertex<>("D");
        Vertex<String> vertexE = new Vertex<>("E");
        Vertex<String> vertexF = new Vertex<>("F");

        vertexA.addNeighbor(vertexB);
        vertexB.addNeighbor(vertexA);

        vertexA.addNeighbor(vertexC);
        vertexC.addNeighbor(vertexA);

        vertexB.addNeighbor(vertexE);
        vertexE.addNeighbor(vertexB);

        vertexC.addNeighbor(vertexD);
        vertexD.addNeighbor(vertexC);

        vertexD.addNeighbor(vertexE);
        vertexE.addNeighbor(vertexD);

        vertexE.addNeighbor(vertexF);
        vertexF.addNeighbor(vertexE);

        List<Vertex<String>> graph = Arrays.asList(vertexA, vertexB, vertexC, vertexD, vertexE, vertexF);
        System.out.println(new CycleDetection<String>().hasCycle(graph));

    }

}
