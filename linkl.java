public class linkl{
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
        Node newN=new Node(x);
        if(head==null){
            head=newN;
            return;
        }
        newN.next=head;
        head=newN;
    }
    void addlast(int x){
        Node data=new Node(x);
        if(head==null){
            head=data;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=data;
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
        Node check=head;
        while(last.next!=null){
            last=last.next;
            check=last;
        }
        check.next=null;
    }

    void print(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node last=head;
        while(last!=null){
            System.out.print(last.data+" ");
            last=last.next;
        }
    }

public static void main(String[] args) {
    linkl list=new linkl();
    list.addfirst(1);
    list.addfirst(10);
    list.addfirst(20);
   
    list.print();
    
}
}