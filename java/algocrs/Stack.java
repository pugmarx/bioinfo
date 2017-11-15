/**
 *      Singly-linked-list
 *      n -> n+1 ---> n+k
 **/

/**
 * class Node{
 *      String item;
 *      Node next;
 *      public Node(){}
 *      public Node(String item){
 *              this.item = item;
 *      }
 * }
 **/
public class Stack {
   LinkedList l = new LinkedList();

   public Stack() {
      l = new LinkedList();
   }

   public void push(String item) {
      l.add(item);
   }

   public String pop() {
      return(l.remove());
   }

   public boolean isEmpty() {
      return(l.size() == 0);
   }

   public void print() {
      l.traverse();
   }

   public static void main(String a[]) throws Exception {
      Stack s = new Stack();

      s.push("a");
//		s.push("b");
//		s.push("c");
//		s.push("d");
      s.print();
      System.out.println(s.pop());
      System.out.println(s.pop());
      s.print();
//		System.out.println(s.pop());
      //System.out.println(s.pop());
      //	System.out.println(s.pop());
      //	System.out.println(s.pop());
   }
}
