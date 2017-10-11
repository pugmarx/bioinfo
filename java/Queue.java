
public class Queue{

	LinkedList l = new LinkedList();

	public Queue(){
		l = new LinkedList();
	}

	public void add(String item){
		if(l.isEmpty()){
			l.add(item);
			return;
		}
		l.add(item);
	}

	public String remove(){
		if(l.isEmpty()){
			return null;
		}
		return l.remove(l.size()-1);
	}
	

	public boolean isEmpty(){
		return l.isEmpty();
	}

	public void print(){
		l.traverse();
	}

	public int size(){
		return l.size();
	}

	public static void main(String a[]) throws Exception{
		Queue q = new Queue();
		q.add("a");
		System.out.println(q.size());
		q.add("b");
		System.out.println(q.size());
		q.add("c");
		System.out.println(q.size());
		q.add("c");
		System.out.println(q.size());
		q.print();
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}
}
