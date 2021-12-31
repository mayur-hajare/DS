package com.mh.Array;

import java.util.*;

public class Main {

    private int distance[];
    private Set<Integer> settld;
    private PriorityQueue<Node> pQue;

    private int totalNodes;
    List<List<Node>> adjacent;

    public Main(int totalNodes) {

        this.totalNodes = totalNodes;
        distance = new int[totalNodes];
        settld = new HashSet<Integer>();
        pQue = new PriorityQueue<Node>(totalNodes, new Node());
    }

    public void dijkstra(List<List<Node>> adjacent, int s) {
        this.adjacent = adjacent;

        for (int j = 0; j < totalNodes; j++) {
            distance[j] = Integer.MAX_VALUE;
        }

        pQue.add(new Node(s, 0));

        distance[s] = 0;

        while (settld.size() != totalNodes) {

            if (pQue.isEmpty()) {
                return;
            }

            int ux = pQue.remove().n;

            if (settld.contains(ux)) {
                continue;
            }

            settld.add(ux);

            eNeighbours(ux);
        }
    }

    private void eNeighbours(int ux) {

        int edgeDist = -1;
        int newDist = -1;

        for (int j = 0; j < adjacent.get(ux).size(); j++) {
            Node vx = adjacent.get(ux).get(j);

            if (!settld.contains(vx.n)) {
                edgeDist = vx.price;
                newDist = distance[ux] + edgeDist;

                if (newDist < distance[vx.n]) {
                    distance[vx.n] = newDist;
                }

                pQue.add(new Node(vx.n, distance[vx.n]));
            }
        }
    }

    public static void main(String argvs[]) {

        int totalNodes = 9;
        int s = 0;


        List<List<Node>> adjacent = new ArrayList<List<Node>>();

        for (int i = 0; i < totalNodes; i++) {
            List<Node> itm = new ArrayList<Node>();
            adjacent.add(itm);
        }


        adjacent.get(0).add(new Node(1, 3));
        adjacent.get(0).add(new Node(7, 7));
        adjacent.get(1).add(new Node(0, 3));
        adjacent.get(1).add(new Node(2, 7));
        adjacent.get(1).add(new Node(7, 10));
        adjacent.get(1).add(new Node(8, 4));
        adjacent.get(2).add(new Node(1, 7));
        adjacent.get(2).add(new Node(3, 6));
        adjacent.get(2).add(new Node(5, 2));
        adjacent.get(2).add(new Node(8, 1));
        adjacent.get(3).add(new Node(2, 6));
        adjacent.get(3).add(new Node(4, 8));
        adjacent.get(3).add(new Node(5, 13));
        adjacent.get(3).add(new Node(8, 3));
        adjacent.get(4).add(new Node(3, 8));
        adjacent.get(4).add(new Node(5, 9));
        adjacent.get(5).add(new Node(2, 2));
        adjacent.get(5).add(new Node(3, 13));
        adjacent.get(5).add(new Node(4, 9));
        adjacent.get(5).add(new Node(6, 4));
        adjacent.get(5).add(new Node(8, 5));
        adjacent.get(6).add(new Node(5, 4));
        adjacent.get(6).add(new Node(7, 2));
        adjacent.get(6).add(new Node(8, 5));
        adjacent.get(7).add(new Node(0, 7));
        adjacent.get(7).add(new Node(1, 10));
        adjacent.get(7).add(new Node(6, 2));
        adjacent.get(7).add(new Node(8, 6));
        adjacent.get(8).add(new Node(1, 4));
        adjacent.get(8).add(new Node(2, 1));
        adjacent.get(8).add(new Node(3, 3));
        adjacent.get(8).add(new Node(5, 5));
        adjacent.get(8).add(new Node(6, 5));
        adjacent.get(8).add(new Node(7, 6));

        Main obj = new Main(totalNodes);
        obj.dijkstra(adjacent, s);


        System.out.println("The shortest path from the node :");

        for (int j = 0; j < obj.distance.length; j++) {
            System.out.println(s + " to " + j + " is " + obj.distance[j]);
        }
    }
}

class Node implements Comparator<Node> {

    public int n;
    public int price;


    public Node() {

    }

    public Node(int n, int price) {
        this.n = n;
        this.price = price;
    }

    @Override
    public int compare(Node n1, Node n2) {

        if (n1.price < n2.price) {
            return -1;
        }
        if (n1.price > n2.price) {
            return 1;
        }

        return 0;
    }
}  