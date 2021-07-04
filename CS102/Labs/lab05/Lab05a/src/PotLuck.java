import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * PotLuck game class for Lab05 assignment.
 * @author Berk Çakar
 * @version 29.03.2021
 */
public class PotLuck extends JPanel {
    private static final long serialVersionUID = 6897361702536369497L;

    // Properties
    JButton[] buttonArray;

    private JLabel label1;

    int xCounter;
    int yCounter;
    
    boolean isBomb;
    boolean isBomb2;
    boolean isGameOver;
    
    int bombX;
    int bombY;
    int bombX2;
    int bombY2;

    int attempt;
    int bombCounter;

    int rnd;
    int rnd2;
    int rnd3;

    ArrayList<Integer> pickRandomElement;

    /**
     * Default constructor for PotLuck which initializes the game.
     */
    public PotLuck() {
        buttonArray = new JButton[ 25 ];
        
        for ( int index = 0; index < 25; index = index + 1 ) {
            buttonArray[ index ] = new JButton();
        }

        label1   = new JLabel();
        pickRandomElement = new ArrayList<Integer>( Arrays.asList(  1,  2,  3,  4,  5,  6,  7,  8,  9, 10,
                                                                   11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                                                                   21, 22, 23, 24, 25 ) );
        setLayout(null);

        xCounter = 0;
        yCounter = 0;
        
        // Lay down the buttons.
        for ( int index = 0; index < buttonArray.length; index = index + 1 ) {
            buttonArray[ index ].setText( Integer.toString( index + 1 ) );
            add( buttonArray[ index ] );

            if ( index != 0 ) {
                xCounter = xCounter + 80;
            }

            if ( index % 5 == 0 && index != 0 ) {
                xCounter = 0;
                yCounter = yCounter + 60;
            }

            buttonArray[ index ].setBounds( xCounter, yCounter, 80, 55 );
        }

        label1.setText( attempt + " attempts!" );
        add( label1 );
        label1.setBounds( new Rectangle( new Point( 5, 300 ), new Dimension( 300, 15 ) ) );

        disableButtons( buttonArray );
        selectStar( buttonArray );
        selectBombs( buttonArray );
        attempt = 0;
        bombCounter = 0;
        isGameOver = false;
    }

    /**
     * This method controls the behaviour of regular buttons. Increases
     * the attempt count on click action and disables it afterwards.
     * @param buttonArray is the all buttons of the game.
     */
    public void disableButtons( JButton[] buttonArray ) {
        for ( JButton button : buttonArray ) {
            button.setFocusPainted( false );

            button.addMouseListener( new MouseAdapter() {
                @Override
                public void mouseClicked( MouseEvent e ) {
                    if ( isGameOver == false ) {
                        if( button.isEnabled() == true ) {
                            attempt++;
                        }
                        button.setEnabled( false );
                        label1.setText( attempt + " attempts!" );
                    }
                }
            } );
        }
    }

    /**
     * This method selects a star among the other buttons.
     * @param buttonArray is the JButton array to choose a star from.
     */
    public void selectStar( JButton[] buttonArray ) {
        int tempRnd =  new Random().nextInt( pickRandomElement.size() );
        rnd = pickRandomElement.get( tempRnd );
        pickRandomElement.remove( tempRnd );
        buttonArray[ rnd ].addMouseListener( new MouseAdapter() {
            @Override
            public void mouseClicked( MouseEvent e ) {
                if ( isGameOver == false ) {
                    buttonArray[ rnd ].setEnabled( true );
                    buttonArray[ rnd ].setForeground( Color.orange );
                    buttonArray[ rnd ].setFont( new Font( "Arial", Font.PLAIN, 30 ) );
                    buttonArray[ rnd ].setText( "★" );
                    label1.setText( "You got it in " + attempt + " attempts!" );

                    isGameOver = true;
                }
            }
        } );
    }

    /**
     * This method draws the bombs on the screen.
     */
    @Override
    public void paintComponent( Graphics g ) {
        Graphics2D graphics2d = (Graphics2D) g;
        
        if ( isBomb == true || isGameOver == true) {

            buttonArray[ rnd2 ].setText("");
            buttonArray[ rnd2 ].setOpaque(false);
            buttonArray[ rnd2 ].setContentAreaFilled(false);
            buttonArray[ rnd2 ].setBorderPainted(false);

            // Bomb cap
            graphics2d.setColor(Color.GRAY);
            graphics2d.fillRect( bombX + 37, bombY + 7, 10, 30 );
            
            // Bomb body
            graphics2d.setColor(Color.BLACK);
            graphics2d.fillOval( bombX + 27, bombY + 12, 30, 30 );

            // Bomb fuse
            graphics2d.setColor(Color.RED);
            graphics2d.setStroke(new BasicStroke(2));
            graphics2d.drawArc( bombX + 42, bombY + 0, getWidth() / 16, getHeight() / 18, 180, -100 );
        }

        if ( isBomb2 == true || isGameOver == true ) {

            buttonArray[ rnd3 ].setText("");
            buttonArray[ rnd3 ].setOpaque(false);
            buttonArray[ rnd3 ].setContentAreaFilled(false);
            buttonArray[ rnd3 ].setBorderPainted(false);
            
            // Bomb cap
            graphics2d.setColor(Color.GRAY);
            graphics2d.fillRect( bombX2 + 37, bombY2 + 7, 10, 30);
            
            // Bomb body
            graphics2d.setColor(Color.BLACK);
            graphics2d.fillOval( bombX2 + 27, bombY2 + 12, 30, 30);

            // Bomb fuse
            graphics2d.setColor(Color.RED);
            graphics2d.setStroke(new BasicStroke(2));
            graphics2d.drawArc( bombX2 + 42, bombY2 + 0, getWidth() / 16, getHeight() / 18, 180, -100);
        }
    }

    /**
     * This method selects two bombs among the other buttons.
     * @param buttonArray is the JButton array to choose two bombs from.
     */
    public void selectBombs( JButton[] buttonArray ) {
        int tempRnd2 =  new Random().nextInt( pickRandomElement.size() );
        rnd2 = pickRandomElement.get( tempRnd2 );
        pickRandomElement.remove( tempRnd2 );

        int tempRnd3 = new Random().nextInt( pickRandomElement.size() );
        rnd3 = pickRandomElement.get( tempRnd3 );
        pickRandomElement.remove( tempRnd3 );

        bombX  = buttonArray[ rnd2 ].getX();
        bombY  = buttonArray[ rnd2 ].getY();

        bombX2 = buttonArray[ rnd3 ].getX();
        bombY2 = buttonArray[ rnd3 ].getY();

        buttonArray[ rnd2 ].addMouseListener( new MouseAdapter() {
            @Override
            public void mouseClicked( MouseEvent e ) {
                if ( isGameOver == false ) {
                    isBomb = true;
                    isBomb2 = false;
                    System.out.println( "Bomb no. 1 has found." );
                    bombCounter++;
                }

                if (bombCounter == 1) {
                    isGameOver = true;
                    label1.setText("Game over in " + attempt + " attempts!");

                    buttonArray[ rnd ].setEnabled( true );
                    buttonArray[ rnd ].setForeground( Color.orange );
                    buttonArray[ rnd ].setFont( new Font( "Arial", Font.PLAIN, 30 ) );
                    buttonArray[ rnd ].setText( "★" );
                }
            }
        } );

        buttonArray[ rnd3 ].addMouseListener( new MouseAdapter() {
            @Override
            public void mouseClicked( MouseEvent e ) {
                if ( isGameOver == false ) {
                    isBomb = false;
                    isBomb2 = true;
                    System.out.println( "Bomb no. 2 has found." );
                    bombCounter++;
                }

                if (bombCounter == 1) {
                    isGameOver = true;
                    label1.setText("Game over in " + attempt + " attempts!");

                    buttonArray[ rnd ].setEnabled( true );
                    buttonArray[ rnd ].setForeground( Color.orange );
                    buttonArray[ rnd ].setFont( new Font( "Arial", Font.PLAIN, 30 ) );
                    buttonArray[ rnd ].setText( "★" );
                }
            }
        } );
    }
}
