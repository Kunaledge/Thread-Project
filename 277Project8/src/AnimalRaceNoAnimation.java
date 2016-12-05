
public class AnimalRaceNoAnimation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1= new Animal("Mustang", 6, 2);
		Animal a2= new Animal("GreyHound", 4, 4);
		Animal a3= new Animal("JackRabbit", 3, 4);
		Thread t1=newThread(a1);
		t1.start();
		Thread t2= newThread(a2);
		t2.start();
		Thread t3= newThread(a3);
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
