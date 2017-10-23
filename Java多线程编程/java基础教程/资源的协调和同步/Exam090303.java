//线程同步演示

public class Exam090303 {
    private static int x,y;
    private static class Thread1 extends Thread{
    	public synchronized void run() {
    		x=y=0;
    		System.out.println(x);
    	}
    }
    private static class Thread2 extends Thread{
    	public synchronized void run() {
    		x=y=1;
    		System.out.println(y);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Thread1().run();
         new Thread2().run();
	}

}
/**
 * synchronized方法控制对类成员变量的访问：
 *        每个类实例对应一把实例锁，每个synchronized方法必须获得调用该方法的类实例的锁方能执行
 *        否则所属线程阻塞
 *        方法一旦执行，就独占该锁，直到从该方法返回时才将锁释放，此后被阻塞的线程方法才能获得该锁，从新进入可执行状态
 *        这种机制确保了同一时刻对于每一个类实例，其所有声明synchronized的成员函数中至多只有一个处于可执行状态
 *        （因为之多只有一个能够获得该类实例对应的锁），从而有效避免了类成员变量的访问冲突/
 */