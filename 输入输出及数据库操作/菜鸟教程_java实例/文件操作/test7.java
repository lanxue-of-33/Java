//�޸��ļ�������޸�����
//ʹ��File���fileTochange��lastModified������fileTochange��setLastModified��������

package �ļ�����;
import java.io.File;
import java.nio.file.*;
import java.util.*;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="E:\\myjavafile.txt";
       try {
    	   File fileTochange=new File(path);//����File���ʵ������fileTochange����ֻ���ڴ��д�������û�ڴ����д����ļ�
           fileTochange.createNewFile();//�������ڴ���֮�д����ļ�
           Date filetime=new Date(fileTochange.lastModified());
           System.out.println(filetime.toString());
           System.out.println(fileTochange.setLastModified(System.currentTimeMillis()));
           filetime=new Date(fileTochange.lastModified());
           System.out.println(filetime.toString());
       }catch(Exception e) {
    	   System.out.print(e);
       }
//       ÿ����һ�μ��Ƕ��ļ���һ���޸ģ���������Ѿ����ڵ��ļ����и���
	}

}
