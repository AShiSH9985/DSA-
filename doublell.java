public class doublell {
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
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    void addlast(int x){
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;
        newnode.prev=last;
        newnode.next=null;
    }

    void delfirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head.next=null;
        head.prev=null;
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
        last.prev=null;
    }

    void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node last=head;
        while(last!=null){
            System.out.print(last.data+" ");
            last=last.next;
        }
    }
    
    public static void main(String[] args) {
        doublell list=new doublell();
        list.addfirst(50);
        list.addfirst(20);
        list.addlast(10);
        list.print();
        System.out.println();
      // list.delfirst();
       // list.print();
    }
}
