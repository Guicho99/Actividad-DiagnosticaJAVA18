package mx.com.cursodia.js18mod1.diagnostico;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LaucherRelojTiempoReal extends JFrame
{
	private JLabel etiquetaHora;
	public static void main(String[] args) 
	{
		
		new LaucherRelojTiempoReal();
	}
	
	public LaucherRelojTiempoReal() 
	{
        // Configuración de la ventana
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creación de la etiqueta para mostrar la hora
        etiquetaHora = new JLabel();
        etiquetaHora.setFont(new Font("Arial", Font.PLAIN, 24));

        // Añadir la etiqueta al contenido de la ventana
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(etiquetaHora, BorderLayout.CENTER);

        // Mostrar la ventana
        setVisible(true);

        // Actualizar la hora cada segundo
        actualizarHora();
    }

    public void actualizarHora() 
    {
       RelojTiempoReal rtr = new RelojTiempoReal(etiquetaHora);
       rtr.start();
		
    }
}
