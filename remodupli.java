package Ques;

import java.util.Scanner;

public class RemoDupli {
Node head;


	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}



	public static RemoDupli insert(RemoDupli li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
			li.head=newNode;
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	  public void remodupli(){
	        Node first=null;
	        Node second=null;
	        Node dupli=null;
	        first=head;
	        while (first!=null && first.next!=null){
	            second=first;
	            while (second.next!=null){
	                if (first.data==second.next.data){
	                    dupli=second.next;
	                    second.next=second.next.next;
	                }
	                else {
	                    second=second.next;
	                }
	            }
	            first=first.next;
	        }
	    }

	public static void display(RemoDupli li)
	{
		Node current=li.head;
		System.out.println("LinkedList is as follows:");
		while(current.next!=null)
		{
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println(current.data);
	}

	public static void main(String[] args) {
		RemoDupli li=new RemoDupli();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of value for insertion");
		 int num=s.nextInt();
		 for(int i=0;i<num;i++)
		 {
			 int item=s.nextInt();
			 insert(li,item);
		 }
		 li.remodupli();
		 li.display(li);
	}

}
