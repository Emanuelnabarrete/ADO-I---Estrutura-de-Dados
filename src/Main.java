import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Quantos colaboradores deseja cadastrar? ");
        int qnt = sc.nextInt();


        Colaboradores colab = new Colaboradores(qnt);
        Colaboradores coll = new Colaboradores(colab.tamanho());


        Informacoes info = null;

        int escolha;


        for(int i = 1 ; i <=qnt;i++){






            System.out.println("ID: ");
            String id = sc.next();

            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Cpf: ");
            String cpf = sc.next();

            System.out.println("Funcao: ");
            String funcao = sc.next();

            info = new Informacoes(id, nome, cpf, funcao);


            colab.adiciona(info);

        }
        do {
            // adicionar | remove | mostrar
            System.out.println(" 2- Ver lista de colaboradores\n 3- Retirar Colaborador(ID)\n 0- Sair");
            escolha = sc.nextInt();

            if (escolha == 2) {

                System.out.println(colab);
            } else if (escolha == 3) {
                System.out.println("Qual ID do colaborador? ");
                String id = sc.next();
                colab.remover(id);

            }else if(escolha ==1){

            }

        } while (escolha != 0);
    }
}