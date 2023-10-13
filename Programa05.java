import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa05 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("#.##");

        System.out.print("\n|=========================|");
        System.out.print("\n|    Tabuada de 1 a 10    |");
        System.out.print("\n|=========================|");
        System.out.print("\n| Opção 1 - Adição        |");
        System.out.print("\n| Opção 2 - Subtração     |");
        System.out.print("\n| Opção 3 - Multiplicação |");
        System.out.print("\n| Opção 4 - Divisão       |");
        System.out.print("\n| Opção 5 - Sair          |");
        System.out.print("\n|=========================|");

        int opcao;

        do{
            System.out.print("\nDigite o Número da Opção: ");
            opcao = ent.nextInt();

            if (opcao > 5 || opcao < 1){
                System.out.print("\nDigite um Número Entre 1 e 5!\n");
            }
        }while (opcao > 5 || opcao < 1);

        if (opcao == 5){
            System.out.print("\nAté Mais!!!\n");
            System.exit(0);
        }


        switch (opcao){

            case 1:

                System.out.print("\n| Tabuada (Adição) |\n");
                System.out.print("\nTabuada do 1\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (1+n1);
                    System.out.print("\n1 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 2\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (2+n1);
                    System.out.print("\n2 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 3\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (3+n1);
                    System.out.print("\n3 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 4\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (4+n1);
                    System.out.print("\n4 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 5\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (5+n1);
                    System.out.print("\n5 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 6\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (6+n1);
                    System.out.print("\n6 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 7\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (7+n1);
                    System.out.print("\n7 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 8\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (8+n1);
                    System.out.print("\n8 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 9\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (9+n1);
                    System.out.print("\n9 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 10\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (10+n1);
                    System.out.print("\n10 + "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");

                break;

            case 2:

                System.out.print("\n| Tabuada (Subtração) |\n");
                System.out.print("\nTabuada do 1\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (1-n1);
                    System.out.print("\n1 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 2\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (2-n1);
                    System.out.print("\n2 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 3\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (3-n1);
                    System.out.print("\n3 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 4\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (4-n1);
                    System.out.print("\n4 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 5\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (5-n1);
                    System.out.print("\n5 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 6\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (6-n1);
                    System.out.print("\n6 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 7\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (7-n1);
                    System.out.print("\n7 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 8\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (8-n1);
                    System.out.print("\n8 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 9\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (9-n1);
                    System.out.print("\n9 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 10\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (10-n1);
                    System.out.print("\n10 - "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");

                break;

            case 3:

                System.out.print("\n| Tabuada (Multiplicação) |\n");
                System.out.print("\nTabuada do 1\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (1*n1);
                    System.out.print("\n1 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 2\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (2*n1);
                    System.out.print("\n2 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 3\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (3*n1);
                    System.out.print("\n3 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 4\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (4*n1);
                    System.out.print("\n4 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 5\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (5*n1);
                    System.out.print("\n5 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 6\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (6*n1);
                    System.out.print("\n6 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 7\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (7*n1);
                    System.out.print("\n7 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 8\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (8*n1);
                    System.out.print("\n8 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 9\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (9*n1);
                    System.out.print("\n9 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 10\n");
                for(int n1 = 0; n1 <= 10; n1++){
                    int res = (10*n1);
                    System.out.print("\n10 x "+ n1 +" = "+ res);

                }
                System.out.print("\n\n");

                break;

            case 4:

                System.out.print("\n| Tabuada (Divisão) |\n");
                System.out.print("\nTabuada do 1\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (1/n1);
                    System.out.print("\n1 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 2\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (2/n1);
                    System.out.print("\n2 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 3\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (3/n1);
                    System.out.print("\n3 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 4\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (4/n1);
                    System.out.print("\n4 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 5\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (5/n1);
                    System.out.print("\n5 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 6\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (6/n1);
                    System.out.print("\n6 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 7\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (7/n1);
                    System.out.print("\n7 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 8\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (8/n1);
                    System.out.print("\n8 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 9\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (9/n1);
                    System.out.print("\n9 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");


                System.out.print("\nTabuada do 10\n");
                for(double n1 = 1; n1 <= 10; n1++){
                    double res = (10/n1);
                    System.out.print("\n10 / "+ deci.format(n1) +" = "+ deci.format(res));

                }
                System.out.print("\n\n");

        }

    }
}

