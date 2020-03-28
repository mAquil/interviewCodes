
public class ShortestList {
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	static void printList(Node head){
		Node node=head;
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	public static void shortestPath(Node head, int x){
		
	}
	
	public static void main(String[] args) {
		Node head=new Node(2);
		head.next=new Node(4);
		head.next.next=new Node(8);
		head.next.next.next=new Node(1);
		head.next.next.next.next=new Node(3);
		head.next.next.next.next.next=new Node(6);
		head.next.next.next.next.next.next=new Node(7);
		head.next.next.next.next.next.next.next=new Node(2);
		head.next.next.next.next.next.next.next.next=new Node(5);
		printList(head);
		shortestPath(head,6);
	}

}
