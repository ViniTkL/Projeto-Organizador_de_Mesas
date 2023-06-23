package Classes;

import java.util.Arrays;
import java.util.Scanner;

public class Mesa {
    FuncoesSuporte suporte = new FuncoesSuporte();
    //vetor das mesas
    private final boolean[] mesas = new boolean[10];
    //vetor para verificar se mesas está inteiro como FALSE
    private final boolean[] compare = new boolean[10];
    //vetor dos itens



    public Mesa(){
        Arrays.fill(this.mesas, true);
        Arrays.fill(this.compare, false);
    }


    //mostra as mesas disponíveis e indisponíveis
    public void getMesasFechadas(){
       for(int i=0;i<10;i++){
           if(this.mesas[i] == true){
               System.out.printf("Mesa %d: Fechada| ", i+1);
           }
           else {
               System.out.printf("Mesa %d: Aberta| ", i+1);
           }
       }
    }

    //verifica se todas as mesas estão indisponiveis
    public int todasMesasIndisponiveis(){
        int result = Arrays.compare(mesas,compare);
        return result;
    }
    //função abrir mesa
    public int abrirMesa(){
        //clone da array mesas
        boolean [] copiaMesas = mesas.clone();
        //inteiro a ser retornado
        int a,b = 0;
        //Scanner
        Scanner lt = new Scanner(System.in);
        //opções

        System.out.printf("\nMenu Abrir Mesa\n\t1. Indicar mesa para ser aberta\n\t2. Retornar ao menu inicial.\nSelecione: ");
        int opc = lt.nextInt();

        if((opc!=1) || (opc!=2)){
            while((opc!=1) && (opc!=2)) {
            System.out.printf("Opcao invalida, tente novamente\n");
            System.out.printf("Menu Abrir Mesa\n\t1. Indicar mesa para ser aberta\n\t2. Retornar ao menu inicial.\nSelecione: ");
            opc = lt.nextInt();

            }
        }

        if(opc == 2){
            b = 1;
        }
        //se a opçõa for 1 de abrir mesa
        if(opc == 1){
            System.out.println("Indique o numero da mesa que deseja abrir: ");
             a = lt.nextInt();
             a = a - 1;

             //se for uma mesa errada ou ja estiver aberta
            if((a>=10) || (copiaMesas[a] != true)){
                do{
                    System.out.println("Indique o numero da mesa que deseja abrir: ");
                    a = lt.nextInt();
                    a = a - 1;
                }while((a>=10) || (copiaMesas[a] != true));
            }
                this.mesas[a] = false;
                System.out.printf("Mesa %d aberta\n",a+1);

        }


        return b;
    }


    public int opcao1(int opc, Mesa mesas){
     int sup=0;
      if(opc == 1){
        if(mesas.todasMesasIndisponiveis()==0){
            System.out.println("Nao ha mesas disponiveis.");
        }
        else{
            mesas.getMesasFechadas();
             sup = mesas.abrirMesa();
        }
      }
        return sup;
    }

    public int escolha(int opc, Mesa mesas){
        int sup=0;
        if (opc == 1) {
            sup = mesas.opcao1(opc, mesas);

        }
        if (opc == 2) {
            sup = mesas.opcao2(opc, mesas);
        }
        if(opc==3){
            sup=mesas.opcao3(opc, mesas);
        }

        return sup;
    }

    public int opcao2(int opc, Mesa mesas){
        //scanner
       Scanner lt = new Scanner(System.in);
       //copiando mesaws
        boolean [] copiaMesas = this.mesas.clone();
        //varaiveis
        int escolha=0,volta=0,c=0;
        //se a opçõa for 2
        if(opc==2){
            //menu
            System.out.printf("Menu verificar mesa\n\t1. Informe o número da mesa\n\t2. Retornar ao Menu inicial\nSelecione");
            escolha = lt.nextInt();

            //se escolher 1
            if(escolha == 1){ getMesasAbertas(mesas);
                //pedindo para digitar o numero da mesa
                System.out.printf("\nInforme o numero da mesa ou digite 0 para retornar ao menu anterior: ");
                escolha = lt.nextInt();


                //diminuindo 1 para não bugar o vetor
                int a = escolha - 1;

                //fazer um função em loop para isso aqui
                 suporte.getEscolha(escolha,a,copiaMesas,mesas);


                //Ta tendo um bug que eu to com preguiça de resolver, então so taca isso ae e fds, n vai impactar muito no final, eu acho
                try{
                    //Se a mesa digitada estiver aberta. OBS: Talvez precise de uma função para isso também

                    c = suporte.menuNumMesa(copiaMesas,a);}
                catch(ArrayIndexOutOfBoundsException e){

                }
                if( c ==1){
                    volta=1;
                }

            }
            //se escolher 2
            if(escolha == 2 ){
                volta = 1;
            }
        }

        return volta;
    }


    //pegar mesas abertas
    public void getMesasAbertas(Mesa mesas){
        for(int i = 0;i<this.mesas.length;i++){
            if(this.mesas[i] == false){
                System.out.printf("Mesa %d: Aberta| ", i+1);
            }
        }
    }
    public int opcao3(int opc, Mesa mesas) {
        //scanner
        Scanner lt = new Scanner(System.in);
        //variaveis
        int escolha = 0, a = 0, b = 0, volta = 0,ab=0;
        //clone da array mesas
        boolean[] copiaMesas = this.mesas.clone();
        // so entra se a opc ==3
        if (opc == 3) {
            //puxando e rebendo o valor da função FecharMesa
            escolha = suporte.menuFecharMesa();
            if (escolha == 1) {

                //entra no if e pega as mesas abertas
                getMesasAbertas(mesas);

                // pede para informar o numero das mesas
                System.out.printf("Informe o numero da mesa que deseja fechar ou digite 0 para retornar ao menu anterior: ");
                a = lt.nextInt();
                b = a - 1;

                // se o numero for zero ou de fora do vetor ou se a mesa não estiver aberta
                if ((a == 0) || (b >= 10) || (copiaMesas[b] == true)) {
                    while ((a == 0) || ((a - 1) >= 10)) {
                        escolha = suporte.menuFecharMesa();
                        //oque fazer se escolha for 2
                         if(escolha == 2) {
                            volta = 1;
                            return volta;
                        }
                        if (escolha == 1) {
                            getMesasAbertas(mesas);
                            System.out.printf("Informe o numero da mesa que deseja fechar ou digite 0 para retornar ao menu anterior: ");
                            a = lt.nextInt();
                            if(a == 0){
                                volta =1;
                            }
                        }

                    }
                }
                if (copiaMesas[b] == false) {
                     ab = fecharMesa(b, opc, mesas);
                    if(ab == 1){
                        suporte.menuFecharMesa();
                        funcao(escolha,mesas,opc);
                    }else if(ab==2){
                        volta =1;
                    }
                }
            }
            if(escolha == 2){
                volta =1;
            }
        }
        return volta;
    }

    //funcao fecahr mesa
    public int fecharMesa(int b, int opc, Mesa mesas){
        Scanner lt = new Scanner(System.in);
        int escolha = 0, volta = 0, voltaA=0;
        System.out.printf("Tem certeza que deseja fechar a mesa %d?\n\t1.sim\t2.nao\nSelecione: ",b+1);
        escolha = lt.nextInt();

        if(escolha == 1){
            this.mesas[b] = true;
            System.out.printf("Mesa %d fechada\n", b+1);
            suporte.mostrarPedidosMesas(b);
            suporte.valorTotalDasMesas(b);
            try{
            System.out.println("\n\tPressione qualquer tecla para voltar ao menu principal: ");

            voltaA = lt.nextInt();}
            catch(Exception a){

            }
            volta =2;

        }
        if((escolha == 2 )||(escolha !=2 && escolha !=1)){
            volta = 1;
        }
        return volta;
    }

    //funcao para loop na opcao 3
    public int funcao(int escolha, Mesa mesas, int opc){
         //scanner
        Scanner lt = new Scanner(System.in);
        //variaveis
        int a=0,b = 0,volta =0,ab=0;
        //clone da array mesas
        boolean [] copiaMesas = this.mesas.clone();
        if(escolha == 1){

            //entra no if e pega as mesas abertas
            getMesasAbertas(mesas);

            // pede para informar o numero das mesas
            System.out.printf("Informe o numero da mesa que deseja fechar ou digite 0 para retornar ao menu anterior: ");
            a = lt.nextInt();
            b = a-1;

            if ((a == 0) || (b >= 10) || (copiaMesas[b] == true)) {
                while ((a == 0) || ((a - 1) >= 10)) {
                    escolha = suporte.menuFecharMesa();
                    //oque fazer se escolha for 2
                    if(escolha == 2) {
                        volta = 1;
                        return volta;
                    }
                    if (escolha == 1) {
                        getMesasAbertas(mesas);
                        System.out.printf("Informe o numero da mesa que deseja fechar ou digite 0 para retornar ao menu anterior: ");
                        a = lt.nextInt();
                        if(a == 0){
                            volta =1;
                        }
                    }

                }
            }
            if (copiaMesas[b] == false) {
                ab = fecharMesa(b, opc, mesas);
                if(ab == 1){
                    suporte.menuFecharMesa();
                    funcao(escolha,mesas,opc);
                }
            }
        }
        return volta;
    }



}
