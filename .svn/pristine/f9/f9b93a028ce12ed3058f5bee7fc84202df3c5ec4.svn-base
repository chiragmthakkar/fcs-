public class Node {
    protected Node next;
    protected Patient patient;

    public Node(Patient patient) {
        this.patient = patient;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void printNode() {
        System.out.println("ID: "+this.getPatient().getId()+"  Name: "+
            this.getPatient().getName()+" TriageLevel: "+this.getPatient().getTriageLevel());
    }
}
