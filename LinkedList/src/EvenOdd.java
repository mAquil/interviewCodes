public class EvenOdd{
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	static void printList(Node head){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	static Node evenOdd(Node head){
		if(head==null){
			return null;
		}
		Node odd=head;
		Node even=odd.next;
		Node tempEven=even;
		while(true){
			if(odd==null || even==null || even.next==null){
				odd.next=tempEven;
				break;
			}
			odd.next=even.next;
			odd=even.next;
			if(odd.next==null){
				even.next=null;
				odd.next=tempEven;
				break;
			}
			even.next=odd.next;
			even=odd.next;
		}
		return head;
	}
	
	public static void main(String args[]){
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		printList(head);
		head=evenOdd(head);
		System.out.println();
		printList(head);

	}
}