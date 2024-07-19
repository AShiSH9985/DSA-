package DSA;

import java.util.Scanner;

public class As1 {
    static class node {
        String name;
        int marks;
        node next;

        node(int marks, String name) {
            this.name = name;
            this.marks = marks;
            this.next = null;
        }
    }

    static class stackk {
        static node top = null;

        public static boolean isEmpty() {
            return top == null;
        }

        public static void add(String name, int marks) {
            node newnode = new node(marks, name);
            if (isEmpty()) {
                top = newnode;
                return;
            }
            newnode.next = top;
            top = newnode;
        }

        public static void remove() {
            if (isEmpty()) {
                System.out.println("we have not any student record");
                return;
            }
            top = top.next;
        }

        public static void displayy() {
            if (isEmpty()) {
                System.out.println("we have not any student record");
                return;
            }
            node temp = top;
            while (temp != null) {
                System.out.println("name =" + top.name);
                System.out.println("marks =" + top.marks);
                System.out.println();
                temp=temp.next;
            }

        }
        
        
       
    }

    public static void main(String[] args) {
        stackk student = new stackk();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Display Students\n4. Display Top 3 Students\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student name : ");
                    String n =sc.next();
                    System.out.print("Enter marks : ");
                    int marks = sc.nextInt();
                    student.a1dd(n, marks);
                    break;
                case 2:
                    System.out.println("done");
                    student.remove();
                    break;
                case 3:
                    System.out.println("List of student");
                    student.displayy();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Program close");
                    break;          
                default:
                    System.out.println("Program close");
                    
            }
        }while( choice <= 5);
      
    }

}
