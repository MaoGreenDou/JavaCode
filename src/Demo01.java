
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Demo01 {
	
public static void main(String[] args) throws IOException {

/* 0.  前备知识 */
	
//	1.java产生背景
//	2.java程序开发环境搭建
//	3.java程序从源码到运行的过程
//	4.java虚拟机工作原理
//	5.java集成开发环境搭建
	
/* 1.  运算符  */
	
//		System.out.println(~3); //    0 000 001 1
//		                            //    1 111 110 0 补码
//		                            //    1 000 010 0 原码 -4
//		System.out.println(!false);
	
/* 2. switch */
	
//		int x = 0;
//		switch (x) {
//		case 1:
//			System.out.println(x);
//			break;
//		}
	
/* 3. 数组  */
//	数组的初始化，分配空间，赋值三个部分可以
//	分类成动态进行，和静态进行。
//	数组的传递是按照引用传递。
	
/* 4. String  */
//	字符串的两种初始化方法。   （只要new就开辟空间）
//	字符串的不可变性。
//	Java和C++，C语言中引用的不同之处。
//	字符串的+操作内存示意
//	字符串的对比（享元模式和new的联系） 同第一条
//	字符串的匿名对象
//	String aString = "hello";
//	String bString = new String("hello");
//	String cString = "hello";
//	System.out.println(aString==bString);  //false
//	System.out.println(aString==cString);  //true

/* 5.类在内存中的空间分配  */
//	Person p1 = new Person();
//	System.out.println(p1.age);
//	
//	Person p2 = new Person();
//	p2.nameString = "hello";
//	p1.nameString = "hello";
//	System.out.println(p1.nameString==p2.nameString);  //引用数据类型内部的引用数
//	                                                   //据类型的内存分布
//	
//	p2.nameString = new String("hello");
//	System.out.println(p1.nameString==p2.nameString);
//	
//	Person p3 = p1;
//	p3.age = 10;
//	System.out.println(p1.age);

/* 6. 关于静态类  */
//	1. 只有内部类能被声明为静态类 
//	2.  静态类的存在意义在于该类只为某个类服务
//	3. 静态类的内部属性，方法可以是静态的也可以是非静态的
//	4. 非静态类的属性只能是非静态的
//	5. 静态类的方法只能访问外部类的静态方法
	
/* 7. 关于Data类(long <---> Date)   */
//	Date d1 = new Date();
//	long l = d1.getTime();
//	
//	System.out.println(d1);
//	System.out.println(l);
//	
//	Date d2 = new Date(System.currentTimeMillis());
//	
//	System.out.println(d2);
//	System.out.println(System.currentTimeMillis());

	
/* 8. 关于SimpleDateFormat类（String <---> Date）  */
//	SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//	Date d1 = new Date();
//	String s1 = sdfDateFormat.format(d1);
//	
//	System.out.println(s1);
//	
//	try {
//		d1 = sdfDateFormat.parse(s1);
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	System.out.println(d1);
//	System.out.println(d1.getTime());

/* 9.关于enum  */
//	Color c1 = Color.BLACK;
//	Person p1 = new Person();
//	System.out.println(c1);
//	System.out.println();

/* 10.关于singleton(对访问权限的理解加深)  */
//	Singleton s1 = Singleton.getSingleton();
//	s1.fun();

/* 11.关于继承和访问权限  */
//	Student s1 = new Student();
//	s1.fun();    //可以运行
//	Person p1 = new Student();
////	p1.fun();    //不可以运行，此时的fun是Student独有的
//	s1.fun1();     //只是继承，没有被覆写
//	s1.fun1(1);    //没有被覆写，只是重载
//	
//	总结：被覆写的方法，在子类和父类中只有访问权限，异常处理，和函数体可以
//	不一样，且前两者的要求在子类中不能比父类更严格。注意private不能被继承
//  具体情况可以结合继承体系在内存中的分配进行分析	
	
/* 12. 关于异常处理机制  */
	
//	System.out.println(testExcept());
//	Exception exception = new ArithmeticException();
//	System.out.println(exception.getMessage());  //null
//	System.out.println(exception.toString());    //AE
//	exception.printStackTrace();
	
/* 13.关于泛型Generics */	
//    Info<Integer> idemo = new Info<Integer>();
//    Info<Double> idemo02 = new Info<Double>();
//    idemo.t = 10;
//    System.out.println(idemo.t+1);
//    System.out.println(idemo.fun("Hello"));
//    testInfo(idemo);
//    testInfo(idemo02);
	
//	ArrayList<String> alS = new ArrayList<String>();
//	alS.add("first");
//	alS.add("second");
//	alS.add("third");
//	
//	Set<Integer> sIntegers = new HashSet<Integer>();
//	sIntegers.add(1);
//	sIntegers.add(1);    //可以加入相同的吗？
//	sIntegers.add(2);
//	
//	HashMap<String, Integer> msi = new HashMap<String, Integer>();
//	msi.put("First", 1);
//	msi.put("First",1);
//	msi.put("second", 2);
//	
//	Iterator<?> iterator = alS.iterator();
//	while (iterator.hasNext()) {
//		System.out.println(iterator.next());
//		
//	}
//	
//	iterator = sIntegers.iterator();
//	while (iterator.hasNext()) {
//		System.out.println(iterator.next());
//		
//	}
//	
////	iterator = msi.iterator();    //map没有实现 Iterator
////	while (iterator.hasNext()) {
////		System.out.println(iterator.next());
////		
////	}
////	
//	
//	/* 可以继续优化，如何实现不暴露内部代码的细节  */
////	Set<String> kSet = msi.keySet();   //<String>---><?>下面的for-each循环无法运行
////	for(String iString :kSet)
////	{
////		System.out.println(msi.get(iString));
////	}
	
/* 14. 关于静态方法的覆写 */
	/*
	  * 证明了静态方法的覆写是开辟一个新的内存区域存储新的函数体
	  * 和静态变量不一样 
	 */
//	demoStatic.fun();
//	demoStaticInherit.fun();
//	demoStaticInherit d1 = new demoStaticInherit();
//	demoStatic d2 = new demoStatic();
//	d1.fun();
//	d2.fun();
//	
	
/* 15. IO操作   */	
	//demo1();
	//demo2();
	//demo3();
	//demo4();
	//demo5();
	//demo6();
	//demo7();
	}    //--static截止处----------

    public static void demo1() {
    	/* 
    	  *  测试说明：
    	  *  测试字节输出装饰流PrintStream
    	 * print<?>方法会（打包参数）调用参数toString方法
    	 * write方法输出码表对应值
    	  *  注意关闭流或者执行刷出操作（ln不用）
    	 * write方法不能输出自定义类型
    	 */
		System.out.println("aaa");
		
		
		PrintStream ps = System.out;			//可以换一种方式写：获取标注输出流
		ps.println(97);							//底层通过Integer.toString()将97转换成字符串并打印
		ps.write(97);							//查找码表,找到对应的a并打印		
		Person p1 = new Person("张三", 23);
		ps.println(p1);							//默认调用p1的toString方法		
		Person p2 = null;						//打印引用数据类型,如果是null,就打印null,如果不是null就打印对象的toString方法
		ps.println(p2);
		ps.close();
    }
    
	public static void demo2() throws IOException {
		/*
		 *  字符装饰流也可以包装字节流
		 *  字符流的输出带2K缓存
		 */
		PrintWriter pw = new PrintWriter(new FileWriter("demo03.txt"),true);
		//PrintWriter pw = new PrintWriter(new FileOutputStream("demo03.txt"),true);
		
		//pw.println(97);//自动刷出功能只针对的是println方法
		pw.write(97); //查码表得到a，如果忘了关流，是写不出的，有2K缓冲
		pw.print(97); // 忘了关流也不能自动刷出
		//pw.println(97); //自动刷出
		pw.close(); 
		
	}
	
	public static void demo3() {
		byte[] array = new byte[4];
		int len = 0;
		try {
			FileInputStream iStream = new FileInputStream("demo03.txt");
		    len = iStream.read(array);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(len);
		System.out.println(new String(array,0,len));
	}
	
	public static void demo4() {

		char[] array = new char[4];
		int len = 0;
		try {
			FileReader fr = new FileReader("demo03.txt");
		    len = fr.read(array);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(len);
		System.out.println(new String(array,0,len));
	}
	
	public static void demo5() {
		/*
		 * GBK码读中文
		  *  一个中文一个字符
		 */
		int len = 0;
		char[] arr = new char[4];
		try {
			InputStreamReader tr = new InputStreamReader(new FileInputStream("demo03.txt"),"GBK");
		    len = tr.read(arr);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(len);
		System.out.println(new String(arr,0,len));
	}
	
	public static void demo6() {
		/*
		  *  测试内容：序列化，反序列化对象IO
		 */
		try {
		    Person p1 = new Person("Jack", 21);
		    FileOutputStream os = new FileOutputStream("object.txt");
		    ObjectOutputStream oos = new ObjectOutputStream(os);
		    oos.writeObject(p1);
		    
		    Person p2  = null;
		    FileInputStream is = new FileInputStream("object.txt");
		    ObjectInputStream ooi = new ObjectInputStream(is);
		    p2 = (Person)ooi.readObject();
		    System.out.println(p2);
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}
	
	public static void demo7() {
		/*
		  *  测试内容：字节流标准异常处理
		  * 文件打开异常，文件读异常，文件写异常，文件（非null）关闭异常  
		 */
		
//java 1.7
		try(
				FileInputStream iStream = new FileInputStream("Exception.txt");
				FileOutputStream oStream = new FileOutputStream("ExceptionT.txt");
				){
			int b;
			while((b=iStream.read())!=-1) {
				oStream.write(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//java 1.6
	    /*
	          * 注意事项：
	     * fis fos首先设置成null，防止局部变量无法关闭
	          * 第一个try-catch-finally体系解决：创建异常，读写异常，资源释放三个问题
	     * finally块中释放资源时，分开释放多个流资源，防止前面的异常导致后面也无法关闭
	          * 即能关一个关一个
	          * 关之前要判断是否非null
	          * 关闭的时候 也有可能引起异常，因此也要用try-catch-finally体系
	     * try-catch解决第一个关闭异常
	     * finally关闭第二个流，也要嵌套一个try-catch防止第二个的关闭异常
	     */
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("abc.txt");    //创建流异常
			fos = new FileOutputStream("coy.txt");
			
			int b;
			while ( (b= fis.read()) != -1 ) {    //读写异常
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();    //关闭异常
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (fos != null) {
					try {
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}

	}
//------------------------------------------
/*  该系列函数用来测试泛型机制   */
//     public static void testInfo(Info myInfo)   //方案一：去掉报错
//     {
//    	 System.out.println(myInfo.t);
//     }
     
//     public static void testInfo(Info<?> myInfo)   //方案二：通配符
//     {
//    	 System.out.println(myInfo.t);
//     }
//
//       public static void testInfo(Info<? extends Object> myInfo)   //方案三：上限
//       {
//    	   System.out.println(myInfo.t);
//       }
       
//       public static void testInfo(Info<? super Integer> myInfo)    //方案四：下限
//       {
//    	   System.out.println(myInfo.t);
//       }
     
     
//------------------------------------------
/* 该函数用来测试异常处理机制  */
//    public static int testExcept()
//    {
//    	int x = 10;
//    	try {
//			x = 20;
//			System.out.println(x/0);
//			return x;
//		} catch (Exception e) {
//			x = 30;
//			return x;    会先执行fianlly再返回
//		}finally {
//			x = 40;
//			System.out.println(x);
//			//return x;  直接从finally返回
//		}
//    	//return x;  测试不同语句块的x是否相互影响
//    }
//

}    //Demo01截止处

class demoStatic{
	public static void fun() {
		System.out.println("in basic class");
	}
}

class demoStaticInherit extends demoStatic{
	public static void fun() {
		System.out.println("in Inherit class");
	}
}
//------------------------------------------
class Person implements Serializable{
	private static final long serialVersionID = 1L;
	String nameString;
	private int age;
	
	public Person(String n,int a) {
		nameString = n;
		age = a;
	}
	
	
	//private void fun()
	public void fun()
	{
		System.out.println("Person");
		System.out.println(age);
	}
	
	public int fun1()
	{
		System.out.println("Person");
		return 0;
	}
}

//------------------------------------------
/* 用来测试Generics */
class Info<T>{    //泛型类
	public T t;
	
	public <V> V fun(V v)    //泛型方法
	{
		return v;
	}
}

//------------------------------------------
/* 用来测试继承，多态的相关知识点 */
class Student extends Person {
	public Student(String n, int a) {
		super(n, a);
		// TODO Auto-generated constructor stub
	}

	public void fun() {
		 super.fun();
		 System.out.println("Student");
	}
	 
	public int fun1(int a)
	{
		System.out.println("Student with a parameter");
		return 0;
	}
}

//------------------------------------------
/* 用来测试访问权限 （单例模式） */
class Singleton{
	private static final Singleton s1 = new Singleton();
	
	public static Singleton getSingleton() {
		return s1;
	}
	
	private Singleton() {
		
	}
	
	public void fun()
	{
		System.out.println("This is a singleton!");
	}
}

//------------------------------------------
/* 枚举类型 */
enum Color {
	RED,BULE,BLACK;
}
