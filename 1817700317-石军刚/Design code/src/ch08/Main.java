package ch08;

 class LeiFeng
{
	public void sweep()
	{
		System.out.println("扫地");
	}

	public void wash()
	{
		System.out.println("洗衣");
	}

	public void buyRice()
	{
		System.out.println("买米");
	}
}
//学雷锋的大学生类，继承雷锋
 class Undergraduate extends LeiFeng
{

}

//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		LeiFeng student1 = new Undergraduate();
		student1.buyRice();
		LeiFeng student2 = new Undergraduate();
		student2.sweep();
		LeiFeng student3 = new Undergraduate();
		student3.wash();
	}
}