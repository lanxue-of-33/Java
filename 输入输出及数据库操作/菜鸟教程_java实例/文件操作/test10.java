//�����ļ�ֻ��
//ʹ��File���file��setReadOnly������file��canWriter���������������ļ�ֻ�ɶ�

//����ļ��Ƿ����
//ʹ��File���file��exits�����������ж��ļ��Ƿ����

//��ָ��Ŀ¼�д����ļ�
//ʹ��File���file��createTempFile����������ָ��Ŀ¼�д����ļ�

//��ȡ�ļ��޸�ʱ��
//ʹ��File���file��lastModified������������ȡ�ļ�������޸�ʱ��

//�ļ�·���Ƚ�
//ʹ��File���filename��compartTo��another filename���������Ƚ������ļ�·���Ƿ���ͬһ��Ŀ¼��

package �ļ�����;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class test10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String path="E:\\aaa.txt";
        File file=new File(path);
        System.out.println("�ļ��Ƿ���ڣ�"+file.exists());
        System.out.println(file.setReadOnly());//�����ļ�ֻ�ɶ�������ֵ�ǲ���ֵ���ɹ�Ϊtrue
        System.out.println(file.canWrite());//�жϿ�д�𣺷���ֵ�ǲ���ֵ
        
        System.out.println();
        File createFile=null;
        File dir=new File("E:/");
        createFile=File.createTempFile("JavaTemp",".javatemp",dir);
        System.out.println(createFile.getPath());//��ȡ�ļ�·��
        
        File fileDate=new File(path);
        Long lastModefied=fileDate.lastModified();//��ȡ����޸�ʱ��
        Date date=new Date(lastModefied);//�ڽ�ʱ��ת��Ϊ���ڶ������
        System.out.println(date);
        
        System.out.println();
        if(fileDate.compareTo(createFile)==0) {
        	System.out.println("�ļ�·��һ�£�");
        }else {
        	System.out.println("�ļ�·����һ�£�");
        }
	}

}
