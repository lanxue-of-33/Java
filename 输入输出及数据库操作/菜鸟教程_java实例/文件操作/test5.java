//演示使用FileWrite方法向文件中追加数据

package 文件操作;
import java.io.*;

import java.io.BufferedWriter;

public class test5 {

	public static void main(String[] args) {
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("filename"));//会直接创建文件filename
			//FileWriter方法：文件不存在时在磁盘直接创建
			out.write("aString\n");
			out.close();
			out=new BufferedWriter(new FileWriter("filename",true));//true代表则将字节写入文件末尾处，而不是写入文件开始处
			//文件存在时，true代表则将字节写入文件末尾处，而不是写入文件开始处，并不会覆盖文件
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
//FileWrider可以创建文件，而FileReader不可以，它只能用来关联一个已经存在的文件
