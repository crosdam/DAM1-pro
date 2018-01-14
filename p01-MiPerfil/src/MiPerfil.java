import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



/* Class */
public class MiPerfil extends JFrame
{
/* Class properties, attributes, vars */
	private JPanel container;

	private JTextField tfName;
	private JTextField tfSurname;
	private JTextField tfAge;
	private JTextField tfEmail;

	private JLabel lbName;	
	private JLabel lbSurname;
	private JLabel lbAge;
	private JLabel lbEmail;
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
					MiPerfil frame = new MiPerfil();
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



/* MiPerfil() method - Container constructor */
	public MiPerfil()
	{
// Container configuration (window)
		setTitle("MiPerfil App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Container position & size
		setBounds(100, 100, 400, 400);

		
// Container JPanel creation & configuration
		container = new JPanel();
		container.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(container);
		container.setLayout(null);


// Vars
		String name = "Carlos";
		String surname = "Ros";
		String age = "35";
		String email = "hello@carlosros.com";


// lb & tf configuration
// Name
		lbName = new JLabel("Nombre");
		lbName.setBounds(12, 25, 100, 16);
		container.add(lbName);

		tfName = new JTextField();
		tfName.setBounds(12, 48, 200, 22);
		container.add(tfName);
		tfName.setColumns(10);
		tfName.setText(name);

// Surname
		lbSurname = new JLabel("Apellidos");
		lbSurname.setBounds(12, 80, 100, 16);
		container.add(lbSurname);

		tfSurname = new JTextField();
		tfSurname.setBounds(12, 105, 200, 22);
		container.add(tfSurname);
		tfSurname.setColumns(10);
		tfSurname.setText(surname);

// Age
		lbAge = new JLabel("Edad");
		lbAge.setBounds(12, 140, 100, 16);
		container.add(lbAge);

		tfAge = new JTextField();
		tfAge.setBounds(12, 166, 200, 22);
		container.add(tfAge);
		tfAge.setColumns(10);
		tfAge.setText(age);

// Email
		lbEmail= new JLabel("Email");
		lbEmail.setBounds(12, 201, 100, 16);
		container.add(lbEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(12, 230, 200, 22);
		container.add(tfEmail);
		tfEmail.setColumns(10);
		tfEmail.setText(email);
	}
/* /MiPerfil() method - Container constructor */
}
/* /Class */
