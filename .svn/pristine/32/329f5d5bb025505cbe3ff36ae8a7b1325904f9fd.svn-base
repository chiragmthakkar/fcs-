public class WaitingList {
    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    //  This method will pop the first patient from the waiting list
    //  @return the patient popped from the waiting list
    public Patient popPatient() {
        Node temp = this.head;
        if(this.head == null)
            return null;
        else{
            this.head = this.head.getNext();
            this.numNodes--;
        }
        return temp.getPatient();
    }


    // This method will add patient into the waiting list according to the triage level
    // param patient patient's data
     
    public void addToList(Patient patient) {
        if(this.head == null){
            Node newPatient = new Node(patient);
            //newPatient.setNext(this.head);
            this.head = newPatient;
            this.numNodes++;
            //System.out.println("a");
        }
        else {
            Node newPatient = new Node(patient);
            Node topPatient = new Node(null);
            topPatient = this.head;

            while(topPatient.getNext() != null){
                if(newPatient.getPatient().getTriageLevel() >= topPatient.getPatient().getTriageLevel() && 
                    newPatient.getPatient().getTriageLevel() < topPatient.getNext().getPatient().getTriageLevel()){
                    
                    //System.out.println("b");
                    Node t = topPatient.getNext();
                    topPatient.setNext(newPatient);
                    newPatient.setNext(t);
                    // newPatient.setNext(this.head);
                    // this.head = newPatient;
                    this.numNodes++;           
                    return;
                }
                else if(newPatient.getPatient().getTriageLevel() < topPatient.getPatient().getTriageLevel()){
                    newPatient.setNext(this.head);
                    this.head = newPatient;
                    this.numNodes++;     
                    //System.out.println("d");      
                    return;    
                    }
                    else {
                        topPatient = topPatient.getNext();
                        //System.out.println("c");
                    
                }
            }
                    topPatient.setNext(newPatient);
                    this.numNodes++;     
                    //System.out.println("e");         
        }
        }
    
    // function to print out the information for each patient in waiting list
    public void printList() {
//    Check if it's empty
    if (this.head == null) {
        System.out.println("Stack is empty.");
    }
    else {
        Node tmp = this.head;
        // int cnt = 0;
        while(tmp != null) {
            // System.out.println("cnt  "+ cnt +" " + tmp);
            // System.out.println("ID: "+tmp.getPatient().getId()+" Name: "+tmp.getPatient().getName()+" TriageLevel: "+tmp.getPatient().getTriageLevel());
            tmp.printNode();
            tmp = tmp.getNext();
        }
        System.out.println();
    }

    }
    
    // function to Check whether the patient is in this list or not
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }


    public void popPatientById(int id){
        Node tmpN = this.head;
        int cnt = 0;
        boolean found = false;
        while(tmpN != null)
        {
            if(tmpN.getPatient().getId() == id){
                found = true;
                break;
            }
            cnt++;
            tmpN = tmpN.getNext();
        }
        if(found)
        {
            Node tmp = this.head;
            Node before = this.head;
            while(tmp != null) {
                if(this.head.getPatient().getId() == id){
                    this.head = this.head.getNext();
                    // System.out.println("a "+ this.head);
                    System.out.println("Success! An ambulance is assigned for patient "+id);
                    this.numNodes--;
                    return;
                }
                else if(tmp.getPatient().getId() == id){
                    // System.out.println("b "+ this.head);
                    before.setNext(tmp.getNext());
                    this.numNodes--;
                    System.out.println("Success! An ambulance is assigned for patient "+id);
                    return;
                }
                before = tmp;
                tmp = tmp.getNext();
            }

        }
        else
            System.out.println("Id "+id+ " does not exist");





    }

    public void checkPosition(int id){
        Node tmp = this.head;
        int cnt = 0;
        boolean found = false;
        while(tmp != null) {
            if(tmp.getPatient().getId() == id){
                found = true;
                break;
            }
            cnt++;
            tmp = tmp.getNext();
        }
        if(found)
            System.out.println("There are "+cnt+" patients before patient "+id);
        else
            System.out.println("Id "+id+ " does not exist");
    }





    // public static void main(String[] args) {
    //     WaitingList wl = new WaitingList();
        
    //     wl.addToList(new Patient("A" , "111" , 1 , "SA"));
    //     wl.addToList(new Patient("B" , "111" , 2 , "SA"));
    //     wl.addToList(new Patient("C" , "111" , 3, "SA"));
    //     wl.addToList(new Patient("D" , "111" , 2, "SA"));
    //     System.out.println("After adding : ");
    //     System.out.println("=========================== ");
    //     wl.printList();
    //     wl.checkPosition(2);

    // }

}

