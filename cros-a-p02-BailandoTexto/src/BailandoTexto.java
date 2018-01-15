// Necessary awt because we are going to use later
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

// Necessary awt because we are going to use later
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;



/* Class */
public class BailandoTexto extends JFrame
{
/* Class properties, attributes, vars */
  private JPanel container;

  private JTextField jtfBox1;
  private JTextField jtfBox2;
  private JButton jbButton1;
  private JButton jbButton2;
  private JLabel jlLabel1;
  private JLabel jlLabel2;
/* /Class properties, attributes, vars */



/* main() method - launch the app */
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        try
        {
          BailandoTexto frame = new BailandoTexto();
          frame.setVisible(true);
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
  }
/* /main() method - launch the app */



/* BailandoTexto() method - Container constructor */
  public BailandoTexto()
  {
// Container configuration (window)
    setTitle("Bailando Texto");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Container position & size
    setBounds(100, 100, 600, 300);


// Container JPanel creation & configuration
    container = new JPanel();
    container.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(container);
    container.setLayout(null);


// jtf & jlb configuration
// jtfBox1
    jtfBox1 = new JTextField();
    jtfBox1.setBounds(25, 130, 200, 50);
    container.add(jtfBox1);
    jtfBox1.setColumns(10);

    jlLabel1 = new JLabel("Left Text");
    jlLabel1.setBounds(110, 25, 100, 16);
    container.add(jlLabel1);

// jtfBox2
    jtfBox2 = new JTextField();
    jtfBox2.setBounds(345, 130, 200, 50);
    container.add(jtfBox2);
    jtfBox2.setColumns(10);

    jlLabel2 = new JLabel("Right Text");
    jlLabel2.setBounds(420, 25, 100, 16);
    container.add(jlLabel2);


// Buttons
// jbButton1
// Text from jtfBox1 to jtfBox2
    JButton jbButton1 = new JButton("->");

// jbButton2
// Text from jtfBox2 to jtfBox1
    JButton jbButton2 = new JButton("<-");




// Actions - Listeners + Events
// Listener1 + Event1
// Event: 2 actions - move text from jtfBox1 to jtfBox2, delete content jtfBox1
    jbButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
/* Not working */
/*
        if (jtfBox1 == null)
        {
/* /Not working */
        if (jtfBox1.getText().equals(""))
        {

        }
        else
        {
          jtfBox2.setText(jtfBox1.getText());
          jtfBox1.setText("");
        }
      }
    });

    jbButton1.setBounds(150, 80, 100, 50);
    container.add(jbButton1);

// Listener2 + Event2
// Event: 2 actions - move text from jtfBox2 to jtfBox1, delete content jtfBox2
    jbButton2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
/* Not working */
/*
        if (jtfBox1 == null)
        {
/* /Not working */
        if (jtfBox2.getText().equals(""))
        {

        }
        else
        {
          jtfBox1.setText(jtfBox2.getText());
          jtfBox2.setText("");
        }
      }
    });

    jbButton2.setBounds(330, 80, 100, 50);
    container.add(jbButton2);
  }
/* /BailandoTexto() method - Container constructor */
}
/* /Class */
