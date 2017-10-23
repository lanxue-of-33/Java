//通过实现Runnable接口实现多线程的演示

public class Exam090203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=0;i<5;i++)
        	new Thread(new myThread1(i+1)).start();//将myThread类的一个实例化对象作为实参传给Thread，然后调用start
	}

}
class myThread1 implements Runnable{
	int count=1,number;
	public myThread1(int num) {
		number=num;
		System.out.println("创建线程："+number);
	}
	public void run() {
		while(true) {
			System.out.println("线程："+number+": 计数"+count);
			if(++count==6)return ;
		}
	}
}