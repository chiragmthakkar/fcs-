//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to get the details of the person
//===================================

class Person{
	private String givenName;
	private String lastName;
	private int age;
	private String gender;
	private String citizenship;

	// Basic Constructor
	public Person(){
		givenName="null";
		lastName = "null";
		age = 0;
		gender = "null";
		citizenship = "null"; 
	}

	// Parametrised Constructor
	public Person(String givenName , String lastName , int age , String gender , String citizenship ){
		this.givenName = givenName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.citizenship = citizenship; 
	}

	// Accessors or Getters
	public String getGivenName(){
		return this.givenName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public int getAge(){
		return this.age;
	}

	public String getGender(){
		return this.gender;
	}

	public String getCitizenship(){
		return this.citizenship;
	}

	// Mutators or Setters
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public void setCitizenship(String citizenship){
		this.citizenship = citizenship;
	}

	// Main for testing ONLY
	// public static void main(String args[]){
	// 	Person p = new Person();
	//  	p.setGivenName("Chirag");
	//  	p.setLastName("Thakkar");
	//  	p.setAge(50);
	//  	p.setGender("Male");
	//  	p.setCitizenship("Indian");

	// 	System.out.println(p.getGivenName());
	// 	System.out.println(p.getLastName());
	// 	System.out.println(p.getAge());
	// 	System.out.println(p.getGender());
	// 	System.out.println(p.getCitizenship());
	// }
}