package union;

public class WeightedQuickUnionWithPathCompression {
	private int[] id;
	private int[] sz;
	
	public WeightedQuickUnionWithPathCompression(int N)
	{
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}
	
	public int root(int i)
	{
		while (i != id[i]) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q)
	{
		return root(p) == root(q);
	}
 
	public void union(int p, int q)
	{
		int i = root(p);
		int j = root(q);
		if(i == j) return;
		if(sz[i] < sz[j]) {
			id[i] = j;
			sz[j] += sz[i];
		} else {
			id[j] = i;
			sz[i] += sz[j];
		}
	}
	
	public int sizeOfTree(int i) {
		return sz[i];
	}


}
