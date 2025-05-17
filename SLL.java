class SLL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //add-first,last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
   //add-Last
    public void addLast(String data){
         Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next=newNode;
       // newNode.next = null;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data+"->");
             currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.addFirst("10");
        list.addLast("30");
        list.printList();
    }
}