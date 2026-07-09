
/**
 * Write a description of class HiloCampo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiloCampo extends Thread
{
    private Juego juego;
    private PanelJuego panel;

    public HiloCampo(Juego juego, PanelJuego panel)
    {
        this.juego = juego;
        this.panel = panel;
    }
    @Override
    public void run()
    { 
      while(!juego.isGameOver())
      {
        juego.setCactusX(juego.getCactusX() - juego.getVelocidad());

        if(juego.getCactusX() < -20)
        {
            juego.setCactusX(800);
        }

        panel.repaint();

        try
        {
            Thread.sleep(30);
        }
        catch(InterruptedException e)
        {
            break;
        }
      }
    }
}
