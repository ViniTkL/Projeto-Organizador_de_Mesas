package Main;

import Classes.Mesa;

import java.util.Scanner;

public class Main {
   /*
   Grupo:
   Vinícius Santana Azambuja,
   Lian Souza Miranda Mendes,
   Antoino Mussato Maciel,
   Luiz Eduardo Souza de Oliveira,
   Gabriel Andrade.
    */

    public static void main(String[] args){
        //variavel
        int sup=0;


        //craindo objeto mesa
        Mesa mesas = new Mesa();



        while (true) {
            //lendo opção do usuario
            int opc = getInicio();
            if (opc == 1) {
                sup = mesas.opcao1(opc, mesas);
                if (sup == 1) {
                    do {
                        opc = getInicio();
                        sup = mesas.escolha(opc, mesas);
                    } while (sup > 1);
                }
            }
            if (opc == 2 || sup == 2) {
                sup = mesas.opcao2(opc, mesas);
                if (sup == 1) {
                    do {
                        opc = getInicio();
                        sup = mesas.escolha(opc, mesas);
                    } while (sup > 1);
                }
            }
            if (opc == 3 || sup == 3) {
                sup = mesas.opcao3(opc, mesas);
                if (sup == 1) {
                    do {
                        opc = getInicio();
                        sup = mesas.escolha(opc, mesas);
                    } while (sup > 1);
                }

            }


        }







    }
    // função menu principal
    public static int getInicio(){
        Scanner lt = new Scanner(System.in);
        System.out.println("Menu Inicial");
        System.out.println("1.Abrir mesa");
        System.out.println("2.Verificar mesa");
        System.out.println("3.Fechar mesa");
        System.out.print("selecione: ");
        //lendo opção do usuario
        int opc = lt.nextInt();

        return opc;
        }
    }




