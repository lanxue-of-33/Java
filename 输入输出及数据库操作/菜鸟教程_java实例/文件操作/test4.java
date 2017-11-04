//演示使用BufferedWriter类的read和write方法将文件内容复制到另一个文件

package 文件操作;
import java.io.*;

public class test4 {

	public static void main(String[] args) {
		try {
			BufferedWriter out1=new BufferedWriter(new FileWriter("srcfile.txt"));
//	new BufferedWriter:		创建一个使用默认大小输出缓冲区的缓冲字符输出流。
			out1.write("String to be copied\n");
			out1.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			InputStream in=new FileInputStream(new File("srcfile.txt"));
//new FileInputStream（）：通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
//			打开文件但是不创建文件
			OutputStream out=new FileOutputStream(new File("destnfile.txt"));
			byte[]buf=new byte[1024];
			int len;
			while((len=in.read(buf))>0) {
				out.write(buf,0,len);
			}
			in.close();
			out.close();
		}catch(Exception e) {
			
		}
		try {
			BufferedReader in1=new BufferedReader(new FileReader("destnfile.txt"));
			String str;
			while((str=in1.readLine())!=null) {
				System.out.println(str);
			}
			in1.close();
		}catch(IOException e) {
			
		}
	}

}
