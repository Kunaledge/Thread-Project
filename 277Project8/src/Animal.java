
public class Animal implements Runnable{
	private String name;
	private double speed;
	private int rest;
	private int lap;
	private static int place=1;
	private int lD;
	private int finalPlace;
	public Animal() {
		// TODO Auto-generated constructor stub
		name="Animal";
		speed=5;
		rest=2;
		lap=1;
		place=1;
		lD=0;
	}
	public Animal(String n, double s, int r){
		name=n;
		speed=s;
		rest=r;
		lap=1;
		place=1;
		lD=0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getRest() {
		return rest;
	}
	public void setRest(int rest) {
		this.rest = rest;
	}
	public int getLap() {
		return lap;
	}
	public void setLap(int lap) {
		this.lap = lap;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return name + " is on lap:  " + lap;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(lD<100){
			lD+=speed;
			if(lD>100){
				lap++;
				System.out.println(this);
			}
			if(lap==5){
				finalPlace=place;
				place++;
				System.out.println(this.getName()+ " is in place: "+ finalPlace);
				break;
			}
			try {
				Thread.sleep(rest);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
