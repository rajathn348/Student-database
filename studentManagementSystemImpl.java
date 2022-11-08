package Student;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

class studentManagementSystemImpl implements studentManagementSystem {
	 Scanner scan =new Scanner (System.in);
	 LinkedHashMap<Integer,Student> db=new LinkedHashMap<Integer,Student>();
	@Override
	public void addStudent() {
		System.out.println("Enter id,Name,Age and Marks");
		int id=scan.nextInt();
		String name=scan.next();
		int age=scan.nextInt();
		double marks=scan.nextDouble();
		Student std=new Student(age, name, age, marks);
		db.put(id, std);
		System.out.println("Student data is been inserted Successfully");
		
	}

	@Override
	public void removeStudent() {
		
		
	}

	@Override
	public void removeAllStudent() {
		
		db.clear();
		System.out.println("All the student data is been deleted");
	}

	@Override
	public void displayStudent() {
		
		
	}

	@Override
	public void displayAllStudent() {
		
			Set<Integer> setofKeys=db.keySet();
		
			for(int id:setofKeys) {
				System.out.println(db.get(id));
			}
		
	}

	@Override
	public void updateStudent() {
		
		
	}

	@Override
	public void countStudent() {
		db.size();
		System.out.println("the count of the students is "+db.size());
	}

	@Override
	public void sortStudent() {
	
		
	}

}
