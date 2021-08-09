//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to get the details of the bicycle
//===================================


class Bicycle{
	private boolean is_serviced;
	private String inDate;
	private String outDate;
	private String serviceResponsible;

	// Basic Constructor

	public Bicycle(){
		is_serviced = false;
		inDate = "null";
		outDate = "null";
		serviceResponsible = "null";
	}

	// Parameterised Constructor
	public Bicycle(boolean is_serviced, String inDate, String outDate, String serviceResponsible){
		this.is_serviced = is_serviced;
		this.inDate = inDate;
		this.outDate = outDate;
		this.serviceResponsible = serviceResponsible;
	}

	// Accessors 
	public boolean getIs_serviced(){
		return this.is_serviced;
	}

	public String getInDate(){
		return this.inDate;
	}

	public String getOutDate(){
		return this.outDate;
	}

	public String getServiceResponsible(){
		return this.serviceResponsible;
	}

	// Mutator

	public void setIs_serviced(boolean is_serviced){
		this.is_serviced = is_serviced;
	}

	public void setInDate(String inDate){
		this.inDate = inDate;
	}

	public void setOutDate(String outDate){
		this.outDate = outDate;
	}

	public void setServiceResponsible(String serviceResponsible){
		this.serviceResponsible = serviceResponsible;
	}

	public void checkoutService(){

	}




}