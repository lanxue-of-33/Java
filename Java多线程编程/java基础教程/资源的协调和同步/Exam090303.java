//�߳�ͬ����ʾ

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
 * synchronized�������ƶ����Ա�����ķ��ʣ�
 *        ÿ����ʵ����Ӧһ��ʵ������ÿ��synchronized���������õ��ø÷�������ʵ����������ִ��
 *        ���������߳�����
 *        ����һ��ִ�У��Ͷ�ռ������ֱ���Ӹ÷�������ʱ�Ž����ͷţ��˺��������̷߳������ܻ�ø��������½����ִ��״̬
 *        ���ֻ���ȷ����ͬһʱ�̶���ÿһ����ʵ��������������synchronized�ĳ�Ա����������ֻ��һ�����ڿ�ִ��״̬
 *        ����Ϊ֮��ֻ��һ���ܹ���ø���ʵ����Ӧ���������Ӷ���Ч���������Ա�����ķ��ʳ�ͻ/
 */