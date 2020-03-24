package imovel;

import java.util.ArrayList;

public class ContabilizaArea
{
    private float areaTotalDeTodosEmpreendimentos;
    
    public ContabilizaArea()
    {
        this.areaTotalDeTodosEmpreendimentos = 0;
    }
    
    public float contabilizaAreaTotal(ArrayList<Imovel> listaImoveis)
    {
        //Poimorfismo.
//        
//        this.areaTotalDeTodosEmpreendimentos = 0;
//        for(int i = 0; i<listaImoveis.size(); i++)
//        {
//            Imovel imovel;
//            imovel = listaImoveis.get(i);
//            this.areaTotalDeTodosEmpreendimentos = 
//                    this.areaTotalDeTodosEmpreendimentos + 
//                    imovel.getArea();
//        }
//        
//        for(Imovel teste : listaImoveis)
//        {
//            this.areaTotalDeTodosEmpreendimentos = 
//                    this.areaTotalDeTodosEmpreendimentos + 
//                    teste.getArea();
//        }
        listaImoveis.forEach((teste)->
        {
            this.areaTotalDeTodosEmpreendimentos = 
                    this.areaTotalDeTodosEmpreendimentos + 
                    teste.getArea();
        });
        return(this.areaTotalDeTodosEmpreendimentos);
    }
}
