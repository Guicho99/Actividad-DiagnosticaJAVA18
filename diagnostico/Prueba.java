package mx.com.cursodia.js18mod1.diagnostico;
import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prueba extends JFrame
{

	 JLabel etiquetaHora;

    public Prueba() {
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

    public static void main(String[] args) 
    {
        new Prueba();
    }
	
	
	

	
	
		
	

}
