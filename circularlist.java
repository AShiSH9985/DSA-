public class circularlist {
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
            head.next=head;
            return;
        }
        Node last=head;
        while(last.next!=head){
        last=last.next;}
        head.prev=newnode;
        newnode.next=head;
        last.next=newnode;
        head=newnode;
    }
  /*   void delete(int d){
       Node prev=head;
        for(int i=0;i<d;i++){
            prev=head;
            head=head.next;
        }
        head.next=prev;
        prev.next=head.next;
        
    }*/
    void addlast(int x){
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
            head.next=head;
            return;
        }
        Node last=head;
        while(last.next!=head){
            last=last.next;
        }
        last.next=newnode;
        newnode.prev=last;
        newnode.next=head;
        head.prev=newnode;
    }
    
    void delfirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node last=head;
        while(last.next!=head){
            last=last.next;
        }
        last.next=head.next;
        head=head.next;
        head.prev=last;

    }

    void dellast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node last=head;
        Node Check=head;
        while(last.next!=head){
            last=last.next;
            Check=last;
        }
        Check.next=head;
        head.prev=Check;

    }
   
    void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node last=head;
        while(last.next!=head){
            System.out.println(last.data+" ");
            last=last.next;
        }
        System.out.println(last.data+" ");

    }

    

    public static void main(String[] args) {
        circularlist list=new circularlist();
        list.addfirst(5);
        list.addlast(10);
        list.addfirst(30);
       list.print();
        System.out.println();
       //list.delete(2);
       list.print();
    }
}
