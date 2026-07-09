
/**
 * Write a description of class PanelJuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class PanelJuego extends JPanel
{
    private Juego juego;

    public PanelJuego(Juego juego)
    {
        this.juego = juego;
        //setBackground(Color.WHITE);
        //setBackground(new Color(245, 245, 245))
        setBackground(new Color(245,245,245));
        setFocusable(true);

        addKeyListener(new KeyAdapter()
        {
         @Override
         public void keyPressed(KeyEvent e)
         {
         if(e.getKeyCode() == KeyEvent.VK_SPACE)
          {
           if(!juego.isSaltando())
           { 
           juego.setSaltando(true);
           }
         }
        }
        });  
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        // Dibujar el suelo
        g.setColor(Color.BLACK);
        g.drawLine(0, 280, 800, 280);

        // Dibujar el dinosaurio
        g.fillRect(
            juego.getDinoX(),
            juego.getDinoY(),
            30,
            30
        );

        // Dibujar el cactus
        g.fillRect(
            juego.getCactusX(),
            juego.getCactusY(),
            20,
            30
        );

        // Dibujar los puntos
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Puntos: " + juego.getPuntos(), 20, 30);

        // Si perdió...
        if(juego.isGameOver())
        {
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("GAME OVER", 270, 150);
        }
    }
}
