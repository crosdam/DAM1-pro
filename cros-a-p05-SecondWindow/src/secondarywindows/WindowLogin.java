package secondarywindows;
// Necessary awt because we are going to use later
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

// Necessary awt because we are going to use later
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

// Necessary custom class Player
import game.Player;



/* Class */
public class WindowLogin extends JFrame
{
/* Class properties, attributes, vars */
  private JPanel container;

  private JLabel jlLabId;
  private JLabel jlLabName;
  private JLabel jlLabSurname;
  private JLabel jlLabAge;
  private JLabel jlLabScore;

  private JTextField jtfName;
  private JTextField jtfSurname;
  private JTextField jtfAge;
  private JTextField jtfId;
  private JTextField jtfScore;

  private JButton jbBtnPlay;

  private JTextArea jtaMessagePlay;



  private WindowLogin reference;
  private WindowGame windowGame;
/*/Class properties, attributes, vars */


/* New object for player */
  Player player1 = new Player();
/* Not working */
/*
  private Player player1;
/* /Not working */
/* /New object for player */


/* WindowLogin() method - Container constructor */
  public WindowLogin(WindowGame wG)
  {
    reference = this;
    windowGame = wG;

// Container configuration (window)
    setTitle("Mathdice");
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


// Labels
// jlLab1
    jlLabId = new JLabel("Id");
    jlLabId.setForeground(new Color(0, 0, 0));
    jlLabId.setFont(new Font("Arial", Font.PLAIN, 18));
    jlLabId.setBounds(20, 20, 200, 20);
    container.add(jlLabId);

// jlLab2
    jlLabName = new JLabel("Name Player");
    jlLabName.setForeground(new Color(0, 0, 0));
    jlLabName.setFont(new Font("Arial", Font.PLAIN, 18));
    jlLabName.setBounds(20, 40, 200, 20);
    container.add(jlLabName);

// jlLab3
    jlLabSurname = new JLabel("Surname");
    jlLabSurname.setForeground(new Color(0, 0, 0));
    jlLabSurname.setFont(new Font("Arial", Font.PLAIN, 18));
    jlLabSurname.setBounds(20, 60, 200, 20);
    container.add(jlLabSurname);

// jlLab4
    jlLabAge = new JLabel("Age");
    jlLabAge.setForeground(new Color(0, 0, 0));
    jlLabAge.setFont(new Font("Arial", Font.PLAIN, 18));
    jlLabAge.setBounds(20, 80, 200, 20);
    container.add(jlLabAge);

// jlLab5
    jlLabScore = new JLabel("Score");
    jlLabScore.setForeground(new Color(0, 0, 0));
    jlLabScore.setFont(new Font("Arial", Font.PLAIN, 18));
    jlLabScore.setBounds(20, 100, 200, 20);
    container.add(jlLabScore);


// Textfields entry data
// jtf1
    jtfId = new JTextField();
    jtfId.setForeground(new Color(255, 255, 255));
    jtfId.setBackground(Color.DARK_GRAY);
    jtfId.setFont(new Font("Arial", Font.PLAIN, 17));
    jtfId.setBounds(200, 20, 200, 20);
    jtfId.setColumns(10);
    container.add(jtfId);
// Listener
// Listener: on jtfId, on enter button 
// Event: 1 action - when pushing enter button cursor moves from jtfId to jtfName
    jtfId.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jtfName.requestFocusInWindow();
      }
    });


// jtf2
    jtfName = new JTextField();
    jtfName.setForeground(new Color(255, 255, 255));
    jtfName.setBackground(Color.DARK_GRAY);
    jtfName.setFont(new Font("Arial", Font.PLAIN, 17));
    jtfName.setBounds(200, 40, 200, 20);
    jtfName.setColumns(10);
    container.add(jtfName);
// Listener
// Listener: on jtfId, on enter button 
// Event: 1 action - when pushing enter button cursor moves from jtfId to jtfName
    jtfName.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jtfSurname.requestFocusInWindow();
      }
    });

// jtf3
    jtfSurname = new JTextField();
    jtfSurname.setForeground(new Color(255, 255, 255));
    jtfSurname.setBackground(Color.DARK_GRAY);
    jtfSurname.setFont(new Font("Arial", Font.PLAIN, 17));
    jtfSurname.setBounds(200, 60, 200, 20);
    jtfSurname.setColumns(10);
    container.add(jtfSurname);
// Listener
// Listener: on jtfId, on enter button 
// Event: 1 action - when pushing enter button cursor moves from jtfId to jtfName
    jtfSurname.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jtfAge.requestFocusInWindow();
      }
    });

// jtf4
    jtfAge = new JTextField();
    jtfAge.setForeground(new Color(255, 255, 255));
    jtfAge.setBackground(Color.DARK_GRAY);
    jtfAge.setFont(new Font("Arial", Font.PLAIN, 17));
    jtfAge.setBounds(200, 80, 200, 20);
    jtfAge.setColumns(10);
    container.add(jtfAge);
// Listener
// Listener: on jtfId, on enter button 
// Event: 2 actions - a) when pushing enter button cursor moves from jtfId to jtfName;
// b) check if datatext is numeric or not. If yes, method parseInt() from Integer class converts a "enter" number (setAge() waits for "entero" number).
    jtfAge.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent arg0)
      {
        if (player1.isNumeric(jtfAge.getText()) == true)
        {
          player1.setAge2(Integer.parseInt(jtfAge.getText()));
        }
        else
        {
          player1.setAge2(999);
        }
      }
    });


// jtf5
    jtfScore = new JTextField();
    jtfScore.setForeground(new Color(255, 255, 255));
    jtfScore.setBackground(Color.DARK_GRAY);
    jtfScore.setFont(new Font("Arial", Font.PLAIN, 17));
    jtfScore.setBounds(200, 100, 200, 20);
    jtfScore.setColumns(10);
    container.add(jtfScore);



// Textarea showing data
// jla1
    jtaMessagePlay = new JTextArea();
    jtaMessagePlay.setForeground(new Color(255, 255, 0));
    jtaMessagePlay.setBackground(new Color(0, 0, 0));
    jtaMessagePlay.setFont(new Font("Arial Black", Font.PLAIN, 14));
    jtaMessagePlay.setBounds(20, 200, 500, 20);
    jtaMessagePlay.setLineWrap(true);
    jtaMessagePlay.setEnabled(false);
    jtaMessagePlay.setText("Are you ready to play MATHDICE?");
//    jtaMessagePlay.append("Are you ready to play MATHDICE?");
    container.add(jtaMessagePlay);



// Buttons
// jbBtn1
// Launch "play"
    JButton jbBtnPlay = new JButton("PLAY");
    jbBtnPlay.setForeground(Color.DARK_GRAY);
    jbBtnPlay.setBackground(new Color(0, 0, 0));
    jbBtnPlay.setFont(new Font("Arial Black", Font.PLAIN, 20));
    jbBtnPlay.setBounds(200, 150, 100, 20);
    jbBtnPlay.setBorder(new LineBorder(new Color(0, 0, 0)));
    container.add(jbBtnPlay);

// Actions - Listeners + Events
// Listener1 + Event1
// Event: 1 action - move text from jtfBox1 to jtfBox2, delete content jtfBox1
    jbBtnPlay.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e) {

        if (player1.isEmpty(jtfName.getText()))
        {
          jtaMessagePlay.setText("Please, complete your name");
        }
        else if (player1.isEmpty(jtfSurname.getText()))
        {
          jtaMessagePlay.setText("Please, complete your surname");
        }
/* Not working */
/*
        else if (player1.isEmpty(jtfAge.getText()) && player1.getAge2() == 999)
/* /Not working */
        else if (player1.isEmpty(jtfAge.getText()) || player1.getAge2() == 999)
        {
          jtaMessagePlay.setText("Please, complete your age with numbers");
        }
        else
        {
// Assign data
//          player1.setId(jtfId.getText());
          player1.setName(jtfName.getText());
          player1.setSurname(jtfSurname.getText());

          player1.setAge(jtfAge.getText());
          int ageint = Integer.valueOf(player1.getAge());
          player1.setAge2(ageint);

//          player1.setScore(jtfScore.getText());


          jtaMessagePlay.setText(
            "Loading game to "
            + player1.getName()
            + " "
            + player1.getSurname()
            + " - "
            + player1.getAge()
            + " years old"
          );

      wG.setPlayer(player1);
      wG.setVisible(true);
      // Se cierra la ventana de login
      //referencia.dispose();
      reference.setVisible(false);
        }
      }
    });
  }
/* /WindowLogin() method - Container constructor */
}
/* /Class */
