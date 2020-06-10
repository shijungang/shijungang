package ch06;

//person类代码
class Person
{
	private String	name;

	public Person(String name)
	{
		this.name = name;
	}

	public void wearTShirts()
	{
		System.out.println("大T恤");
	}

	public void wearBigTrouser()
	{
		System.out.println("大裤衩");
	}

	public void wearSneakers()
	{
		System.out.println("破球鞋");
	}

	public void wearSuit()
	{
		System.out.println("西装");
	}

	public void wearTie()
	{
		System.out.println("领带");
	}

	public void wearLeatherShoes()
	{
		System.out.println("皮鞋");
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("小菜");

		System.out.println("第一种装扮:");

		person.wearTShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();

		System.out.println("第二种装扮:");

		person.wearSuit();
		person.wearTie();
		person.wearLeatherShoes();
		person.show();
	}
}
