//��ʾʹ��readLine��������ȡ�ļ�������
//��������Ҫ����һ��test.log�ļ�

package �ļ�����;
import java.io.*;
public class test2 {

	public static void main(String[] args) {
		try {
			BufferedReader in=new BufferedReader(new FileReader("test.log"));
			String str;
//			��ȡһ���ı��С�ͨ�������ַ�֮һ������Ϊĳ������ֹ������ ('\n')���س� ('\r') ��س���ֱ�Ӹ��Ż��С� 
//			���أ������������ݵ��ַ������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null 
//			FileReader ���ڶ�ȡ�ַ�����Ҫ��ȡԭʼ�ֽ������뿼��ʹ�� FileInputStream�� 
//	new FileReader("test.log")		�ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader��
			while((str=in.readLine())!=null) {
				System.out.println(str);
			}
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
