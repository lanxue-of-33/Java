//通过实现Runnable接口实现多线程的演示

public class Exam090204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        myThread2 t=new myThread2();
        for(int i=0;i<3;i++) {
        	//new Thread(t).start();
        	new Thread(new myThread2()).start();
        }
	}

}
class myThread2 implements Runnable{
	public synchronized void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(100);//使当前的线程停止n个毫秒
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
	}
}