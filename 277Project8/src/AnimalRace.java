import javax.swing.*;

public class AnimalRace extends JFrame {
	
	private JLabel anim1 = new JLabel("Mustang");
	private JLabel anim2 = new JLabel("GreyHound");
	private JLabel anim3 = new JLabel("JackRabbit");
	
	public AnimalRace(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setTitle("Thread Demo");
		this.setLayout(null);
		this.setResizable(false);
		this.add(anim1);
		this.add(anim2);
		this.add(anim3);
		anim1.setBounds(0, 50, 100, 30);
		anim2.setBounds(0, 120, 100, 30);
		anim3.setBounds(0, 190, 100, 30);
		Animal a1= new Animal("Mustang", 6, 2);
		Animal a2= new Animal("GreyHound", 4, 4);
		Animal a3= new Animal("JackRabbit", 3, 4);
		Thread t1= new Thread(a1).start();
		newThread(a2).start();
		newThread(a3).start();
	}
	

	class Race implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int x = anim1.getX();
			while (true) {
				try {
					anim1.setBounds(x, anim1.getY(), anim1.getWidth(), anim1.getHeight());
					x++;
					Thread.sleep(6);
					if(x==500){
						while (true) {
							x--;
							anim1.setBounds(x, anim1.getY(), anim1.getWidth(), anim1.getHeight());
							Thread.sleep(6);
							if (x==0) break;
						}
					}
				} catch (Exception ex) {}
			}
		}
	}
	
	
	
	public static void main(String[] args){
		new AnimalRace().setVisible(true);
	}
	public static Thread newThread(Animal a){
		return new Thread(new Race(), a.getName());
		
	}

}
