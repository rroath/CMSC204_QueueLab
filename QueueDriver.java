
public class QueueDriver {

	public static void main(String[] args) {
		QueueADT line1=new QueueADT(5);
		
		System.out.println("The line is empty: "+line1.isEmpty());
		
		//adding elements to array
		line1.enqueue(5);
		line1.enqueue(10);
		line1.enqueue(8);
		line1.enqueue(7);
		System.out.println(line1.toString()+"\n");
		
		//removing elements in array
		System.out.println("New front: "+line1.dequeue());
		System.out.println("New front: "+line1.dequeue()+"\n");
		
		//checking if line is empty
		System.out.println("The line is empty: "+line1.isEmpty());
		
		//displaying front
		System.out.println("Current front: "+line1.getFront());
		
		//use of clear function
		line1.clear();
		System.out.println("\nThe line is empty: "+line1.isEmpty()+"\n"+line1.toString());
		

	}

}
