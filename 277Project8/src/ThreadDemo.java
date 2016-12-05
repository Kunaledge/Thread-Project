import javax.swing.*;
 
public class ThreadDemo extends JFrame {
 
	private JLabel anim1 = new JLabel("TestAnimation 1");
	private JLabel anim2 = new JLabel("TestAnimation 2");
 
	public ThreadDemo() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setTitle("Thread Demo");
		this.setLayout(null);
		this.setResizable(false);
		this.add(anim1);
		this.add(anim2);
		anim1.setBounds(0, 50, 100, 30);
		anim2.setBounds(0, 120, 100, 30);
		new Thread(new AnimationThread1()).start();
		new Thread(new AnimationThread2()).start();
	}
 
	public static void main(String args[]) {
		new ThreadDemo().setVisible(true);
	}
 
	class AnimationThread1 implements Runnable {
 
		public void run() {
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
 
	class AnimationThread2 implements Runnable {
 
		public void run() {
			int x = anim2.getX();
			while (true) {
				try {
					anim2.setBounds(x, anim2.getY(), anim2.getWidth(), anim2.getHeight());
					x++;
					Thread.sleep(3);
					if(x==500){
						while (true) {
							x--;
							anim2.setBounds(x, anim2.getY(), anim2.getWidth(), anim2.getHeight());
							Thread.sleep(3);
							if (x==0) break;
						}
					}
				} catch (Exception ex) {}
			}
		}
	}
}