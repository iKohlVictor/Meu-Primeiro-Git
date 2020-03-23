package imovel;
public class Imovel 
{
    //Atributos.....
    private String id;
    private float area;
    //Construtor Padrão
    public Imovel(String id, float area) 
    {
        this.id = id;
        this.area = area;
    }
    //Construtor de Inicialização
    public Imovel() 
    {
        this.id = "sem id";
        this.area = 0;
    }
    //SETTER & GETTER

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public float getArea() 
    {
        return area;
    }

    public void setArea(float area) 
    {
        this.area = area;
    }
    //toString

    @Override
    public String toString() 
    {
        return "\n id = " + this.id + "\n area = " + this.area;
    }
    
    
    
    
}
