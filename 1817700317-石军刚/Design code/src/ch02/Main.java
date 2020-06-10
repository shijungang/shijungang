package ch02;

interface CashSuper
{
	public double acceptCash(double money);
}
//�����շ�����
 class CashNormal implements CashSuper
{

	public double acceptCash(double money)
	{
		return money;
	}
}
//�����շ�����
class CashRebate implements CashSuper
{
	private double	moneyRebate	= 1;

	public CashRebate(double moneyRebate)
	{
		this.moneyRebate = moneyRebate;
	}

	public double acceptCash(double money)
	{
		return money * moneyRebate;
	}
}
//�����շ�����
 class CashReturn implements CashSuper
{
	private double	moneyCondition	= 0;
	private double	moneyReturn		= 0;

	public CashReturn(double moneyCondition, double moneyReturn)
	{
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	public double acceptCash(double money)
	{
		double result = money;
		if (money >= moneyCondition)
		{
			result = money - money / moneyCondition * moneyReturn;
		}
		return result;
	}
}
//�ֽ��շѹ�����
 class CashFactory
{
	 static CashSuper createCash(String type)
	{
		CashSuper cs = null;
		if ("�����շ�".equals(type))
		{
			cs = new CashNormal();
		}
		else if ("��300��100".equals(type))
		{
			cs = new CashReturn(300, 100);
		}
		else if ("��8��".equals(type))
		{
			cs = new CashRebate(0.8);
		}
		
		return cs;
	}
}
//�ͻ��˴���
public class Main
{
	private static double	total	= 0;

	public static void main(String[] args)
	{
		consume("�����շ�", 1, 1000);
		consume("��300��100", 1, 1000);
		consume("��8��", 1, 1000);

		System.out.println("�ܼ�:" + total);
	}

	public static void consume(String type, int num, double price)
	{
		CashSuper csuper = CashFactory.createCash(type);
		double totalPrices = 0;
		totalPrices = csuper.acceptCash(num * price);
		total += totalPrices;
		System.out.println("����:" + price + " ����:" + num + "�ϼ�:" + totalPrices);
	}
}