import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Produto[] vect = new Produto[n];
//        for (int i = 0; i < vect.length; i++) {
//            sc.nextLine();
//            String name = sc.nextLine();
//            double price = sc.nextDouble();
//            vect[i] = new Produto(name,price);
//
//
//        }
//
//        double soma = 0;
//        for (int i = 0; i < vect.length; i++) {
//            soma+= vect[i].getPrice();
//            
//        }
//        double media = soma / vect.length;
//
//        System.out.println("A média dos produtos é: " + media);
//    }
//
    
        var leitura = new Scanner(System.in);
        System.out.println("Insira o tamanho da matriz,n representara o numero de linhas e colunas");
        int n = leitura.nextInt();
        int [][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = leitura.nextInt();
            }
        }
        System.out.print("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int numeroNegativo = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0){
                    numeroNegativo++
                }
            }

        }

        System.out.println("Essa é a quantidade de numeros negativos" + numeroNegativo );





        leitura.close();
    
    
    
    
    
    
    
    
    }

};
