//�嵥1-3 �Դ���Thread����ķ�ʽ�����߳�
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