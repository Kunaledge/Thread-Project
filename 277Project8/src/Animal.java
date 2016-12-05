
public class Animal {
	private String name;
	private double speed;
	private double rest;
	private int lap;
	private int place;
	public Animal() {
		// TODO Auto-generated constructor stub
		name="Animal";
		speed=5;
		rest=2;
		lap=1;
		place=1;
	}
	public Animal(String n, double s, double r){
		name=n;
		speed=s;
		rest=r;
		lap=1;
		place=1;
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
	public void setRest(double rest) {
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
	
	

}
