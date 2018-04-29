
package Interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelBotonesDatosPasajero extends JPanel implements ActionListener {
    public final static String ACEPTAR = "ACEPTAR";

    private VentanaDatosPasajero ventana;

    private JButton botonAceptar;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Crea el panel de botones de la ventana de datos del pasajero
     * @param laVentana - Ventana de la que hace parte el panel
     */
    public PanelBotonesDatosPasajero( VentanaDatosPasajero laVentana )
    {
        setLayout( new GridLayout( 1, 2, 10, 1 ) );
        ventana = laVentana;

        //Aceptar
        botonAceptar = new JButton( );
        botonAceptar.setText( "Aceptar" );
        botonAceptar.setActionCommand( ACEPTAR );
        botonAceptar.addActionListener( this );
        add( botonAceptar );
    }

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
    /**
     * Acciones de respuesta a los eventos de la interfaz
     * @param evento - evento generado por un elemento de la interfaz
     */
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( comando.equals( ACEPTAR ) )
        {
            ventana.aceptar( );
        }
    }

    
}
