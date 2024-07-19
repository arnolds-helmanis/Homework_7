package Classes_And_Objects;

public class PracticalWorkWorker {

	public static void main(String[] args) {
		Worker subject1 = new Worker ("Jim", 45, 9);
		Worker subject2 = new Worker ("Lisa", 18, 0);
		Worker subject3 = new Worker ("Bill", 45, 16);
		Worker subject4 = new Worker ("Alice", 58, 15);
		Worker subject5 = new Worker ("Timmy", 17, 1);
		Worker subject6 = new Worker ("Leroy", 74, 3);
		Worker[] workers = {subject1, subject2, subject3, subject4, subject5, subject6};
		
		subject1.getRanks();
		System.out.println("");
		
		for(Worker employee: workers) {
			System.out.println(employee);
			employee.isEligible();
			System.out.println("");
		}
		subject4.getPromotion();
		
		double pension = subject6.determinePension();
		System.out.println(subject6.name + "'s pension is " + pension + " euros a month.");
		
		double biggestSalary = 0;
		String employee = "";
		for (int i = 0; i < workers.length; i++) {
			if (workers[i].getSalary() > biggestSalary) {
				biggestSalary = workers[i].getSalary();
				employee = workers[i].getName();
			}
		}
		System.out.println(employee +" has the biggest salary in this work group and it is " + biggestSalary + " euros a month.");
		
	}

}
