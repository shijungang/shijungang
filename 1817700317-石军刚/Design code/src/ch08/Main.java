package ch08;

 class LeiFeng
{
	public void sweep()
	{
		System.out.println("ɨ��");
	}

	public void wash()
	{
		System.out.println("ϴ��");
	}

	public void buyRice()
	{
		System.out.println("����");
	}
}
//ѧ�׷�Ĵ�ѧ���࣬�̳��׷�
 class Undergraduate extends LeiFeng
{

}

//�ͻ��˴���
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