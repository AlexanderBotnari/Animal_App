
public class AnimalApp {

	public static void main(String[] args) {
		Animal a = new Animal("Tuzik" , 5);
		a.info();
		Dog my_dog = new Dog("Nerro" , 12);
		my_dog.info();
		Cat my_cat = new Cat("Mira", 7);
		my_cat.info();
	}
}
//SuperClass
class Animal{
	//properties
	private String name;
	private Integer age;
	
	//methods
	public Animal() {}
	public Animal (String name , Integer age){
		setName(name);
		setAge(age);
	}
	public void info() {
		info("Animal");
	}
	public void info(String type) {
		System.out.printf("### THIS IS AN %6s ###\n",type);
		System.out.printf("%10s (%d years)\n",name,age);
		System.out.println(" ########################\n");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 20) {
			this.name = name;
	}else {
		System.err.println("Invalid name !!!");
	}
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		if(age > 0 && age < 200) {
			this.age = age;
		}else {
			System.err.println("Invalid age !!!");
		}
	}
}
class Dog extends Animal{
	public Dog() {}
	public Dog(String name , Integer age) {
		super(name , age);
	}
	public void info() {
		info("Dog");
	}
}
class Cat extends Animal{
	public Cat() {}
	public Cat(String name, Integer age) {
		super(name, age);
	}
	public void info() {
		info("Cat");
	}
}