//线程同步演示
//所分管冲突块

public class Exam090304 {
	public static int x,y;
	private static Object lockObject=new Object(); 
/*
 * 这个object只是用来锁的，所以不需要赋值
 * lockObj 只是为了定义一个引用类型的对象用于加锁。lockObj 内容是啥并不关心，它的作用只是声明接下去的代码块是互斥操作，需要加锁执行
 * 即，加锁需要有内容可锁嘛，所以随便new了一个lockObj 让锁有“对象”可锁，仅此而已*/	
    private static class Threadl extends Thread{
    	public void run() {
    		synchronized(lockObject) {
    			x=y=0;
    			System.out.println(x);
    		}
    	}
    }
    private static class Threadll extends Thread{
    	public void run() {
    		synchronized(lockObject) {
    			x=y=1;
    			System.out.println(y);
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Threadl().run();
        new Threadll().run();
	}
}
/*
 * synchronized块是这样一个代码块，其中的代码必须获得对象 syncObject(如前所述，可以是类实例或类）的锁方能执行，具体机制如前
 * 由于可以针对任意代码块，且可任意指定上锁的对象，故灵活性更高*/
