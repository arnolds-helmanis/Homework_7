package Classes_And_Objects;

public class Worker {
	String name;
	private int age;
	private double salary;
	private int expInYears;
	private String rank;
	static String[] ranks = {"rookie", "professional", "sensei"};
	
	public Worker (String name, int age, int expInYears) {
		this.name = name;
		this.age = age;
		this.expInYears = expInYears;
		if (expInYears < 4) {
			this.rank = "rookie";
		} else if (expInYears >= 4 && expInYears < 10) {
			this.rank = "professional";
		} else {
			this.rank = "sensei";
		}
		if (this.age < 18) {
			this.salary = 200; // He/she needs some food as well.
		} else {
			this.salary = (this.expInYears * 300) + (this.age/5 * 100);
		}
	}
	
	void isEligible() {
		if (this.age < 18) {
			 System.out.println("Sorry, " + this.name + " you are too young to work officially!");
		} else if (this.age >= 18 && this.age < 64) {
			System.out.println("Congratualtions, " + this.name + "! You are perfectly fine to work.");
		} else {
			System.out.println(this.name + ", you are too old. you should rest!");
		}
	}
	
	void getPromotion() {
		this.salary += (expInYears/4 * 50);
	}
	
	double getSalary() {
		return this.salary;
	}
	
	String getName() {
		return this.name;
	}
	
	double determinePension() {
		return (this.salary * 0.1) + this.age + (expInYears * 15);
	}
	
	public String toString() {
		return this.name + " is a " + this.age + " years old " + this.rank + " and makes " + this.salary + " euros a month.";
	}
	
	static void getRanks() {
		System.out.println("A worker can have a one of these ranks: ");
		for (int i = 0; i < ranks.length; i++) {
			System.out.println(" - " + ranks[i]);
		}
	}
	

}
