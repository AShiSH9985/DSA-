package DSA;

public class doublecircularlist {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int x){
            data=x;
            prev=null;
            next=null;
        }
    }
    void addfirst(int x){
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
            head.next=head;
            return;
        }
        Node a=head;
        while(a.next!=head){
            a=a.next;
        }
        newnode.prev=a;
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    void addlast(int x){
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
            head.next=head;
            return;
        }
        Node a=head;
        while(a.next!=null){
            a=a.next;
        }
        a.next=newnode;
        newnode.prev=a;
        newnode.next=head;
        head.prev=newnode;
    }
    void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node a=head;
        while(a.next!=head){
            System.out.print(a.data+" ");
            a=a.next;
        }
        System.out.println(a.data+" ");
    }
    public static void main(String[] args){
        doublecircularlist list=new doublecircularlist();
        list.addfirst(5);
        list.addlast(100);
        list.addfirst(15);
        list.addlast(110);
        list.addfirst(15);
        list.addlast(120);
        list.print();
    }
}
