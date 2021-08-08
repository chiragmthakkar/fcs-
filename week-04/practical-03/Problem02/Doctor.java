//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to display the speciality of the Doctor
//===================================

// Doctor is child class and Person is parent class
class Doctor extends Person {
    private String speciality;

    public Doctor(){
        speciality = "null";
    }

    public Doctor(String speciality){
        this.speciality = speciality;
    }
    // Accessor
    public String getSpeciality(){
        return this.speciality;
    }

    // Mutator
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    // For TESTING
    // public static void main(String args[]){
    //     Doctor d = new Doctor();
    //     d.setSpeciality("Phsiotheraphist");
    //     System.out.println(d.getSpeciality());
    // }
}