
/**
 * Write a description of class PanelJuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.ImageIcon;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class PanelJuego extends JPanel
{
    private Juego juego;
    private Image dino;
    private Image cactus;
    private Image pajaro;
    private Image fondo;
    private Image cactus2;
    public PanelJuego(Juego juego)
    {
        this.juego = juego;
        //setBackground(Color.WHITE);
        //setBackground(new Color(245, 245, 245))
        setBackground(new Color(245,245,245));
        
        dino = new ImageIcon("DinoGameDinosaurioR.png").getImage();

        cactus = new ImageIcon("DinoGameCactusR.png").getImage();

        pajaro = new ImageIcon("DinoGamePajaroR.png").getImage();

        fondo = new ImageIcon("DinoGameFondo.jpg").getImage();
        
        cactus2 = new ImageIcon("DinoGameCactusR.png").getImage();
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
           //hoy 10
           
           
         }
         if(e.getKeyCode() == KeyEvent.VK_SPACE && juego.isGameOver()){
            
            javax.swing.SwingUtilities.getWindowAncestor(PanelJuego.this).dispose();   
               
            Main.main(null);
            
            }
         // aca va lo nuevo 
         /*if(e.getKeyCode() == KeyEvent.VK_R && juego.isGameOver()){
              juego.reiniciar();
              
            }*/
        }
        });  
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        // Dibujar el suelo
       // g.setColor(Color.BLACK);
       // g.drawLine(0, 280, 800, 280);

        // Dibujar el dinosaurio
        /*g.fillRect(
            juego.getDinoX(),
            juego.getDinoY(),
            30,
            30
        );*/
        
        g.drawImage(
        fondo,
        0,
        0,
        getWidth(),
        getHeight(),
        this
        );

        g.drawImage(
        dino,
        juego.getDinoX(),
        juego.getDinoY(),
        60,
        60,
        this
        );

        // Dibujar el cactus
        /*g.fillRect(
            juego.getCactusX(),
            juego.getCactusY(),
            20,
            30
        );*/
        g.drawImage(
        cactus,
        juego.getCactusX(),
        juego.getCactusY(),
        35,
        55,
        this
        );
        
        g.drawImage(
        cactus2,
        juego.getCactus2X(),
        juego.getCactus2Y(),
        35,
        55,
        this
        );
        
        /*g.drawImage(
        pajaro,
        juego.getPajaroX(),
        juego.getPajaroY(),
        55,
        40,
        this
        );*/

        if (juego.isPajaroActivo())
{
    g.drawImage(
        pajaro,
        juego.getPajaroX(),
        juego.getPajaroY(),
        45,
        30,
        this
    );
}
        // Dibujar los puntos
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Puntos: " + juego.getPuntos(), 20, 30);

        // Si perdió...
        if(juego.isGameOver())
        {
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("JA! PERDISTE", 270, 150);
            
        }
    }
}
