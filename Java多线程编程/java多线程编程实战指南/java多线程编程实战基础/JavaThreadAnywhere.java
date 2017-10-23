//java代码的执行线程

public class JavaThreadAnywhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("The main method was executed by thread:"+Thread.currentThread().getName());
        Helper helper=new Helper("Java Thread Anywhere");
        helper.run();
	}

}
class Helper implements Runnable{
	private final String message;
	public Helper(String message) {
		this.message=message;
	}
	private void doSomething(String message) {
		System.out.println("The doSomething method was executed by thread:"+Thread.currentThread().getName());
		System.out.println("Do something with"+message);
	}
	@Override
	public void run() {
		doSomething(message);
	}
}
//从上面的输出可以看出，类JavaThreadAnywhere的main方法以及类Helper的dosomething方法都是由main方法负责执行的