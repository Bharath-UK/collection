package collection_project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
 

public class ListType 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List li=null;
		char e;
		
		do
		{
			System.out.println("press 1 for Array List object  creation");
			System.out.println("press 2 for vector object  creation");
			System.out.println("press 3 for Linked list object  creation");
	         int choice = sc.nextInt();
			switch(choice)
			{
			case 1:li=new ArrayList();
			       System.out.println("press a for entering to add element");
			       e=sc.next().charAt(0);
			      while(e=='a')
			      {
				      System.out.println("press y to add  element");
				      System.out.println("press n to stop adding and print added elements");
				      if(sc.next().charAt(0)=='y')
				      {
				    	  System.out.println("enter element to add");
				    	  int z= sc.nextInt();
					      li.add(z);
				    	 continue;
				      }
				    	 System.out.println(li); 
				    	 break;
			      }
			      break;
			case 2:li=new Vector();
		       System.out.println("press a for entering to add element");
		       e=sc.next().charAt(0);
		      while(e=='a')
		      {
			      System.out.println("press y to add  element");
			      System.out.println("press n to stop adding and print added elements");
			      if(sc.next().charAt(0)=='y')
			      {
			    	  System.out.println("enter element to add");
			    	  int z= sc.nextInt();
				      li.add(z);
			    	 continue;
			      }
			    	 System.out.println(li); 
			    	 break;
		      }
		      break;
			case 3:li=new LinkedList();
		       System.out.println("press a for entering to add element");
		       e=sc.next().charAt(0);
		      while(e=='a')
		      {
			      System.out.println("press y to add  element");
			      System.out.println("press n to stop adding and print added elements");
			      if(sc.next().charAt(0)=='y')
			      {
			    	  System.out.println("enter element to add");
			    	  int z= sc.nextInt();
				      li.add(z);
			    	 continue;
			      }
			    	 System.out.println(li); 
			    	 break;
		      }
		      break;
		      default :System.err.println("enter a valid choice");
			
			}
			System.out.println("press y to continue");
			System.out.println("press n to stop");
		}
		while(sc.next().charAt(0)=='y');
		System.err.println("stopped sucessfully");
	}
}
