package com.gurukul.day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DijkstraOptimized {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the destination index to find the shortest path from A");
	int index = sc.nextInt();
	System.out.print("The weight of the shortest path from A to " + (char) (index + 65) + " " + dijkstra(index));
    }

    public static int dijkstra(int index) {
	int ans = 0;
	int arr[] = new int[8];
	PriorityQueue<Edge> distance = new PriorityQueue<>(new Comparator<Edge>() {

	    @Override
	    public int compare(Edge o1, Edge o2) {
		// TODO Auto-generated method stub
		return o1.getCost() - o2.getCost();
	    }
	});
	int nodes = 8;

	Map<Integer, List<Edge>> graph = new HashMap<>();

// A
	List<Edge> edgeAList = new ArrayList<>();
	edgeAList.add(new Edge(0, 1, 4));
	edgeAList.add(new Edge(0, 3, 8));
	graph.put(0, edgeAList);

//B
	List<Edge> edgeBList = new ArrayList<>();
	edgeBList.add(new Edge(1, 0, 4));
	edgeBList.add(new Edge(1, 2, 3));
	graph.put(1, edgeBList);

// C
	List<Edge> edgeCList = new ArrayList<>();
	edgeCList.add(new Edge(2, 1, 3));
	edgeCList.add(new Edge(2, 6, 2));
	edgeCList.add(new Edge(2, 7, 1));
	graph.put(2, edgeCList);

// D
	List<Edge> edgeDList = new ArrayList<>();
	edgeDList.add(new Edge(3, 0, 8));
	edgeDList.add(new Edge(3, 4, 3));
	edgeDList.add(new Edge(3, 5, 4));
	edgeDList.add(new Edge(3, 6, 5));
	graph.put(3, edgeDList);

// E
	List<Edge> edgeEList = new ArrayList<>();
	edgeEList.add(new Edge(4, 3, 3));
	edgeEList.add(new Edge(4, 5, 9));
	graph.put(4, edgeEList);

// F
	List<Edge> edgeFList = new ArrayList<>();
	edgeFList.add(new Edge(5, 3, 4));
	edgeFList.add(new Edge(5, 4, 9));
	edgeFList.add(new Edge(5, 6, 6));
	edgeFList.add(new Edge(5, 7, 2));
	graph.put(5, edgeFList);

// G
	List<Edge> edgeGList = new ArrayList<>();
	edgeGList.add(new Edge(6, 2, 2));
	edgeGList.add(new Edge(6, 3, 5));
	edgeGList.add(new Edge(6, 5, 6));
	edgeGList.add(new Edge(6, 7, 7));
	graph.put(6, edgeGList);

// H
	List<Edge> edgeHList = new ArrayList<>();
	edgeHList.add(new Edge(7, 2, 1));
	edgeHList.add(new Edge(7, 5, 2));
	edgeHList.add(new Edge(7, 6, 7));
	graph.put(7, edgeHList);
	int start = 0;
	int sum = 0;
	boolean visited[] = new boolean[nodes];
	int parent[] = new int[nodes];
	visited[start] = true;
	int parentCost = 0;
	for (int count = 1; count < nodes; count++) {

	    List<Edge> list = graph.get(start);
	    for (int i = 0; i < list.size(); i++) {

		Edge edge = list.get(i);
		int j = edge.getChild();
		edge.setCost(edge.getCost() + parentCost);
		if (!visited[j]) {
		    distance.add(edge);
		}
	    }
	    Edge selected = distance.poll();
	    start = selected.getChild();
	    ans += selected.getCost();
	    visited[start] = true;
	    System.out.println(selected);
	    arr[count] = selected.getCost();
	    parentCost = selected.getCost();
	}
	return arr[index];
    }

}
