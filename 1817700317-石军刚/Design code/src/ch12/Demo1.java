package ch12;
class Stock1{
	public void sell() {
		System.out.println("��Ʊ1����");
	}
	public void buy() {
		System.out.println("��Ʊ1����");
	}
}
class Stock2{
	public void sell() {
		System.out.println("��Ʊ2����");
	}
	public void buy() {
		System.out.println("��Ʊ2����");
	}
}
class Stock3{
	public void sell() {
		System.out.println("��Ʊ3����");
	}
	public void buy() {
		System.out.println("��Ʊ3����");
	}
}
class NationalDebt1{
	public void sell() {
		System.out.println("��ծ1����");
	}
	public void buy() {
		System.out.println("��ծ1����");
	}
}
class Realty1{
	public void sell() {
		System.out.println("���ز�1����");
	}
	public void buy() {
		System.out.println("���ز�1����");
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
