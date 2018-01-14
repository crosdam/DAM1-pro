package secondarywindows;

// Necessary awt because we are going to use it later
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.EventQueue;

// Necessary swing because we are going to use it later
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import game.Player;



/* Class */
public class WindowGame extends JFrame
{
  private JPanel container;
  private JLabel jlLabWellcome;

  private Player player1;


/* WindowGame class constructor */
  public WindowGame()
  {
// Container configuration (window)
    setTitle("MathDice");
    setFont(new Font("Arial Black", Font.PLAIN, 60));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Container position & size
    setBounds(100, 100, 600, 300);

// Container JPanel creation & configuration
    container = new JPanel();
    container.setBackground(new Color(255, 255, 255));
    container.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(container);
    container.setLayout(null);

    jlLabWellcome = new JLabel();
    jlLabWellcome.setForeground(new Color(0, 0, 0));
    jlLabWellcome.setFont(new Font("Arial", Font.PLAIN, 16));
    jlLabWellcome.setBounds(15, 30, 350, 20);
    container.add(jlLabWellcome);
  }
/* /WindowGame class constructor */


  public void setPlayer(Player player1)
  {
    this.player1 = player1;
    jlLabWellcome.setText(
      "Welcome to MathDice game, "
      + player1.getName()
      + " "
      + player1.getSurname()
    );
  }
}
/* /Class */
