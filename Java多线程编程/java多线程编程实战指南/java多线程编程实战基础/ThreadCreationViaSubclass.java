//清单1-3 以创建Thread子类的方式创建线程
public class ThreadCreationViaSubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread thread=new CustomThread();
        thread.start();
	}

}
class CustomThread extends Thread{
	@Override
	public void run() {
		System.out.println("Running...");
	}
}