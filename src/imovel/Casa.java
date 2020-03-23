package imovel;
public class Casa extends Imovel
{
    private float areaDoQuintal;
    
    //Construtor padrão
    public Casa(float areaDoQuintal, String id, float area) 
    {
        super(id, area);
        this.areaDoQuintal = areaDoQuintal;
    }
    //Construtor De inicialização
    public Casa() 
    {
        super();
        this.areaDoQuintal = 0;
    }
    //SETTER & GETTER

    public float getAreaDoQuintal() 
    {
        return areaDoQuintal;
    }

    public void setAreaDoQuintal(float areaDoQuintal) 
    {
        this.areaDoQuintal = areaDoQuintal;
    }
    //toString

    @Override
    public String toString() 
    {
        return  (super.toString() + "\n areaDoQuintal = " + areaDoQuintal);
    }
    
}
