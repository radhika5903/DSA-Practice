public class LinkedList{

    public static void insertAtEnd(Node head, int val){
        Node t = new Node(val);
        Node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=t;
    }

    public static void display(Node head){
        //this will print list
        // while(head!=null){
        // System.out.print(head.data+" ");
        // head=head.next;
        // }
        //this will not print list bcz my head is change and lost bcz of previous while loop        
        // while(head!=null){
        // System.out.print(head.data+" ");
        // head=head.next;
        // }
        //this will also not print list bcz my head is change and lost bcz of previous while loop so in temp there will only come null value in head node 
        // Node temp=head;
        // while(temp!=null){
        // System.out.print(temp.data+" ");
        // temp=temp.next;
        // }

        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
    }

    //recursively printing the linkedlist
    public static void displayrecur(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        displayrecur(head.next);
    }

    //recursively printing the linkedlist in revserse order
    public static void displayrecurrev(Node head){
        if(head==null)return;
        displayrecurrev(head.next);
        System.out.print(head.data+" ");
    }

    //find the length of the LL
    public static int length(Node head){
        int count = 0;
        while(head!=null){
        count++;
        head=head.next;
        }
        return count;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        }
    }
   
    public static void main(String[] args) {
        //manually making the LL
        Node a = new Node(5);
        //System.out.println(a.next);//null
        Node b = new Node(6);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //all data will come diff
        // System.out.println(a);//LinkedList$Node@2f92e0f4
        // System.out.println(a.next);//LinkedList$Node@28a418fc
        // System.out.println(b);//LinkedList$Node@28a418fc
        // System.out.println(c);//LinkedList$Node@5305068a
        // System.out.println(d);//LinkedList$Node@1f32e575

        //output will be same i.e 6
        // System.out.println(b.data);
        // System.out.println(a.next.data);//for b
        // System.out.println(a.next.next.data);//for c

        //printing or displaying the list
        //Node temp=a;
        //if we know no. of nodes
        // for(int i=1; i<=5;i++){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        //for n no. of nodes means we dont know no. of nodes
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        //calling by function or method
        // display(a);
        // System.out.println();
        //display(a);// 2nd time list will print bcz nodes will remain same bcz of temp
        //displayrecur(a);
        //displayrecurrev(a);

//printing the length of the LL
        System.out.println("Length is : " + length(a));

        insertAtEnd(a, 78);
        display(a);
    }
}