//��ȡ�ļ���С
//ʹ��File���file��exit������file��length������������ȡ�ļ��Ĵ�С�����ֽڼ��㣬1kB=1024�ֽڣ�

package �ļ�����;
import java.io.File;
import java.nio.file.*;

public class test8 {
    
	public static long getFileSize(String filename) {	
			File file=new File(filename);
			if(!file.exists()||!file.isFile()) {
				System.out.println("�ļ�������!");
				return -1;
			}
			return file.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="E:\\myjavafile.txt";
       long size=getFileSize(path);
       System.out.println(path+"�ļ���СΪ��"+size);
	}

}
