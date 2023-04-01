package app;

import entites.Empregado;
import entites.Tercerizados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionarios");
        List<Empregado> empregados = new ArrayList<Empregado>();

        int qnt = sc.nextInt();
        for (int i = 0; i < qnt; i++) {
            System.out.println("O " + (i + 1) + "° " + "funcionario é tercerizado?(y/n) ");
            char resp = sc.next().charAt(0);
            System.out.println("Digite os dados do funcionario: ");

            if (resp == 'y') {

                System.out.println("Nome: ");
                String nome = sc.next();
                System.out.println("Horas trabalhas: ");
                int horas = sc.nextInt();
                System.out.println("Valor da hora: ");
                double valor = sc.nextDouble();
                System.out.println("Valor das dipezas: ");
                double dispeza = sc.nextDouble();
                Empregado empregado = new Tercerizados(nome, horas, valor, dispeza);
                empregados.add(empregado);
            } else {

                System.out.println("Nome;");
                String nome = sc.next();
                System.out.println("Horas trabalhas: ");
                int horas = sc.nextInt();
                System.out.println("Valor da hora: ");
                double valor = sc.nextDouble();
                Empregado empregado = new Empregado(nome, horas, valor);
                empregados.add(empregado);
            }

        }
        System.out.println("Dados do empregado");
        for (Empregado emp : empregados) {
            System.out.print(emp.getNome() + " - " + "R$ ");
            System.out.println(emp.pagamento());


        }


        sc.close();

    }
}