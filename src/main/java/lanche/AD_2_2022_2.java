package lanche;

public class AD_2_2022_2 {
     public static void main(String[] args) {
  
        System.out.println("**********SISTEMA DE GERENCIAMENTO DE LANCHES DO JOSELITO**********\n");

        valores pedido = new valores();
        montaLanche lanche = new montaLanche();
        lanche.Lanche();
        String select = lanche.getLanche(); //objeto que define o tipo de lanche

        //objetos para montagem dos ingredientes
        lanche.Molho();
        lanche.Queijo();
        lanche.Carne();
        lanche.Salada();
        
        String molho = lanche.TipoMolho;
        String queijo = lanche.TipoQueijo;
        String carne = lanche.TipoCarne;
        String salada = lanche.TipoSalada;
        

        //Objeto "Pedido" usando como parâmetros o tipo do lanche (pizza ou lanche), uma array de ingredientes e valores dos ingredientes.
        pedido.pedido(select,lanche.ListaLanches, pedido.PrecoMolho(molho), pedido.PrecoQueijo(queijo), pedido.PrecoCarne(carne), pedido.PrecoSalada(salada));
        lanche.verLanche();
        pedido.imprimiValor();
        pedido.menu();
        
     }
        
}
   
