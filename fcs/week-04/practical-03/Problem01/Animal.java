//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to get the details of an Animal
//===================================

class Animal{
 	private String name;
 	private double weight;
 	private String favouriteFood;
    private int age;
     
    // Basic Constructor
	public Animal(){
        name = "null";
        weight = 0;
        favouriteFood = "null";
        age = 0;
	}

	// Parametrised Constructor
	public Animal(String name , double weight , String favouriteFood , int age){
        this.name = name;
        this.weight = weight;
        this.favouriteFood = favouriteFood;
        this.age = age;
	}

	// Accessors or Getters
	public String getName(){
		return this.name;
	}

	public double getWeight(){
		return this.weight;
	}

    public String getFavouriteFood(){
		return this.favouriteFood;
	}

	public int getAge(){
		return this.age;
	}

	// Mutators or Setters
	public void setName(String name){
		this.name = name;
	}

	public void setWeight(double weight){
		this.weight = weight;
    }
    
	public void setFavouriteFood(String favouriteFood){
		this.favouriteFood = favouriteFood;
    }
    
	public void setAge(int age){
		this.age = age;
    }
    
    // // Main for testing
    // public static void main(String args[]){
    //     Animal a = new Animal();
    //     a.setAge(11);
    //     a.setFavouriteFood("Banana");
    //     a.setName("Monkey");
    //     a.setWeight(25);
    //     System.out.println(a.getName());
    //     System.out.println(a.getAge());
    //     System.out.println(a.getFavouriteFood());
    //     System.out.println(a.getWeight());
    // }
}
