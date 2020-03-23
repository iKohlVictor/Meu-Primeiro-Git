package imovel;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        ArrayList<Imovel> listaImoveis = new ArrayList();
        Apartamento apartamento;
        Casa casa;
        Comercial comercial;
        int opc1, opc2;
        Scanner entrada = new Scanner (System.in);
        
        opc1 = opc2 = 0;
        
        while(opc1 != 4)
        {
            System.out.print("\n ----MENU----");
            System.out.print("\n 1 - Inserir:");
            System.out.print("\n 2 - Mostrar:");
            System.out.print("\n 3 - Mostrar tudo:");
            System.out.print("\n 4 - Sair \n ->");
            opc1 = entrada.nextInt();
            
            switch(opc1)
            {
                case 1:
                    System.out.print("\n Inserir");
                    System.out.print("\n 1 - Apartamento:");
                    System.out.print("\n 2 - Casa:");
                    System.out.print("\n 3 - Comercial: \n ->");
                    opc2 = entrada.nextInt();
                    switch(opc2)
                    {
                        case 1:
                            apartamento = new Apartamento();
                            System.out.print("\n ID:");
                            apartamento.setId(entrada.next());
                            System.out.print("\n Área:");
                            apartamento.setArea(entrada.nextFloat());
                            System.out.print("\n Sacada:");
                            apartamento.setSacada(entrada.nextBoolean());
                            listaImoveis.add(apartamento);
                        break;
                            
                        case 2:
                            casa = new Casa();
                            System.out.print("\n ID:");
                            casa.setId(entrada.next());
                            System.out.print("\n Área:");
                            casa.setArea(entrada.nextFloat());
                            System.out.print("\n Área Do Quintal:");
                            casa.setAreaDoQuintal(entrada.nextFloat());
                            listaImoveis.add(casa);
                        break;
                            
                        case 3:
                            comercial = new Comercial();
                            System.out.print("\n ID:");
                            comercial.setId(entrada.next());
                            System.out.print("\n Área:");
                            comercial.setArea(entrada.nextFloat());
                            System.out.print("\n Nota Localização:");
                            comercial.setNotaLocalizacao(entrada.nextInt());
                            listaImoveis.add(comercial);
                        break;    
                    }
                break;
                case 2:
                    System.out.print("\n Mostrar");
                    System.out.print("\n 1 - Apartamento:");
                    System.out.print("\n 2 - Casa:");
                    System.out.print("\n 3 - Comercial: \n ->");
                    opc2 = entrada.nextInt();
                    switch(opc2)
                    {
                        case 1:
                            for(int i = 0; i<listaImoveis.size(); i++)
                            {
                                if(listaImoveis.get(i) instanceof Apartamento)
                                {
                                    System.out.print("\nApartamento:" + listaImoveis.get(i).toString());
                                }
                            }
                        break;
                        case 2:
                            for(int i = 0; i<listaImoveis.size(); i++)
                            {
                                if(listaImoveis.get(i) instanceof Casa)
                                {
                                    System.out.print("\nCasa:" + listaImoveis.get(i).toString());
                                }
                            }
                        break;
                        case 3:
                            for(int i = 0; i<listaImoveis.size(); i++)
                            {
                                if(listaImoveis.get(i) instanceof Comercial)
                                {
                                    System.out.print("\nComercial:" + listaImoveis.get(i).toString());
                                }
                            }
                        break;
                    }
                break;
                case 3:
                    System.out.print("\n Mostar Tudo");
                    for(int i = 0; i<listaImoveis.size(); i++)
                    { 
                        System.out.print("\n -> " + listaImoveis.get(i).getClass().getSimpleName()
                                + ":"+listaImoveis.get(i).toString());
                    }
                break;
            }
        }
    }
    
}
