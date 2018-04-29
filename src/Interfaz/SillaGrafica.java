
package Interfaz;

import Clases.Silla;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class SillaGrafica extends JPanel {
   private ImageIcon imagen;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Crea la representación gráfica de la silla <br>
     * <b>post: </b> la imagen de la silla distingue si está libre u ocupada
     * @param silla - silla a representar - silla != null
     */
    public SillaGrafica( Silla silla )
    {
        super( new BorderLayout( ) );
        JLabel lSilla = new JLabel( );
        if( silla.darClase( ) == Silla.CLASE_EJECUTIVA && silla.sillaAsignada( ) )
            imagen = new ImageIcon( "data/imagenes/silla-ejec-asig.gif" );
        else if( silla.darClase( ) == Silla.CLASE_EJECUTIVA && !silla.sillaAsignada( ) )
            imagen = new ImageIcon( "data/imagenes/silla-ejec-libre.gif" );
        else if( silla.darClase( ) == Silla.CLASE_ECONOMICA && silla.sillaAsignada( ) )
            imagen = new ImageIcon( "data/imagenes/silla-econ-asig.gif" );
        else if( silla.darClase( ) == Silla.CLASE_ECONOMICA && !silla.sillaAsignada( ) )
        {
            imagen = new ImageIcon( "data/imagenes/silla-econ-libre.gif" );
            lSilla.setForeground( Color.white );
        }
        setPreferredSize( new Dimension( imagen.getIconWidth( ), imagen.getIconHeight( ) ) );
        setOpaque( false );
        lSilla.setPreferredSize( new Dimension( imagen.getIconWidth( ), imagen.getIconHeight( ) ) );
        lSilla.setText( "" + silla.darNumero( ) );
        lSilla.setHorizontalAlignment( SwingConstants.CENTER );
        add( lSilla );
    }

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
    /**
     * Dibuja la imagen de la silla
     * @param grafica gráfica de la silla
     */
    public void paint( Graphics grafica )
    {
        grafica.drawImage( imagen.getImage( ), 0, 0, null, null );
        super.paint( grafica );
    }  
}
