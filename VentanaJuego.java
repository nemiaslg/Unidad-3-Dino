
/**
 * Write a description of class VentanaJuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import java.awt.BorderLayout;
public class VentanaJuego extends JFrame
{
    private PanelJuego panel;
    public VentanaJuego(Juego juego)
    {
        setTitle("Dinosaurio jsjsj");

        setSize(800, 350);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        setLayout(new BorderLayout());
        //add(new PanelJuego(juego));
        panel = new PanelJuego(juego);

        //add(panel);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
        panel.requestFocus(); ///extra
        panel.requestFocusInWindow();
    }
    public PanelJuego getPanel()
    {
        return panel;
    }
}
