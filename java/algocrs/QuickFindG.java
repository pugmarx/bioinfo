/**
 Basic QuickFind impl. for Union-Find requirement
**/

public class QuickFind<T>{

	T a[];

	public QuickFind(int size){
		_init(size);
	}
	
	public void _init(int sz){
		if(sz < 1) throw new IllegalArgumentException("invalid size");
		a = (T[])new Object[size];
		for(int i=0;i<a.length;i++){
			a[i]=null; // default	
		}	
	}

	// Makes union of p and q
	public union(T p, T q){
					
	}

	// Returns index of p
	public int find(T p){
		for(int i=0;i<a.length;i++){
			if(a[i].equals(p)) return i;
		}
	}

	// Indicates whether p and q are connected
	public boolean connected(T p, T q){
		int i = find(p);
		int j = find(q);
	
		return a[i].equals(a[j]);	
	}
}
