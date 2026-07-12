
/**
 * Write a description of class HiloCampo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class HiloCampo extends Thread
{
    private Juego juego;
    private PanelJuego panel;
    private Random random = new Random();   
    public HiloCampo(Juego juego, PanelJuego panel)
    {
        this.juego = juego;
        this.panel = panel;
    }
    @Override
public void run()
{
    while (!juego.isGameOver())
    {
        if (juego.isPajaroActivo())
        {
            juego.setPajaroX(
                juego.getPajaroX() - juego.getVelocidad()
            );

            /*if (juego.getPajaroX() < -55)
            {
                juego.setPajaroActivo(false);

                if (random.nextBoolean())
                {
                    juego.setPajaroActivo(true);
                    juego.setPajaroX(650);
                }
                else
                {
                    juego.setCactusX(500);
                }
            }*/
            if (juego.getPajaroX() < -55)
             {
              juego.setPajaroActivo(false);

              juego.setCactusX(800);
              juego.setCactus2X(950);
             }
        }
        else
        {
            juego.setCactusX(
                juego.getCactusX() - juego.getVelocidad()
            );
            juego.setCactus2X(juego.getCactus2X() - juego.getVelocidad());
            
            if (juego.getCactusX() < -35)
            {
                //if (random.nextBoolean())
                if (random.nextInt(4) == 0)
                {
                    juego.setPajaroActivo(true);
                    juego.setPajaroX(550);

                    juego.setCactusX(-50);
                }
                else
                {
                    juego.setCactusX(550);
                }
                
            }
            if (juego.getCactus2X() < -35)
                {
                juego.setCactus2X(750);
              }
        }

        if (juego.hayColision() ||
    juego.hayColisionCactus2() ||
    juego.hayColisionPajaro())
{
    juego.setGameOver(true);
}

        panel.repaint();

        try
        {
            Thread.sleep(25);
        }
        catch (InterruptedException e)
        {
            break;
        }
    }
}
}
