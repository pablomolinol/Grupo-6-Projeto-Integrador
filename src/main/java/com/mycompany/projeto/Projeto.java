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
    
 //Início da história de The Realm of Unknown King    
     
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
                     System.out.println("Opção inválida. ");
                     break;
       
       }
    } while (opcao != 1 && opcao!=2);
        
    
    //Qual tipo de rei você deseja ser ao governar o império? (1)
    
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
      
      
      //Desafio do bobo da corte (2)
      
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
      
      
        //Situação do Moinho (3)
        
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
 
        
        //Desafio da revolta da burguesia (4)
        
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
        
        
    
        // Decisão após revolta (5) 
          
          
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
    
    
    // Questão coleta de minérios (6)
    
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
              System.out.println("Opção inválida, tente novamente.\n");
              break;
        }
    } while (golpe_estado != 1 && golpe_estado !=2);
    
    int perdas = aleatorio.nextInt(1000);
        System.out.println("\nO número de soldados perdidos foram de " +  perdas);
        
        if (perdas <= 300)
            System.out.println("\nGrande vitória, sofreu poucas perdas, e capturou muitos soldados, fazendo assim o seu exercito um dos maiores de mundo");
        
        
        else if (perdas > 300 && perdas < 600)
            System.out.println("\n1Perca mediana de soldados, mas como você capturou soldados adversarios, você aumentou o número de soldados.\n");
        
        else System.out.println("\nPerda significativa de soldados, porém voce dominou soldados de outros terras sendo assim manteve um número parecido de soldados.\n");
    
        
    //Questão da muralha com ArrayList (7)
        boolean acertou = false;
        
        List alternativas = new ArrayList<>();
        alternativas.add(" Escolher um número pequeno de trabalhadores e forçá-los ao extremo para executar a construção da muralha de um jeito rápido.");
        alternativas.add(" Preparar equipes de pessoas selecionadas que irão realizar tarefas específicas para a construção da muralha, diminuindo o cansaço que pode ser exaustivo."); //Resposta correta
        alternativas.add(" Escolher somente homens jovens para trabalhar arduamente na construção da muralha, poupando as mulheres e os idosos.");
        alternativas.add(" Cancelar a construção da muralha porque terá um gasto excessivo e arriscar na vulnerabilidade futura do reino.");
        
        do{
            Collections.shuffle (alternativas);
            System.out.println("Continuando o desenvolvimento da história... Os trabalhos para a manutenção diária do império exigem esforços de muitos homens e mulheres.\n");
            System.out.println("A estrutura hierárquica ordena as funções de todas as pessoas, sendo assim, existe um modo adequado para realizar tais ações.\n");
            System.out.println("Escolha uma alternativa condizente para a grande construção da muralha que protege o império de invasores inimigos.");           
            System.out.println("Você tem algumas opções: \n");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            String alternativa = jogador.next();
            
            
            switch (alternativa) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals(" Preparar equipes de pessoas selecionadas que irão realizar tarefas específicas para a construção da muralha, diminuindo o cansaço que pode ser exaustivo.")) {
                        System.out.println("Correto! A única maneira de realizar a construção da muralha é através da divisão de equipes selecionadas e capacitadas, evitando a fadiga exaustiva e trazendo eficiência para o projeto.!\n");
                        acertou = true;
                    } else {
                        System.out.println("Errado... Não foi uma decisão sábia. Escolhas erradas diminuem sua reputação com o seu povo e os territórios vizinhos.\n");
                    }
                    break;
                    
                    case "b":
                    case "B":
                    if (alternativas.get(1).equals(" Preparar equipes de pessoas selecionadas que irão realizar tarefas específicas para a construção da muralha, diminuindo o cansaço que pode ser exaustivo.")) {
                        System.out.println("Correto! A única maneira de realizar a construção da muralha é através da divisão de equipes selecionadas e capacitadas, evitando a fadiga exaustiva e trazendo eficiência para o projeto.!\n");
                        acertou = true;
                    } else {
                        System.out.println("Errado... Não foi uma decisão sábia. Escolhas erradas diminuem sua reputação com o seu povo e os territórios vizinhos.\n");
                    }
                    break;
                           
                    case "c":
                    case "C":
                    if (alternativas.get(2).equals(" Preparar equipes de pessoas selecionadas que irão realizar tarefas específicas para a construção da muralha, diminuindo o cansaço que pode ser exaustivo.")) {
                        System.out.println("Correto! A única maneira de realizar a construção da muralha é através da divisão de equipes selecionadas e capacitadas, evitando a fadiga exaustiva e trazendo eficiência para o projeto.!\n");
                        acertou = true;
                    } else {
                        System.out.println("Errado... Não foi uma decisão sábia. Escolhas erradas diminuem sua reputação com o seu povo e os territórios vizinhos.\n");
                    }
                    break;
                    
                    case "d":
                    case "D":
                    if (alternativas.get(3).equals(" Preparar equipes de pessoas selecionadas que irão realizar tarefas específicas para a construção da muralha, diminuindo o cansaço que pode ser exaustivo.")) {
                        System.out.println("Correto! A única maneira de realizar a construção da muralha é através da divisão de equipes selecionadas e capacitadas, evitando a fadiga exaustiva e trazendo eficiência para o projeto.!\n");
                        acertou = true;
                    } else {
                        System.out.println("Errado... Não foi uma decisão sábia. Escolhas erradas diminuem sua reputação com o seu povo e os territórios vizinhos.\n");
                    }
                    break;
                  
                    default:
                    System.out.print("Escolha inválida. Tente novamente.\n");                   
}
        } while (!acertou);
        
        
        //Desafio do pagamento dos trabalhadores (8)
        do{
            System.out.println("Após as construções que foram necessárias para manter a manutenção do reinado, como a muralha, o reparo do moinho e a exploração de minérios\n");
                System.out.println("Os trabalhadores não ficaram satisfeitos com os valores do pagamento que foi dado a eles.\n");
                System.out.println("O pagamento dos trabalhadores eram dados através de moedas, alimentos ou até animais.\n");
                System.out.println("Como rei, você deve tomar essa decisão importante. Escolha uma das decisões: ");
                System.out.println(">1< Reconhecer o serviço recorrente que os trabalhadores fazem para o império, porém, não dar nenhum tipo de pagamento a eles.");
                System.out.println(">2< Ignorar o pedido dos trabalhadores e ameaçar aqueles que exigem os seus direitos.");
                System.out.println(">3< Reconhecer o serviço feito pelos trabalhadores, ser justo e pagá-los, mas esse pequeno valor será retirado da fortuna dos ricos. ");
                System.out.println(">4< Matar aqueles que estão exigindo um pagamento pelos serviços em segredo e contratar novas pessoas para trabalhar cegamente para o rei.");
    
        opcao = jogador.nextInt();
        switch (opcao) {
            case 1: 
                System.out.println("Decisão ruim... O reconhecimento não traz alimento e dinheiro a mesa das famílias! Você ficou manchado aos olhos do povo.\n");
              break;

            case 2:
              System.out.println("Péssima decisão! O povo exige um líder e um governador justo para o seu povo, e não um tirano. Há um aumento de rebeldes e malfeitores contra o reino.\n");
              break;
              
            case 3:
                System.out.println("Excelente decisão... Reconhecer e ser justo com o seu povo afirma que você, mesmo com tropeços durante o caminho, ainda seja um bom líder.\n");
                break;
                
            case 4:
                System.out.println("Assassino!! As autoridades investigativas do reino estarão a frente desse cenário horrendo e criminoso.\n");
                break;
                
            default:
              System.out.println("Opção inválida, tente novamente.\n");
              break;
              
        }
    } while (opcao!=1 && opcao!=2 && opcao!=3 && opcao!=4);
    
        
    System.out.println("Muitos meses após o evento com os trabalhadores do império, o rei vinha tomando atitudes que favoreciam apenas um dos lados de seu povo.\n");
      System.out.println("Essas atitudes como aumentar impostos, jogo político e ameaças de guerras deixaram o povo insatisfeito...\n");
      System.out.println("Atos que estavam levando a um possível fim do reinado de TOGS em Ironberg...\n");
      System.out.println("Uma multidão enfurecida está a porta do seu castelo e eles tem um apelo a fazer!\n");
    System.out.println("Querem que você renuncie, eles estão infelizes com o seu governo, exigem que você seja deposto. \n");
    System.out.println("Digite >1< para acatar ao pedido do povo e renunciar ao trono");
    System.out.println("Digite >2< para ser um pouco tirânico e permanecer no trono");
    
    //A escolha final (9)
    do{

        opcao = jogador.nextInt();
        
        switch (opcao) {
            case 1: 
              System.out.println("***BAD ENDING***\n");
              System.out.println("Apesar do povo não gostar de você, você fazia boas escolhas para IRONBERG e fez com que ele prosperasse. Sem você para comandar tudo, eles ficaram perdidos e instáveis, levando a sua própria ruina.");
                System.out.println("FIM.\n");
              break;

            case 2:
              System.out.println("***GOOD ENDING***\n");
                System.out.println("Você recusou o pedido de renuncia, sendo um tanto tirânico mas confiante da sua liderança. Insatisfeito ainda, o povo retorna para suas casas.");
                  System.out.println("O tempo passa, e graças a sua escolha de ter permanecido no trono, IRONBERG segue mais próspera do que nunca!");
                  System.out.println("FIM.\n");
              break;

            default:
              System.out.println("Opção inválida, tente novamente... \n");
              break;
        }
    } while (opcao != 1 && opcao!=2);

        

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