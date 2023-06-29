package Classes;

import java.util.*;

public class Cardapio {
    List cardapioNomes = new ArrayList<String>();
    List cardapioPrecos = new ArrayList<Double>();
    List cardapioNumero = new ArrayList<Integer>();

    public Cardapio(){
        //inicializando os nomes no cardapio nomes
        cardapioNomes.add("Filé de frango grelhado");
        cardapioNomes.add("Iscas de frango");
        cardapioNomes.add("Iscas de carne");
        cardapioNomes.add("Bife acebolado");
        cardapioNomes.add("Filé de frango a milanesa");
        cardapioNomes.add("Filé a parmegiana");
        cardapioNomes.add("Caeser Salad");
        cardapioNomes.add("Espaguete ao alho e óleo");
        cardapioNomes.add("Panqueca de carne");
        cardapioNomes.add("Panqueca de queijo");
        cardapioNomes.add("Suco de laranja (500 ml)");
        cardapioNomes.add("Suco de abacaxi (500 ml)");
        cardapioNomes.add("Suco de maracujá (500 ml)");
        cardapioNomes.add("Água (500 ml)");
        cardapioNomes.add("Coca-Cola (350 ml)");
        cardapioNomes.add("Guaraná Antártica (350 ml)");
        cardapioNomes.add("Fanta (350 ml)");
        cardapioNomes.add("Fatia de pudim");
        cardapioNomes.add("Bola de sorvete");
        cardapioNomes.add("Calabresa acebolada");
        cardapioNomes.add("Frango a passarinho");
        cardapioNomes.add("Batata frita");
        cardapioNomes.add("Porção extra de arroz");
        cardapioNomes.add("Porção extra de feijão");
        cardapioNomes.add("Adicional de ovo frito");
        cardapioNomes.add("Adicional de fatia de bacon");//27 itens no total

        //inicializando os precos no cardapio precos
        cardapioPrecos.add(16.50);
        cardapioPrecos.add(22.35);
        cardapioPrecos.add(22.35);
        cardapioPrecos.add(26.99);
        cardapioPrecos.add(28.99);
        cardapioPrecos.add(35.50);
        cardapioPrecos.add(16.50);
        cardapioPrecos.add(15.00);
        cardapioPrecos.add(19.99);
        cardapioPrecos.add(19.99);
        cardapioPrecos.add(7.00);
        cardapioPrecos.add(7.00);
        cardapioPrecos.add(7.00);
        cardapioPrecos.add(4.50);
        cardapioPrecos.add(5.50);
        cardapioPrecos.add(5.50);
        cardapioPrecos.add(5.50);
        cardapioPrecos.add(8.90);
        cardapioPrecos.add(12.00);
        cardapioPrecos.add(5.50);
        cardapioPrecos.add(35.00);
        cardapioPrecos.add(40.00);
        cardapioPrecos.add(22.50);
        cardapioPrecos.add(5.00);
        cardapioPrecos.add(5.00);
        cardapioPrecos.add(3.99);
        cardapioPrecos.add(3.99);

        //inicializando os numeros no cardapio numero
        cardapioNumero.add(101);
        cardapioNumero.add(102);
        cardapioNumero.add(103);
        cardapioNumero.add(104);
        cardapioNumero.add(105);
        cardapioNumero.add(106);
        cardapioNumero.add(107);
        cardapioNumero.add(108);
        cardapioNumero.add(109);
        cardapioNumero.add(110);
        cardapioNumero.add(201);
        cardapioNumero.add(202);
        cardapioNumero.add(203);
        cardapioNumero.add(204);
        cardapioNumero.add(205);
        cardapioNumero.add(206);
        cardapioNumero.add(207);
        cardapioNumero.add(301);
        cardapioNumero.add(302);
        cardapioNumero.add(303);
        cardapioNumero.add(401);
        cardapioNumero.add(402);
        cardapioNumero.add(403);
        cardapioNumero.add(404);
        cardapioNumero.add(405);
        cardapioNumero.add(406);
        cardapioNumero.add(407);

    }

    public String getNome(int i){
        return (String) cardapioNomes.get(i);}


    public Integer getNumero(int a){
        return (Integer) cardapioNumero.get(a);
    }

    public Double getPreco(int a){
        return (Double) cardapioPrecos.get(a);
    }

    public int posicao(int numeroInt){
        int a = cardapioNumero.indexOf(numeroInt);
        return a;
    }
}

