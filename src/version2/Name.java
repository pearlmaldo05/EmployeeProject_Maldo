package version2;

public class Name {

    private String firstName;
    private String middleInitial;
    private String lastName;

    public Name() {
        this.firstName = "N/A";
        this.middleInitial = "N/A";
        this.lastName = "N/A";
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = "N/A";
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleInitial = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleName(String middleName) {
        this.middleInitial = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + middleInitial + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
