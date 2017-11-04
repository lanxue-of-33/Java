//删除文件
//前提也是文件哟啊存在

package 文件操作;
import java.io.*;

public class test3 {

	public static void main(String[] args) {
		try {
			String str="E:\\test.txt";
			File file=new File(str);
			//new File("E:\\test.txt"):  通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例，并未在磁盘中创建文件
//			createNewFile() 
//	          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
			file.createNewFile();
//			当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。检查文件是否存在，若不存在则创建该文件，这是单个操作，对于其他所有可能影响该文件的文件系统活动来说，该操作是不可分的。
			if(file.delete()) { //调用文件删除方法.delete(),其返回值是布尔值
				System.out.println(file.getName()+"文件已被删除！");
			}else {
				System.out.println("文件删除失败！");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
