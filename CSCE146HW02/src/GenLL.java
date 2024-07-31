/*
 * ERIN KELLY
 */
public class GenLL <T>{
	//IKD WHAT GOES HERE
	//<T> is a variable for data types
		//<T> is interface
		
		private class ListNode
		{
			T data;
			ListNode link;
			public ListNode(T aData, ListNode aLink)
			{
				data = aData;
				link = aLink;
			}
		}
		
		private ListNode head;//ALWAYSSS first element of the list
		private ListNode current;//Movable iterator / current node of interest
		private ListNode previous;//One node behind current /previous.link == current
		private int size;
		
		public GenLL()
		{
			head = current = previous = null;
			this.size = 0;
		}
		
		public void add(T aData)//adds to end of list
		{
			//create new node w data
			ListNode newNode = new ListNode(aData,null);
			
			//add the node to the list
			if(head == null)//empty list
			{
				head = current = newNode;
				this.size = 1;
				return;
			}
			ListNode temp = head;
			while(temp.link != null)
			{
				temp = temp.link;
			}
			temp.link = newNode;
			this.size++;
		}
		
		public void print()
		{
			ListNode temp = head;
			while(temp!= null)
			{
				System.out.println(temp.data);
				temp = temp.link;
			}
		}
		
		public void addAfterCurrent(T aData)
		{
			if(current==null)
				return;
			ListNode newNode = new ListNode(aData,current.link);
			current.link = newNode;
			this.size++;
		}
		//accessor for linked list
		public T getCurrent()
		{
			if(current == null)
			{
				return null;
			}
			return current.data;
			
		}
		//mutator
		public void setCurrent(T aData)
		{
			if(aData == null || current == null)
				return;
			current.data = aData;
		}
		
		public void goToNext()
		{
			if(current == null)
				return;
			previous = current;
			current = current.link;	
		}
		
		public void reset()
		{
			current = head;
			previous = null;
		}
		
		public boolean hasMore()
		{
			return current != null;
		}
		
		public void removeCurrent()
		{
			if(current == head)
			{
				head = head.link;
				current = head;
			}
			else
			{
				previous.link = current.link;
				current = current.link;
			}
			if(this.size > 0)
				size--;		
		}
		
		public T getAt(int index)
		{
			if(index < 0 || index >= size)
				return null;
			ListNode temp = head;
			for(int i=0;i<index;i++)
				temp = temp.link;
			return temp.data;
		}
		
		public void setAt(int index, T aData)
		{
			if(index < 0 || index >= size || aData == null)
				return;
			ListNode temp = head;
			for(int i=0;i<index;i++)
				temp = temp.link;
			temp.data = aData;
		}
}
