//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Practical Exam Number: Practical-Exam-01
// Program to get the details of the ebook
//===================================

// EBook is a child class and Book is a Parent class
class EBook extends Book
{
	private String url;

	// Basic Constructor
	public EBook(){
		url = "null";
	}

	// Parameterised Constructor
	public EBook(String url){
		this.url = url;
	}

	// Accessor
	public String getUrl(){
		return this.url;
	}

	// Mutator
	public void setUrl(String url){
		this.url = url;
	}

	// // ONLY FOR TESTING 
	// public static void main(String[] args)
	// {
	// 	EBook e = new EBook();
	// 	e.setUrl("www.google.com");
	// 	System.out.println(e.getUrl());
	// }
}