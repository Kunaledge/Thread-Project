
public class Animal implements Runnable{
	private String name;
	private double speed;
	private int rest;
	private int lap;
	private int lapNum;
	private static int place=1;
	private int lD;//Lap Distance
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
	public Animal(String n, double s, int r, int laps){
		name=n;
		speed=s;
		rest=r;
		lap=1;
		place=1;
		lD=0;
		lapNum=laps;
	}
	
	public int getLapNum() {
		return lapNum;
	}
	public void setLapNum(int lapNum) {
		this.lapNum = lapNum;
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
		while(lap!=lapNum){
			lD+=speed;
			if(lD>100){
				System.out.println(name + " is on lap:  " + lap);
				lap++;
			}
			if(lap==lapNum){
				System.out.println(name + " has finished the race!");
				break;
			}
			try {
				Thread.sleep(rest);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		finalPlace=place;
		place++;
		System.out.println(getName()+ " is in place: "+ finalPlace);
		
		if(this.finalPlace==1){
			System.out.println(this.getName() + " is the Winner!!!");
		}
	}
		

}
