//�ļ�д��

package �ļ�����;
import java.io.*;
public class test1 {

	public static void main(String[] args) {
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("runoob.txt"));//���ļ���ֱ�ӽ��ڡ��ļ�������Ŀ¼��
//			���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
//	new FileWriter("runoob.txt")		���ݸ������ļ�������һ�� FileWriter ����
			out.write("����̳�");
			out.close();
			System.out.println("�ļ������ɹ���");
		}catch(IOException e) {
			
		}

	}

}
