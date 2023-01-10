public class singlelinkedlist {
	 Node head = null;
     class Node {
         int data;
		Node next;

		 Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
  
    
	public void addNodeAtTheBeginning(int data) {
        System.out.println("Add a node with data " + data + " in the beginning.");
		// Create a new node
		Node newNode = new Node(data);

		// Check if the list is empty
		if (head == null) {
			// Make the new node as head
			head = newNode;
		} else {
			// Point the new node's next to head
			newNode.next = head;

			// Make the new node as head
			head = newNode;
		}
	}
  
    /*
	 * Method to add a node at the end of the list
	 */
	public void addNodeAtTheEnd(int data) {
        System.out.println("Add a node with data " + data + " at the end.");
		// Create a new node
		Node newNode = new Node(data);

		// Check if the list is empty
		if (this.head == null) {
			// Make the new node as head
			this.head = newNode;
		} else {
			Node cur = this.head;
			// traverse to the end of the list
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}
  
  
	/*
	 * Method to add a node at the specified position in the list
	 */
	public void add(int position, int data) {
        System.out.println("Add a node with data " + data + " at the position " + position);
		// Create a new node
		Node newNode = new Node(data);

		// Init the cur and prev nodes to the head
		Node cur = head, prev = head;
        
		if (position == 1) {
			// Point the new node's next to head
			newNode.next = head;
			// Make the new node as head
			head = newNode;
			return;
		}

		// traverse to the end of the list and check positions moved
		while (cur.next != null && --position > 0) {
			// update the prev and cur references
			prev = cur;
			cur = cur.next;
		}

		// update prev to point to new node
		prev.next = newNode;

		// & new node to point to current node
		newNode.next = cur;
	}
    public void delete(int position){
        Node cur = head, prev = head;
        if(position==1){
            head=head.next;
        }
        else{
            while (cur.next != null && --position > 0) {
                // update the prev and cur references
                prev = cur;
                cur = cur.next;
            }
            prev.next=cur.next;
    

        }
    }
    public void deletebegin(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            System.out.println("the head node is deleted sucessfully"+head.data);
            head=head.next;

        }

    }
    public void deleteend(){
        if(head==null){
            System.out.println("list is empty");
        }
        else if(head.next==null){
            head=null;
            System.out.println("the head node is deleted sucessfully"+head.data);

        }
        else{
            Node cur=head;
            Node prev=head;
            while(cur.next!=null){
                prev=cur;
                cur=cur.next;
            }
            prev.next=null;
        }
    }

  	public void print() {
		if (this.head == null) {
			System.out.println("The List is empty.");
		} else {
			System.out.println("The contents of the Singly Linked List are : ");
			Node cur = this.head;
			while (cur != null) {
				System.out.print(cur.data + " -> ");
				cur = cur.next;
			}
			System.out.println("NULL\n");
		}
	}
  
  	public static void main(String[] args) {
        singlelinkedlist list=new singlelinkedlist();
        System.out.println("Created a singly linked list .....");
	    list.print();
        list.deletebegin();
		list.addNodeAtTheBeginning(100);
	    list.print();
		list.addNodeAtTheBeginning(200);
		list.print();
        list.deletebegin();
        list.print();
      	list.addNodeAtTheEnd(900);
	    list.print();
		list.addNodeAtTheEnd(800);
		list.print();

    
        list.add(1,150);
        list.print();
        list.add(4,250);
        list.print();
        System.out.println("before delete");
        list.delete(4);
        list.deleteend();
        list.print();
        list.add(6,250);
        list.print();
    }
}