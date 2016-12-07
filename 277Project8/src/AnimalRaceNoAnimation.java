
public class AnimalRaceNoAnimation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animal1= "Mustang";
		String animal2= "GreyHound";
		String animal3= "JackRabbit";
		Animal a1= new Animal(animal1, 20, 10, 10);
		a1.setName("Mustang");
		Animal a2= new Animal(animal2, 20, 10, 10);
		a2.setName("GreyHound");
		Animal a3= new Animal(animal3, 20, 10, 10);
		a3.setName("JackRabbit");
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
		return new Thread(a, a.getName());
		
	}

}
