package imovel;
public class Apartamento extends Imovel
{
    //Atributo...
    private boolean sacada;
    //Construtor de inicialização
    public Apartamento(boolean sacada, String id, float area) 
    {
        super(id, area);
        this.sacada = sacada;
    }
    //Construtor Padrão...
    public Apartamento() 
    {
        super();
        this.sacada = false;
    }
    //GETTER & SETTER

    public boolean isSacada() 
    {
        return sacada;
    }

    public void setSacada(boolean sacada) 
    {
        this.sacada = sacada;
    }
    //toString...

    @Override
    public String toString() 
    {
        return (super.toString() + "\n sacada = " + sacada);
    }
    
    
    
    
}
