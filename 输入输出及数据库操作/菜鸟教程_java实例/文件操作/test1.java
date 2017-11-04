//文件写入

package 文件操作;
import java.io.*;
public class test1 {

	public static void main(String[] args) {
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("runoob.txt"));//该文件会直接建在“文件操作”目录下
//			将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
//	new FileWriter("runoob.txt")		根据给定的文件名构造一个 FileWriter 对象
			out.write("菜鸟教程");
			out.close();
			System.out.println("文件创建成功！");
		}catch(IOException e) {
			
		}

	}

}
