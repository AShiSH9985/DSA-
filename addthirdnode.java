public class addthirdnode {
    Node head;
   class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
   }
  
   void addfirst(int x){
    Node NewNode=new Node(x);
        if(head==null){
            head=NewNode;
            return;
        }
        NewNode.next=head;
        head=NewNode;
    }

    void add3position(int x){
        Node NewNode=new Node(x);
        if(head==null){
            head=NewNode;
            return;
        }
        int count=0;
        Node a=head;
        Node prev=head;
        while(a.next!=null){
            prev=a;
            a=a.next;
            count++;
            if(count==3){
                prev.next=NewNode;
                NewNode.next=a;
                return;
            }
        }
    }

    void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node a=head;
        while(a!=null){
        System.out.print(a.data+" ");
            a=a.next;
        }
    }
    public static void main(String[] args) {
        addthirdnode llist=new addthirdnode();
        llist.addfirst(25);
        llist.addfirst(15);
        llist.addfirst(05);
        llist.addfirst(35);
        llist.print();
        System.out.println();
        llist.add3position(1);
        llist.print();
    }
}