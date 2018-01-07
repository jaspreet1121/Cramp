package DataStructures;

public class SLLNode {
    private int data;
    private SLLNode next;

    public SLLNode(int data){
        this.data = data;
        this.next = null;
    }

    public SLLNode(int data,SLLNode next){
        this(data);
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    public SLLNode getNext() {
        return next;
    }


}
