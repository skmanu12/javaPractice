package Java;
class Animal{
	void eat() {
		System.out.println("Animal Eat");
	}
}
class Dog extends Animal{
	void dogEat() {
		System.out.println("Dog  Eat");
	}
}
class BabyDog extends Dog{
	void babyDogEat() {
		System.out.println("Boby dog Eat");
	}
}
public class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b=new BabyDog();
		b.babyDogEat();
		b.dogEat();
		b.eat();
	}

}
