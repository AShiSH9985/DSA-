package DSA;

public class linkl {
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
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void addlast(int x){
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
            return;
        }
        Node prev=head;
        while(prev.next!=null){
            prev=prev.next;
        }
        prev.next=newnode;
    }

    void delfirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    void dellast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node last=head;
        Node prev=head;
        while(last.next!=null){
            prev=last;
            last=last.next;
        }
        prev.next=null;
    }

    void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node prev=head;
        while(prev!=null){
            System.out.print(prev.data+" ");
            prev=prev.next;
        }
    }
    public static void main(String[] args) {
        linkl list=new linkl();
        list.addfirst(5);
        list.addlast(10);
        list.addfirst(15);
        list.addlast(120);
        list.print();
        System.out.println();
        list.dellast();
        list.delfirst();
        list.print();
    }
}
