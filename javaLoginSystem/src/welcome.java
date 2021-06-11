import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class welcome {

    /* Creating the welcome page */

    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    Random random = new Random();

     welcome(String userID){
         /* List or array of messages */
         String[] randomMessages = {"Hi There ", "Sup ", "Welcome back ", "Good to see you "};

         /* Getting a random message */
         int rand = random.nextInt(randomMessages.length);

         label.setBounds(0,0,300,40);
         label.setFont(new Font(null,Font.PLAIN,15));

         /* NOTE: if the username (userID) doesn't appear completely

            try to make it short or edit the font size of the label */

         label.setText(randomMessages[rand] + userID);


         frame.add(label);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(420,420);
         frame.setLayout(null);
         frame.setVisible(true);

    }
    
}
