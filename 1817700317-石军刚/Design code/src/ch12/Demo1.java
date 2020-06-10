package ch12;
class Stock1{
	public void sell() {
		System.out.println("股票1卖出");
	}
	public void buy() {
		System.out.println("股票1买入");
	}
}
class Stock2{
	public void sell() {
		System.out.println("股票2卖出");
	}
	public void buy() {
		System.out.println("股票2买入");
	}
}
class Stock3{
	public void sell() {
		System.out.println("股票3卖出");
	}
	public void buy() {
		System.out.println("股票3买入");
	}
}
class NationalDebt1{
	public void sell() {
		System.out.println("国债1卖出");
	}
	public void buy() {
		System.out.println("国债1买入");
	}
}
class Realty1{
	public void sell() {
		System.out.println("房地产1卖出");
	}
	public void buy() {
		System.out.println("房地产1买入");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stock1 gu1=new Stock1();
         Stock2 gu2=new Stock2();
         Stock3 gu3=new Stock3();
         NationalDebt1 nd1=new NationalDebt1();
         Realty1 rt1=new Realty1();
         gu1.buy();
         gu2.buy();
         gu3.buy();
         nd1.buy();
         rt1.buy();
         
         gu1.sell();
         gu2.sell();
         gu3.sell();
         nd1.sell();
         rt1.sell();
	}

}
