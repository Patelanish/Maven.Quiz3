package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    String name;
    LabStatus status;
    public Lab() {
        this("Anish");
    }

    public Lab(String labName) {
        this.name = labName;
        this.status= LabStatus.INCOMPLETE;
    }

    public String getName() {
        return this.name;
    }

    public void setStatus(LabStatus labStatus) {
        this.status = status;
    }

    public LabStatus getStatus() {
        return status;
    }
}
