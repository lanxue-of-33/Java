//设置文件只读
//使用File类的file。setReadOnly（）和file。canWriter（）方法来设置文件只可读

//检测文件是否存在
//使用File类的file。exits（）方法类判断文件是否存在

//在指定目录中创建文件
//使用File类的file。createTempFile（）方法在指定目录中创建文件

//获取文件修改时间
//使用File类的file。lastModified（）方法来获取文件的最后修改时间

//文件路径比较
//使用File类的filename。compartTo（another filename）方法来比较两个文件路径是否在同一个目录下

package 文件操作;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class test10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String path="E:\\aaa.txt";
        File file=new File(path);
        System.out.println("文件是否存在："+file.exists());
        System.out.println(file.setReadOnly());//设置文件只可读，返回值是布尔值，成功为true
        System.out.println(file.canWrite());//判断可写吗：返回值是布尔值
        
        System.out.println();
        File createFile=null;
        File dir=new File("E:/");
        createFile=File.createTempFile("JavaTemp",".javatemp",dir);
        System.out.println(createFile.getPath());//获取文件路径
        
        File fileDate=new File(path);
        Long lastModefied=fileDate.lastModified();//获取最后修改时间
        Date date=new Date(lastModefied);//在将时间转化为日期对象输出
        System.out.println(date);
        
        System.out.println();
        if(fileDate.compareTo(createFile)==0) {
        	System.out.println("文件路径一致！");
        }else {
        	System.out.println("文件路径不一致！");
        }
	}

}
