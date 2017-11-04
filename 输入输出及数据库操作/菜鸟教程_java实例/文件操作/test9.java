//文件的重命名
//使用File类的oldName。renameTo（newName）方法类重命名文件

package 文件操作;
import java.io.File;
import java.nio.file.*;

public class test9 {

	public static void main(String[] args) {
		String path="E:\\b.txt";
        File oldName=new File(path);//只是在关联文件，并没用打开文件
        File newName=new File("E:\\aaa.txt"); 
        if(oldName.renameTo(newName)) { //该方法用来重命名，返回值是布尔值
        	System.out.println("已重命名！");
        }else {
        	System.out.println("Error");
        }
	}

}
