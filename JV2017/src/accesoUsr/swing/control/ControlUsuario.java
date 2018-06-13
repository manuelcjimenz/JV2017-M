/** Proyecto: Juego de la vida.
 *  Resuelve todos los aspectos relacionados con el control 
 *  de inicio de sesión de usuario. Colabora en el patron MVC
 *  @since: prototipo2.1
 *  @source: ControlInicioSesion.java 
 *  @version: 2.2 - 2018.05.25
 *  @author: ajp
 */

package accesoUsr.swing.control;

import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import accesoDatos.Datos;
import accesoDatos.DatosException;
import accesoUsr.swing.vista.VistaUsuarios;
import config.Configuracion;
import modelo.ClaveAcceso;
import modelo.ModeloException;
import modelo.SesionUsuario;
import modelo.SesionUsuario.EstadoSesion;
import modelo.Usuario;
import util.Fecha;

public class ControlUsuario implements ActionListener, MouseListener {
	private int maxIntentosFallidos;
	private VistaUsuarios vistaUsuario;
	private Usuario usuario;
	private SesionUsuario sesion;
	private Datos fachada;

	public ControlUsuario() {
		initControlUsuarios();
	}

	private void initControlUsuarios() {	
		fachada = new Datos();
		vistaUsuario = new VistaUsuarios();
		configListener();
		vistaUsuario.pack();
		vistaUsuario.setVisible(true);
	}

	//Metodos a implementar proximamente...

	private void configListener() {
		// Hay que escuchar todos los componentes que tengan interacción de la vista
		// registrándoles la clase control que los escucha.
		//vistaUsuario.getBotonOk().addActionListener(this);
		//vistaUsuario.getBotonCancelar().addActionListener(this);
		//vistaUsuario.getCampoUsuario().addActionListener(this);
		//vistaUsuario.getCampoClaveAcceso().addActionListener(this);
		//vistaUsuario.getLblAyuda().addMouseListener(this);
	}

	//Manejador de eventos de componentes... ActionListener
	@Override
	public void actionPerformed(ActionEvent evento) {

	}

	//Manejador de evento de raton...pendiente
	@Override
	public void mouseClicked(MouseEvent e) {

	}


	




	// Manejadores de eventos de ratón no usados.
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

} //class
