package Classes;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private List pedidoNome = new ArrayList<String>();
   private List pedidoPrecos = new ArrayList<Double>();
    private List pedidoNumero = new ArrayList<Integer>();
   private  List pedidoQntd = new ArrayList<Integer>();

   //sempre que um novo pedido for cridado ene inicializa uma nova list destas
    public Pedidos() {
        List pedidoNome = new ArrayList<String>();
        List pedidoPrecos = new ArrayList<Double>();
        List pedidoNumero = new ArrayList<Integer>();
        List pedidoQntd = new ArrayList<Integer>();

    }
    public void setPedidoNome(String a) {
        pedidoNome.add(a);
    }
    public void setPedidoPrecos(Double a) {
        pedidoPrecos.add(a);
    }
    public void setPedidoNumero(Integer a) {
        pedidoNumero.add(a);
    }
    public void setPedidoQntd(int a) {
        pedidoQntd.add(a);
    }
    public int tamanaho(){
        return pedidoNumero.size();
    }
    public int posicao(int numeroInt){
        int a = pedidoNumero.indexOf(numeroInt);
        return a;
    }
    public String getPedidoNome(int a) {
        return (String) pedidoNome.get(a);
    }
    public Double getPedidoPrecos(int a) {
        return (Double) pedidoPrecos.get(a);
    }
    public Integer getPedidoNumero(int a) {
        return (Integer) pedidoNumero.get(a);
    }
    public Integer getPedidoQntd(int a) {
        return (Integer) pedidoQntd.get(a);
    }

    public void removePedidoNome(int i) {
        pedidoNome.remove(i);
    }
    public void removePedidoPrecos(int a) {
        pedidoPrecos.remove(a);
    }
    public void removetPedidoNumero(int a) {
        pedidoNumero.remove(a);
    }
    public void removePedidoQntd(int a) {
        pedidoQntd.remove(a);
    }

    public void setPedidoQntd(int remove, int i){
        int newValue=0;
        newValue = getPedidoQntd(i)- remove;
        pedidoQntd.set(i,newValue);


    }

}
