//ERIN
public interface QueueI<T> {
	public  void enqueue(T aData);//add to end
	public T dequeue();//remove from beginning
	public T peek();
	public void print();
}
