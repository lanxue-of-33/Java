//获取文件大小
//使用File类的file。exit（）和file。length（）方法来获取文件的大小（以字节计算，1kB=1024字节）

package 文件操作;
import java.io.File;
import java.nio.file.*;

public class test8 {
    
	public static long getFileSize(String filename) {	
			File file=new File(filename);
			if(!file.exists()||!file.isFile()) {
				System.out.println("文件不存在!");
				return -1;
			}
			return file.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="E:\\myjavafile.txt";
       long size=getFileSize(path);
       System.out.println(path+"文件大小为："+size);
	}

}
