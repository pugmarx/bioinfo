/**
 * Array impl. of a FixedCapacityStack
 **/

@SuppressWarnings("unchecked")
public class ArrayFCStack <T> {
   private T[] arr;
   private int size;
   private int capacity;

   public ArrayFCStack(int capacity) {
      size          = 0;
      this.capacity = capacity;
      arr           = (T[])new Object[capacity];
   }

   private void resizeArray(int toSize) {
      T[] newArray = (T[])new Object[toSize];
      for (int i = 0; i < size; i++) {
         newArray[i] = arr[i];
      }
      arr = newArray;
   }

   // Double the size if full
   public void push(T t) {
      if (size == capacity) {
         resizeArray(2 * capacity);
      }
      arr[size++] = t;
   }

   // Halve the size if array is half empty
   public T pop() {
      if (size <= capacity / 2) {
         resizeArray(capacity / 2);
      }
      T tmp = arr[--size];
      arr[size] = null;

      return(tmp);
   }

   public void print() {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] != null) {
            System.out.print(arr[i] + " |");
         }
         else{
            System.out.print(" - |");
         }
      }
      System.out.println();
   }

   public static void main(String arg[]) {
      ArrayFCStack <String> afcs = new ArrayFCStack <>(6);
      afcs.push("a");
      afcs.push("b");
      afcs.push("c");
      afcs.push("d");
      afcs.pop();
      afcs.pop();
//		afcs.pop();
//		afcs.pop();
      afcs.print();
   }
}
