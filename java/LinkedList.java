
/**
	Singly-linked-list
	n -> n+1 ---> n+k
**/

class Node{
	String item;
	Node next;
	public Node(){}
	public Node(String item){
		this.item = item;
	}
}

public class LinkedList{

	Node first;
	Node last;
	private int N = 0;

	public void add(String item){
		Node node = new Node();
		node.item = item;
		if(N==0){
			first = node;
			last = node;
			node.next = null;
		}else{
			Node oldFirst = first;
			first = node;
			node.next = oldFirst;
		}
		N++;		
	}

	public void add(String item, int index){

		if(index  < 0 || index > N){
			throw new IllegalArgumentException("Invalid index: "+index);
		}

		if(index == 0){
			add(item);
			return;
		}

		Node prev = null;
		Node curr = null;
		int i = 1;
		for(prev = first, curr = first.next; curr != null; i++){
			if(i == index){
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		Node n  = new Node(item);
		if(curr == null){ // end
			n.next = null;
			prev.next = n;
		}else{
			prev.next = n;
			n.next = curr;
		}
		N++;
	}

/**
	public void add(String item, int index){
		Node n = new Node(item);
		if(index < 0 || index > N){
			throw new IllegalArgumentException("Invalid index");
		}
		if(index == 0){
			add(item);
			return;
		}
		if(index == N){
			last.next = n;
			n.next = null;
			last = n;
			N++;
			return;
		}
		int i=1;
		Node prev=null;
		Node curr=null;
		for(prev = first, curr = first.next;curr.next !=null;i++){
			if(i==index){
				prev.next = n;
				n.next = curr;
				N++;
				break;
			}
			prev = curr;
			curr = curr.next;
		}
	}
**/	
	public int size(){
		return N;
	}

	public boolean isEmpty(){
		return N==0;
	}

	public String remove(int index){
		if(index < 0 || index > (N-1)){
              throw new IllegalArgumentException("Invalid index: "+index);
          }	
		if(index == 0){
			return remove();
		}
		int i=1;
        Node prev=null;
        Node curr=null;
        for(prev = first, curr = first.next;i<N;i++){
			//System.out.print(i + " ");
            if(i==index){ 
                prev.next = curr.next;
                //n.next = curr;
                N--;
				return curr.item;
                //break;
            }   
            prev = curr;
            curr = curr.next;
        }   		
		return null;		
	}	

	public String remove(){
		if(N<1){
			return null;
		}
		if(N==1){
			N--;
			return first.item;
		}
		else{
			N--;
			Node oldFirst = first;
			first = oldFirst.next;
			return oldFirst.item;
		}	
	}

	public void remove(String item){
		if(first.item.equals(item)){
			remove();
			return;
		}
		Node curr = null;
		Node prev = null;
		Node toRemove = null;
		for(prev=first, curr=first.next; curr.next != null;){
            //System.out.print(String.format("%s ",n.item));
			if(curr.item.equals(item)){
		//		toRemove = curr;
				break;
			}
			prev = curr;
			curr = curr.next;
        }
		prev.next = curr.next;
		N--;
	}

	public void traverse(){

		for(Node n=first; n != null; n=n.next){
			System.out.print(String.format("%s ",n.item));
		}
		System.out.println();
	}


	public static void main(String s[]) throws Exception{
		LinkedList l = new LinkedList();

//		l.add("H");
//		l.add("E");
//		l.add("L");
//		l.add("L");
//		l.add("O");
		//l.remove();	
		//l.remove();
		//l.add("n");
		//l.add("a");
//		l.traverse();		
		//l.remove("H");
		//l.remove("L")
//		l.add(" ");
		l.add("W",0);
		System.out.println("-> "+ l.size());
		l.add("O",1);
		System.out.println("-> "+ l.size());
		l.add("R",1);
		System.out.println("-> "+ l.size());
		//l.traverse();
		//l.remove(1);
		//l.traverse();
		//l.remove(2);
		l.traverse();
	//	l.remove(6);
	//	l.traverse();
	//	l.remove(6);
	//	l.traverse();
//		System.out.println("-> "+ l.size());
	//	l.remove(6);
	//	l.traverse();
//		System.out.println("-> "+ l.size());
	//	l.remove(5);
	//	l.traverse();
	}

}
