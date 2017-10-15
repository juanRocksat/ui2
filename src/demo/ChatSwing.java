package demo;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.border.*;
public class ChatSwing extends JFrame implements WindowListener
{
	 private JTextField tfNick;
	 private JTextField tfMensaje;
	 private JButton bLogin;
	 private JButton bLogout;
	 private JButton bEnviar;
	 private JList lstLog;
	 private Border border;
	 public ChatSwing()
	 {
	 super("Chat");
	 // pedimos el "panel de contencion" al JFrame
	 Container content = getContentPane();

	 // seteamos el layout
	 content.setLayout(new BorderLayout());

	 // este sera el tipo de borde que
	 // utilizamos en todos los paneles
	 border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	 // creamos el panel norte
	 JPanel pNorth = crearPNorte();
	 content.add( pNorth, BorderLayout.NORTH);

	 // creamos el panel central
	 JPanel pCenter = crearPCenter();
	 content.add( pCenter, BorderLayout.CENTER);
	 // creamos el panel sur
	 JPanel pSouth = crearPSur();
	 content.add(pSouth, BorderLayout.SOUTH);
	 
	 setSize(400,500);
	 setVisible(true);
	 addWindowListener( new Evento_cerrar_ventana()); // aca puede haber  error 
}
 private JPanel crearPSur()
{
	 JPanel p = new JPanel(new BorderLayout());
	 TitledBorder titleBoder =
	 BorderFactory.createTitledBorder(border,"Mensaje");
	 p.setBorder(titleBoder);
	 tfMensaje = new JTextField();
	 p.add(tfMensaje,BorderLayout.CENTER);
	 bEnviar = new JButton("Enviar");
	 p.add(bEnviar,BorderLayout.EAST);
	 return p;
}
private JPanel crearPCenter()
{
	 JPanel p = new JPanel(new BorderLayout());
	 TitledBorder titleBoder =
	 BorderFactory.createTitledBorder(border,"Conversacion");
	 p.setBorder(titleBoder);
	 lstLog = new JList();
	 JScrollPane scroll = new JScrollPane(lstLog);
	 p.add(scroll,BorderLayout.CENTER);
	 return p;
}
// sigue mas abajo...
 // :
private JPanel crearPNorte()
{
	JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
	 // instancio un TitledBorder con el titulo y ol objeto border
	 // que cree en el constructor
	 TitledBorder titleBoder =
	 BorderFactory.createTitledBorder(border,"Nick");
	 // asigno el titled border al panel
	 p.setBorder(titleBoder);

	 tfNick = new JTextField(10);
	 p.add(tfNick);

	 bLogin=new JButton("Login");
	 p.add(bLogin);

	 bLogout = new JButton("Logout");
	 p.add(bLogout);

	 return p;
}
	public static void main(String[] args)
	{
		ChatSwing chat = new ChatSwing();
	}
	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
