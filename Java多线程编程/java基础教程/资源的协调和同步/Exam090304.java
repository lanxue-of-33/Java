//�߳�ͬ����ʾ
//���ֹܳ�ͻ��

public class Exam090304 {
	public static int x,y;
	private static Object lockObject=new Object(); 
/*
 * ���objectֻ���������ģ����Բ���Ҫ��ֵ
 * lockObj ֻ��Ϊ�˶���һ���������͵Ķ������ڼ�����lockObj ������ɶ�������ģ���������ֻ����������ȥ�Ĵ�����ǻ����������Ҫ����ִ��
 * ����������Ҫ�����ݿ�����������new��һ��lockObj �����С����󡱿��������˶���*/	
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
 * synchronized��������һ������飬���еĴ�������ö��� syncObject(��ǰ��������������ʵ�����ࣩ��������ִ�У����������ǰ
 * ���ڿ�������������飬�ҿ�����ָ�������Ķ��󣬹�����Ը���*/
