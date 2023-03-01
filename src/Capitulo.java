import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    String texto;
    ArrayList <Escolha> escolhas;
    Personagens personagem1;
    Personagens personagem2;
    int incrementoVida1;
    int incrementoVida2;
    Scanner scan;

    Capitulo(   String texto,
                Personagens personagem1,
                Personagens personagem2,
                int incrementoVida1,
                int incrementoVida2,
                Scanner scan
            )
{
    this.texto=texto;
    this.personagem1=personagem1;
    this.personagem2=personagem2;
    this.incrementoVida1=incrementoVida1;
    this.incrementoVida2=incrementoVida2;
    this.scan=scan;
    this.escolhas= new ArrayList<Escolha>();
}




    void mostrar()
{
    System.out.println();
    System.out.println("===");
    System.out.println();

    System.out.println(texto);
    personagem1.incrementarVida(incrementoVida1);
    personagem2.incrementarVida(incrementoVida2);
    System.out.println();

    
    
    for (int i = 0; i < escolhas.size(); i++)
    {
        System.out.println(escolhas.get(i).textoDisplay);
    }
    
    if(escolhas.size()>0)
    {
        int idCapituloEsc = escolher();
        escolhas.get(idCapituloEsc-1).proximo.mostrar();
    }
    else
    {
        System.out.println("Sua aventura acabou, reicinie o programa para novas expêriencias");
    }
}    



    int escolher()
    {
        int resultado=0;
        
        String escolha;

        boolean validação = false;

        while(!validação)
        {
            if (escolhas.size()==1)                
            {
                personagem1.resetarVidaProt();                
            } 
                
            escolha = scan.nextLine();
                
            for (int i = 0; i < escolhas.size(); i++)
            {

                if (escolha.equalsIgnoreCase(escolhas.get(i).textoDigitado))
                {                            
                    validação = true;                        
                    resultado=i+1;                    
                }
            }
                   
            if(!validação)
            {
                System.out.println("A escolha digitada não é válida, digite novamente");
                validação = false;                
            }
        }
    
        return resultado;
    }
}
