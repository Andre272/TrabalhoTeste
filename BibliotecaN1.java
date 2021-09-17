import java.util.Scanner;

public class BibliotecaN1 { 
    
public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        //VARIAVEIS
        double valor=0;
        float opcao;
        char pular;
        double estado=0;
        double frete=0;
        double resultado;
        int parcelas;
        String nome, CPF;
        int n = 11; // tamanho do vetor
        int v[] = new int[n]; // declaração e alocação de espaço para o vetor "v"
        int i; // índice ou posição
 
// processando os "n" elementos do vetor "v"
        for (i=0; i<n; i++) {
        v[i] = i; // na i-ésima posição do vetor "v" armazena o valor da variável "i"
        }
        //Bem vindas
        System.out.println(">> Tec Vendas Online <<");
        System.out.println("========================");
        System.out.println("► APROVEITE e compre acima de 400 reais em produtos e ganhe 10% de desconto ◄");
        System.out.println("========================");
        System.out.println("Para efetuar uma ou mais compras, cadastre-se em nosso site");
        
        //CADASTRO
        System.out.println(" >> CADASTRO <<");
        System.out.println("=========================");
        System.out.print("Nome:");
        nome=leia.next();
        System.out.print("CPF:");
        CPF=leia.next();
        System.out.print("Estado:");
        nome=leia.next();
        System.out.print("Telefone:");
        nome=leia.next();
        System.out.println("Cadastro efetuado com sucesso, efetue o login e prossiga á suas compras.");
        System.out.println("========================");
        
        //LOGIN
        System.out.println("LOGIN:");
        System.out.print("Nome:");
        nome=leia.next();
        System.out.print("CPF:");
        CPF=leia.next();
        System.out.println("Login efetuado com sucesso!");
        System.out.println("========================");
        //PRODUTOS
        System.out.println("LISTA DE PRODUTOS");
        System.out.println("========================");
        
        //AVISO
        System.out.println("▶ ATENÇÃO ◀");
        System.out.println("CASO QUEIRA UM DETERMINADO PRODUTO, DIGITE O NÚMERO CORRESPONDENTE AO PRODUTO, CASO NÃO QUEIRA UM OU MAIS PRODUTOS, DIGITE 'NÃO' E CLIQUE ENTER");
        System.out.println("••••••••••••••••••••••");
        
        //PRODUTO A
        System.out.print("A - CABO USB - 10$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'a'){
         valor =valor+10;
    }else System.out.println("Veja os próximos produtos!");
                
        //PRODUTO B        
        System.out.print("B - Teclado Razer - 100$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'b'){
         valor =valor+100;
    }else System.out.println("Veja os próximos produtos!");
                
        //PRODUTO C        
        System.out.print("C - Monitor 4k - 1000$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'c'){
         valor =valor+1000;
    }else System.out.println("Veja os próximos produtos!");
                
        //PRODUTO D        
        System.out.print("D - Mouse Razer - 100$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'd'){
         valor =valor+100;
    }else System.out.println("Veja os próximos produtos!");
                
        //PRODUTO E        
        System.out.print("E - Gabinete - 90$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'e'){
         valor =valor+90;
    }else System.out.println("Veja os próximos produtos!");
                
         //PRODUTO F       
        System.out.print("F - Placa de Vídeo - 300$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'f'){
         valor =valor+300;
    }else System.out.println("Veja os próximos produtos!");
         //PRODUTO G       
      System.out.print("G - Placa-Mãe - 150$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'g'){
         valor =valor+150;
    }else System.out.println("Veja os próximos produtos!");     
        //PRODUTO H        
         System.out.print("H - Processador - 300$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'h'){
         valor =valor+300;
    }else System.out.println("Veja os próximos produtos!");
        //PRODUTO I      
        System.out.print("I - Cooler - 65$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'i'){
         valor =valor+65;
    }else System.out.println("Veja os próximos produtos!");
      //PRODUTO J
      System.out.print("J - Placa de Rede - 160$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'j'){
         valor =valor+160;
    }else System.out.println("Veja os próximos produtos!");
       //´PRODUTO K
       System.out.print("K - SSD 120GB -125$:");
        opcao=leia.next().charAt(0);
                if(opcao == 'k'){
         valor =valor+125;
    }else System.out.println("Veja os próximos produtos!");
     //VALORES/VALOR A PAGAR
      System.out.println("O valor total em $ foi:"+valor);
      System.out.println("----------------------");
      System.out.println("Informe seu Estado para calcular o frete:");
      System.out.println("A - RS - GRATIS$\n B - SC - 50$\n C - PR - 100$\n D - OUTROS - 50$\n");  
      opcao=leia.next().charAt(0);
      
      if(opcao =='a'){
      frete = 15;
            
}
      if(opcao =='b'){
      frete =25;  
}
      if(opcao =='c'){
      frete=50;
      }
      if(opcao =='d'){
      frete=65;
      }
      resultado = frete + valor;
      System.out.println("VALOR TOTAL:" + resultado);
      
      if(valor >=400){
          System.out.println("Você tem 10% de desconto nesta compra.");
          System.out.println("=======================================");
      resultado =(resultado * 0.90);
      System.out.println("Valor á pagar com 10% de desconto é de:"+resultado);
      }
      //FORMA DE PAGAMENTO
      System.out.println("Informe a forma de pagamento:");
      System.out.println("1 - CARTÃO\n 2 - BOLETO/AVISTA");
      opcao=leia.next().charAt(0);

      if(opcao == '2'){
      System.out.println("O valor á ser pago no boleto avista é de:"+resultado);    
      System.out.println("Clique em imprimir e efetue o pagamento do boleto na Agência ou Loterica mais próxima ");    
      
      }else if(opcao == '1'){
      System.out.println("Prossiga com seu pagamento.");
      System.out.println("PARCELAMENTO:");
      System.out.println("Insira o número de parcelas:");
      System.out.println("A - 3x\n B - 5x\n C - 8x\n D - 12x\n");
      System.out.print("Digite aqui:");
      parcelas=leia.nextInt();
      
      if(parcelas ==3){
      resultado=(resultado/3);
      System.out.println("Ficou 3 vezes de:"+resultado);
      }  

      else if(parcelas ==5){
      resultado= (resultado/5);
      System.out.println("Ficou 5 vezes de:"+resultado); 
}
      else if(parcelas ==8){
      resultado= (resultado/8);
      System.out.println("Ficou 8 vezes de:"+resultado); 
}
      else if(parcelas ==12){
      resultado= (resultado/12);
      System.out.println("Ficou 12 vezes de:"+resultado);
      }
     
      }
      
        }
}