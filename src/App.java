import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in,"CP850");
        
        System.out.println("Nota:\nPara que nossa história funcione, favor digite a palavra destacada\nBom Jogo :]");
        System.out.println();
        

        System.out.println("Antes de começarmos nossa história, diga-me o seu nome, aventureiro!");
        String nomeDoProt=scan.nextLine();

        //------------------------------------------------------------------------------------------

        Personagens protag = new Personagens(nomeDoProt);
        Personagens capra = new Personagens("Capra-Demônio",50);
        Personagens furtle = new Personagens("Furtle", 50);
        Personagens nulo = new Personagens("",0);
        
        //------------------------------------------------------------------------------------------
        

        Capitulo capitulo1 = 
            new Capitulo("Em seu mundo, após ser destruido, " + 
            nomeDoProt + " se encontra no Limbo eterno, \nele não encherga nada no Limbo," + 
            " sua consiença vaga pelos confins daquele local. \nAté que depois de muito tempo sem ter esperança, surge uma luz ao horizonte.\nO que " + nomeDoProt + " fará?", 
            protag, nulo, 0, 0, scan);
        
        Capitulo Final1 = 
            new Capitulo( "Aceitando seu destino de pós morte, "+nomeDoProt+
            " ignora a luz e decide viver no Limbo \nDepois de algum tempo a conciencia de "+nomeDoProt+
            " já não existe mais e ele deixou de pensar, \nagora apenas vaga pela eternidade...",
             protag, nulo, -20, 0, scan);
        
        Capitulo capitulo11 = 
            new Capitulo(nomeDoProt + 
                        " desesperado por viver, tenta alcançar a luz; quando finalmente alcança, ele se vê num mundo completamente diferente do seu anterior,"+
                        " ele finalmente estava vivo novamente; \n"+ nomeDoProt +" vê outros de sua espécie, ele está num planeta de Golens antigos, assim que ele chega naquele"+
                        " local, ele é recebido por 'Grundle, O Guia', \nGrundle o explica que este local é apenas uma estádia temporaria para todos os Golens Hérois, e que "+nomeDoProt+
                        " está em espera \npara o proxímo local que ele irá proteger com sua vida, e que para a espera não ser entediante, \nnaquele local existira algumas recreações, como lutas e livros, por fim Grundle se despede e diz que o "+nomeDoProt+
                        " está livre para andar pela área. \no Que o "+nomeDoProt+" fará agora?", 
                        protag, nulo, 0, 0, scan);
                        
        Capitulo capitulo111 = 
            new Capitulo(nomeDoProt + 
                        " chega ao ringue e chama um lutador que aparentava ser forte, ele chama O Furtle Muralha, os dois em posição, "
                        +nomeDoProt+" saca sua espada e Furtle sua marreta. \nEscolha:",
                        protag, furtle,
                        0,0, scan);
                        
        Capitulo capitulo1111 = 
            new Capitulo("Após a sua tentativa, Furtle é perfurado, mas lhe contra ataca com uma marretada em sua cabeça.\nO Que você faz a seguir?",
                        protag, furtle,
                        -18, -14, scan);
        Capitulo capitulo11111 = 
            new Capitulo("Sua estratégia deu certo e Furtle caí de joelhos, antes que você pudesse dar o golpe final,"+
                        " \nFurtle fala que sua estratéria é muito boa e diz que você venceu o duelo.", 
                        protag, furtle, 0, -35, scan);

        Capitulo capitulo1112 =
            new Capitulo("Após sua tentativa, Furtle o para e diz que não lutará contra um guerreiro tão desonroso como você, e o explusa do ringue.",
                        protag, furtle, 0, 0, scan);
        Capitulo capitulo112 = 
            new Capitulo(nomeDoProt + " lê alguns livros e após isso, volta a esperar.",
             protag, nulo, 0, 0, scan);
        
        Capitulo capitulo113 = 
            new Capitulo("Durante sua Espera, tocava uma musica no ambiente e você gostou do ritmo dela, e foi dançar.",
            protag, nulo, 0, 0, scan);

        Capitulo capitulo2G = 
            new Capitulo("Após um tempo, Grundle o chama e diz que você vai ter a escolha do mundo que você vai, \no primeiro mundo é "+
            "repleto de monstros que se acham donos do local e uma certa quantidade de humanóides está lutando para sobreviver por lá, sua missão seria ajudar a salvar esse mundo dos "+
            "terriveis monstros, \no segundo mundo é um local pós-apocaliptico terreste, chuva de meteóros é muito comum por lá e eles"+
            " precisam de um herói que possa salvar todas as raças que ainda existem por lá, sua missão seria acabar com o apocalipse terreste; \ne então "+ nomeDoProt +
            " , qual sua escolha?",
            protag, nulo, 0, 0, scan);
        Capitulo capitulo2L = 
            new Capitulo("Após um tempo, Grundle o chama e diz que você vai ter a escolha do mundo que você vai, \no primeiro mundo é "+
            "repleto de monstros que se acham donos do local e uma certa quantidade de humanóides está lutando para sobreviver por lá, sua missão seria ajudar a salvar esse mundo dos "+
            "terriveis monstros, \no segundo mundo é um local pós-apocaliptico terreste, chuva de meteóros é muito comum por lá e eles"+
            " precisam de um herói que possa salvar todas as raças que ainda existem por lá, sua missão seria acabar com o apocalipse terreste; \ne então "+ nomeDoProt +
            " , qual sua escolha?",
            protag, nulo, 0, 0, scan);
        Capitulo capitulo2M = 
            new Capitulo("Após um tempo, Grundle o chama e diz que você vai ter a escolha do mundo que você vai, \no primeiro mundo é "+
            "repleto de monstros que se acham donos do local e uma certa quantidade de humanóides está lutando para sobreviver por lá, sua missão seria ajudar a salvar esse mundo dos "+
            "terriveis monstros, \no segundo mundo é um local pós-apocaliptico terreste, chuva de meteóros é muito comum por lá e eles"+
            " precisam de um herói que possa salvar todas as raças que ainda existem por lá, sua missão seria acabar com o apocalipse terreste; \ne então "+ nomeDoProt +
            " , qual sua escolha?",
            protag, nulo, 0, 0, scan);
        Capitulo capitulo2D = 
            new Capitulo("Após um tempo, Grundle o chama e diz que você vai ter a escolha do mundo que você vai, \no primeiro mundo é "+
            "repleto de monstros que se acham donos do local e uma certa quantidade de humanóides está lutando para sobreviver por lá, sua missão seria ajudar a salvar esse mundo dos "+
            "terriveis monstros, \no segundo mundo é um local pós-apocaliptico terreste, chuva de meteóros é muito comum por lá e eles"+
            " precisam de um herói que possa salvar todas as raças que ainda existem por lá, sua missão seria acabar com o apocalipse terreste; \ne então "+ nomeDoProt +
            " , qual sua escolha?",
            protag, nulo, 0, 0, scan);
        Capitulo capitulo21G = 
            new Capitulo("Assim que você chega no primeiro mundo, você é abordado por um Capra-Demônio que logo começa a correr "+
            "em sua direção, e a intenção dele é matar, Escolha:",
            protag, capra, 0, 0, scan);
        Capitulo capitulo21L = 
            new Capitulo("Assim que você chega no primeiro mundo, você é abordado por um Capra-Demônio que logo começa a correr "+
            "em sua direção, e a intenção dele é matar, Escolha:",
            protag, capra, 0, 0, scan);
        Capitulo capitulo21M = 
            new Capitulo("Assim que você chega no primeiro mundo, você é abordado por um Capra-Demônio que logo começa a correr "+
            "em sua direção, e a intenção dele é matar, Escolha:",
            protag, capra, 0, 0, scan);
        Capitulo capitulo21D = 
            new Capitulo("Assim que você chega no primeiro mundo, você é abordado por um Capra-Demônio que logo começa a correr "+
            "em sua direção, e a intenção dele é matar, Escolha:",
            protag, capra, 0, 0, scan);
        
        Capitulo Final2 = 
            new Capitulo("Após adentrar no segundo mundo, você dá o grande azar de um meteoro cair em sua cabeça.",
            protag, nulo, -100, 0, scan);
        
        Capitulo FinalD = 
            new Capitulo("Após começar a dançar, o capra-Demônio se vê confuso, ele simplesmente desiste de lutar contra você e te pergunta, "+
            "porque? \nEntão, você responde: simplesmente aconteceu; \ncom isso vocês dois seguem seus caminhos em busca de respostas para suas perguntas...",
            protag, capra,0,0, scan);
        
        Capitulo FinalF = 
            new Capitulo("O capra-Demônio sem piedade, o persegue e o alcança, fazendo você sofrer como nunca antes, ele o despedaça inteiro.",
            protag, capra, -40, 0, scan);
        
        Capitulo capitulo211G = 
            new Capitulo("Então, você avança, você corre em direção as pernas do Demônio, e tenta dar um corte para o fazer cair de joelhos, mas o ele golpeia o chão, "+
                        "deixando você um pouco atordoado; \nPor estar atordoado,"+
                        " o Capra-Demônio aproveita para te dar um golpe forte, acertando seu braço esquerdo e quase decaptando ele;\nEscolha:",  
                        protag, capra, -15, -12, scan);
        Capitulo capitulo2111G = 
            new Capitulo("Você crava a espada e atinge uma artéria importante do Demônio, fazendo ele sangrar até a morte.", 
            protag, capra, 0, -38, scan);
        
        Capitulo capitulo2112G = 
            new Capitulo("Você o escala e tenta cortar seu pescoço, mas o pescoço dele é bastante duro, o que faz com que você faça apenas um corte superficial,"+
            " \no Capra-Demônio se balança e o joga no chão; \nEscolha:", 
            protag, capra, -4, -5, scan);
        
        Capitulo capitulo21122G = 
            new Capitulo("Você o escala novamente e dessa vez acerta sua nuca, fazendo o morrer quase que instantaneamente.", 
            protag, capra, 0, -33, scan);
        
        
        Capitulo capitulo211L = 
            new Capitulo("O Capra-Demônio logo o perde de vista, e fica enfurecido; você se esgueira até suas costas e golpeia dando um salto para alcançar o pescoço dele,"+
            " o Demônio grita de fúria, e te joga no chão, porêm você logo se levanta, e se esgueira novamente; \nEscolha:", 
            protag, capra, -4, -11, scan);

        Capitulo capitulo2111L = 
            new Capitulo("O Demônio não percebe que você tinha subido na árvore, então você pula na cabeça dele"+
            " cravando sua adaga no cerebro do mesmo, fazendo assim, ele morrer.",
            protag, capra, 0, -39, scan);


        Capitulo capitulo2112L = 
            new Capitulo("Como o ser já estava esperto com essa estrátégia, você apenas faz um risco em seu braço,"+
            " mas ele pula e te pressiona contra o chão, você consegue escapar do ataque dele, mas bem ferido.",  
            protag, capra, -10, -1, scan);

        Capitulo capitulo211M = 
            new Capitulo("Seus conhecimentos, lhe trouxeram poderes arcanos, você acaba por usar um deles, 10 flechas mágicas vão"+
            " na direção do coração do Demônio, e todas conseguem atravéssar seu peito, mas parece que uma delas está descontrolada"+
            " e acaba pegando em sua mão, após isso, você dissipa a mágia e o capra-demônio ainda está de pé; \nEscolha:", 
            protag, capra, -6, -36, scan);

        Capitulo capitulo2111M = 
            new Capitulo("Você usa a magia e sua visão fica escura, e você só escuta o som do corpo do"+
            " Capra-Demônio batendo no chão, sua visão volta e você vê o Demônio morto, você não sabe o que aconteceu, mas ele morreu, provavelmente por sua magia.", 
            protag, capra, 6, -1000, scan);

        Capitulo Final3 = 
            new Capitulo("O capra-Demônio é vencido, e após a sua queda, você vai em busca de respostas para suas perguntas, em busca da razão para estar ali.",
            protag, nulo, 0, 0, scan);

        //------------------------------------------------------------------------------------------
        
        Capitulo raiz = capitulo1;    
        
        capitulo1.escolhas.add(new Escolha("- Desesperadamente tentará alcançar a [luz].","luz", capitulo11));
        capitulo1.escolhas.add(new Escolha("- [Aceitar] seu destino.","aceitar", Final1));
        
        
        capitulo11.escolhas.add(new Escolha("- Irá atras de [lutar] contra outros Golens para provar sua força.","lutar", capitulo111));
        capitulo11.escolhas.add(new Escolha("- Irá até a biblioteca Local para [ler] e aumentar seus conhecimentos.","ler", capitulo112));
        capitulo11.escolhas.add(new Escolha("- Irá [esperar] pacientemente seu proxímo local de vivência.","esperar", capitulo113));
        
        capitulo111.escolhas.add(new Escolha("- " + nomeDoProt + " avança em direção ao seu oponente e tenta [cravar] a espada no peito de seu inimigo.","cravar", capitulo1111));
        capitulo111.escolhas.add(new Escolha("- "+ nomeDoProt +" se [esgueira] pelo ringue e tenta atacar pelas costas.","esgueira", capitulo1112));
        
        capitulo1111.escolhas.add(new Escolha("- Tentar [desarmar] Furtle e dar um golpe em suas pernas.","desarmar", capitulo11111));
        capitulo1111.escolhas.add(new Escolha("- [Fugir] do ringe, pois acha que já foi o suficiente.","Fugir", capitulo1112));
        
        capitulo11111.escolhas.add(new Escolha("","",capitulo2G));       
        
        capitulo1112.escolhas.add(new Escolha("","", capitulo2L));

        capitulo112.escolhas.add(new Escolha("","",capitulo2M));      
        
        capitulo113.escolhas.add(new Escolha("","",capitulo2D));  
        
        capitulo2G.escolhas.add(new Escolha("- [Primeiro] mundo.","primeiro", capitulo21G));
        capitulo2G.escolhas.add(new Escolha("- [Segundo] mundo","segundo", Final2));
        
        capitulo2L.escolhas.add(new Escolha("- [Primeiro] mundo.","primeiro", capitulo21L));
        capitulo2L.escolhas.add(new Escolha("- [Segundo] mundo","segundo", Final2));

        capitulo2M.escolhas.add(new Escolha("- [Primeiro] mundo.","primeiro", capitulo21M));
        capitulo2M.escolhas.add(new Escolha("- [Segundo] mundo","segundo", Final2));

        capitulo2D.escolhas.add(new Escolha("- [Primeiro] mundo.","primeiro", capitulo21D));
        capitulo2D.escolhas.add(new Escolha("- [Segundo] mundo","segundo", Final2));

        capitulo21D.escolhas.add(new Escolha("- Você começa a dançar e [rebolar].","rebolar", FinalD));
        capitulo21D.escolhas.add(new Escolha("- [Fugir].","Fugir", FinalF));
        
        capitulo21M.escolhas.add(new Escolha("- Você levanta um dos livros e decide por combater o Demônio com [magia].","magia", capitulo211M));
        capitulo21M.escolhas.add(new Escolha("- [Fugir].","Fugir", FinalF));

        capitulo211M.escolhas.add(new Escolha("- [Re-usar] a magia.","Re-usar", capitulo2111M));
        capitulo211M.escolhas.add(new Escolha("- Tentar [outra] magia.","outra", capitulo2111M));
        
        capitulo2111M.escolhas.add(new Escolha("","", Final3));

        capitulo21L.escolhas.add(new Escolha("- Você se [esgueira] pelas árvores e decide por combater o Demônio.","esgueira", capitulo211L));
        capitulo21L.escolhas.add(new Escolha("- [Fugir].", "Fugir",FinalF));
        
        capitulo211L.escolhas.add(new Escolha("- Aproveitar para tentar subir em uma árvore e pegar ele de [surpresa].","surpresa", capitulo2111L));
        capitulo211L.escolhas.add(new Escolha("- Tentar o mesmo ataque [novamente].","novamente", capitulo2112L));
        
        capitulo2112L.escolhas.add(new Escolha("- Aproveitar para tentar subir em uma árvore e pegar ele de [surpresa].","surpresa", capitulo2111L));
        capitulo2112L.escolhas.add(new Escolha("- [Fugir]","Fugir", FinalF));

        capitulo2111L.escolhas.add(new Escolha("","", Final3));

        capitulo21G.escolhas.add(new Escolha("- Você [empunha] sua espada e decide por combater o Demônio.","empunha", capitulo211G));
        capitulo21G.escolhas.add(new Escolha("- [Fugir].","Fugir", FinalF));

        capitulo211G.escolhas.add(new Escolha("- [Cravar] a espada nas costas dele.","cravar", capitulo2111G));
        capitulo211G.escolhas.add(new Escolha("- [Escalar] as costas dele para acertar seu pescoço.","escalar", capitulo2112G));
        
        capitulo2112G.escolhas.add(new Escolha("- [Cravar] a espada nas costas dele.","Cravar", capitulo2111G));
        capitulo2112G.escolhas.add(new Escolha("- [Escalar] as costar e cravar a espada na nuca dele.","Escalar", capitulo21122G));
        
        capitulo2111G.escolhas.add(new Escolha("","", Final3));
           
        capitulo21122G.escolhas.add(new Escolha("","", Final3));
        //------------------------------------------------------------------------------------------
        raiz.mostrar();
        
        scan.close();
    }
}