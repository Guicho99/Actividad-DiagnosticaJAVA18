package mx.com.cursodia.js18mod1.diagnostico;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;

public class RelojTiempoReal extends Thread
{
	 JLabel etiquetaHora;


	public RelojTiempoReal(JLabel etiquetaHora) {
		this.etiquetaHora = etiquetaHora;
	}

	public void run()
	{
		while (true) {
        	// Obtener la hora actual
            Calendar calendario = Calendar.getInstance();
            calendario.add(Calendar.HOUR_OF_DAY, -1); // Restar una hora
            SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss a");
            String hora = formato.format(calendario.getTime());

            // Actualizar la etiqueta
            etiquetaHora.setText(hora);

            // Esperar un segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}






	
}
