import arrays.DynamicArray;

/**
 * @author rajatsrivastava
 **/
public class Main {
    public static void main(String[] args) {

     DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0,"X");
        System.out.println("size: " +dynamicArray.size());
        System.out.println("capacity: " +dynamicArray.capacity());
        System.out.println(dynamicArray);

        dynamicArray.insert(2,"Y");
        System.out.println("size: " +dynamicArray.size());
        System.out.println("capacity: " +dynamicArray.capacity());
        System.out.println(dynamicArray);

        dynamicArray.delete("A");
        System.out.println("size: " +dynamicArray.size());
        System.out.println("capacity: " +dynamicArray.capacity());
        System.out.println(dynamicArray);

        System.out.println(dynamicArray.search("C"));
        System.out.println(dynamicArray.search("D"));

        dynamicArray.add("P");
        dynamicArray.add("Q");
        System.out.println(dynamicArray);
        System.out.println("size: " +dynamicArray.size());
        System.out.println("capacity: " +dynamicArray.capacity());

        dynamicArray.delete("Q");
        System.out.println(dynamicArray);
        System.out.println("size: " +dynamicArray.size());
        System.out.println("capacity: " +dynamicArray.capacity());

        dynamicArray.delete("P");
        System.out.println(dynamicArray);
        System.out.println("size: " +dynamicArray.size());
        System.out.println("capacity: " +dynamicArray.capacity());

        dynamicArray.delete("B");
        System.out.println(dynamicArray);
        System.out.println("size: " +dynamicArray.size());
        System.out.println("capacity: " +dynamicArray.capacity());

        /*dynamicArray.insert(0,"X");
        dynamicArray.delete("A");
        System.out.println(dynamicArray.search("C"));*/

        //System.out.println(dynamicArray);
        /*
        System.out.println("Empty: " +dynamicArray.isEmpty());
        System.out.println("size: " +dynamicArray.size());
        System.out.println("capacity: " +dynamicArray.capacity());*/
    }
}