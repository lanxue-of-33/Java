//ɾ���ļ�
//ǰ��Ҳ���ļ�Ӵ������

package �ļ�����;
import java.io.*;

public class test3 {

	public static void main(String[] args) {
		try {
			String str="E:\\test.txt";
			File file=new File(str);
			//new File("E:\\test.txt"):  ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ������δ�ڴ����д����ļ�
//			createNewFile() 
//	          ���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ���
			file.createNewFile();
//			���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ�������ļ��Ƿ���ڣ����������򴴽����ļ������ǵ��������������������п���Ӱ����ļ����ļ�ϵͳ���˵���ò����ǲ��ɷֵġ�
			if(file.delete()) { //�����ļ�ɾ������.delete(),�䷵��ֵ�ǲ���ֵ
				System.out.println(file.getName()+"�ļ��ѱ�ɾ����");
			}else {
				System.out.println("�ļ�ɾ��ʧ�ܣ�");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
