
package com.mycompany.projeto;

/**
 *
 * @author phmol
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Projeto
{
    
     public static void menu(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*****THE REALM OF UNKNOWN KING***** \n");
        System.out.println("***Menu*** \n");
        System.out.println(" 1-Jogar\n 2-Instruções\n 3-Créditos\n 4-Sair\n");
        
        int entrada = scanner.nextInt();
       
        while(true){
        
        switch (entrada){
            case 1:
                    jogar();
                    break;
            case 2:
                    instruções();
                    break;
            case 3:
                    créditos();
                    break;
                    
            case 4: System.out.println("Saindo...");System.exit(0);
        
            default:
                System.out.println("Opção Inválida\n");
                
                menu(); // retorna pro Menu
                
                  
        
        }
    
    }
     }
    
  public static void jogar(){
    Scanner jogador = new Scanner(System.in);
    
    System.out.println("Bem vindo à grandiosa história de TOGS I, onde um completo estranho, que de um mero camponês se transformou em um líder de um dos maiores impérios do mundo!\n ");
    System.out.println("Primeiramente temos que começar a história falando do rei Carianus III, no qual comandava uma região gigantesca do seu mundo chamada de IRONBERG, e essa dinastia de Carianus III, ficou conhecida como a dinastia CARIANI.\n");
    System.out.println("No começo Carianus, tinha apenas uma pequena região de Ironberg, que havia herdado de seu pai, no qual era um homem pacífico, e não tinha perspectiva de grandeza, e isso irritava profundamente Carianus, então ele decidiu tomar providências quando herdou o trono.\n");
    System.out.println("Carianus- eu rei Carianus III, filho de Carianus II sempre tive um sonho, conquistar um território gigantesco para aumentar minhas terras e consequentemente nossas vidas, todos nós teríamos uma vida melhor.\n");
    System.out.println("Então meus servos, lhe dou duas escolhas lutar para uma vida melhor ao lado do seu rei, ou aceitar a vida medíocre que vocês tem.\n");
   
    System.out.println("Faça sua escolha sabiamente! Escolha >1< para invadir outros reinos com matança e extermínio de outras pessoas, ou, escolha >2< para invadir com menos matança e mais diálogo, para tentar conquistar os outros reinos\n");
    int opcao; 
  
    do{
    
        opcao = jogador.nextInt();
        switch (opcao) {
            case 1: 
              System.out.println("Você conquistou todas as terras ao seu redor, mas ficou um pouco mal visto, pois perdeu vários soldados, mas aumentou imensamente seu império começando seu caminho de glória para você e seu povo.\n");
              break;

            case 2:
              System.out.println("Você tentou conquistar seu império com mais paz, mas afinal de contas na guerra, paz nunca é uma opção, você perde ainda mais soldados, pois não estavam tão preparados para guerra, quantos seus oponentes, mas isso não importa afinal de contas, pois seus soldados era muito mais fortes que os do oponente, conseguindo conquistar seu império para o seu caminho de glória!\n");
              break;

            default:
              System.out.println("Opção inválida, tente novamente \n");
              break;
        }
    } while (opcao != 1 && opcao!=2);
    
        
        
        System.out.println("Depois dessa 'Grande Conquista' como ficou conhecido esse acontecimento, Ironberg e Carianus III prosperaram, uma vida quase perfeita, se não fosse por um detalhe, Carianus e sua esposa, a rainha Roberta não conseguiam conceber um herdeiro para o trono, mesmo depois de uma vida inteira de conquistas e riqueza, o rei nunca conseguiu o que mais desejou, um filho. \n");
        
        System.out.println("30 anos se passam desde a Grande Conquista, Carianus está velho, fraco e desesperado, pois sabe que o fim de sua vida está próximo e quando sua inevitável morte acontecer, Ironberg ficará sem rei. \n");
        
        System.out.println("O momento que temia finalmente chega, Carianus morre. Mas algo estranho acontece, em seu leito de morte a rainha Roberta ouve uma confusão, como se alguém tentasse invadir o castelo a força, mesmo de luto e sofrendo ela ainda é rainha e deve ir ver o que se passa. /n ");
        
        System.out.println("Escolha >1< para deixar quem está tentando invadir entrar ou escolha >2< para reforçar a guarda para impedir? \n");
          
    do{
        opcao = jogador.nextInt();
        switch (opcao) {
                 case 1: 
                     System.out.println("Entra uma mulher que aparenta ter a idade de Roberta e um jovem aparentando ter 25 anos, forte, robusto e com um olhar familiar \n" );
                  break;

                  case 2:
                     System.out.println("Você manda reforçar a guarda, mas inútil, derrubando a porta a força entra um jovem aparentando ter 25 anos, forte, robusto e com um olhar familiar e uma mulher que parece ter a idade de Roberta \n");
                      break;

                  default:
                     System.out.println("Opção inválida!");
                     break;
       
       }
    } while (opcao != 1 && opcao!=2);
        
               
        System.out.println(" O que está acontecendo? Quem são vocês que ousam invadir meu castelo em pleno leito de morte do meu marido?\n");
          
        System.out.println("Me chamo Julis, e eu tenho um filho com o seu marido, vulgo Carianus III, ele sempre falava pra mim que era muito frustado por não tem um filho com a vossa majestade e eu dei esse orgulho pra ele, e eu vim com meu filho reivindicar o que é dele por direito.\n");
          System.out.println("Espantanda ao ver o filho de Julis, roberta pergunta o nome do menino e ele responde... me chamo Tiago Toguro, de onde eu venho sou conhecido como TOGS|Roberta estava muito espantandada com o que havia visto, pois não tinha como negar o que ela estava vendo.\n");
      System.out.println("Thiago Toguro, vulgo TOGS era idêntico ao seu marido, certamente era filho dele, então a rainha Roberta pede conselho a corte do rei, que diz que tem que tem que entregar o trono, para TOGS.\n");
      System.out.println("Pois de acordo com as leis do trono, caso ela não passe o trono ela será tirada a força pois, o trono é de TOGS, por direito\n");
      System.out.println("Começando assim a dinastia do Tiago Toguro vulgo TOGS I\n");
      
      //Qual tipo de rei você deseja ser para o seu império?
      System.out.println("Bem, TOGS é jovem e inexperiente, não sabe como regir um império, ainda mais do Tamanho de Ironberg, então escolheu dois conselheiros, Fredericks e Henry\n");
      System.out.println("Ensinando respectivamente administração ciêntifica e o outro a clássica\n ");
      
      System.out.println("Primeirmente os conselheiros do rei deram as opções para ele: escolher qual tipo de rei ele seria <escolha qual tipo de rei você quer ser\n ");
      System.out.println("Escolha <1> para autoritário Escolha <2> para democrata\n");
      int opcao1;
      do{
        opcao1 = jogador.nextInt();
        switch (opcao) {
                 case 1: 
                     System.out.println("Na escolha do rei autoritário, onde as pessoas do seu reino não terão liberdade, se assemelhando com a ADM clássica\n" );
                  break;

                  case 2:
                     System.out.println("Na escolha do rei democrata, as pessoas seram dividas por tarefas e serão ouvidas.\n");
                      break;

                  default:
                     System.out.println("Opção inválida. ");
                     break;
       
       }
    } while (opcao1 != 1 && opcao1!=2  );
      
      
      //Brincadeira do bobo da côrte com Random e If.
      Random aleatorio = new Random ();
      
      int num,a,t=0;
      System.out.println("No primeiro dia de governo, em um momento de descontração, o bobo da côrte sugere uma brincadeira para o Rei. Se ele conseguiria acertar quantas cartas entre 1 a 52 ele tinha em suas mãos...\n"); 
      System.out.println("Você tem 5 chances, todavia, o próprio bobo nunca mais o perturbaria com suas brincadeiras... MAS, caso ele erre ele voltará a pertuba-lo novamente!\n");
      a= aleatorio.nextInt(52) + 1;
      do {              
            System.out.println("Escreva um número entre 01 a 52 e tente sua sorte...");
           num=jogador.nextInt();
        if(num == a ){System.out.println("Droga! Você ganhou o jogo! Nunca mais lhe pertubarei ");}
        if (num - a == 1 || num + 1 == a  ){System.out.println("Está próximo, tente mais...  ");}
        else if (num<a) {System.out.println("O número é maior!");}
        
        else if (num>a) {System.out.println("O número é menor!");}
        t++;
            } while((t!=5) && ( num !=a ));
      if (num !=a){System.out.println("Game over, voltarei a pertubá-lo com minhas brincadeiras!\n");}
        
        System.out.println("O número era exatamente " +  a + "\n");
        
        //Situação do Moinho
        System.out.println("Depois da brincadeira com o rei, assuntos sérios precisavam ser tratados. Os agricultores do reino haviam chegado ao castelo e exclamado ao rei: o moinho quebrou!\n");
        System.out.println("Com o moinho quebrado, as plantações foram prejudicadas e havia uma grande possibilidade de faltar alimentos para o império em poucas semanas.\n");
        System.out.println("Diante desse cenário, o jovem rei tem a possibilidade de tomar uma das 3 decisões abaixo. Escolha entre 1 e 3 para responder.\n");
        System.out.println(">1< Ignorar o pedido dos agricultores, expulsá-los do castelo e caçoar da possibilidade da fome atingir o império.\n");
        System.out.println(">2< Ordenar que o máximo de pessoas aleatórias possíveis ajudem no problema com o moinho, ganhando o reconhecimento do povo pela agilidade.\n");
        System.out.println(">3< Demorar um pouco mais para sanar o problema, mas selecionar calmamente as pessoas aptas e indicadas para resolver o problema existente no moinho, evitando um desastre maior no futuro.\n");
        
        int moinho = jogador.nextInt();
        if (moinho == 3){
            System.out.println("Graças a solução bem pensada do rei, o moinho foi restaurado com sucesso, garantindo a comida na mesa de seus súditos!\n");  
        }else 
            System.out.println("Devido a tomada de decisão precipitada do rei, em pouco tempo o moinho se desestruturou e houve um terrível acidente na colheita. Esse acontecimento fez com que os súditos desconfiassem da habilidade de tomar decisões que o rei possuía.\n");
 
        
        System.out.println("Meses após o evento do moinho, o conselheiro Fredericks sugeriu ao rei que criasse e desenvolvesse uma estrutura de hierarquia para o funcionamento adequado do império.\n");
        System.out.println("Com isso, dando oportunidade a plebe e causando também revoltas na burguesia com essa decisão...");
        System.out.println("Com o poder de persuasão da burguesia, eles recrutaram as pessoas da plebe como soldados, tentando dar um verdadeiro golpe no trono de TOGS I.");
        System.out.println("Com isso, o rei teve de ordenar o exército a parar a grande rebelião e impedir o golpe!");
            
        System.exit(0);

  }
  
  public static void instruções(){
  
        System.out.println("Olá, seja bem vindo a The Realm of Unknown King.\n");
        
        System.out.println("The Realm of Unknown King é um jogo estilo RPG, onde você escolhe suas ações e elas influenciam diretamente em sua jornada.\n");
        
        System.out.println("O jogo é feito por escolhas, onde em sua maioria você escolhe entre opções como A, B, C ou D, ou 1, 2, 3 ou 4.\n ");
  
        System.out.println("Você progride na história conforme vai tomando decisôes que julgar correta, caso escolha fora das opções a questão vai resetar\n");

        System.out.println("Escolhas ruins podem resultar em um Fim de jogo mais rapido, escolhas sábias podem garantir em um jogo mais longo\n");
        
        menu();
  } 
  
  public static void créditos(){
  
        System.out.println("Diretores Executivos:\n João Macieski\n Thiago Perrud\n Pablo Molina\n");
        System.out.println("Roteiristas:\n João Macieski\n Thiago Perrud\n Pablo Molina\n ");
        System.out.println("Dirigido e editado por:\n João Macieski\n Thiago Perrud\n Pablo Molina\n");
        System.out.println("Produção:\n João Macieski\n Thiago Perrud\n Pablo Molina\n");

        System.out.println("Agradecimento especial a Tiago Toguro da mansão maromba!");

        
        menu();
       } 
        public static void main (String[] args){
        menu();
        // volta pro Menu
        // jogo
  }
  
}
