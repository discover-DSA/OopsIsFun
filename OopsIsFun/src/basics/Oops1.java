package basics;

public class Oops1 {

	public static void main(String[] args) {
		//System.out.println("Hello");
		//person p1 = new person();
		
		//p1.age = 24;
		//p1.name = "Amit Kumar";
		
		//person p2 = new person(31, "shivam");
	//	p2.age = 30;
		//p2.name = "Akash Kumar";
		
//		System.out.println( p1.name +"   "+ p1.age);
//		System.out.println( p2.name +"   "+ p2.age);
		//p1.eat();
//		p2.walk(5);
//		p2.walk();
		//System.out.println(person.count);
		
		Developer d1 = new Developer(24, "Srinath");
				d1.walk();
		
		
		
 
	}

}

class Developer extends person{
	public Developer(int age, String name)
	{
		super(age,name);
	}
	
	void walk()
	{
		System.out.println("Developer "+ name + " is walking");
	}
	
}

class person{
	String name;
	int age;
	static int count;
	
	//constructor
	public person() {
		count++;
		System.out.println("Creating an object");
	}
	
	public person(int age, String name) {

		this.name = name;
		this.age = age;
		
	}
	void walk() {
		System.out.println(name + " is Walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk(int steps)
	{
		System.out.println(name + " Walked steps - " + steps);
	}
	
	void doWork()
	{
		System.out.println("The person is walking");
	}

}