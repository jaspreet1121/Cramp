package DataStructures;

import java.util.Stack;

public class FixedSizeArrayStack {

    protected int capacity;

    public static final int CAPACITY = 10;

    protected int[] stackRep;

    protected int top = -1;

    public FixedSizeArrayStack(){
        this(CAPACITY);
    }

    public FixedSizeArrayStack(int cap){
        capacity = cap;
        stackRep = new int[capacity];
    }

    public int size(){
        return top+1;
    }

    public Boolean isEmpty(){
        return (top < 0);
    }

    public void push(int data) throws Exception {
        if (size() == capacity){
            throw new Exception("Stack is Full.");
        }
        stackRep[++top] = data;
    }

    public int pop() throws Exception {
        int data;
        if (isEmpty()==true){
            throw new Exception("Stack is Empty.");
        }
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        return data;
    }

    public String toString(){
        String s;
        s = "[";
        if (size()>0){
            s+=stackRep[0];
        }
        if (size()>1){
            for (int i = 1;i<=size()-1;i++){
                s+=","+stackRep[i];
            }
        }
        return s+"]";
    }

    public int top() throws Exception {
        if (isEmpty()==true){
            throw new Exception("Stack is Empty.");
        }
        return stackRep[top];
    }

    public Boolean isFull(){
        return ((top+1)==capacity);
    }

    public void deleteStack(){
        stackRep = new int[capacity];
        top = -1;
    }

}
