package ch06;

//person�����
class Person
{
	private String	name;

	public Person(String name)
	{
		this.name = name;
	}

	public void wearTShirts()
	{
		System.out.println("��T��");
	}

	public void wearBigTrouser()
	{
		System.out.println("�����");
	}

	public void wearSneakers()
	{
		System.out.println("����Ь");
	}

	public void wearSuit()
	{
		System.out.println("��װ");
	}

	public void wearTie()
	{
		System.out.println("���");
	}

	public void wearLeatherShoes()
	{
		System.out.println("ƤЬ");
	}

	public void show()
	{
		System.out.println("װ���" + name);
	}
}
//�ͻ��˴���
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("С��");

		System.out.println("��һ��װ��:");

		person.wearTShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();

		System.out.println("�ڶ���װ��:");

		person.wearSuit();
		person.wearTie();
		person.wearLeatherShoes();
		person.show();
	}
}
