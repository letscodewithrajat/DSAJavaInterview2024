package stacks;

/**
 * @author rajatsrivastava
 **/
public class ParenthesisChecker {

    Character[] stack;
    int top , capacity;

    public ParenthesisChecker(int size) {
        this.capacity = size;
        stack = new Character[capacity];
        top = -1;
    }

    public ParenthesisChecker() {
        this.capacity = 5;
        stack = new Character[capacity];
        top = -1;
    }

    void push(char ch){
        if (top +1 >= capacity){
            System.out.println("Overflow");
        }else{
            top++;
            stack[top]=ch;
            System.out.println("Pushed");
        }
    }
    Character pop(){
        if (top  < 0){
            System.out.println("Underflow");
            return null;
        }else{
            char ch = stack[top];
            top--;
            System.out.println("popped");
            return ch;
        }
    }
    Character peek(){
        if (top  < 0){
            System.out.println("Underflow");
            return null;
        }else{
            char ch = stack[top];
            return ch;
        }
    }
    boolean isEmpty(){
        return top ==-1;
    }

    void display(){
        for (int i =0 ;i <=top;i++){
            System.out.println(stack[i]);
        }
    }

    boolean parenthesisChecker(String str){
    ParenthesisChecker stk = new ParenthesisChecker(100);
    for (int i =0; i < str.length(); i++){
        char c = str.charAt(i);

        switch (c){
            case '{': case '[': case '(':
                stk.push(c);
                break;

            case ')':
                char b = stk.pop();
                if(b != '('){
                    System.out.println(b + " missing ) ");
                    return false;
                }
                break;
            case '}':
                char curly = stk.pop();
                if(curly != '{'){
                    System.out.println(curly + " missing } ");
                    return false;
                }
                break;
            case ']':
                char square = stk.pop();
            if(square != '['){
                System.out.println(square + " missing ] ");
                return false;
            }
            break;
        }

    }
    if(stk.isEmpty()) return true;
    else return false;
    }

    public static void main(String[] args) {
        ParenthesisChecker pc = new ParenthesisChecker();
        System.out.println(pc.parenthesisChecker("csjdkc{csndsv{cknlsdv(jvs)cjsjd[csd]ks}jvdfs}"));
        System.out.println(pc.parenthesisChecker("csjdkc{csndsv{cknls]dv(jvs)cjsjd[csd]ks}jvdfs}"));

    }

}
