public class AddOne{
	//creation of node via a Node class
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	//print function
	static void printList(Node head){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	//method to get the added value
	static Node addOne(Node head){
		head=reverse(head);
		head=addOneUtil(head);
		head=reverse(head);
		return head;
	}
	
	//reverse function
	static Node reverse(Node head){
		Node current=head, prev,next=null;
		while(current!=null){
			prev=current.next;
			current.next=next;
			next=current;
			current=prev;
		}
		return next;
	}
	//adding one to list function
	static Node addOneUtil(Node head){
		int carry=1,sum=0;
		Node temp=null,result=head;
		while(head!=null){
			sum=head.data+carry;
			carry=(sum>=10)?1:0;
			head.data=sum%10;
			temp=head;
			head=head.next;
		}
		if(carry>0)
			temp.next=new Node(carry);
		return result;
	}
	
	public static void main(String args[]){
		Node head=new Node(9);
		head.next=new Node(9);
		head.next.next=new Node(9);
		head.next.next.next=new Node(9);
		System.out.print("Linked List is: ");
		printList(head);
		System.out.println();
		head=addOne(head);
		System.out.print("After addition list is: ");
		printList(head);
	}
}