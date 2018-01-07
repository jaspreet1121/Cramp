import DataStructures.LinkedStack;
import DataStructures.SLLNode;
import DataStructures.SinglyLinkedLists;

public class Baby {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(4);
        stack.push(2);
        stack.push(7);
        stack.pop();
        stack.push(1);
        System.out.println(stack.toString());
    }
}
