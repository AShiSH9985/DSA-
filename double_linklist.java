package DSA;

public class double_linklist {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int x){
            data=x;
            next=null;
            prev=null;
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
        Node a=head;
        while(a.next!=null){
            a=a.next;
        }
        a.next=newnode;
        newnode.prev=a;
    }
    void delfirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void dellast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node a=head;
        Node b=head;
        while(a.next!=null){
            b=a;
            a=a.next;
        }
        b.next=null;
        a.prev=null;
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
        double_linklist list=new double_linklist();
        list.addfirst(5);
        list.addlast(10); 
        list.addfirst(15);
        list.addlast(20); 
        list.addfirst(25);
        list.addlast(130);
        list.print();
        System.out.println();
        list.delfirst();
        list.dellast();
        list.print();
    }
}
