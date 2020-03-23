package imovel;
public class Comercial extends Imovel
{
    //Atributos....
    private int notaLocalizacao;
    //Construtor de Inicialização
    public Comercial(int notaLocalizacao, String id, float area) 
    {
        super(id, area);
        this.notaLocalizacao = notaLocalizacao;
    }
    //Construtor padrão
    public Comercial() 
    {
        super();
        this.notaLocalizacao = 0;
    }
    //GETTER & SETTER
    public int getNotaLocalizacao() 
    {
        return notaLocalizacao;
    }

    public void setNotaLocalizacao(int notaLocalizacao) 
    {
        this.notaLocalizacao = notaLocalizacao;
    }
    //toString....
    @Override
    public String toString() 
    {
        return (super.toString() + "\n notaLocalizacao = " + notaLocalizacao);
    }
    
    
    
}
