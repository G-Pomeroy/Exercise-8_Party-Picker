public class Person {

    private String firstName;
    private String lastName;
    private int isInvited;

    //Getter & Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int isInvited() {
        return isInvited;
    }

    public void setInvited(int invited) {
        isInvited = invited;
    }

    //Constructor method
        //Default constructor
    public Person(){}

    public Person(String firstName, String lastName, int isInvited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }

    //Method to return full name when called
    public String getFullName(){
        return firstName + " " + lastName;
    }


}
