package ch14;

import java.util.ArrayList;
import java.util.List;

//ǰ̨������
class Secretary
{
	private List<StockObserver>	observers	= new ArrayList<StockObserver>();
	private String				action;

	public void attach(StockObserver observer)
	{
		observers.add(observer);
	}

	public void announce()
	{
		for (StockObserver obj : observers)
		{
			obj.update();
		}
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}
}
//����Ʊͬ����
class StockObserver
{
	private String		name;
	private Secretary	sub;

	public StockObserver(String name, Secretary sub)
	{
		this.name = name;
		this.sub = sub;
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "�رչ�Ʊ���飬����������");
	}
}
//�ͻ��˴���
public class Main
{
	public static void main(String[] args)
	{
		// ǰ̨С��ͯ�ӆ�
		Secretary tongzizhe = new Secretary();
		
		// ����Ʊ��ͬ��
		StockObserver tongshi1 = new StockObserver("κ���", tongzizhe);
		StockObserver tongshi2 = new StockObserver("�׹ܲ�", tongzizhe);
		
		//ǰ̨��������λͬ��
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		//�����ϰ����
		tongzizhe.setAction("�ϰ������!");
		
		//֪ͨ����ͬ��
		tongzizhe.announce();
	}
}
