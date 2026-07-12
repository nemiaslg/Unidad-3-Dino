
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    
    public static void iniciarJuego()
    {
       Juego juego = new Juego();

       VentanaJuego ventana = new VentanaJuego(juego);

       HiloCampo campo = new HiloCampo(juego, ventana.getPanel());

       HiloDinosaurio dinosaurio = new HiloDinosaurio(juego, ventana.getPanel());
       HiloContador contador = new HiloContador(juego, ventana.getPanel());
       campo.start();

       dinosaurio.start();
       
       contador.start();
    }
    public static void main(String [] args){
        iniciarJuego();
    }
}
