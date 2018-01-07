package DataStructures;

public class SinglyLinkedLists {
    private int length = 0;
    private SLLNode head;

    public SinglyLinkedLists(){
        length = 0;
    }

    public synchronized SLLNode getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public synchronized void insertAtBegin(SLLNode node){
        node.setNext(head);
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(SLLNode node){
        if (head == null){
            head = node;
        }
        else {
            SLLNode p,q;
            for (p=head;(q=p.getNext())!=null;p=q);
            p.setNext(node);
        }
        length++;
    }

    public synchronized void insert(int data, int position){
        if(position<0){
            position=0;
        }
        if (position>length){
            position=length;
        }

        if (head==null){
            head=new SLLNode(data);
        }else if (position ==0 ){
            SLLNode temp = new SLLNode(data,head);
            head=temp;
        }else {
            SLLNode temp = head;
            for (int i =1;i<position;i++){
                temp = temp.getNext();
            }
            SLLNode newNode = new SLLNode(data,temp.getNext());
            temp.setNext(newNode);
        }
        length++;
    }

    public synchronized SLLNode removeFromBegin(){
        SLLNode node = head;
        if (node!=null){
            head = node.getNext();
            node.setNext(null);
        }
        length--;
        return node;
    }

    public synchronized SLLNode removeFromEnd(){
        if (head==null) return null;
        SLLNode p = head, q = null, next = head.getNext();
        if (next == null){
            head = null;
            return p;
        }
        while ((next = p.getNext()) != null){
            q = p;
            p=next;
        }
        q.setNext(null);
        length--;
        return p;
    }

    public synchronized void remove(int position){
        if (position<0) position = 0;
        if (position>length) position = length - 1;
        if (head == null) return ;
        if(position  == 0){
            head = head.getNext();
        }else {
            SLLNode temp = head;
            for (int i = 1;i<position;i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        length--;
    }

    @Override
    public String toString() {
        String result = "[";
        if (head==null){
            return  result+"]";
        }
        result = result + head.getData();
        SLLNode temp = head.getNext();
        while (temp!=null){
            result = result + ","  + temp.getData();
            temp = temp.getNext();
        }
        return result + "]";
    }

    public int length(){
        return length;
    }

    public int getPosition(int data){
        SLLNode temp = head;
        int pos = 0;
        while (temp!=null){
            if (temp.getData()==data){
                return pos;
            }
            pos++;
            temp = temp.getNext();
        }
        return Integer.MIN_VALUE;
    }

    public void clearList(){
        head = null;
        length = 0;
    }
}
