//修改文件的最后修改日期
//使用File类的fileTochange。lastModified（）和fileTochange。setLastModified（）方法

package 文件操作;
import java.io.File;
import java.nio.file.*;
import java.util.*;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="E:\\myjavafile.txt";
       try {
    	   File fileTochange=new File(path);//创建File类的实例对象fileTochange，其只在内存中创建，但没在磁盘中创建文件
           fileTochange.createNewFile();//现在是在磁盘之中创建文件
           Date filetime=new Date(fileTochange.lastModified());
           System.out.println(filetime.toString());
           System.out.println(fileTochange.setLastModified(System.currentTimeMillis()));
           filetime=new Date(fileTochange.lastModified());
           System.out.println(filetime.toString());
       }catch(Exception e) {
    	   System.out.print(e);
       }
//       每运行一次即是对文件的一个修改，但不会对已经存在的文件进行覆盖
	}

}
