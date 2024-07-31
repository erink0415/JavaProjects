//Erin
import java.io.*;
public class LinkedBST<T extends Comparable<T>>{

	private class Node
	{
		T data;
		Node leftChild;
		Node rightChild;
		public Node(T aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	private Node root;//head
	public LinkedBST()
	{
		root = null;
	}
	//add method
	public void add(T aData)
	{
		if(root == null)
			root = new Node(aData);
		else
			add(root,aData);
	}
	//add method
	private Node add(Node aNode, T aData)
	{
		if(aNode == null)
			aNode = new Node(aData);
		else if(aData.compareTo(aNode.data)<0)//GO LEFT
			aNode.leftChild = add(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)//GO RIGHT
			aNode.rightChild = add(aNode.rightChild,aData);
			return aNode;
	}
	//remove method
	public void remove(T aData)
	{
		root = remove(root, aData);
	}
	private Node remove(Node aNode, T aData)
	{
		//find the node
		if(aNode == null)
			return null;
		if(aData.compareTo(aNode.data)<0)
			aNode.leftChild = remove(aNode.leftChild, aData);
		else if(aData.compareTo(aNode.data)>0)
			aNode.rightChild = remove(aNode.rightChild, aData);
		else//FOUND IT
		{
			if(aNode.leftChild == null)
				return aNode.rightChild;
			else if(aNode.rightChild == null)
				return aNode.leftChild;
			Node temp = findMinInTree(aNode.rightChild);
			aNode.data = temp.data;
			aNode.rightChild = remove(aNode.rightChild,temp.data);
		}
		return aNode;
	}
	private Node findMinInTree(Node aNode)
	{
		if(aNode == null)
			return null;
		else if(aNode.leftChild == null)
			return aNode;
		else
			return findMinInTree(aNode.leftChild);
	}
	public T findMaxInTree()
	{
		return findMaxInTree(root).data;
	}
	
	private Node findMaxInTree(Node aNode)
	{
		if(aNode == null)
			return null;
		else if(aNode.rightChild == null)
			return aNode;
		else
			return findMaxInTree(aNode.rightChild);
	}
	public void removeMax()
	{
		removeMax(root);
	}
	private Node removeMax(Node aNode)
	{
		if(aNode==null)
			return null;
		if(aNode.rightChild == null)
			return aNode.leftChild;
		aNode.rightChild = removeMax(aNode.rightChild);
		return aNode;
	}
	
	
	//search method
	public boolean search(T aData)
	{
		return search(root, aData);
	}
	private boolean search(Node aNode, T aData)
	{
		if(aNode == null)
			return false;
		else if(aData.compareTo(aNode.data)<0)//GO LEFT
			return search(aNode.leftChild, aData);
		else if(aData.compareTo(aNode.data)>0)//GO RIGHT
			return search(aNode.rightChild,aData);
		else
			return true;
	}
	//print preorder method
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if(aNode == null)
			return;
		System.out.println(aNode.data);//Process
		printPreorder(aNode.leftChild);//left
		printPreorder(aNode.rightChild);//right
	}
	//print in order method
	public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(Node aNode)
	{
		if(aNode == null)
			return;
		printInorder(aNode.leftChild);//Left
		System.out.println(aNode.data);//process
		printInorder(aNode.rightChild);//right
	}
	//print post order method
	public void printPostorder()
	{
		printPostorder(root);
	}
	private void printPostorder(Node aNode)
	{
		if(aNode == null)
			return;
		printPostorder(aNode.rightChild);//RIGHT
		printPostorder(aNode.leftChild);//LEFT
		System.out.println(aNode.data);///PROCESS
		
	}
	public void writeFile(String fileName)
	{
		try
		{
			PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
			writeFile(root, printWriter);
			printWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private void writeFile(Node aNode, PrintWriter printWriter)
	{
		if(aNode == null)
			return;
		writeFile(aNode.leftChild, printWriter);
		printWriter.print(aNode.data);
		writeFile(aNode.rightChild, printWriter);
	}
}

