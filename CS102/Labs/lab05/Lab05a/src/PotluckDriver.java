import java.awt.Dimension;
import javax.swing.*;

/**
 * PotLuckDriver class for Lab05 assignment.
 * @author Berk Çakar
 * @version 29.03.2021
 */
public class PotluckDriver {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame ( "PotLuck" );
        frame.setPreferredSize( new Dimension( 400, 340 ) );;
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setResizable( false );
        frame.getContentPane().add( new PotLuck() );
        frame.pack();
        frame.setVisible( true );
    }
}
