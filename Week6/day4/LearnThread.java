package week6.day4;


public class LearnThread  extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+ " -->value of the var i "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
public static void main(String[] args) {
	LearnThread lt = new LearnThread();
	LearnThread lt1 = new LearnThread();
	lt.start();
	lt1.start();
}
}
