public class CreateList{
	ListNode head;
	
//	static class ListNode{
//		int data;
//		ListNode next;
//		ListNode(int d){
//			data=d;
//			next=null;
//		}
//	}
	private void printList(ListNode head){
		ListNode n=head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	private ListNode reverse(ListNode head){
		ListNode prev=null,next=null,current=head;
		while(current!=null){
			prev=current.next;
			current.next=next;
			next=current;
			current=prev;
		}
		return next;
	}
	
	private ListNode reverseByRecursion(ListNode head){
		if(head==null || head.next==null){
			return head;
		}
		ListNode rest=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return rest;
	}
	
	public static void main(String[] args){
		CreateList list=new CreateList();
		list.head=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		list.head.next=second;
		second.next=third;
		list.printList(list.head);
		ListNode newHead=list.reverse(list.head);
		System.out.println();
		System.out.print("Reversed linked list is: ");
		list.printList(newHead);
		System.out.println();
		System.out.print("Reversed linked list via recursion is: ");
		ListNode recursiveHead=list.reverseByRecursion(newHead);
		list.printList(recursiveHead);
	}
}