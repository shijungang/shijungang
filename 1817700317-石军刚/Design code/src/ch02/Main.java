package ch02;

interface CashSuper
{
	public double acceptCash(double money);
}
//正常收费子类
 class CashNormal implements CashSuper
{

	public double acceptCash(double money)
	{
		return money;
	}
}
//打折收费子类
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
//返利收费子类
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
//现金收费工厂类
 class CashFactory
{
	 static CashSuper createCash(String type)
	{
		CashSuper cs = null;
		if ("正常收费".equals(type))
		{
			cs = new CashNormal();
		}
		else if ("满300返100".equals(type))
		{
			cs = new CashReturn(300, 100);
		}
		else if ("打8折".equals(type))
		{
			cs = new CashRebate(0.8);
		}
		
		return cs;
	}
}
//客户端代码
public class Main
{
	private static double	total	= 0;

	public static void main(String[] args)
	{
		consume("正常收费", 1, 1000);
		consume("满300返100", 1, 1000);
		consume("打8折", 1, 1000);

		System.out.println("总计:" + total);
	}

	public static void consume(String type, int num, double price)
	{
		CashSuper csuper = CashFactory.createCash(type);
		double totalPrices = 0;
		totalPrices = csuper.acceptCash(num * price);
		total += totalPrices;
		System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
	}
}