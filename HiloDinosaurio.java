
/**
 * Write a description of class HiloDinosaurio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiloDinosaurio extends Thread
{
    private Juego juego;
    private PanelJuego panel;

    public HiloDinosaurio(Juego juego, PanelJuego panel)
    {
        this.juego = juego;
        this.panel = panel;
    }

    @Override
    public void run()
    {
        while(!juego.isGameOver())
        {
            if(juego.isSaltando())
            {
                // Subir
                while(juego.getDinoY() > 130)
                {
                    juego.setDinoY(juego.getDinoY() - 5);

                    panel.repaint();

                    try
                    {
                        Thread.sleep(15);
                    }
                    catch(InterruptedException e)
                    {
                        return;
                    }
                }

                // Bajar
                while(juego.getDinoY() < 250)
                {
                    juego.setDinoY(juego.getDinoY() + 5);

                    panel.repaint();

                    try
                    {
                        Thread.sleep(15);
                    }
                    catch(InterruptedException e)
                    {
                        return;
                    }
                }

                juego.setSaltando(false);
            }

            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                return;
            }
        }
    }
}
