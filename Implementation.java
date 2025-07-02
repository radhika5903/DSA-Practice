public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAt(int idx, int val){
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtBeginning(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("wrong index");
                return;
            }
            Node t = new Node(val);
            Node temp = head;
            for(int i=1; i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next=t;
            size++;
        }
        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head==null){//empty list
                //head = tail = temp;
                insertAtEnd(val);
            }
            else{// non empty list
                temp.next = head;
                head= temp;
            }
            size++;
        }

        int getElementAt(int idx){
            if(idx<0 || idx>size){
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
            for(int i=0; i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx < 0 || idx >= size){
            System.out.println("wrong index");
            return;
            }
            if(idx==0){
                head = head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1; i<=idx-1;i++){
                temp = temp.next;
            }
            // if(idx==size-1){
            //     tail = temp;
            //     return;
            // }
            
            temp.next = temp.next.next;
            
            size--;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            }
            System.out.println();
        }
        // int size(){//for o(n) TC
        //     Node temp = head;
        //     int count = 0;
        //     while(temp!=null){
        //     count++;
        //     temp=temp.next;
        //     }
        //     return count;
        // }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtBeginning(10);
        ll.insertAtEnd(4);
        ll.display();
        
        ll.insertAtEnd(5);
        ll.display();
        
        ll.insertAtEnd(12);
        ll.display();
        
        ll.insertAtBeginning(25);
        ll.display();

        ll.insertAt(5,100 );
        ll.display();

        ll.insertAt(0,200 );
        ll.display();

        ll.deleteAt(4);
        ll.display();

        //Printing the size of LL
        //System.out.println(ll.size());//o(n) method for printing size of LL
        System.out.println(ll.size);

        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        System.out.println(ll.getElementAt(-2));
    }
}

