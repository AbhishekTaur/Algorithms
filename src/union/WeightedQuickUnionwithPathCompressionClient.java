package union;

import java.util.Scanner;

public class WeightedQuickUnionwithPathCompressionClient {
	private static Scanner sc;
	private static WeightedQuickUnionWithPathCompression wQUPC;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Size of the array: " + n);
		
		wQUPC = new WeightedQuickUnionWithPathCompression(n);
		System.out.println("Connected: " + wQUPC.connected(0, 1));
		wQUPC.union(0, 1);
		System.out.println("Connected after union: " + wQUPC.connected(0, 1));
		System.out.println("root of 0: " + wQUPC.root(0));
		System.out.println("root of 1: " + wQUPC.root(1));
		wQUPC.union(1, 2);
		wQUPC.union(0, 2);
		System.out.println("root of 0: " + wQUPC.root(0));
		System.out.println("root of 1: " + wQUPC.root(1));
		System.out.println("root of 2: " + wQUPC.root(2));
		wQUPC.union(3, 4);
		System.out.println("root of 3: " + wQUPC.root(3));
		System.out.println("root of 4: " + wQUPC.root(4));
		wQUPC.union(5, 6);
		wQUPC.union(6, 4);
		wQUPC.union(6, 0);
		System.out.println("root of 4: " + wQUPC.root(4));
		System.out.println("root of 6: " + wQUPC.root(6));
		System.out.println("Size of tree with root 0: " + wQUPC.sizeOfTree(0));
		System.out.println("Size of tree with root 3: " + wQUPC.sizeOfTree(3));
	}

}
