//利用Thread类实现多线程

public class Exam090202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        myThread t1,t2,t3,t4; //创建了自定义线程类的四个对象
        t1=new myThread("Thread1");  //实例化线程
        t2=new myThread("Thread2");
        t3=new myThread("Thread3");
        t4=new myThread("Thread4");
        t1.start(); t2.start(); //调用start方法启动线程
        t3.start(); t4.start();
	}

}
class myThread extends Thread{ //定义了Thread类的一个自定义子类
	int sleeptime;
	public myThread(String id) { //构造函数
		super(id);
		sleeptime=(int)(Math.random()*100);
		System.out.println("The Thread Name="+getName()+", sleeping:"+sleeptime);
	}
	public void run() { //定义子类中的run方法，覆盖父类中的run方法
		try {  //通过线程睡眠模拟程序的运行
			Thread.sleep(sleeptime);
		}
		catch(InterruptedException e) {
			System.out.println("Exception:"+e.toString());
		}
		System.out.println("The running Thread="+getName());
	}
}
//先运行构造函数，然后运行其中的run函数
//Thread类中的run方法具有public属性，覆盖该方法是，也应该带上public