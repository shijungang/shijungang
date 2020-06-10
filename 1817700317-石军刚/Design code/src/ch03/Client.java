package ch03;
class Animal{
	public void breathe(String animal) {
	System.out.println(animal+"ºôÎü¿ÕÆø");
	}
}
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal();
		animal.breathe("Å£");
		animal.breathe("Ñò");
		animal.breathe("Öí");

	}

}
