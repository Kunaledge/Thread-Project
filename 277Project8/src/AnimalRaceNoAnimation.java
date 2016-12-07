/**
 * @author Kunal Patel
 * This is the tester class for the Animal Race. Create 3 animals with varying speed and rest time.
 * Inputs: Hard-coded: animal data
 * Outputs: 3 Threads of the animals racing simultaneously
 */
public class AnimalRaceNoAnimation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1= new Animal("Mustang", 30, 20, 50); //Name, Speed, Rest, Laps
		Animal a2= new Animal("GreyHound", 30, 15, 50);
		Animal a3= new Animal("JackRabbit", 30, 10, 50);
		Thread t1=newThread(a1);
		Thread t2= newThread(a2);
		Thread t3= newThread(a3);
		
		t3.start();
		t1.start();
		t2.start();
		
		
	}

	public static Thread newThread(Animal a){
		return new Thread(a, a.getName());
		
	}

}
