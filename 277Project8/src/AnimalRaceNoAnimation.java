
public class AnimalRaceNoAnimation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1= new Animal("Mustang", 15, 5, 5);
		Animal a2= new Animal("GreyHound", 10, 5, 5);
		Animal a3= new Animal("JackRabbit", 3, 2, 5);
		Thread t1=newThread(a1);
		t1.setName("Mustang");
		Thread t2= newThread(a2);
		t2.setName("GreyHound");
		Thread t3= newThread(a3);
		t3.setName("JackRabbit");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

	/*@Override
	public void run() {
		final int dPerL= 50; //Distance per Lap
		int lap=1;
		int currentD=0; //Current Lap's Distance
		// TODO Auto-generated method stub
		Thread t= Thread.currentThread();
		while(lap!=5){
			while(currentD<dPerL){
				currentD++;
				t.sleep(t.getClass().)
			}
		}
		
		
	}
	*/
	public static Thread newThread(Animal a){
		return new Thread(new Animal(), a.getName());
		
	}

}
