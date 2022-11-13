



abstract public class Ingredientess {

    private double precoMolho;
    private double precoQueijo;
    private double precoCarne;
    private double precoSalada;
        
    public double getPrecoMolho() {
        return precoMolho;
    }

    public void setPrecoMolho(double precoMolho) {
        this.precoMolho = precoMolho;
    }
    public double getPrecoQueijo() {
        return precoQueijo;
    }

    public void setPrecoQueijo(double precoQueijo) {
        this.precoQueijo = precoQueijo;
    }

     public double getPrecoCarne() {
        return precoCarne;
    }

    public void setPrecoCarne(double precoCarne) {
        this.precoCarne = precoCarne;
    }

    public double getPrecoSalada() {
        return precoSalada;
    }

    public void setPrecoSalada(double precoSalada) {
        this.precoSalada = precoSalada;
    }
   
}
   
abstract class Precos extends Ingredientess{
    
    public double Molho (double valorMolho){
                 
        setPrecoMolho(valorMolho);
        return getPrecoMolho();
    }
      
        
    public double Queijo ( double valorQueijo){   
       setPrecoQueijo(valorQueijo);
       return getPrecoQueijo();
     
    }
    
    public double Carne (double valorCarne){
        setPrecoCarne(valorCarne);
        return getPrecoCarne();

    }
    
     public double Salada (double valorSalada){
        setPrecoSalada(valorSalada);
        return getPrecoSalada();
    }
}


class getIngredientes extends Precos{
    double precoLanche;
    public void montagem(){   
        
       this.precoLanche = getPrecoCarne() + getPrecoMolho() + getPrecoQueijo() + getPrecoSalada();
         
       //get para consultar os preços dos ingredientes
       System.out.println("Preço da carne: R$ " +getPrecoCarne());
       System.out.println("Preço do molho: R$ " +getPrecoMolho());
       System.out.println("Preço do queijo: R$ " +getPrecoQueijo());
       System.out.println("Preço da salada: R$ " + getPrecoSalada());
       System.out.println("Preço total dos ingredietntes: R$ "+ this.precoLanche);
         
        }
    }


