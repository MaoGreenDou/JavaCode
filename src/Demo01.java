
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
	
public static void main(String[] args) {
//
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
// //	p1.fun();    //不可以运行，此时的fun是Student独有的
//	s1.fun1();     //只是继承，没有被覆写
//	s1.fun1(1);    //没有被覆写，只是重载
//	
//	总结：被覆写的方法，在子类和父类中只有访问权限，异常处理，和函数体可以
//	不一样，且前两者的要求在子类中不能比父类更严格。注意private不能被继承
	
	}


}



class Person{
	String nameString;
	int age;
	
	private void fun()
	{
		System.out.println("Person");
	}
	
	public int fun1()
	{
		System.out.println("Person");
		return 0;
	}
}

class Student extends Person{
	 void fun() {
		System.out.println("Student");
	}
	 
	public int fun1(int a)
	{
		System.out.println("Student with a parameter");
		return 0;
	}
}


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

enum Color{
	RED,BULE,BLACK;
}
