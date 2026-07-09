
/**
 * Write a description of class VentanaJuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
public class VentanaJuego extends JFrame
{
    public VentanaJuego(Juego juego)
    {
        setTitle("Dinosaurio Concurrente");

        setSize(800, 350);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        add(new PanelJuego(juego));

        setVisible(true);
    }

}
