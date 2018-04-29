
package Interfaz;

import Clases.Pasajero;
import Clases.Silla;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VentanaDatosPasajero extends JFrame {
    private PanelBotonesDatosPasajero panelBotones;

    /**
     * Panel de los datos del pasajero
     */
    private PanelDatosPasajero panelDatosPasajero;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Crea la ventana con los datos del pasajero
     * @param silla - silla en la que el pasajero está ubicado
     */
    public VentanaDatosPasajero( Silla silla )
    {
        Pasajero pasajero = silla.darPasajero( );
        setLayout( new BorderLayout( ) );

        //Crea el panel de datos del pasajero
        panelDatosPasajero = new PanelDatosPasajero( pasajero, silla );
        add( panelDatosPasajero, BorderLayout.NORTH );

        //Crea el panel de botones
        panelBotones = new PanelBotonesDatosPasajero( this );
        add( panelBotones, BorderLayout.SOUTH );

        setTitle( "Datos registro del pasajero" );
        pack( );
        setResizable( false );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Cierra la ventana
     */
    public void aceptar( )
    {
        dispose( );
    }
}
