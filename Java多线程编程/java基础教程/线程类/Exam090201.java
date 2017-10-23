//获得线程的信息

public class Exam090201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("kkk");
		Thread curr;  //curr是Thread类的实例化对象
		int num=7;
		curr=Thread.currentThread(); //反回当前运行的线程对象，是一个静态的方法
		curr.setPriority(num); //设置线程的优先级
		System.out.println("当前线程："+num);
		System.out.println("线程名："+curr.getName()); //获得调用线程的名字
		System.out.println("优先级："+curr.getPriority());//取得线程的优先级

	}

}
