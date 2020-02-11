import java.io.*;
abstract class cal
{
	double a,b,s;
	public void get()throws IOException
	{
		System.out.println("Enter the two nos.");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Double.parseDouble(br.readLine());
		b=Double.parseDouble(br.readLine());
	}
	abstract void compute();
	void put()
	{
		System.out.println("The result is : "+ s);
	}
}
class addition extends cal
{
	void compute()
	{
		s=a+b;
	}
}
class division extends cal
{
	void compute()
	{
		s=a/b;
	}
}
class subtraction extends cal
{
	void compute()
	{
		s=a-b;
	}
}
class multiplication extends cal
{
	void compute()
	{
		s=a*b;
	}
}
class calculate{
	public static void main(String args[])throws IOException
	{
		System.out.println("CALCULATOR");
		int x,ch=1;
		addition a=new addition();
		subtraction b=new subtraction();
		multiplication c= new multiplication();
		division d= new division();
		do{
		System.out.println("Enter the operation you want to perform : ");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		switch (x){
			case 1: a.get();
				a.compute();
				a.put();
				break;
			case 2: b.get();
				b.compute();
				b.put();
				break;
			case 3: c.get();
				c.compute();
				c.put();
				break;
			case 4: d.get();
				d.compute();
				d.put();
				break;
		}	
		System.out.println("Press 0 to EXIT and 1 to CONTINUE");
		ch=Integer.parseInt(br.readLine());
		}while(ch!=0);
	}
}
	
	