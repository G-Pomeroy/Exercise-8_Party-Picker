import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean mainLoop = false;


        ArrayList<Friend> guestList = new ArrayList<Friend>();
        Object[] myButton = {"Invited", "Not Invited"};

        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker.\n\n Enter the person's " +
                "name and the type of food they're likely to bring, then indicate whether they are actually invited " +
                "to the party or not.");


        while(mainLoop == false) {

            Friend friend = new Friend();
            friend.setFirstName(JOptionPane.showInputDialog(null, "Enter first name:"));
            friend.setLastName(JOptionPane.showInputDialog(null, "Enter last name:"));
            friend.setFoodToBring(JOptionPane.showInputDialog(null, "Enter food they usually bring:"));
            int choice = (JOptionPane.showOptionDialog(null,
                    "Choose if this guest is Invited or Not Invited:","Party Picker", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,
                    myButton,myButton[1]));

            if(choice == 0){
                friend.setInvited(0);
            } else if (choice == 1){
                friend.setInvited(1);
            }

            guestList.add(friend);

            int choice2 = JOptionPane.showConfirmDialog(null,"Enter another guest?");

            if(choice2 == 1){
                mainLoop=true;
            }
        }

        for(int i = 0; i < guestList.size(); i++){
            System.out.println(i);
            System.out.println(guestList.get(i).toString());
            JOptionPane.showMessageDialog(null, guestList.get(i).toString());
        }







    }
}