package lanche;

import java.util.Scanner;

abstract class ingredientes {
    private double precoMolho;
    private double precoQueijo;
    private double precoCarne;
    private double precoSalada;
    private double valorTotal;     
        
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
   
}
   
abstract class PrecosIngredientes extends ingredientes{
    double valorMolho;
    double valorQueijo;
    double valorCarne;
    double valorSalada;
    
  
    public double PrecoMolho(String molho){
        switch (molho){
            case "Caesar":
                setPrecoMolho(1.0);
                this.valorMolho = getPrecoMolho();
                break;
                
            case "Molhotomate":
                setPrecoMolho(0.50);
                this.valorMolho = getPrecoMolho();
                break;
                
             case "Barbecue":
                setPrecoMolho(0.90);
                this.valorMolho = getPrecoMolho();
                break;
                      
        }
         return this.valorMolho;
     }   
    
     public double PrecoQueijo(String queijo){
        switch (queijo){
            case "Prato":
                setPrecoQueijo(0.50);
                this.valorQueijo = getPrecoQueijo();
                break;
                
            case "Cheddar":
                setPrecoQueijo(1.0);
                this.valorQueijo = getPrecoQueijo();
                break;
                
             case "Mozzarella":
                setPrecoQueijo(0.50);
                this.valorQueijo = getPrecoQueijo();
                break;
        }
        
        return this.valorQueijo;
    }
     
    public double PrecoCarne(String carne){
        switch (carne){
            case "Flango":
                setPrecoCarne(1.50);
                this.valorCarne = getPrecoCarne();
                break;
                
            case "Pelanca":
                setPrecoCarne(2.0);
                this.valorCarne = getPrecoCarne();
                break;
                
            case "Rato":
                setPrecoCarne(0.50);
                this.valorCarne = getPrecoCarne();
                break;
                
            case "Peixe":
                setPrecoCarne(1.0);
                this.valorCarne = getPrecoCarne();
                break;
        }
        return valorCarne;
    }
    public double PrecoSalada(String salada){
        switch (salada){
            case "Alface":
                setPrecoSalada(0.50);
                this.valorSalada = getPrecoSalada();
                break;
                
            case "Tomate":
                setPrecoSalada(1.0);
                this.valorSalada = getPrecoSalada();
                break;
                
            case "Azeitona":
                setPrecoSalada(0.75);
                this.valorSalada = getPrecoSalada();
                break;
                
            case "Pimentao":
                setPrecoSalada(0.75);
                this.valorSalada = getPrecoSalada();
                break;
        }
        return this.valorSalada;
    }
    
    public void pedido(String lanche){ //Método que calcula margem de lucro
        if (lanche.equals("Pizza")){
            setValorTotal(getValorTotal()*1.3);
        } else{
            setValorTotal(getValorTotal()*1.4);
        }
    } 
     
}
     


class valores extends PrecosIngredientes{
           
             //Método pedido (POLIMORFISMO)
    public void pedido(String lanche, String[] Pedido, double somaMolho, double somaQueijo, double somaCarne, double somaSalada){
      
        if (lanche.equals("Pizza")){
            setValorTotal((somaMolho + somaQueijo + somaCarne + somaSalada)*1.3);
        } else{
            setValorTotal((somaMolho + somaQueijo + somaCarne + somaSalada)*1.4);
            
        }
    }
    
    public void imprimiValor(){
           System.out.println("Valor do pedido:  R$ " + getValorTotal() );
    }
            
    public void menu(){
        String selecao = "null";
        String valor = "null";
        String Bin;
        double newValorDouble;
        String newValor;
        
        Scanner seletor = new Scanner(System.in);
        while(!selecao.equals("f") ) {
            System.out.println("\nPara finalizar o pedido digite (f):");
            System.out.println("Para consultar os valores de todos os ingredientes digite (t):");
            System.out.println("Para consultar o valor de um ingrediente específico (c):\n");
            selecao = seletor.nextLine();

            switch (selecao){
                case "t":
                    System.out.println("Valor dos ingredientes: Molho = R$ "+getPrecoMolho()+" Queijo = R$ "+getPrecoQueijo()+" Carne = R$ "+getPrecoCarne()+" Salada = R$ "+getPrecoSalada());
                    break;

                case "c":
                    Scanner select = new Scanner(System.in);
                    System.out.println("Digite o nome do ingrediente que deseja consultar (molho, queijo, carne, salada)");
                    valor = select.nextLine();
                    
                    switch (valor){
                        case "molho":
                            Scanner molho = new Scanner(System.in);
                            Scanner newmolho = new Scanner(System.in);
                            System.out.println("Valor do ingrediente R$ " + getPrecoMolho() + "\n");
                            System.out.println("Digite (s) ou (n) para alterar ou não o valor");
                            Bin = molho.nextLine();
                            
                            if (Bin.equals("s")){
                                System.out.println("Digite o novo valor para o ingrediente");
                                newValor = newmolho.nextLine();
                                newValorDouble = Double.parseDouble(newValor);
                                setPrecoMolho(newValorDouble);
                                System.out.println("Valor do ingrediente alterado para R$ " + getPrecoMolho());
                            }
                                                      
                            break;
                            
                        case "queijo":
                            Scanner queijo = new Scanner(System.in);
                            Scanner newqueijo = new Scanner(System.in);
                            System.out.println("Valor do ingrediente R$ " + getPrecoQueijo() + "\n");
                            System.out.println("Digite (s) ou (n) para alterar ou não o valor");
                            Bin = queijo.nextLine();
                            
                            if (Bin.equals("s")){
                                System.out.println("Digite o novo valor para o ingrediente");
                                newValor = newqueijo.nextLine();
                                newValorDouble = Double.parseDouble(newValor);
                                setPrecoQueijo(newValorDouble);
                                System.out.println("Valor do ingrediente alterado para R$ " + getPrecoQueijo());
                            }
                                                      
                            break;
                        
                        case "carne":
                            Scanner carne = new Scanner(System.in);
                            Scanner newcarne = new Scanner(System.in);
                            System.out.println("Valor do ingrediente R$ " + getPrecoCarne() + "\n");
                            System.out.println("Digite (s) ou (n) para alterar ou não o valor");
                            Bin = carne.nextLine();
                            
                            if (Bin.equals("s")){
                                System.out.println("Digite o novo valor para o ingrediente");
                                newValor = newcarne.nextLine();
                                newValorDouble = Double.parseDouble(newValor);
                                setPrecoCarne(newValorDouble);
                                System.out.println("Valor do ingrediente alterado para R$ " + getPrecoCarne());
                            }
                             break;
                                
                        case "salada":
                            Scanner salada = new Scanner(System.in);
                            Scanner newsalada = new Scanner(System.in);
                            System.out.println("Valor do ingrediente R$ " + getPrecoSalada() + "\n");
                            System.out.println("Digite (s) ou (n) para alterar ou não o valor");
                            Bin = salada.nextLine();
                            
                            if (Bin.equals("s")){
                                System.out.println("Digite o novo valor para o ingrediente");
                                newValor = newsalada.nextLine();
                                newValorDouble = Double.parseDouble(newValor);
                                setPrecoSalada(newValorDouble);
                                System.out.println("Valor do ingrediente alterado para R$ " + getPrecoSalada());
                            }
                                                      
                            break;                 
                            
                        
                    }
                    break;    
            }
        }
           
    }
}


   



