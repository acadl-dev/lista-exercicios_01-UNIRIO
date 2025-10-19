import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final float PRIMEIRO_LADO;
        final float SEGUNDO_LADO;
        final float TERCEIRO_LADO;

        System.out.println("=== PROGRAMA PARA DEFINIR O TRIANGULO ===");

        System.out.println("Insira o valor do primeiro lado: ");
        PRIMEIRO_LADO = in.nextFloat();

        System.out.println("Insira o valor do segundo lado: ");
        SEGUNDO_LADO = in.nextFloat();

        System.out.println("Insira o valor do terceiro lado: ");
        TERCEIRO_LADO = in.nextFloat();

        if (PRIMEIRO_LADO == SEGUNDO_LADO && SEGUNDO_LADO == TERCEIRO_LADO) {
            System.out.println("Triângulo Equilátero: possui os 3 lados iguais");
        } else if (PRIMEIRO_LADO == SEGUNDO_LADO || SEGUNDO_LADO == TERCEIRO_LADO || PRIMEIRO_LADO == TERCEIRO_LADO) {
            System.out.println("Triângulo Isósceles: possui 2 lados iguais");
        } else {
            System.out.println("Triângulo Escaleno: possui 3 lados diferentes.");
        }
        
        System.out.println("Os valores inseridos foram: " + PRIMEIRO_LADO + " - " + SEGUNDO_LADO + " - " + TERCEIRO_LADO);




        System.out.println("=== PROGRAMA PARA JOGAR PEDRA, PAPEL E TESOURA COM A MÁQUINA ===");
        System.out.println("[0] - pedra");
        System.out.println("[1] - papel");
        System.out.println("[2] - tesoura");

        int escolha_maquina = randInt(0, 2);

        System.out.println("Faça sua escolha, digite de 0 a 2: ");
        int escolha_usuario = in.nextInt();

        System.out.println("A máquina sorteou: [" + escolha_maquina + "]");

        if (escolha_maquina == 0 && escolha_usuario == 2 || escolha_maquina == 1 && escolha_usuario == 0 || escolha_maquina == 2 && escolha_usuario == 1) {
            System.out.println("Máquina ganhou");
        } else if (escolha_usuario == 0 && escolha_maquina == 2 || escolha_usuario == 1 && escolha_maquina == 0 || escolha_usuario == 2 && escolha_maquina == 1) {
            System.out.println("Usuário ganhou");
        } else if (escolha_maquina == escolha_usuario) {
            System.out.println("Caraca, deu empate! kkk");
        } else {
            System.out.println("Alguma coisa deu errado!");
        }






        // Pendente uma correção aqui. O programa precisa identificar qual a maior nota pra caluclar a média na segunda condição
        //A divisão esta incorreta
        System.out.println("=== PROGRAMA PARA CALCULAR MÉDIA DA PROVA (APROVADO/REPROVADO) ===");

        System.out.println("Insira a nota da primeira prova: ");
        final float NOTA_UM = in.nextFloat();

        System.out.println("Insira a nota da segunda prova:");
        final float NOTA_DOIS = in.nextFloat();

        if (NOTA_UM + NOTA_DOIS >= 5.0) {
            if (NOTA_UM >= 3.0 && NOTA_DOIS >= 3.0) {

                final float MEDIA_FINAL = NOTA_UM + NOTA_DOIS / 2;

                System.out.println("Aluno aprovado por média! Média: " + MEDIA_FINAL);

            } else {
                System.out.print("Esse aluno precisou fazer a prova de recuperação, insira a nota da terceira prova: ");
                final float NOTA_TRES = in.nextFloat();
                if (NOTA_TRES >= 3.0 && (NOTA_TRES + NOTA_UM >= 5.0 || NOTA_TRES + NOTA_DOIS >= 5.0)) {
                    final float MEDIA_FINAL = NOTA_UM + NOTA_DOIS / 2;
                    System.out.println("Aluno aprovado por média, após prova de recuperação! Média: " + MEDIA_FINAL);

                } else {
                    final float MEDIA_FINAL = NOTA_UM + NOTA_DOIS / 2;
                    System.out.println("Aluno reprovado! Média: " + MEDIA_FINAL);
                }
            }
        } else {
            final float MEDIA_FINAL = NOTA_UM + NOTA_DOIS / 2;
            System.out.println("Aluno reprovado! Média: " + MEDIA_FINAL);
        }
        

    }

    public static int randInt(int min, int max) 
    {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    } 

}
