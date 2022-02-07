package com.mh.Array;

import java.util.Scanner;

class tp {
    int inf = 999;
    int data, n, c, b, u, v, cost, i, j, ne, q;
    int[][] a = new int[50][50];
    int min;
    int[] visited = new int[20];
    int[] distance = new int[20];

    Scanner sc = new Scanner(System.in);

    void matrix(int n) {
        //tp *9nn;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.println("Enter the weight between " + i + " and " + j + "  ");
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < visited.length; i++) {
            visited[i] = 0;
            distance[i] = inf;
        }
    }

    void display(int n) {
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    void Dijkstra(int n) {
        ne = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (a[i][j] == 0)
                    a[i][j] = inf;
            }
        }
        visited[1] = 1;
        q = 1;
        while (ne < n) {
            min = inf + 1;
            for (i = 1; i <= n; i++) {
                if (visited[i] != i) {
                    if (distance[i] > a[q][i])
                        distance[i] = a[q][i];
                }
            }
            for (i = 1; i <= n; i++) {
                if (visited[i] != i) {
                    if (min > distance[i]) {
                        min = distance[i];
                        q = i;
                    }
                }
            }
            visited[q] = 1;
            for (i = 1; i <= n; i++) {
                a[q][i] = min + a[q][i];
            }
            ne++;
        }
        distance[1] = 0;
        System.out.println("\nThe shortest distance initial point to the respective nodes is\n");
        for (i = 1; i <= n; i++)
            System.out.print(distance[i] + "\t");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tp tp = new tp();
        int ch, b = 0;
        do {
            System.out.println("\n1.Enter the matrix form of graph\n2.The matrix representation fo graph\n3. Dijkstras algorithm\nEnter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the no. of nodes in the graph");
                    b = sc.nextInt();
                    tp.matrix(b);
                }
                case 2 -> tp.display(b);
                case 3 -> tp.Dijkstra(b);
                default -> System.out.println("\nPlz enter an valid choice");
            }
        } while (ch < 8);
    }
}
// not
