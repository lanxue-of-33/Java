//�ļ���������
//ʹ��File���oldName��renameTo��newName���������������ļ�

package �ļ�����;
import java.io.File;
import java.nio.file.*;

public class test9 {

	public static void main(String[] args) {
		String path="E:\\b.txt";
        File oldName=new File(path);//ֻ���ڹ����ļ�����û�ô��ļ�
        File newName=new File("E:\\aaa.txt"); 
        if(oldName.renameTo(newName)) { //�÷�������������������ֵ�ǲ���ֵ
        	System.out.println("����������");
        }else {
        	System.out.println("Error");
        }
	}

}
