package ch09;
 class Resume{
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	public Resume(String name) {
		this.name=name;
	}
	public void setPersonalInfo(String sex,String age) {
		this.sex=sex;
		this.age=age;
	}
	public void setWorkExperience(String timeArea,String company) {
		this.timeArea=timeArea;
		this.company=company;
	}
	public void display() {
		System.out.println(name+"     "+sex+"       "+age);
		System.out.println("����������"+timeArea+"  "+company);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Resume a=new Resume("����");
      a.setPersonalInfo("��", "29");
      a.setWorkExperience("1998-2000","xx��˾");
      
      Resume b=new Resume("����");
      b.setPersonalInfo("��", "29");
      b.setWorkExperience("1998-2000","xx��˾");
      
      Resume c=new Resume("����");
      c.setPersonalInfo("��", "29");
      c.setWorkExperience("1998-2000","xx��˾");
      
      a.display();
      b.display();
      c.display();
	}

}
