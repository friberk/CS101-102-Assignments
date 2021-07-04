import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * ConvertNumbersDriver for Lab05b assignment.
 * @author Berk Çakar
 * @version 29.03.2021
 */
public class ConvertNumbersDriver {
    public static void main(String[] args) {
    JFrame frame = new JFrame ( "Convert Numbers" );
    frame.setPreferredSize( new Dimension( 400, 320 ) );;
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
    frame.getContentPane().add( new ConvertNumbers() );
    frame.setResizable( false );
    frame.pack();
    frame.setVisible( true );
    }
}
