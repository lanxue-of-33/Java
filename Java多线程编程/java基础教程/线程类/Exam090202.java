//����Thread��ʵ�ֶ��߳�

public class Exam090202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        myThread t1,t2,t3,t4; //�������Զ����߳�����ĸ�����
        t1=new myThread("Thread1");  //ʵ�����߳�
        t2=new myThread("Thread2");
        t3=new myThread("Thread3");
        t4=new myThread("Thread4");
        t1.start(); t2.start(); //����start���������߳�
        t3.start(); t4.start();
	}

}
class myThread extends Thread{ //������Thread���һ���Զ�������
	int sleeptime;
	public myThread(String id) { //���캯��
		super(id);
		sleeptime=(int)(Math.random()*100);
		System.out.println("The Thread Name="+getName()+", sleeping:"+sleeptime);
	}
	public void run() { //���������е�run���������Ǹ����е�run����
		try {  //ͨ���߳�˯��ģ����������
			Thread.sleep(sleeptime);
		}
		catch(InterruptedException e) {
			System.out.println("Exception:"+e.toString());
		}
		System.out.println("The running Thread="+getName());
	}
}
//�����й��캯����Ȼ���������е�run����
//Thread���е�run��������public���ԣ����Ǹ÷����ǣ�ҲӦ�ô���public