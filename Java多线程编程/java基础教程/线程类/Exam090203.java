//ͨ��ʵ��Runnable�ӿ�ʵ�ֶ��̵߳���ʾ

public class Exam090203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=0;i<5;i++)
        	new Thread(new myThread1(i+1)).start();//��myThread���һ��ʵ����������Ϊʵ�δ���Thread��Ȼ�����start
	}

}
class myThread1 implements Runnable{
	int count=1,number;
	public myThread1(int num) {
		number=num;
		System.out.println("�����̣߳�"+number);
	}
	public void run() {
		while(true) {
			System.out.println("�̣߳�"+number+": ����"+count);
			if(++count==6)return ;
		}
	}
}