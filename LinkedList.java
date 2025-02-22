import java.util.*;
public class LinkedList{
     Node head;
     private int size;
     LinkedList(){
         this.size = 0;
     }
     public class Node{
         String data;
         Node next;
         Node(String data){
             this.data = data;
             this.next = null;
             size++;
         }
     }
     // Add function => First , Last
    // Insert the node in the First
     public void addFirst(String data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;
     }
     // Insert the node into last
    public void addLast(String data){
         Node newNode = new Node(data);
         if(head == null){
             newNode.next = head;
             head = newNode;
         }
         Node currNode = head;
         while(currNode.next != null){
             currNode = currNode.next;
         }
         currNode.next = newNode;
    }
      public void deleteFirst(){
           if(head == null){
               System.out.println("List is empty");
               return;
           }
           size--;
           head = head.next;
      }
      public void deleteLast(){
          if(head == null){
              System.out.println("list is empty");
              return;
          }
          size--;
          if(head.next == null ){
                 head = null;
                 return;
          }
          Node secondLast = head;
          Node lastNode = head.next;
          while(lastNode != null){
              lastNode = lastNode.next;
              secondLast = secondLast.next;
          }
           secondLast = null;
      }
    // print node
    public void printNode(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }
    public int getSize(){
         return size;
    }
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printNode();

        list.addLast("List");
        list.printNode();

        list.addFirst("this");
        list.printNode();

        list.deleteFirst();
        list.printNode();

        list.deleteLast();
        list.printNode();
        System.out.println(list.getSize());
    }
}
