//创建临时文件
//演示使用File类的createTempFile（String prefix，String suffix）；
//方法在默认临时目录来创建临时文件，参数prefix为前缀，蚕食suffix为后缀

package 文件操作;
import java.io.*;
public class test6 {

	public static void main(String[] args)throws Exception {
		File temp=File.createTempFile("testrunoobtmp",".txt");
        System.out.println("文件路径："+temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out=new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已经创建！");
        out.close();
	}

}
