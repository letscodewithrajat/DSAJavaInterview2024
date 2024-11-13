package stacks;

/**
 * @author rajatsrivastava
 **/
public class StackUsingArray {



    String[] stack;
    int capacity, top;

    public StackUsingArray(int size) {
        this.capacity = size;
        stack = new String[capacity];
        top = -1;
    }
    public StackUsingArray() {
        this.capacity = 5;
        stack = new String[capacity];
        top = -1;
    }

   void push(String data){
        if(top+1>= capacity){
            System.out.println("Overflow");
        }
        else {
            top++;
            stack[top] =data;
            System.out.println("Added");
        }
    }
    String pop(){
        if(top < 0){
            System.out.println("Underflow");
            return null;
        }
        else {
            String data = stack[top];
            top--;
            System.out.println("Popped");
            return data;
        }
    }
    String peek(){
        if(top < 0){
            System.out.println("Underflow");
            return null;
        }
        else {
            String data = stack[top];
           // top--;
            System.out.println("Popped");
            return data;
        }
    }

    boolean isEmpty(){
        return top == -1;
    }
    void display(){
        for (int i =0 ; i <=top ; i ++){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray names = new StackUsingArray();
        names.push("A");
        names.push("B");
        names.display();
        String s= names.pop();
        System.out.println(s);
        s = names.peek();
        System.out.println(s);
    }
}
