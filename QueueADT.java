
public class QueueADT implements QueueInterface{
	private int total, personNum, front, back;
	private int[] line;
	
	public QueueADT(int total) {
		this.total=total;
		front = back = 0;
		line = new int[total];
	}
	
	 public int dequeue() {
		 if(front == back)
			 System.out.println("The Queue is empty");
		 else {
			 for(int x = 0; x<back-1; x++) {
				 line[x]=line[x+1];
			 }
			 
			 if(back<total)
				 line[back]=0;
			 back--;
		 }
		 
		 return line[front];
	 }
	 
	 public int getFront() {
		 return line[front];
	 }
	 
	 public boolean isEmpty() {
		 int statement=0;
		 
		 for(int x = 0; x<total; x++) {
			 if(line[front]==0)
				 statement=1;
		 }
		
		 if(statement==0)
			 return false;
		 else
			 return true;
	 }
	 
	 public void clear() {
		 for(int x = 0; x<total; x++)
			 line[x]=0;
	 }

	@Override
	public void enqueue(int personNum) {
		if(total == back)
			 System.out.println("The Queue is full");
		 else {
			 line[back] = personNum;
			 back++;
		 }
	}
	
	public String toString() {
		 String queue = "";
		   for(int x=0; x<total; x++) {
			   queue+=line[x]+" ";
		   }
		   return queue;
	}

}
