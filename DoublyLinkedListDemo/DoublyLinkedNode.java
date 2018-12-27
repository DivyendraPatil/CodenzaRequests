package LLTest;
public class DoublyLinkedNode {
	private int data;
	private DoublyLinkedNode nextNode;
	private DoublyLinkedNode previousNode;
	
	public DoublyLinkedNode(int data){
		this.data=data;	
	}
	
	public int getData() {
		return this.data;
	}
		
	public  DoublyLinkedNode getNextNode(){
		return nextNode;
	}
	
	public  DoublyLinkedNode getpreviousNode(){
		return previousNode;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNextNode(DoublyLinkedNode nextNode){
		this.nextNode = nextNode;
	}
	
	public void setPreviousNode(DoublyLinkedNode previousNode){
		this.previousNode = previousNode;
	}
	
	public String toString(){
		return "Data: "+ this.data;
	}
		
}