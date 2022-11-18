
package com.mycompany.projeto;

/**
 *
 * @author phmol
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


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
      System.out.println("Começando assim a dinastia do Tiago Toguro vulgo TOGS I");

      
        
        
            
<<<<<<< HEAD
        System.exit(0); // Finaliza o código
=======
        System.exit(0);
        
>>>>>>> 5892f915c3bfb725252676a5dbd538939116c138
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

        System.out.println("Agradecimento especial a Tiago Toguro");

        System.out.println("Agradecimento especial a Tiago Toguro, da mansão maromba!");

        
        menu();
       } 
        public static void main (String[] args){
        menu();
        // volta pro Menu
        // jogo
  }
  
}
