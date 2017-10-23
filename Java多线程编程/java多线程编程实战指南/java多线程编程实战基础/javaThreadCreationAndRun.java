//�嵥1-2 Java�̵߳Ĵ���������
public class javaThreadCreationAndRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("The main method was executed by thread:"+Thread.currentThread().getName());
        Helper1 helper1=new Helper1("Java Thread AnyWhere");
        
        //����һ���߳�
        Thread thread=new Thread(helper1);
        //�����߳���
        thread.setName("A-Worker-Thread");
        //�����߳�
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
//����ͨ��ֱ��newһ��Thread��ʵ���ഴ��һ���߳�
//Thread�������һ��������֧�ִ���һ��Java.lang.Runnable�ӿ�ʵ��������Ӧ�߳�����ʱ��ʵ����run�����ͻᱻJVM����
//ͬǰһ��������ȣ�ͬ������Helper��ͬһ��������Something��ʱʱ����ΪA-Worker-Thread���̶߳���main�̴߳�����
//������Ϊ��һ��run������main�߳���ִ�е�main����ֱ�ӵ���
//���ڶ����е�run�������ǲ�û���ڴ�����ֱ�ӵ��ã�������JVMͨ���䴴�����̣߳��߳���ΪA-Worker-Thread�����е���

//��������У����̶߳����start�����ĵ��ã�thread.start())��δ���ֵ������main�����еģ���main��������main�̸߳���ִ�еģ���ˣ�
//�������������߳�thread�Ϳ��Կ�����main�̵߳�һ�����̣߳���main�߳��Ǹ��̵߳ĸ��߳�

//Java�����У����߳��Ƿ���һ���ػ��߳�ȡ�����丸�߳�
//Ĭ������£����߳����ػ��߳������߳�Ҳ�Ǹ��ػ��̣߳����߳����û��߳������߳�Ҳ���û��߳�
//��Ȼ���������߳�֮ǰ���Ե���Threadʵ����setDaemon�������޸��̵߳���һ����