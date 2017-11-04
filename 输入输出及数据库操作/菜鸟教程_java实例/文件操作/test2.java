//演示使用readLine方法来获取文件的内容
//首先你需要创建一个test.log文件

package 文件操作;
import java.io.*;
public class test2 {

	public static void main(String[] args) {
		try {
			BufferedReader in=new BufferedReader(new FileReader("test.log"));
			String str;
//			读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。 
//			返回：包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null 
//			FileReader 用于读取字符流。要读取原始字节流，请考虑使用 FileInputStream。 
//	new FileReader("test.log")		在给定从中读取数据的文件名的情况下创建一个新 FileReader。
			while((str=in.readLine())!=null) {
				System.out.println(str);
			}
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
