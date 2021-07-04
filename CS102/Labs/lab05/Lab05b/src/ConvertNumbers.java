import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ConvertNumbers class for Lab05b assignment.
 * @author Berk Çakar
 * @version 29.03.2021
 */
public class ConvertNumbers extends JPanel {

    // Properities
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    /**
     * Default constructor initializes the ConvertNumbers program.
     */
    public ConvertNumbers() {
        setLayout(null);

        textField1 = new JTextField();
        textField1.setHorizontalAlignment( SwingConstants.RIGHT );
        textField2 = new JTextField();
        textField2.setHorizontalAlignment( SwingConstants.RIGHT );
        textField3 = new JTextField();
        textField3.setHorizontalAlignment( SwingConstants.RIGHT );
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //---- textField1 ----
        textField1.addKeyListener( new KeyAdapter() {
            @Override
            public void keyPressed( KeyEvent e ) {
                textFieldKeyPressed( e );
            }
        } );
        add( textField1 );
        textField1.setBounds( 90, 0, 300, 95 );

        //---- textField2 ----
        textField2.addKeyListener( new KeyAdapter() {
            @Override
            public void keyPressed( KeyEvent e ) {
                textFieldKeyPressed( e );
            }
        });
        add( textField2 );
        textField2.setBounds( 90, 100, 300, 95 );

        //---- textField3 ----
        textField3.addKeyListener( new KeyAdapter() {
            @Override
            public void keyPressed( KeyEvent e ) {
                textFieldKeyPressed( e );
            }
        });
        add( textField3 );
        textField3.setBounds( 90, 200, 300, 95 );

        //---- label1 ----
        label1.setText( "Decimal" );
        add( label1 );
        label1.setBounds( new Rectangle( new Point( 10, 40 ), label1.getPreferredSize() ) );

        //---- label2 ----
        label2.setText( "Hex" );
        add( label2 );
        label2.setBounds( 10, 140, 51, 16 );

        //---- label3 ----
        label3.setText( "Binary" );
        add( label3 );
        label3.setBounds( 10, 240, 51, 16 );
    }

    /**
     * This method keeps track of the enter button action in the text boxes.
     * @param e is the key event.
     */
    private void textFieldKeyPressed( KeyEvent e ) {
        if ( e.getSource() == textField1 ) {
            if( e.getKeyCode() == KeyEvent.VK_ENTER ) {
                textField2.setText( convertHex( Integer.parseInt( textField1.getText() ) ) );
                textField3.setText( convertBinary( Integer.parseInt( textField1.getText() ) ) );
            }
        }

        if ( e.getSource() == textField2 ) {
            if( e.getKeyCode() == KeyEvent.VK_ENTER ) {
                textField1.setText( Integer.toString( convertDecimal( textField2.getText() ) ) );
                textField3.setText( convertBinary( convertDecimal( textField2.getText() ) ) );
            }
        }

        if ( e.getSource() == textField3 ) {
            if( e.getKeyCode() == KeyEvent.VK_ENTER ) {
                textField1.setText( Integer.toString( convertBinaryToDecimal( textField3.getText() ) ) );
                textField2.setText( convertHex( convertBinaryToDecimal( textField3.getText() ) ) );
           }
        }
    }
    
    /**
     * This method converts a decimal to hex.
     * @param value is the decimal which is going to be converted to hex.
     * @return Hex value of the decimal.
     */
    public String convertHex( int value ) {
        int remainder;
        String hex = "";
        char[] hexchars = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
        
        while( value > 0 ) {
            remainder = value % 16;
            hex = hexchars[ remainder ] + hex;
            value = value / 16;
        }
        
        return hex;
    }

    /**
     * This method converts a hex to decimal.
     * @param hex is the hex which is going to be converted to decimal.
     * @return Decimal value of the hex.
     */
    public int convertDecimal( String hex ){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        
        return val;
    }

    /**
     * This method converts a decimal to binary.
     * @param base10 is the decimal which is going to be converted to binary.
     * @return Binary value of the decimal.
     */
    public String convertBinary( int base10 ) {
        String result;
        result = "";

        while ( base10 > 0 ) {
            result = ( base10 % 2) + result;
            base10 = base10 / 2;
        }

        return result;
    }

    /**
     * This method converts a binary to decimal.
     * @param base2 is the binary which is going to be converted to decimal.
     * @return Decimal value of the binary.
     */
    public int convertBinaryToDecimal( String base2 )  {
        boolean base2Check;

        int digit;
        int result;

        result = 0;
        digit = 0;
        base2Check = true;

        for ( int i = 1; i <= base2.length(); i = i + 1) {
            // Checking if all numbers in base are 0 or 1. If not returns 0.
            if ( base2.charAt( i - 1) != '0' && base2.charAt( i - 1) != '1' ) {
                base2Check = false;
            }
        }

        if ( base2Check == true ) {
            for ( int i = 1, powerTwo = 1; i <= base2.length(); i = i + 1 ) {
                digit = Integer.parseInt( String.valueOf( base2.charAt( i - 1 ) ) );

                for ( int j = 1; j <= base2.length() - i; j = j + 1) {
                    powerTwo = powerTwo * 2;
                }

                result =  result + ( digit * powerTwo );

                powerTwo = 1;
            }
        }

        return result;
    }
}
