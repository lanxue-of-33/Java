//������ʱ�ļ�
//��ʾʹ��File���createTempFile��String prefix��String suffix����
//������Ĭ����ʱĿ¼��������ʱ�ļ�������prefixΪǰ׺����ʳsuffixΪ��׺

package �ļ�����;
import java.io.*;
public class test6 {

	public static void main(String[] args)throws Exception {
		File temp=File.createTempFile("testrunoobtmp",".txt");
        System.out.println("�ļ�·����"+temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out=new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("��ʱ�ļ��Ѿ�������");
        out.close();
	}

}
