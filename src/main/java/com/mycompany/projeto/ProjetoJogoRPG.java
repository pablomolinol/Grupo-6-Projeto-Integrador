
package com.mycompany.projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ProjetoJogoRPG
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
                System.out.println("Opção Inválida. Tente novamente!\n");
                
                menu();
                
                  
        
        }
    
    }
     }
    
  public static void jogar(){
    Scanner jogador = new Scanner(System.in);
    
    System.out.println("*Capítulo 1 - 1524*\n)");
    System.out.println("Durante todas as eras da humanidade, houve o triunfo e o declínio de grandes impérios. O poder, as riquezas e os territórios definiam a prosperidade e a longevidade dos povos na Terra. E a história de nosso povo não era diferente...\n ");
    System.out.println("Nossa história foi marcada por batalhas infindáveis, homens e mulheres destemidos e um desejo ávido de construir uma grande potência para criação de nossas famílias e filhos em segurança... 'Carianus II, O Impetuoso', foi um grandioso líder e provedor de riquezas para o grande império, e seu filho, Carianus III, ainda moço, demonstrou-se um rapaz de forte personalidade: inteligente, voraz e implacável em seus objetivos.\n");
    System.out.println("Ao Carianus III tornar-se herdeiro, seus discursos e as suas decisões eram marcadas pela clareza de pensamento e pela firmeza em sua oratória - características que encantavam o seu povo e orgulhava os seus soldados e seu exército. Devido aos conflitos que ocorreram antes de sua posse, ele possuía apenas uma pequena região de Svalbard, parte que havia herdado de seu pai. Mesmo seu pai sendo o herói para Carianus, um sentimento de revolta e indignação tomou conta dele por possuir tão pouco.\n");
    System.out.println("Carianus: eu, rei Carianus III, filho de 'Carianus II, O Impetuoso', desde a mocidade sempre tive um sonho para o nosso povo: conquistar um grande território para ampliar nossas terras e dar de comer e beber para as nossas mulheres e filhos! Todos nós teríamos uma vida melhor com isso, não acham?!.\n");
    System.out.println("Então meus servos, diante desse cenário e desse anseio, dou-lhes duas escolhas: lutar para garantirmos uma vida melhor ao lado do seu rei, tendo casas maiores, comida em fartura sobre a mesa de suas famílias e a segurança de um bom território ou aceitar a vida medíocre que temos vivido por aqui!\n");
   
    System.out.println("Chegou a hora de fazer a sua primeira decisão. Você é livre para fazer suas escolhas, mas é prisioneiro das consequências... Escolha >1< para invadir outros reinos e territórios com voracidade, ímpeto e sede por terras, ou, escolha >2< para invadir com estratégia, menos assassinatos e com acordos com o território inimigo.\n");
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
        
               
        System.out.println("O que está acontecendo? Quem são vocês que ousam invadir meu castelo em pleno leito de morte do meu marido?\n");
          
        System.out.println("");
            
        System.exit(0);
  }
  
  public static void instruções(){
  
        System.out.println("Olá, seja bem vindo a The Realm of Unknown King!\n");
        
        System.out.println("The Realm of Unknown King é um jogo estilo RPG, onde você escolhe suas ações e elas influenciam diretamente em sua jornada.\n");
        
        System.out.println("O jogo foi desenvolvido por tomada de decisões, onde você deve escolher entre opções como: A, B, C ou D, ou 1, 2, 3 ou 4 para continuar trilhando a história.\n ");
  
        System.out.println("O seu progresso é definido conforme as decisôes que você julgue correta, portanto, tome-as sabiamente! Caso escolha uma alternativa fora das opções informadas, a questão irá resetar e você responderá novamente.\n");

        System.out.println("Fique ciente que... Escolhas ruins podem resultar em um fim de jogo mais rapido, escolhas sábias podem garantir em um jogo mais longo.\n");
        
        menu();
  } 
  
  public static void créditos(){
  
        System.out.println("Diretores:\n João Macieski\n Thiago Perrud\n Pablo Molina\n");
        System.out.println("Roteiristas:\n Thiago C. Perrud\n Pablo Molina\n João Macieski\n ");
        System.out.println("Dirigido e editado por:\n João Macieski\n Thiago Perrud\n Pablo Molina\n");
        System.out.println("Produção:\n João Macieski\n Thiago Perrud\n Pablo Molina\n");
        System.out.println("Agradecimento especial ao professor Eduardo Takeo na orientação do projeto.");
        
        menu();
       } 
        public static void main (String[] args){
        menu();
        // comentando 
  }
  
}

