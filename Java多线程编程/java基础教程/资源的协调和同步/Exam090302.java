
public class Exam090302 {
     public static void main(String[]args) {
    	 myThread4 Obj=new myThread4();
    	 Thread t1=new Thread(new rThread(Obj,1));
    	 Thread t2=new Thread(new rThread(Obj,2));
    	 Thread t3=new Thread(new rThread(Obj,3));
    	 t1.start();
    	 t2.start();
    	 t3.start();
     }
}
class myThread4{
	void Test(int n) {
		System.out.println("运行线程 NO："+n);
		try {
			Thread.sleep(3);
		}
		catch(InterruptedException e) {
			System.out.println("线程异常,NO："+n);
		}
		System.out.println("线程结束 NO："+n);
	}
}
class rThread implements Runnable{
	myThread4 obj;
	int num;
	rThread(myThread4 t,int n){
		obj=t;
		num=n;
	}
	public void run() {
		obj.Test(num);
	}
}