package ch14;

import java.util.ArrayList;
import java.util.List;

//前台秘书类
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
//看股票同事类
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
		System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
	}
}
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		// 前台小组童子喆
		Secretary tongzizhe = new Secretary();
		
		// 看股票的同事
		StockObserver tongshi1 = new StockObserver("魏关姹", tongzizhe);
		StockObserver tongshi2 = new StockObserver("易管查", tongzizhe);
		
		//前台记下了两位同事
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		//发现老板回来
		tongzizhe.setAction("老板回来了!");
		
		//通知两个同事
		tongzizhe.announce();
	}
}
