
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    // Posición del dinosaurio
    private int dinoX;
    private int dinoY;

    // Posición del cactus
    private int cactusX;
    private int cactusY;

    // Contador de puntos
    private int puntos;

    // Velocidad del escenario
    private int velocidad;

    // Estado del juego
    private boolean gameOver;

    // Indica si el dinosaurio está saltando
    private boolean saltando;

    public Juego()
    {
        dinoX = 60;
        dinoY = 250;

        cactusX = 700;
        cactusY = 250;

        puntos = 0;

        velocidad = 5;

        gameOver = false;

        saltando = false;
    }
    
    public boolean hayColision()
    {
        int anchoDino = 30;
        int altoDino = 30;

        int anchoCactus = 20;
        int altoCactus = 30;

        return dinoX < cactusX + anchoCactus &&
           dinoX + anchoDino > cactusX &&
           dinoY < cactusY + altoCactus &&
           dinoY + altoDino > cactusY;
    }

    // Getters y setters
    public int getDinoX()
    {
        return dinoX;
    }

    public int getDinoY()
    {
        return dinoY;
    }

    public void setDinoY(int dinoY)
    {
        this.dinoY = dinoY;
    }

    public int getCactusX()
    {
        return cactusX;
    }

    public void setCactusX(int cactusX)
    {
        this.cactusX = cactusX;
    }

    public int getCactusY()
    {
        return cactusY;
    }

    public int getPuntos()
    {
        return puntos;
    }

    public void setPuntos(int puntos)
    {
        this.puntos = puntos;
    }

    public int getVelocidad()
    {
        return velocidad;
    }

    public void setVelocidad(int velocidad)
    {
        this.velocidad = velocidad;
    }

    public boolean isGameOver()
    {
        return gameOver;
    }

    public void setGameOver(boolean gameOver)
    {
        this.gameOver = gameOver;
    }

    public boolean isSaltando()
    {
        return saltando;
    }

    public void setSaltando(boolean saltando)
    {
        this.saltando = saltando;
    }
}
