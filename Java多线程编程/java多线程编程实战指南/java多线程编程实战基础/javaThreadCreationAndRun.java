//清单1-2 Java线程的创建和运行
public class javaThreadCreationAndRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("The main method was executed by thread:"+Thread.currentThread().getName());
        Helper1 helper1=new Helper1("Java Thread AnyWhere");
        
        //创建一个线程
        Thread thread=new Thread(helper1);
        //设置线程名
        thread.setName("A-Worker-Thread");
        //启动线程
        thread.start();
	}

}
class Helper1 implements Runnable{
	private final String message1;
	public Helper1(String message1) {
		this.message1=message1;
	}
	private void doSomething(String message1) {
		System.out.println("The doSomething method was executed by thread:"+Thread.currentThread().getName());
		System.out.println("Do something with"+message1);
	}
	@Override
	public void run() {
		doSomething(message1);
	}
	
}
//我们通过直接new一个Thread类实例类创建一个线程
//Thread类的其中一个构造器支持传入一个Java.lang.Runnable接口实例，当相应线程启动时该实例的run方法就会被JVM调用
//同前一个代码相比，同样的类Helper的同一个方法都Something此时时由名为A-Worker-Thread的线程而非main线程带调用
//这是因为第一个run方法由main线程所执行的main方法直接调用
//而第二个中的run方法我们并没有在代码中直接调用，而是由JVM通过其创建的线程（线程名为A-Worker-Thread）进行调用

//这个程序中，对线程对象的start方法的调用（thread.start())这段代码值运行在main方法中的，而main方法是由main线程负责执行的，因此，
//我们所创建的线程thread就可以看成是main线程的一个子线程，而main线程是给线程的父线程

//Java语言中，子线程是否是一个守护线程取决与其父线程
//默认情况下，父线程是守护线程则子线程也是个守护线程，父线程是用户线程则子线程也是用户线程
//当然，启动子线程之前可以调用Thread实例的setDaemon方法类修改线程的这一属性