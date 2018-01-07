package DataStructures;

import java.util.EmptyStackException;

public class LinkedStack<T> {
    private int length;
    private SLLNode top;

    public LinkedStack(){
        length=0;
        top=null;
    }

    public void push(int data){
        SLLNode sll = new SLLNode(data);
        sll.setNext(top);
        top = sll;
        length++;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    public Boolean isEmpty(){
        return (length==0);
    }

    public int size(){
        return length;
    }

    public int peek() throws EmptyStackException{
        if (isEmpty()==true){
            throw new EmptyStackException();
        }
        return top.getData();
    }

    public String toString(){
        String result = "";
        SLLNode current = top;
        while (current!=null){
            result = result + current.getData() + "\n";
            current = current.getNext();
        }
        return result;
    }

}
