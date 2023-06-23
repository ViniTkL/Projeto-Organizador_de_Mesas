package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/*
Pode-se dizer que vai ser uma classe para fazer algumas funções para a classe mesa.
então assim, se precisar fazer uma função para um get,por exemplo, dentro de uma função de Mesa, fazer ela aqui .


 */
public class FuncoesSuporte {

    private final Integer[][] mesaPedido = new Integer[10][50];
    private final double[][] mesaPreco = new double[10][50];
    private final String[][] mesaNome = new String[10][50];
    private final int[][] mesaQntd = new int[10][50];

    //Fazer a declareção do pedido desde a mesa 1 ate a mesa 10
    Pedidos mesa1 = new Pedidos();
    Pedidos mesa2 = new Pedidos();
    Pedidos mesa3 = new Pedidos();
    Pedidos mesa4 = new Pedidos();
    Pedidos mesa5 = new Pedidos();
    Pedidos mesa6 = new Pedidos();
    Pedidos mesa7= new Pedidos();
    Pedidos mesa8 = new Pedidos();
    Pedidos mesa9 = new Pedidos();
    Pedidos mesa10 = new Pedidos();


    Cardapio cardapio = new Cardapio();


    public void getEscolha(int escolha, int a, boolean[] copiaMesas, Mesa mesas) {
        Scanner lt = new Scanner(System.in);

        int numeroMesa,n=0;

        if ((escolha == 0) || (escolha > 10) || (copiaMesas[a] == true)) {
            System.out.println("Escolha Invalida.");
            System.out.printf("\nMenu verificar mesa\n\t1. Informe o número da mesa\n\t2. Retornar ao Menu inicial\nSelecione: ");
            escolha = lt.nextInt();

            if (escolha == 1) {
                mesas.getMesasAbertas(mesas);
                System.out.printf("\nInforme o numero da mesa ou digite 0 para retornar ao menu anterior: ");
               numeroMesa= lt.nextInt();
               n = numeroMesa-1;
               if(numeroMesa >0 && numeroMesa<=10 && copiaMesas[n] == false){
                   menuNumMesa(copiaMesas,n);
               }else if(escolha == 2){

               }else{
                   System.out.println("Valor invalido.");

               }

            }


        }

    }

    //Se a mesa digitada estiver aberta. OBS: Talvez precise de uma função para isso também
    public int menuNumMesa(boolean[]copiaMesas, int a) {
        Scanner lt= new Scanner(System.in);
        int escolha = 0,volta=0;
        if(copiaMesas[a]==false){
        System.out.printf("Menu Informar numero da mesa\n\t1. Fazer pedido de item do cardápio\n\t2. Cancelar pedido de item do cardápio\n\t3. Verificar itens pedidos\n\t4. Retornar ao Menu Inicial\nSelecione:  ");
        escolha = lt.nextInt();
        //criar vetor boolean mesaPedido depois.
        if(escolha == 1){
            fazerPedido(mesaPedido,a,escolha);}
        else if(escolha == 2){
            cancelarPedido(mesaPedido,a,escolha);
            }
        else if(escolha == 3){
            verificarMesaPedido(a);
        }else if(escolha == 4){
            volta =1;
        }else{
            System.out.println("Valor invalido");
            volta =1;
        }
        }
        return volta;
    }

    // função da opção 1.fazer pedido da menuNumMesa
    public int fazerPedido(Integer[][] mesaPedido,int a,int escolha){
        Scanner lt = new Scanner(System.in);
        int numeroItem =0, escolhaOpc=0, sup=0;
        int volta = 0;
        while(volta==0) {
            if (escolha == 1) {
                System.out.printf("Digite o código do item do cardápio ou informe 0 para retornar ao menu anterior: ");
                numeroItem = lt.nextInt();
                // se o numero for zero ou n constar dentro do vetor/matriz do cardápio
                if (numeroItem == 0) {
                    volta = 1;
                }
               if(numeroItem > 0){
                //sup pega o valor retornado para conferir se a operação foi feita com sucesso ou ela falhou/foi interrompida pelo usuário
                sup = itemDesejado(numeroItem,a);}

                // executa esse bloco se ele for interrompida ou falhar
                if (sup == 1) {
                    volta =1;
                }


            }else{
                volta =1;
            }
        }
        return volta;
    }
    //FUNÇÃO para colocar a quantidade dos itens desejados ou para votlar|| colocar um vetor para pedido da mesa e linkar o valor daqui nela.
    public int itemDesejado(int numeroItem,int a){
        Scanner lt = new Scanner(System.in);
        int qntd =0, volta =0, escolhaOpc;

        int pos = cardapio.posicao(numeroItem);

        System.out.printf("\nItem: %d\n“Este é o item que deseja? 1 – para Sim e 2 –para Não\nEscolha: ",numeroItem);
        escolhaOpc = lt.nextInt();
            if(escolhaOpc == 1){
                System.out.println("Digite a quantidade do item pedido pelo cliente: ");
                qntd = lt.nextInt();
                //escolhanedo em qual objeto pedido o pedido vai der armazenado
                if(a==0){
                    //fazer os pedidos serem arraylists
                    mesa1.setPedidoNome(cardapio.getNome(pos));
                    mesa1.setPedidoNumero(cardapio.getNumero(pos));
                    mesa1.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa1.setPedidoQntd(qntd);
                }
                if(a==1){
                    //fazer os pedidos serem arraylists
                    mesa2.setPedidoNome(cardapio.getNome(pos));
                    mesa2.setPedidoNumero(cardapio.getNumero(pos));
                    mesa2.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa2.setPedidoQntd(qntd);
                }
                if(a==2){
                    //fazer os pedidos serem arraylists
                    mesa3.setPedidoNome(cardapio.getNome(pos));
                    mesa3.setPedidoNumero(cardapio.getNumero(pos));
                    mesa3.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa3.setPedidoQntd(qntd);
                }
                if(a==3){
                    //fazer os pedidos serem arraylists
                    mesa4.setPedidoNome(cardapio.getNome(pos));
                    mesa4.setPedidoNumero(cardapio.getNumero(pos));
                    mesa4.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa4.setPedidoQntd(qntd);
                }
                if(a==4){
                    //fazer os pedidos serem arraylists
                    mesa5.setPedidoNome(cardapio.getNome(pos));
                    mesa5.setPedidoNumero(cardapio.getNumero(pos));
                    mesa5.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa5.setPedidoQntd(qntd);
                }
                if(a==5){
                    //fazer os pedidos serem arraylists
                    mesa6.setPedidoNome(cardapio.getNome(pos));
                    mesa6.setPedidoNumero(cardapio.getNumero(pos));
                    mesa6.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa6.setPedidoQntd(qntd);
                }
                if(a==6){
                    //fazer os pedidos serem arraylists
                    mesa7.setPedidoNome(cardapio.getNome(pos));
                    mesa7.setPedidoNumero(cardapio.getNumero(pos));
                    mesa7.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa7.setPedidoQntd(qntd);
                }
                if(a==7){
                    //fazer os pedidos serem arraylists
                    mesa8.setPedidoNome(cardapio.getNome(pos));
                    mesa8.setPedidoNumero(cardapio.getNumero(pos));
                    mesa8.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa8.setPedidoQntd(qntd);
                }
                if(a==8){
                    //fazer os pedidos serem arraylists
                    mesa9.setPedidoNome(cardapio.getNome(pos));
                    mesa9.setPedidoNumero(cardapio.getNumero(pos));
                    mesa9.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa9.setPedidoQntd(qntd);
                }
                if(a==9){//fazer os pedidos serem arraylists
                    mesa10.setPedidoNome(cardapio.getNome(pos));
                    mesa10.setPedidoNumero(cardapio.getNumero(pos));
                    mesa10.setPedidoPrecos(cardapio.getPreco(pos));
                    mesa10.setPedidoQntd(qntd);
                }

            }
            else if(escolhaOpc == 2){
              volta =1;
            }
            else{
                System.out.println("Opcao invalida");
                volta =1;
        }
            return volta;
    }

    //A Partie daqui será apenas para dar suporte a opção 3
    public int menuFecharMesa(){
        int escolha =0;
        Scanner lt = new Scanner(System.in);

        System.out.printf("Menu fechar mesa:\n\t1.Informar mesa que deseja fechar\n\t2.voltar ao menu incial\nSelecione: ");
        escolha = lt.nextInt();

        return escolha;
    }

    //funcao de cancelar um pedido da mesa
    public int cancelarPedido(Integer[][] mesaPedido,int a,int escolha){
        Scanner lt = new Scanner(System.in);


        mostrarPedidosMesas(a);
        System.out.println("Qual item deseja excluir(CODIGO):");
        int codigoExcluir = lt.nextInt();
        excluirPedido(a,codigoExcluir);
        return a;
    }
    //mostras as informações dos pedidos das mesas
    public void mostrarPedidosMesas(int mesa){
        if(mesa==0){
            int j=mesa1.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa1.getPedidoNumero(i)+"\t"+mesa1.getPedidoNome(i)+"\t"+mesa1.getPedidoQntd(i)+"\t\t"+mesa1.getPedidoPrecos(i)+"\t\t"+(mesa1.getPedidoPrecos(i)*mesa1.getPedidoQntd(i)));
            }
        }
        else if(mesa==1){
            int j=mesa2.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa2.getPedidoNumero(i)+"\t"+mesa2.getPedidoNome(i)+"\t"+mesa2.getPedidoQntd(i)+"\t\t"+mesa2.getPedidoPrecos(i)+"\t\t"+(mesa2.getPedidoPrecos(i)*mesa2.getPedidoQntd(i)));
            }
        }
        else if(mesa==2){
            int j=mesa3.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa3.getPedidoNumero(i)+"\t"+mesa3.getPedidoNome(i)+"\t"+mesa3.getPedidoQntd(i)+"\t\t"+mesa3.getPedidoPrecos(i)+"\t\t"+(mesa3.getPedidoPrecos(i)*mesa3.getPedidoQntd(i)));
            }
        }
        else if(mesa==3){
            int j=mesa4.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa4.getPedidoNumero(i)+"\t"+mesa4.getPedidoNome(i)+"\t"+mesa4.getPedidoQntd(i)+"\t\t"+mesa4.getPedidoPrecos(i)+"\t\t"+(mesa4.getPedidoPrecos(i)*mesa4.getPedidoQntd(i)));
            }
        }
        else if(mesa==4){
            int j=mesa5.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa5.getPedidoNumero(i)+"\t"+mesa5.getPedidoNome(i)+"\t"+mesa5.getPedidoQntd(i)+"\t\t"+mesa5.getPedidoPrecos(i)+"\t\t"+(mesa5.getPedidoPrecos(i)*mesa5.getPedidoQntd(i)));
            }
        }
        else if(mesa==5){
            int j=mesa6.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa6.getPedidoNumero(i)+"\t"+mesa6.getPedidoNome(i)+"\t"+mesa6.getPedidoQntd(i)+"\t\t"+mesa6.getPedidoPrecos(i)+"\t\t"+(mesa6.getPedidoPrecos(i)*mesa6.getPedidoQntd(i)));
            }
        }
        else if(mesa==6){
            int j=mesa7.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa7.getPedidoNumero(i)+"\t"+mesa7.getPedidoNome(i)+"\t"+mesa7.getPedidoQntd(i)+"\t\t"+mesa7.getPedidoPrecos(i)+"\t\t"+(mesa7.getPedidoPrecos(i)*mesa7.getPedidoQntd(i)));
            }
        }
        else if(mesa==7){
            int j=mesa8.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa8.getPedidoNumero(i)+"\t"+mesa8.getPedidoNome(i)+"\t"+mesa8.getPedidoQntd(i)+"\t\t"+mesa8.getPedidoPrecos(i)+"\t\t"+(mesa8.getPedidoPrecos(i)*mesa8.getPedidoQntd(i)));
            }
        }
        else if(mesa==8){
            int j=mesa9.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa9.getPedidoNumero(i)+"\t"+mesa9.getPedidoNome(i)+"\t"+mesa9.getPedidoQntd(i)+"\t\t"+mesa9.getPedidoPrecos(i)+"\t\t"+(mesa9.getPedidoPrecos(i)*mesa9.getPedidoQntd(i)));
            }
        }
        else if(mesa==9){//fazer os pedidos serem arraylists
            int j=mesa10.tamanaho();
            System.out.printf("Codigo\tNome\t\tQuantidade\t\tValor do item\t\tValor total do item\n");
            for(int i=0;i<j;i++){
                System.out.println(mesa10.getPedidoNumero(i)+"\t"+mesa10.getPedidoNome(i)+"\t"+mesa10.getPedidoQntd(i)+"\t\t"+mesa10.getPedidoPrecos(i)+"\t\t"+(mesa10.getPedidoPrecos(i)*mesa10.getPedidoQntd(i)));
            }
        }
        else{
            System.out.println("Valor invalido");
        }
    }
    public void excluirPedido(int mesa,int b){
       Scanner lt = new Scanner(System.in);
        int remove =0;
        if(mesa==0){
            int j=mesa1.tamanaho();
           //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa1.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa1.setPedidoQntd(remove,i);
                }
                else if(mesa1.getPedidoNumero(i).equals(b)){
                    mesa1.removePedidoNome(i);
                    mesa1.removetPedidoNumero(i);
                    mesa1.removePedidoPrecos(i);
                    mesa1.removePedidoQntd(i);
                }
            }
        }
        else if(mesa==1){
            int j=mesa2.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa2.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa2.setPedidoQntd(remove,i);
                }
                else if(mesa2.getPedidoNumero(i).equals(b)){
                mesa2.removePedidoNome(i);
                mesa2.removetPedidoNumero(i);
                mesa2.removePedidoPrecos(i);
                mesa2.removePedidoQntd(i);}
            }
        }
        else if(mesa==2){
            int j=mesa3.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa3.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa3.setPedidoQntd(remove,i);
                }
                else if(mesa3.getPedidoNumero(i).equals(b)){
                    mesa3.removePedidoNome(i);
                    mesa3.removetPedidoNumero(i);
                    mesa3.removePedidoPrecos(i);
                    mesa3.removePedidoQntd(i);
                }
            }
        }
        else if(mesa==3){
            int j=mesa4.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa4.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa4.setPedidoQntd(remove,i);
                }
                else if(mesa4.getPedidoNumero(i).equals(b)){
                mesa4.removePedidoNome(i);
                mesa4.removetPedidoNumero(i);
                mesa4.removePedidoPrecos(i);
                mesa4.removePedidoQntd(i);}
            }
        }
        else if(mesa==4){
            int j=mesa5.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa5.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa5.setPedidoQntd(remove,i);
                }
                else if(mesa5.getPedidoNumero(i).equals(b)){
                mesa5.removePedidoNome(i);
                mesa5.removetPedidoNumero(i);
                mesa5.removePedidoPrecos(i);
                mesa5.removePedidoQntd(i);}
            }
        }
        else if(mesa==5){
            int j=mesa6.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa6.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa6.setPedidoQntd(remove,i);
                }
                else if(mesa6.getPedidoNumero(i).equals(b)){
                mesa6.removePedidoNome(i);
                mesa6.removetPedidoNumero(i);
                mesa6.removePedidoPrecos(i);
                mesa6.removePedidoQntd(i);
                }
            }
        }
        else if(mesa==6){
            int j=mesa7.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa7.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa7.setPedidoQntd(remove,i);
                }
                else if(mesa7.getPedidoNumero(i).equals(b)){
                mesa7.removePedidoNome(i);
                mesa7.removetPedidoNumero(i);
                mesa7.removePedidoPrecos(i);
                mesa7.removePedidoQntd(i);
                }
            }
        }
        else if(mesa==7){
            int j=mesa8.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa8.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa8.setPedidoQntd(remove,i);
                }
               else  if(mesa8.getPedidoNumero(i).equals(b)) {
                    mesa8.removePedidoNome(i);
                    mesa8.removetPedidoNumero(i);
                    mesa8.removePedidoPrecos(i);
                    mesa8.removePedidoQntd(i);
                }
            }
        }
        else if(mesa==8){
            int j=mesa9.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa9.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa9.setPedidoQntd(remove,i);
                }
                else if(mesa9.getPedidoNumero(i).equals(b)) {
                    mesa9.removePedidoNome(i);
                    mesa9.removetPedidoNumero(i);
                    mesa9.removePedidoPrecos(i);
                    mesa9.removePedidoQntd(i);
                }
            }
        }
        else if(mesa==9){//fazer os pedidos serem arraylists
            int j=mesa10.tamanaho();
            //saber o numero de pedido/ acher ele nos pedido array, excluir ele
            for(int i=0;i<j;i++){
                if(mesa10.getPedidoQntd(i).compareTo(1)>0){
                    System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
                    remove = lt.nextInt();

                    mesa10.setPedidoQntd(remove,i);
                }
                else if(mesa10.getPedidoNumero(i).equals(b)) {
                    mesa10.removePedidoNome(i);
                    mesa10.removetPedidoNumero(i);
                    mesa10.removePedidoPrecos(i);
                    mesa10.removePedidoQntd(i);
                }
            }
        }
        else{
            System.out.println("Valor invalido");
        }
    }

    //função para escolher quantidade de itens do pedido a serem removidos
    public void removeQntd(int i){
        Scanner lt = new Scanner(System.in);
        int remove = 0;
        if(mesa1.getPedidoQntd(i).compareTo(1)>0){
            System.out.println("Digite a quantidade de itens do pedido a serem removidos: ");
            remove = lt.nextInt();

            mesa1.setPedidoQntd(remove,i);
        }

    }


    public int verificarMesaPedido(int a){
        Scanner lt = new Scanner(System.in);
        int volta = 1;
        double tot=0;


        mostrarPedidosMesas(a);
        valorTotalDasMesas(a);
        try{
            System.out.println("\nDigite uma tecla para voltar ao menu principal");
            volta= lt.nextInt();
        }
        catch(Exception e){
            volta =1;
        }
        return volta;
    }

    public void valorTotalDasMesas(int mesa){
        double tot=0;
        if(mesa==0){
            int j=mesa1.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa1.getPedidoPrecos(i)*mesa1.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==1){
            int j=mesa2.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa2.getPedidoPrecos(i)*mesa2.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==2){
            int j=mesa3.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa3.getPedidoPrecos(i)*mesa3.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==3){
            int j=mesa4.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa4.getPedidoPrecos(i)*mesa4.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==4){
            int j=mesa5.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa5.getPedidoPrecos(i)*mesa5.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==5){
            int j=mesa6.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa6.getPedidoPrecos(i)*mesa6.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==6){
            int j=mesa7.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa7.getPedidoPrecos(i)*mesa7.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==7){
            int j=mesa8.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa8.getPedidoPrecos(i)*mesa8.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==8){
            int j=mesa9.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa9.getPedidoPrecos(i)*mesa9.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else if(mesa==9){//fazer os pedidos serem arraylists
            int j=mesa10.tamanaho();
            for(int i=0;i<j;i++){
                tot = tot+(mesa10.getPedidoPrecos(i)*mesa10.getPedidoQntd(i));
            }
            System.out.printf("Valor total da mesa: R$%.2f ",tot);
        }
        else{
            System.out.println("Valor invalido");
        }
    }

}
