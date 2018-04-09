package union;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewQuestion2 {
	private int[] id;
	private int[] sz;
	private Map<Integer, List<Integer>> elements = new HashMap<>();
	private List<Integer> roots = new ArrayList<>();
	
	public List<Integer> getRoots() {
		return roots;
	}

	public void setRoots(List<Integer> roots) {
		this.roots = roots;
	}

	public InterviewQuestion2(int N)
	{
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}
	
	private void populateRoots() {
		for(int i = 0; i < id.length; i++) {
			if(id[i] == i) {
				roots.add(i);
			}
		}
	}
	
	private void initilizeElements() {
		for(int i : roots) {
			List<Integer> l = new ArrayList<>();
			l.add(i);
			elements.put(i, l);
		}
	}
	
	public void populateElements() {
		populateRoots();
		initilizeElements();
		for(int r: roots) {
			List<Integer> ary = null;
			for(int i = 0; i < id.length; i++) {
				if(!roots.contains(i) && root(i) == r) {
					ary = elements.get(r);
					ary.add(i);
				}
			}
			elements.put(r, ary);	
		}	
	}
	
	public int find(int value) {
		int largest = 0;
		for(int i =0; i < roots.size(); i++) {
			List<Integer> list = elements.get(roots.get(i));
			Collections.sort(list);
			if(list.contains(value)) {
				largest = list.get(list.size()-1);
			}
		}
		return largest;
		
	}
	
	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}
	
	public int root(int i)
	{
		while (i != id[i]) i = id[i];
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
