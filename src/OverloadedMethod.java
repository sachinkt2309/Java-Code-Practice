// overloaded method = methods that shares the same name but have different parameters
// 						method name + parameters = method signature


public class OverloadedMethod {
	public static void main(String[] arg)
	{
		int a=5,b=6,c=7,d=8;
		int x=add(a,d,b,c);
		System.out.println(x);
		
	}
	static int add(int a,int b)
	{
		System.out.println("this overloaded method #1");
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		System.out.println("this overloaded method #2");
		return a+b+c;
	}
	static int add(int a,int b,int c,int d)
	{
		System.out.println("this overloaded method #3");
		return a+b+c+d;
	}
}
