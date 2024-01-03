
import java.util.*;

class Node {
	int start;
	int end;
	int pos;
	Node (int start, int end, int pos) {
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
}

class sortByB implements Comparator<Node> {
	public int compare(Node a, Node b) {
		// ascending order of end times
		return a.end - b.end;
	}
}

class Main {
	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = new int[] {1, 2, 3, 5, 4};

		ArrayList<Node> Nodes = new ArrayList<>();

		for (int i = 0; i < a.length; i ++) {
			Nodes.add(new Node(a[i], b[i], i + 1));
		}

		// sortByB obj = new sortByB();
		Collections.sort(Nodes, new sortByB());
		System.out.println("\nSorted by ArrayB");
 
        // Again iterating over entries to print them
        for (int i = 0; i < Nodes.size(); i++)
            System.out.println(Nodes.get(i).start + " " + Nodes.get(i).end);


	}

}

