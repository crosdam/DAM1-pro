package secondarywindows;

// Necessary awt because we are going to use it later
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// Necessary swing because we are going to use it later
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

// Necessary custom class Player
import game.Player;


import javax.swing.SwingConstants;
import java.util.Random;



/* Class */
public class WindowGame extends JFrame
{
/* Class properties, attributes, vars */
  private static final long serialVersionUID = 1L;
  private JPanel container;

  private JLabel jLabWellcome;
  private JLabel jLabTime;
  private JLabel jLabPointsText;
  private JLabel jLabPoints;

  private JLabel jLabDice2_1;
  private JLabel jLabDice3_1;
  private JLabel jLabDice3_2;
  private JLabel jLabDice3_3;
  private JLabel jLabAdd;
  private JLabel jLabSubtract;
  private JLabel jLabDice4_1;
  private JLabel jLabDice4_2;

  private JTextField jTxfOperations;

  private JButton jBtnMathdice;
  private JButton jBtnRepeat;

  private ImageIcon[] dice3 = new ImageIcon[3];
  private ImageIcon[] dice6 = new ImageIcon[6];
  private ImageIcon[] dice12 = new ImageIcon[12];
  private ImageIcon greyDice;
  private Random dice = new Random();

  private int[] storedNumbersDice3 = new int[3];
  private int[] storedNumbersDice6 = new int[6];
  private int storedNumbersDice12;

/* VER */
  private ImageIcon iIcoAdd;
  private ImageIcon iIcoSubtract;
/* /VER */

/* WindowGame initiation */
  private WindowGame reference = this;
  
/* WindowGame class constructor */
  public WindowGame()
  {
// Container configuration (window)
    setTitle("MathDice");
    setFont(new Font("Arial Black", Font.PLAIN, 60));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Container position & size
    setBounds(100, 100, 900, 900);

// Container JPanel creation & configuration
    container = new JPanel();
    container.setBackground(new Color(255, 255, 255));
    container.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(container);
    container.setLayout(null);

    reference = this;


// Labels
// jLab1-1
    jLabWellcome = new JLabel();
    jLabWellcome.setBounds(0, 0, 400, 30);
    jLabWellcome.setHorizontalAlignment(SwingConstants.LEFT);
    jLabWellcome.setFont(new Font("Arial", Font.PLAIN, 20));
    jLabWellcome.setForeground(Color.WHITE);
    jLabWellcome.setBackground(Color.DARK_GRAY);
    jLabWellcome.setOpaque(true);
    container.add(jLabWellcome);

// jLab1-2
    jLabTime = new JLabel("00:00");
    jLabTime.setBounds(400, 0, 100, 30);
    jLabTime.setHorizontalAlignment(SwingConstants.CENTER);
    jLabTime.setFont(new Font("Arial", Font.PLAIN, 20));
    jLabTime.setForeground(Color.RED);
    jLabTime.setBackground(Color.DARK_GRAY);
    jLabTime.setOpaque(true);
    container.add(jLabTime);
//    jLabTime.setText("00:00");

// jLab1-3
    jLabPointsText = new JLabel("Acumulated points:");
    jLabPointsText.setBounds(500, 0, 350, 30);
    jLabPointsText.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabPointsText.setFont(new Font("Arial", Font.PLAIN, 20));
    jLabPointsText.setForeground(Color.WHITE);
    jLabPointsText.setBackground(Color.DARK_GRAY);
    jLabPointsText.setOpaque(true);
    container.add(jLabPointsText);

// jLab1-4
    jLabPoints = new JLabel("0");
    jLabPoints.setBounds(850, 0, 50, 30);
    jLabPoints.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabPoints.setFont(new Font("Arial", Font.PLAIN, 20));
    jLabPoints.setForeground(Color.WHITE);
    jLabPoints.setBackground(Color.DARK_GRAY);
    jLabPoints.setOpaque(true);
    container.add(jLabPoints);

// jLab2-1
    jLabDice2_1 = new JLabel("");
    jLabDice2_1.setBounds(0, 40, 170, 170);
    jLabDice2_1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabDice2_1.setBackground(Color.DARK_GRAY);
    container.add(jLabDice2_1);


// Textfields entry data
// jTxf2-2
    jTxfOperations = new JTextField();
    jTxfOperations.setBounds(200, 100, 700, 60);
    jTxfOperations.setHorizontalAlignment(SwingConstants.CENTER);
    jTxfOperations.setFont(new Font("Arial", Font.PLAIN, 36));
    jTxfOperations.setForeground(Color.BLUE);
    jTxfOperations.setBackground(Color.DARK_GRAY);
    jTxfOperations.setColumns(10);
    jTxfOperations.setEnabled(false);
    container.add(jTxfOperations);


// Labels
// jLab3-1
    jLabDice3_1 = new JLabel("3_1");
    jLabDice3_1.setBounds(0, 275, 140, 140);
    jLabDice3_1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabDice3_1.setBackground(Color.DARK_GRAY);
    container.add(jLabDice3_1);

// jLab3-2
    jLabDice3_2 = new JLabel("3_2");
    jLabDice3_2.setBounds(160, 275, 140, 140);
    jLabDice3_2.setHorizontalAlignment(SwingConstants.CENTER);
    jLabDice3_2.setBackground(Color.DARK_GRAY);
    container.add(jLabDice3_2);

// jLab3-3
    jLabDice3_3 = new JLabel("3_3");
    jLabDice3_3.setBounds(320, 275, 140, 140);
    jLabDice3_3.setHorizontalAlignment(SwingConstants.CENTER);
    jLabDice3_3.setBackground(Color.DARK_GRAY);
    container.add(jLabDice3_3);

// jLab3-3
    jLabAdd = new JLabel("Add");
    jLabAdd.setBounds(600, 275, 140, 140);
    jLabAdd.setHorizontalAlignment(SwingConstants.CENTER);
    iIcoAdd = new ImageIcon(getClass().getResource("img/suma.png"));
    jLabAdd.setIcon(iIcoAdd);
    container.add(jLabAdd);

// jLab3-4
    jLabSubtract = new JLabel("Subtract");
    jLabSubtract.setBounds(750, 275, 140, 140);
    jLabSubtract.setHorizontalAlignment(SwingConstants.CENTER);
    iIcoSubtract = new ImageIcon(getClass().getResource("img/resta.png"));
    jLabSubtract.setIcon(iIcoSubtract);
    container.add(jLabSubtract);

// jLab4-1
    jLabDice4_1 = new JLabel("4_1");
    jLabDice4_1.setBounds(0, 450, 140, 140);
    jLabDice4_1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabDice4_1.setBackground(Color.DARK_GRAY);
    container.add(jLabDice4_1);

// jLab4-2
    jLabDice4_2 = new JLabel("4_2");
    jLabDice4_2.setBounds(160, 450, 140, 140);
    jLabDice4_2.setHorizontalAlignment(SwingConstants.CENTER);
    jLabDice4_2.setBackground(Color.DARK_GRAY);
    container.add(jLabDice4_2);

// Buttons
// jBtn4-3 - Button "Mathdice"
    jBtnMathdice = new JButton("Mathdice");
    jBtnMathdice.setForeground(Color.GREEN);
    jBtnMathdice.setBackground(Color.DARK_GRAY);
    jBtnMathdice.setFont(new Font("Arial Black", Font.PLAIN, 20));
    jBtnMathdice.setBounds(600, 450, 130, 119);
    jBtnMathdice.setBorder(new LineBorder(new Color(0, 0, 0)));
    container.add(jBtnMathdice);

// jBtn4-4 - Button "Repeat"
    jBtnRepeat = new JButton("Repeat");
    jBtnRepeat.setForeground(Color.ORANGE);
    jBtnRepeat.setBackground(Color.DARK_GRAY);
    jBtnRepeat.setFont(new Font("Arial Black", Font.PLAIN, 20));
    jBtnRepeat.setBounds(750, 450, 130, 119);
    jBtnRepeat.setBorder(new LineBorder(new Color(0, 0, 0)));
    container.add(jBtnRepeat);



/* Random Dice Initiation */
    randomDice();
/* /Random Dice Initiation */
  }
/* /WindowGame class constructor */



  public void setPlayer(Player player1)
  {
/* Not working */
/*
    this.player1 = player1;
/* /Not working */
    jLabWellcome.setText(
      "Welcome to MathDice game, "
      + player1.getName()
      + " "
      + player1.getSurname()
    );
  }



// Metodo para una tirada aleatoria
  private void randomDice()
  {
    for(int i=0; i<dice3.length; i++)
    {
      dice3[i] = new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_3.png"));
    }
    for(int i=0; i<dice6.length; i++)
    {
      dice6[i] = new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_6.png"));
    }
    for(int i=0; i<dice12.length; i++)
    {
      dice12[i] = new ImageIcon(getClass().getResource("img/dadodoce_"+String.valueOf(i+1)+".png"));
    }
    greyDice = new ImageIcon(getClass().getResource("img/dadogris.png"));


// Dices - File 1
    for(int i=0; i<storedNumbersDice3.length; i++)
    {
      storedNumbersDice3[i] = dice.nextInt(3);
    }
      jLabDice3_1.setIcon(dice3[storedNumbersDice3[0]]);
      jLabDice3_1.setName("1");
      jLabDice3_2.setIcon(dice3[storedNumbersDice3[1]]);
      jLabDice3_2.setName("2");
      jLabDice3_3.setIcon(dice3[storedNumbersDice3[2]]);
      jLabDice3_3.setName("3");


// Dices - File 2
    for(int i=0; i<storedNumbersDice6.length; i++)
    {
      storedNumbersDice6[i] = dice.nextInt(6);
    }
      jLabDice4_1.setIcon(dice6[storedNumbersDice6[0]]);
      jLabDice4_1.setName("0");
      jLabDice4_2.setIcon(dice6[storedNumbersDice6[1]]);
      jLabDice4_2.setName("1");
      jLabDice4_1.setIcon(dice6[storedNumbersDice6[2]]);
      jLabDice4_1.setName("2");
      jLabDice4_2.setIcon(dice6[storedNumbersDice6[3]]);
      jLabDice4_2.setName("3");
      jLabDice4_1.setIcon(dice6[storedNumbersDice6[4]]);
      jLabDice4_1.setName("4");
      jLabDice4_2.setIcon(dice6[storedNumbersDice6[5]]);
      jLabDice4_2.setName("5");


// Dice - File 3
      storedNumbersDice12 = dice.nextInt(12);
      jLabDice2_1.setIcon(dice12[storedNumbersDice12]);
  }
}
