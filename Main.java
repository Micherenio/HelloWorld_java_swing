import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
       
        JFrame frame = new JFrame("Hello World!");
        frame.setMinimumSize(new Dimension(140, 100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         
         JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);

         
         frame.getContentPane().add(lblText);
 
         
         frame.pack();
         frame.setVisible(true);


    }
}