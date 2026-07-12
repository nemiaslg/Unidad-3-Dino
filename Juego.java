
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
    private int cactus2X;
    private int cactus2Y;
    
    private int pajaroX;
    private int pajaroY;
    
    // Contador de puntos
    private int puntos;

    // Velocidad del escenario
    private int velocidad;

    // Estado del juego
    private boolean gameOver;

    // Indica si el dinosaurio está saltando
    private boolean saltando;
    private boolean pajaroActivo;

    public Juego()
    {
        dinoX = 60;
        dinoY = 250;

        cactusX = 400;
        cactusY = 250;
        
        cactus2X = 1000;
        cactus2Y= 250;
        
        pajaroX = 200;
        pajaroY = 200;
        
        puntos = 0;

        velocidad = 7;

        gameOver = false;

        saltando = false;
        pajaroActivo = true;
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
    
    public boolean hayColisionCactus2()
{
    int anchoDino = 30;
    int altoDino = 30;

    int anchoCactus = 20;
    int altoCactus = 30;

    return dinoX < cactus2X + anchoCactus &&
           dinoX + anchoDino > cactus2X &&
           dinoY < cactus2Y + altoCactus &&
           dinoY + altoDino > cactus2Y;
}
    
    public void reiniciar(){
       dinoX = 60;
       dinoY = 250;
       cactusX =700;
       cactusY = 250;
       puntos = 0;
       velocidad = 7;
       gameOver = false;
       saltando = false;
       pajaroActivo = true;
      
    }
    
    public boolean hayColisionPajaro()
{
    int anchoDino = 60;
    int altoDino = 60;

    int anchoPajaro = 55;
    int altoPajaro = 40;

    return dinoX < pajaroX + anchoPajaro &&
           dinoX + anchoDino > pajaroX &&
           dinoY < pajaroY + altoPajaro &&
           dinoY + altoDino > pajaroY;
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
    
    public int getCactus2X()
{
    return cactus2X;
}

public void setCactus2X(int cactus2X)
{
    this.cactus2X = cactus2X;
}

public int getCactus2Y()
{
    return cactus2Y;
}

    public int getPajaroX()
{
    return pajaroX;
}

public void setPajaroX(int pajaroX)
{
    this.pajaroX = pajaroX;
}

public int getPajaroY()
{
    return pajaroY;
}

public boolean isPajaroActivo()
{
    return pajaroActivo;
}

public void setPajaroActivo(boolean pajaroActivo)
{
    this.pajaroActivo = pajaroActivo;
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
