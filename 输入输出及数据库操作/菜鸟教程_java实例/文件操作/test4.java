//��ʾʹ��BufferedWriter���read��write�������ļ����ݸ��Ƶ���һ���ļ�

package �ļ�����;
import java.io.*;

public class test4 {

	public static void main(String[] args) {
		try {
			BufferedWriter out1=new BufferedWriter(new FileWriter("srcfile.txt"));
//	new BufferedWriter:		����һ��ʹ��Ĭ�ϴ�С����������Ļ����ַ��������
			out1.write("String to be copied\n");
			out1.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			InputStream in=new FileInputStream(new File("srcfile.txt"));
//new FileInputStream������ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е� File ���� file ָ����
//			���ļ����ǲ������ļ�
			OutputStream out=new FileOutputStream(new File("destnfile.txt"));
			byte[]buf=new byte[1024];
			int len;
			while((len=in.read(buf))>0) {
				out.write(buf,0,len);
			}
			in.close();
			out.close();
		}catch(Exception e) {
			
		}
		try {
			BufferedReader in1=new BufferedReader(new FileReader("destnfile.txt"));
			String str;
			while((str=in1.readLine())!=null) {
				System.out.println(str);
			}
			in1.close();
		}catch(IOException e) {
			
		}
	}

}
