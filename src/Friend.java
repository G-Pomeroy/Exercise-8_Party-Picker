public class Friend extends Person {

    private String foodToBring;


    //Getter & Setter
    public String getFoodToBring() {
        return foodToBring;
    }

    public void setFoodToBring(String foodToBring) {
        this.foodToBring = foodToBring;
    }

    //Constructors
        //Default constructor
    public Friend(){}

    public Friend(String firstName, String lastName, int isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    //toString Method
    public String toString(){

        if((isInvited() == 0)){

            return getFullName() + " is bringing " + getFoodToBring() + "." +
                    " They are invited to the party.\n";
        } else {

            return getFullName() + " is bringing " + getFoodToBring() + "." +
                    " They are not invited to the party\n";
        }



    }
}
