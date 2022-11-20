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
                     System.out.println("Opção inválida ");
                     break;
       
       }
    } while (opcao != 1 && opcao!=2);
        
               
        System.out.println(" O que está acontecendo? Quem são vocês que ousam invadir meu castelo em pleno leito de morte do meu marido?\n");
          
      
        System.out.println("Me chamo Julis, e eu tenho um filho com o seu marido, vulgo Carianus III, ele sempre falava pra mim que era muito frustado por não tem um filho com a vossa majestade e eu dei esse orgulho pra ele, e eu vim com meu filho reivindicar o que é dele por direito.\n");
          
        System.out.println("Espantanda ao ver o filho de Julis, roberta pergunta o nome do menino e ele responde... me chamo Tiago Toguro, de onde eu venho sou conhecido como TOGS|Roberta estava muito espantandada com o que havia visto, pois não tinha como negar o que ela estava vendo.\n");
     
          System.out.println("Thiago Toguro, vulgo TOGS era idêntico ao seu marido, certamente era filho dele, então a rainha Roberta pede conselho a corte do rei, que diz que tem que tem que entregar o trono, para TOGS.\n");
      
      System.out.println("Pois de acordo com as leis do trono, caso ela não passe o trono ela será tirada a força pois, o trono é de TOGS, por direito\n");
     
      System.out.println("Começando assim a dinastia do Tiago Toguro vulgo TOGS I\n");
      
      
      System.out.println("Bem, TOGS é jovem e inexperiente, não sabe como regir um império, ainda mais do Tamanho de Ironberg, então escolheu dois conselheiros, Fredericks e Henry\n");
      
      System.out.println("Ensinando respectivamente administração ciêntifica e o outro a clássica\n ");
      
      
      System.out.println("Primeirmente os conselheiros do rei deram as opções para ele: escolher qual tipo de rei ele seria <escolha qual tipo de rei você quer ser\n ");
     
      System.out.println("Escolha <1> para autoritário Escolha <2> para democrata\n");
      int opcao1;
      do{
        opcao1 = jogador.nextInt();
        switch (opcao) {
                 case 1: 
                     System.out.println("Na escolha do rei autoritário, aonde as pessoas do seu reino não terão liberdade, se assemelhando com a ADM clássica\n" );
                  break;

                  case 2:
                     System.out.println(" Na escolha do rei democrata, as pessoas seram dividas por tarefas e serão ouvidas\n");
                      break;

                  default:
                     System.out.println("Opção inválida ");
                     break;
       
       }
    } while (opcao1 != 1 && opcao1!=2  );
      
      Random aleatorio = new Random ();
      
     
      int num,a,t=0;
      
      System.out.println("No primeiro dia de governo, chega um bobo da corte e sugere uma brincadeira com orei se ele acertar quantas cartas de 0 a 52 eu tenho em minhas mãos\n Você em 5 chances, o próprio nunca mais o perturbaria com suas brincadeiras, caso ele erre ele voltará a pertuba-lo com suas bricadeiras");
      
      a=aleatorio.nextInt(52);
      
      do {              
         
          System.out.println(" escreva um numero de 0 a 52  "  );
        
            num=jogador.nextInt();
       
           if(num == a ){System.out.println("você ganhou o jogo! nunca mais o pertubarei ");}
        
        if (num - a == 1 || num + 1 == a  ){System.out.println(" esta quente, tente mais  ");}
        
        else if (num<a  ) {System.out.println(" o numero é maior  ");}
        
        
        else if (num>a  ) {System.out.println(" o numero é menor ");}
       
        t++;
            
      } while((t!=5) && ( num !=a ));
      
      if (num !=a){System.out.println("game over, voltarei a pertubalo com minhas brincadeiras!");}
        
        
      System.out.println("O numero era exatamente " +  a );
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
 
        //Desafio da revolta da burguesa
        System.out.println("\nMeses após o evento do moinho, o conselheiro Fredericks sugeriu ao rei que criasse e desenvolvesse uma estrutura de hierarquia para o funcionamento adequado do império.\n");
        
        System.out.println("\nCom isso, dando oportunidade a plebe e causando também revoltas na burguesia com essa decisão...");
       
        System.out.println("\nCom o poder de persuasão da burguesia, eles recrutaram as pessoas da plebe como soldados, tentando dar um verdadeiro golpe no trono de TOGS I.");
        
        System.out.println("\nCom isso, o rei teve de ordenar o exército a parar a grande rebelião e impedir o golpe, ordenando os seus soldados para irem a luta!");
        
        int soldado = aleatorio.nextInt(1000);
        System.out.println("\nO numero de soldados perdidos foi " +  soldado);
        
        if (soldado < 300)
            System.out.println("\nGrande vitória, sofreu poucas perdas, tendo assim o reino uma grande perspectiva de recuperação");
        
        
        else if (soldado > 300 && soldado < 600)
            System.out.println("\nPerca mediana de soldados, tendo que visualizar o futuro de uma forma mais delicada, porem não tão preucupante");
        
        else System.out.println("\nPerda significativa de soldados, a burguesia quase deu o golpe no trono, causando uma grande instabilidade no império, e perdendo muitos aliados.\n");
        
        
    
        // decisão após revolta  
          
          
        System.out.println("\nQuerendo ou não após grandes guerras, ou grandes rebeliões, o reino fica abalado, fazendo com que TOGS tome grande decisões");
          System.out.println("Então seus conselheiros Fredericks e Henry deu para seu grande rei dos conselhos diferentes");
          System.out.println("\nHenry o aconselhou a ser mais autoritário, prender as pessoas que lhe deram o golpe, e ser mais rigído com seu povo e com aqueles que discordassem de suas atitudes e escolhas");
          System.out.println("\nFredericks o aconselhou paa tentar se planejar melhor na próxima vez, estudar melhor seus movimentos para nao irritar seu povo, e não tomar atitudes para punir aqueles que tentaram aplicar o golpe nele");
          
          System.out.println("Escolha sabiamente alguma das opções, >1< para o conselho do Henry");
          System.out.println("Opção >2< para seguir o conselho de Fredericks");
          
          int golpe_estado; 
  
    do{
    
        golpe_estado = jogador.nextInt();
        switch (golpe_estado) {
            case 1: 
              System.out.println("Escolhendo o conselho de Henry, tentando prender a burguesia, quem o ajudou ele na guerra, você criou inimgios mortais dentro do reino, que juraram vingança");
                     System.out.println("ao desagradar os conselheiros do reino e também todo o povo de seu império, fazendo com que todos os povos do seu reinado entrassem em guerra ");
                     System.out.println("então você junta todos os seus soldados para tentar parar a rebelião, mas são quase todas as pessoas do seu reino contra você ");
                     System.out.println("mesmo com força máxima, não foi suficiente para conter a raiva de todo seu povo");
                     System.out.println("tendo assim percas desastrosas e impossíveis de seram retomadas, tomando assim um golpe de estado e perdendo seu reinado para a burguesia e seus conselheiros");
                     System.out.println("perdendo assim o jogo.");
                     System.exit(0); // Finaliza o jogo pois voce perdeu, escolhendo a opção errada!
                     break;
                     
                     
                     
            case 2:
              System.out.println("Escolhendo o conselho de Fredericks, você manteve a paz e a harmonia dentro do seu reinado ");
              System.out.println("ao tomar esse sábia decisão, você deixou tranquilo a parcela do povo que estava aflita e com medo de suas decisões após tentar sofrer um golpe ");
              System.out.println("Mas deixou o povo atento, pois ele sabem que você nao é bobo, e se tentar sofrer outra tentativa de golpe, irá haver árduas consequências ");
              
              break;

            default:
              System.out.println("Opção inválida, tente novamente \n");
              break;
        }
    } while (golpe_estado != 1 && golpe_estado !=2);
    
    // questão coleta de minérios
    
    System.out.println("O reinado se mantem de forma autosuficiente, sendo assim a busca por minérios é exigida pelo rei constantemente");
    System.out.println("Os minérios são uma importnate fonte de renda ao reinado, sendo um suporte econõmico e financeiro para o mesmo");
    System.out.println("Sendo de extrema importância manter sempre os seus servos mineiradores felizes");
    System.out.println("Pois eles que mantem e fornecem grande riqueza para o crescimento do reinado ");
    
    int minerio  = aleatorio.nextInt(1000);
        System.out.println("\nO número de minérios coletados foi de " +  minerio);
        
        if (minerio < 300)
            System.out.println("\nInfelizmente o número para manter as riquezas e economia não foram o esperados, talvez você tenha que tomar consequencias mais tarde ");
        
        
        else if (minerio > 300 && minerio < 600)
            System.out.println("\nQuantidade dentro do esperado");
        
        
        else 
            System.out.println("\nQuantidade acima do esperado, você da uma festa para celebrar um grande avanço economico");
        
        System.out.println("Após os resultados da mineração, você convoca uma reunião com seus súditos e conselheiros para visar o aumento do império em território ");
        System.out.println("Pois percebe que se aumentar o império, você terá maior influencia sobre seu povo, e outros povos mais distantes vão te respeitar e ter medo do seu império");
        
        
         int expansao; 
         System.out.println("\n Escolha >1< para não expandir o império");
         System.out.println("\n Escolha >2< para expandir o império");
  
    do{
    
        expansao = jogador.nextInt();
        switch (expansao) {
            case 1: 
                System.out.println("Caso não queira expandir o império isso não vai agradar os conselheiros do trono, nem as pessoas de maior infleuncia do reino");
                System.out.println("Causando assim uma guerra enorma contra você mesmo");
                System.out.println("Perdendo o trono para os conselheiros e para a rainha Roberta, retomando assim o trono");
                System.out.println("Você perdeu o jogo");
                System.exit(0); // Finalizando o codigo, o usuario perdeu.
            
            
              
                     break;
                     
                     
                     
            case 2:
                System.out.println("Aumentando o império você invade cidades próximas");
                System.out.println("Conquistando mais riquezas, minérios e terras, criando mais prosperidade para seu povo e infelizmente para o povo vizinho destruição e dor.");
                System.out.println("Tendo sucesso porém perdendo soldados ");
                
              
              break;

            default:
              System.out.println("Opção inválida, tente novamente \n");
              break;
        }
    } while (golpe_estado != 1 && golpe_estado !=2);
    
    int perdas = aleatorio.nextInt(1000);
        System.out.println("\nO numero de soldados perdidos foi " +  perdas);
        
        if (perdas <= 300)
            System.out.println("\nGrande vitória, sofreu poucas perdas, e capturou muitos soldados, fazendo assim o seu exercito um dos maiores de mundo");
        
        
        else if (perdas > 300 && perdas < 600)
            System.out.println("\nPerca mediana de soldados, mas como você capturou soldados adversarios, você aumentou o número de soldados.");
        
        else System.out.println("\nPerda significativa de soldados, porém voce dominou soldados de outros terras sendo assim manteve um número parecido de soldados.");
    
    
        
        
        
        
    
    
          
          
      
      
      
      
      
      
     

      
        
        
            

        System.exit(0); // Finaliza o código

        
        

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