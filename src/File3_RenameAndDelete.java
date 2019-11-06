

import java.io.File;
import java.io.IOException;

public class File3_RenameAndDelete {

	/**
	 * * A:重命名和删除功能
			* public boolean renameTo(File dest):把文件重命名为指定的文件路径
			* public boolean delete():删除文件或者文件夹
		* B:重命名注意事项
			* 如果路径名相同，就是改名。
			* 如果路径名不同，就是改名并剪切。
		* C:删除注意事项：
			* Java中的删除不走回收站。
			* 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		demo1();
//		demo2();
	}

	public static void demo2() {
		File file1 = new File("yyy.txt");
		System.out.println(file1.delete());
		
		File file2 = new File("aaa");
		System.out.println(file2.delete());
		
		File file3 = new File("ccc");	//如果删除一个文件夹,那么文件夹必须是空的
		System.out.println(file3.delete());
	}

	public static void demo1() throws IOException {
		File file1 = new File("source1.txt");
		File file2 = new File("dest2.txt");
		file1.createNewFile();
		//File file2 = new File("d:\\dest.txt");
		System.out.println(file1.renameTo(file2));
	}

}