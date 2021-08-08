//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to get the diagonistics , intime and prevtime of the patient
//===================================

// Patient is the child class and Person is the Parent class
class Patient extends Person {
    private String diagonistic;
    private String inTime;
    private String prevTime;

    // Accessor
    public String getDiagonistic() {
        return this.diagonistic;
    }
    
    public String getInTime(){
        return this.inTime;
    }

    public String getPrevTime(){
        return this.prevTime;
    }

    // Mutator

    public void setDiagonistic(String diagonistoc){
        this.diagonistic = diagonistoc;
    }

    public void setInTime(String inTime){
        this.inTime = inTime;
    }

    public void setPrevTime(String prevTime){
        this.prevTime = prevTime;
    }

    // FOR TESING ONLY
    // public static void main(String args[]){
    //     Patient p = new Patient();
    //     p.setDiagonistic("Cough");
    //     p.setInTime("11.23am");
    //     p.setPrevTime("1.21am");

    //     System.out.println(p.getDiagonistic());
    //     System.out.println(p.getInTime());
    //     System.out.println(p.getPrevTime());
    // }
}