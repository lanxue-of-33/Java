//����̵߳���Ϣ

public class Exam090201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("kkk");
		Thread curr;  //curr��Thread���ʵ��������
		int num=7;
		curr=Thread.currentThread(); //���ص�ǰ���е��̶߳�����һ����̬�ķ���
		curr.setPriority(num); //�����̵߳����ȼ�
		System.out.println("��ǰ�̣߳�"+num);
		System.out.println("�߳�����"+curr.getName()); //��õ����̵߳�����
		System.out.println("���ȼ���"+curr.getPriority());//ȡ���̵߳����ȼ�

	}

}
