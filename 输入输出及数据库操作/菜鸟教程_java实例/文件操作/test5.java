//��ʾʹ��FileWrite�������ļ���׷������

package �ļ�����;
import java.io.*;

import java.io.BufferedWriter;

public class test5 {

	public static void main(String[] args) {
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("filename"));//��ֱ�Ӵ����ļ�filename
			//FileWriter�������ļ�������ʱ�ڴ���ֱ�Ӵ���
			out.write("aString\n");
			out.close();
			out=new BufferedWriter(new FileWriter("filename",true));//true�������ֽ�д���ļ�ĩβ����������д���ļ���ʼ��
			//�ļ�����ʱ��true�������ֽ�д���ļ�ĩβ����������д���ļ���ʼ���������Ḳ���ļ�
			out.write("aString2");
			out.close();
			BufferedReader in=new BufferedReader(new FileReader("filename"));
			String str;
			while((str=in.readLine())!=null) {
				System.out.println(str);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("exception occoured"+e);
		}

	}

}
//FileWrider���Դ����ļ�����FileReader�����ԣ���ֻ����������һ���Ѿ����ڵ��ļ�
