public class DeleteN_After_M_Nodes {
	//node creation class
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	//creating a list
	static Node push(int d,Node node){
		Node head=new Node(d);
		if(node!=null)
			node.next=head;
		return head;
	}
	//printing the list
	static void printList(Node head){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	//function to count m nodes
	static Node countNode(Node head,int m,int n){
		int count=0;
		Node res=head;
		while(head!=null){
			count++;
			if(count==m){
				delete(head,n);
				count=0;
			}
			head=head.next;
		}
		return res;
	}
	//deleting n nodes function
	static void delete(Node head,int n){
		Node res=head;
		for(int i=1;i<=n;i++){
			if(res.next==null)
				break;
			res=res.next;
		}
		head.next=res.next;
	}
	
	public static void main(String args[]){
		Node head=null,temp;
		int m=5,n=2;
		temp=push(1,head);
		head=temp;
		temp=push(2,temp);
		temp=push(3,temp);
		temp=push(4,temp);
		temp=push(5,temp);
		temp=push(6,temp);
		temp=push(7,temp);
		temp=push(8,temp);
		temp=push(9,temp);
		temp=push(10,temp);
		System.out.print("List is: ");
		printList(head);
		System.out.println();
		System.out.print("Modified list is: ");
		head=countNode(head,m,n);
		printList(head);
	}
}
