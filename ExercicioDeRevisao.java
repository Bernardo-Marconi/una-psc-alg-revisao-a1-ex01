import java.util.Scanner;

public class ExercicioDeRevisao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Revisão - Exercício 01");

        String[] pergunta = new String[4];

        byte[] porcentagem = {0,0,0,0};

        byte[] tentativas = {0,0,0,0};

        System.out.println("Informe o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = scan.nextInt();

        scan.nextLine();
        
        System.out.println("Responda as perguntas com 'SIM' ou 'NAO': ");

    do {

        System.out.println("Seu cartão de vacina está em dia?");
        pergunta[0]=scan.nextLine();

        tentativas[0]++;

    } while (tentativas[0] <= 2 && !pergunta[0].equalsIgnoreCase("sim") && !pergunta[0].equalsIgnoreCase("nao"));

    if(pergunta[0].equalsIgnoreCase("sim") || pergunta[0].equalsIgnoreCase("nao")){
         
        System.out.println("Resposta registrada! ");

    } else {

    if (tentativas[0] == 3) {

        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");

        System.exit(0);

    }
}

    do { 

        System.out.println("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
        pergunta[1] = scan.nextLine();

        tentativas[1]++;

    } while (tentativas[1] <= 2 && !pergunta[1].equalsIgnoreCase("sim") && !pergunta[1].equalsIgnoreCase("nao"));

    if(pergunta[1].equalsIgnoreCase("sim") || pergunta[1].equalsIgnoreCase("nao")){
         
        System.out.println("resposta registrada! ");

    } else {

    if (tentativas[1] == 3) {

        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
    
        System.exit(0);

    }
}

    do {

        System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias?");
        pergunta[2] = scan.nextLine();

        tentativas[2]++;

    } while (tentativas[2] <= 2 && ! pergunta[2].equalsIgnoreCase("sim") && ! pergunta[2].equalsIgnoreCase("nao"));
      
    if(pergunta[2].equalsIgnoreCase("sim") || pergunta[2].equalsIgnoreCase("nao")){
         
        System.out.println("resposta registrada! ");

    } else {

    if (tentativas[2] == 3) {

        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
    
        System.exit(0);

    }
}
    
    do {

        System.out.println("Está retornando de viagem realizada no exterior?");
        pergunta[3] = scan.nextLine();

        tentativas[3]++;

    } while (tentativas[3] <= 2 && !pergunta[3].equalsIgnoreCase("sim") && !pergunta[3].equalsIgnoreCase("nao"));

    if(pergunta[3].equalsIgnoreCase("sim") || pergunta[3].equalsIgnoreCase("nao")){
         
        System.out.println("resposta registrada! ");

    } else {

    if (tentativas[3] == 3) {

        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
    
        System.exit(0);

    }
}
    
    if (pergunta[0].equalsIgnoreCase( "nao")){

        porcentagem[0]=10;

    } if (pergunta[1].equalsIgnoreCase( "sim")){

        porcentagem[1]=30;

    } if (pergunta[2].equalsIgnoreCase( "sim")){

        porcentagem[2]=30;

    } if (pergunta[3].equalsIgnoreCase( "sim")){

        porcentagem[3]=30;

    }

        int resultado=(porcentagem[0]+porcentagem[1]+porcentagem[2]+porcentagem[3]);

        System.out.println("\nRelatório final: ");
    
        System.out.println("Nome: "+nome);

        System.out.println("Idade: "+idade);

        System.out.println("O cartão de vacina está em dia? "+pergunta[0]);

        System.out.println("Teve sintomas recentemente? "+pergunta[1]);

        System.out.println("Teve contato com pessoas infectadas? "+pergunta[2]);

        System.out.println("Está retornando de viagem?"+pergunta[3]);

        System.out.printf("Probabilidade de infecção: %d%%\n",resultado);

        System.out.println("Orientação final do atendimento: ");

    if (pergunta[3].equals( "sim")){

        System.out.printf("Você ficará sob observação por 05 dias, por está retornando de viagem.");

    } else { 

    if (resultado<=30){

        System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        
    } else if (resultado <= 60 && resultado > 30) {

        System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");

    } else if (resultado > 60 && resultado < 90) {

        System.out.println("Paciente com alto reico de estar infectado! Gentileza aguardar em lockdown por 7 dias para ser acompanhado.");

    } else if (resultado > 90) {

        System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.");

               } 
            scan.close();
        } 
    } 
}
