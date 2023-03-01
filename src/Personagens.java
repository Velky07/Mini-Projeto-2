public class Personagens {
    String nome;
    int vida;
    
    Personagens(String nome, int vida)
    {
        this.nome=nome;
        this.vida=vida;
    }
    
    Personagens(String nome)
    {
        this.nome=nome;
        this.vida=20;
    }

    void incrementarVida(int vidaGanha)
    {
        vida+=vidaGanha;
        if(vidaGanha !=0)
        {
            System.out.println(nome + " está com " + vida + " de vida.");
            if (vida<=0)
            {
                System.out.println("O " + nome + " morreu.");
            }
        }
    }

    void resetarVidaProt()
    {
        
        int vidaPadrãoProt= 20;
        vida=vidaPadrãoProt;
        System.out.println("\nO " + nome + " está com a vida cheia.");
    }
    
}