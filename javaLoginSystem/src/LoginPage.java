import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID");
    JLabel userPassLabel = new JLabel("userPass");
    JLabel messageLabel = new JLabel();

    /* Accessing the logininfo HashMap */

    HashMap<String,String> logininfo = new HashMap<String,String>();



    LoginPage(HashMap<String,String> loginInfoOriginal){
        /* Setting up the login page { textFields, buttons } */

        logininfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75,25);
        userPassLabel.setBounds(50, 150, 75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null, Font.ITALIC,15));

        userIDField.setBounds(125,100,200,25);
        userPassField.setBounds(125,150,200,25);

        button.setBounds(125, 200, 100, 25);
        button.setFocusable(false);
        button.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        /* Adding the components in the frame */

        frame.add(userIDLabel);
        frame.add(userPassLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPassField);
        frame.add(button);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == resetButton){
            userIDField.setText("");
            userPassField.setText("");

        }
        if (e.getSource() == button){
            String userID = userIDField.getText();
            String userPassword = String.valueOf(userPassField.getPassword());

            /* Checking if the HashMap (logininfo) contains the

               username (userID) and the password (userPassword) */

            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(userPassword)){
                    messageLabel.setForeground(Color.blue);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    welcome welcome = new welcome(userID);
                }
                else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong password ");
                }

            }
            else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Wrong username ");
            }
        }

    }
}
