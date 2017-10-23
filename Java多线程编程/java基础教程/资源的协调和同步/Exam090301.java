//测试线程的优先级

public class Exam090301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread minThread=new myThread3("MinPriorityThread");
        Thread normThread=new myThread3("NormPriorityThread");
        Thread maxThread=new myThread3("MaxPriorityThread");
        minThread.setPriority(Thread.MIN_PRIORITY);
        normThread.setPriority(Thread.NORM_PRIORITY);
        maxThread.setPriority(Thread.MAX_PRIORITY);
        minThread.start();
        normThread.start();
        maxThread.start();
	}

}
class myThread3 extends Thread{
	myThread3(String str){
		super(str);
	}
	public void run() {
		try {
			Thread.sleep(2);
		}
		catch(InterruptedException e) {
			System.out.println(e.toString());
		}
		System.out.println("the Thread Name="+getName()+", Priority="+getPriority());
	}
}