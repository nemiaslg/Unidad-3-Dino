
/**
 * Write a description of class HiloContador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiloContador extends Thread
{
    private Juego juego;
    private PanelJuego panel;

    public HiloContador(Juego juego, PanelJuego panel)
    {
        this.juego = juego;
        this.panel = panel;
    }

    @Override
    public void run()
    {
        while(!juego.isGameOver())
        {
            juego.setPuntos(juego.getPuntos() + 1);

            panel.repaint();

            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                return;
            }
        }
    }
}
