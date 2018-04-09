package union;

import java.util.Scanner;

public class WeightedQuickUnionClient {

	private static Scanner sc;
	private static WeightedQuickUnion wQU;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Size of the array: " + n);
		
		wQU = new WeightedQuickUnion(n);
		System.out.println("Connected: " + wQU.connected(0, 1));
		wQU.union(0, 1);
		System.out.println("Connected after union: " + wQU.connected(0, 1));
		System.out.println("root of 0: " + wQU.root(0));
		System.out.println("root of 1: " + wQU.root(1));
		wQU.union(1, 2);
		wQU.union(0, 2);
		System.out.println("root of 0: " + wQU.root(0));
		System.out.println("root of 1: " + wQU.root(1));
		System.out.println("root of 2: " + wQU.root(2));
		wQU.union(3, 4);
		System.out.println("root of 3: " + wQU.root(3));
		System.out.println("root of 4: " + wQU.root(4));
		wQU.union(4, 2);
		System.out.println("root of 4: " + wQU.root(4));
		System.out.println("root of 3: " + wQU.root(3));
		System.out.println("Size of tree with root 0: " + wQU.sizeOfTree(0));
		System.out.println("Size of tree with root 3: " + wQU.sizeOfTree(3));
		System.out.println("Get all id's: " + wQU.getId()[4]);
	}

}
