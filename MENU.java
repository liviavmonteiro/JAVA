import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MENU {
    static Scanner read = new Scanner(System.in);
    public static int menu() {
        int opcao;
        
        
       do{
        System.out.println("MENU");
        System.out.println();
        System.out.println("1 - INSTRUÇÕES");
        System.out.println("2 - INTRODUÇÃO");
        System.out.println("3 - JOGAR");
        System.out.println("4 - CRÉDITOS");
        System.out.println("5 - SAIR");

        System.out.println();
        System.out.println("Escolha a opção desejada");
        opcao = read.nextInt();

        if (opcao < 1 || opcao > 5) {
            System.out.println("Opção Inválida");
        }
       } while (opcao < 1 || opcao > 5);

       return opcao;
   
    }
     static void selecionador(int opcao) {
        switch (opcao) {
            case 1:
            instrucoes();
            break;

            case 2:
            introducao();
            break;

            case 3:
            jogar();
            break;

            case 4:
            creditos();
            break;

            case 5:
            System.out.print("SAIR");
            System.exit(0);
            break;
        }
    }
    public static void instrucoes() {
        System.out.println();
        System.out.println("");
        System.out.println();
    }
    public static void introducao() {
        System.out.println();
        System.out.print("");
        System.out.println();
    }
    public static void jogar() {
        pergunta1();
        pergunta2();
        pergunta3();
        pergunta4();
    }
    public static String getPergunta(int indice) {
        String pergunta[] = new String[5];

        pergunta[0] = "1 - Qual dessas pessoas tomaram o soro do super soldado?";
        pergunta[1] = "2 - Como é conhecido Johann Schmidt, um dos principais inimigos do Capitão América?";
        pergunta[2] = "3 - Como Bucky morre?";
        pergunta[3] = "4 - Quem aparece assim que Steve acorda?";

        String retorno = pergunta[indice];
        return retorno;
    }
    public static void pergunta1() {
        String resposta;
        List<String> questoes = new ArrayList<String>();

        questoes.add("Bucky Barnes");
        questoes.add("Peggy Carter");
        questoes.add("Steve Rogers");
        questoes.add("Abraham Erskine");

        System.out.println();
        System.out.println(getPergunta(0));
        System.out.println();

        System.out.println("a) " + questoes.get(0));
        System.out.println("b) " + questoes.get(1));
        System.out.println("c) " + questoes.get(2));
        System.out.println("d) " + questoes.get(3));
        System.out.println();

        resposta = read.next();

        switch (resposta) {
            case "a":
            case "A":
              System.out.println("RESPOSTA INCORRETA");
              break;
            case "b":
            case "B":
              System.out.println("RESPOSTA INCORRETA");
              break;
            case "c":
            case "C":
              System.out.println("RESPOSTA CORRETA!");
              break;
            case "d":
            case "D":
              System.out.println("RESPOSTA INCORRETA");
              break;
        }
    }
    public static void pergunta2() {
        String resposta;
        List<String> questoes = new ArrayList<String>();

        questoes.add("Ossos Cruzados");
        questoes.add("Hydra");
        questoes.add("Víbora");
        questoes.add("Caveira Vermelha");
        
        System.out.println();
        System.out.println(getPergunta(1));
        System.out.println();

        System.out.println("a) " + questoes.get(0));
        System.out.println("b) " + questoes.get(1));
        System.out.println("c) " + questoes.get(2));
        System.out.println("d) " + questoes.get(3));
        System.out.println();

        resposta = read.next();

        switch (resposta) {
            case "a":
            case "A":
                System.out.println("RESPOSTA INCORRETA");
                break;
            case "b":
            case "B":
                System.out.println("RESPOSTA INCORRETA");
                break;
            case "c":
            case "C":
                System.out.println("RESPOSTA INCORRETA");
                break;
            case "d":
            case "D":
                System.out.println("RESPOSTA CORRETA!");
                break;
        }

    }
    public static void pergunta3(){
        String resposta;
        List<String> questoes = new ArrayList<String>();

        questoes.add("Caiu do avião");
        questoes.add("Arremessado de um trem");
        questoes.add("Congelado");
        questoes.add("Baleado");

        System.out.println();
        System.out.println(getPergunta(2));
        System.out.println();

        System.out.println("a) " + questoes.get(0));
        System.out.println("b) " + questoes.get(1));
        System.out.println("c) " + questoes.get(2));
        System.out.println("d) " + questoes.get(3));
        System.out.println();

        resposta = read.next();

        switch (resposta) {
            case "a":
            case "A":
                System.out.println("RESPOSTA INCORRETA");
                break;
            case "b":
            case "B":
                System.out.println("RESPOSTA CORRETA!");
                break;
            case "c":
            case "C":
                System.out.println("RESPOSTA INCORRETA");
                break;
            case "d":
            case "D":
                System.out.println("RESPOSTA INCORRETA");
                break;
        }

    }
    public static void pergunta4(){
        String resposta;
        List<String> questoes = new ArrayList<String>();

        questoes.add("Nick Fury");
        questoes.add("Uma enferimeira");
        questoes.add("Sharon Carter");
        questoes.add("Howard Stark");

        System.out.println();
        System.out.println(getPergunta(3));
        System.out.println();

        System.out.println("a) " + questoes.get(0));
        System.out.println("b) " + questoes.get(1));
        System.out.println("c) " + questoes.get(2));
        System.out.println("d) " + questoes.get(3));
        System.out.println();

        resposta = read.next();

        switch (resposta) {
            case "a":
            case "A":
                System.out.println("RESPOSTA CORRETA!");
                break;
            case "b":
            case "B":
                System.out.println("RESPOSTA INCORRETA");
                break;
            case "c":
            case "C":
                System.out.println("RESPOSTA INCORRETA");
                break;
            case "d":
            case "D":
                System.out.println("RESPOSTA INCORRETA");
                break;

        }
    }
    public static void creditos(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    public static void sair(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.exit(0);
    }
    public static void main(String[] args) {
        int select;

        do{
            select = menu();
            selecionador(select);
        } while (select == 1 || select == 2 || select == 3 || select == 4 || select == 5);
    }
}

