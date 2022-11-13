


import java.util.Scanner;

abstract public class Tipo_Lanche {
    
    private String molhoCaesar;
    private String molhoBarbecue;
    private String molhoTomate;
    private String queijoPrato;
    private String queijoCheddar;
    private String carneFlango;
    private String queijoMozzarella;
    private String carnePelancaBovina;
    private String carneRato;
    private String carnepeixeGuanabara;
    private String saladaAlface;
    private String saladaTomate;
    private String saladaAzeitona;
    private String saladaPimentao;
    
     public String getMolhoCaesar() {
        return molhoCaesar;
    }

    public String getMolhoBarbecue() {
        return molhoBarbecue;
    }
   
    public String getMolhoTomate() {
        return molhoTomate;
    }
  
    public String getQueijoPrato() {
        return queijoPrato;
    }
  
    public String getQueijoCheddar() {
        return queijoCheddar;
    }
 
    public String getCarneFlango() {
        return carneFlango;
    }
  
    public String getQueijoMozzarella() {
        return queijoMozzarella;
    }
   
    public String getCarnePelancaBovina() {
        return carnePelancaBovina;
    }
   
    public String getCarneRato() {
        return carneRato;
    }
   
    public String getCarnepeixeGuanabara() {
        return carnepeixeGuanabara;
    }
   
    public String getSaladaAlface() {
        return saladaAlface;
    }
    
    public String getSaladaTomate() {
        return saladaTomate;
    }
  
    public String getSaladaAzeitona() {
        return saladaAzeitona;
    }
   
    public String getSaladaPimentao() {
        return saladaPimentao;
    }

    public void setMolhoCaesar(String Caesar) {    
        this.molhoCaesar = Caesar;
    }

    public void setMolhoBarbecue(String Barbecue) { 
        this.molhoBarbecue = Barbecue;
    }

    public void setMolhoTomate(String Tomate) {
        this.molhoTomate = Tomate;
    }

    public void setQueijoPrato(String Prato) {
        this.queijoPrato = Prato;
    }

    public void setQueijoCheddar(String Cheddar) {
        this.queijoCheddar = Cheddar;
    }

    public void setCarneFlango(String Flango) {
        this.carneFlango = Flango;
    }

    public void setQueijoMozzarella(String Mozzarella) {
        this.queijoMozzarella = Mozzarella;
    }

    public void setCarnePelancaBovina(String PelancaBovina) {
        this.carnePelancaBovina = PelancaBovina;
    }

    public void setCarneRato(String Rato) {
        this.carneRato = Rato;
    }

    public void setCarnepeixeGuanabara(String peixeGuanabara) {
        this.carnepeixeGuanabara = peixeGuanabara;
    }

    public void setSaladaAlface(String Alface) {
        this.saladaAlface = Alface;
    }

    public void setSaladaTomate(String saladadeTomate) {
        this.saladaTomate = saladadeTomate;
    }

    public void setSaladaAzeitona(String Azeitona) {
        this.saladaAzeitona = Azeitona;
    }

    public void setSaladaPimentao(String Pimentão) {
        this.saladaPimentao = Pimentão;
    }
}

    //Classe abstrata que receberá como parâmetro um ingrediente a ser adicionado ao lanche e retornará ao ingrediente mais o seu valor
class montaLanche extends Tipo_Lanche{
    String TipoMolho;
    String TipoQueijo;
    String TipoCarne;
    String TipoSalada;
    String lanche = "teste";
    String pizza = "Pizza";
    
    public String Lanche (){
        System.out.println(this.lanche);
        
        //do {
          //  Scanner lerLanche = new Scanner(System.in);
            //System.out.println("O lanche pedido é uma Pizza ou um Sanduíche? Por favor insira a resposta com o nome de um dos lanches:");
            //this.lanche = lerLanche.nextLine();
            //System.out.println(this.lanche);
            //}
       // while (!pizza.equals(lanche) );
        
        System.out.println(this.lanche);
        return this.lanche;  
        
    }
        
     public String Molho (String tipoMolho, double valorMolho){
         
      
        
         switch (tipoMolho){
            case "Caesar":
                setMolhoCaesar("Molho Caesar");  
                this.TipoMolho = getMolhoCaesar();
                break;
                
            case "Molhotomate":
                setMolhoTomate("Molho de tomate");  
                this.TipoMolho = getMolhoTomate();
                break;
                
                case "Barbecue":
                setMolhoBarbecue("Molho Barbecue");  
                this.TipoMolho = getMolhoBarbecue();
                break;
        }
        return TipoMolho;
    }
        
    public String Queijo (String tipoQueijo, double valorQueijo){
        switch (tipoQueijo){
                case "Prato":
                setQueijoPrato ("Queijo prato");  
                this.TipoQueijo = getQueijoPrato();
                break;
              
                case "Cheddar":
                setQueijoCheddar ("Queijo cheddar");  
                this.TipoQueijo = getQueijoCheddar();
                break;
           
                case "Mozzarella":
                setQueijoMozzarella ("Queijo mozzarella");  
                this.TipoQueijo = getQueijoMozzarella();
                break;
        }
        return TipoQueijo;
    }
    
    public String Carne (String tipoCarne, double valorCarne){
        switch (tipoCarne){     
                case "Flango":
                setCarneFlango ("Carne de flango");  
                this.TipoCarne = getCarneFlango();
                break;    
                
                case "Pelanca":
                setCarnePelancaBovina ("Pelanca bovina");  
                this.TipoCarne = getCarnePelancaBovina();
                break;     
                
                case "Rato":
                setCarneRato ("Carne de rato");  
                this.TipoCarne = getCarneRato();
                break;
                
                case "Peixe":
                setCarnepeixeGuanabara ("Carnepeixe da Guanabara");  
                this.TipoCarne = getCarnepeixeGuanabara();
                break;
                
        }
        return TipoCarne;
    }
    
     public String Salada (String tipoSalada, double valorSalada){
        switch (tipoSalada){
            case "Alface":
                setSaladaAlface("Salada de alface");  
                this.TipoSalada = getSaladaAlface();
                break;
                
            case "Tomate":
                setSaladaTomate("Salada de tomate");  
                this.TipoSalada = getSaladaTomate();
                break;
                
            case "Azeitona":
                setSaladaAzeitona("Salada de azeitona");  
                this.TipoSalada = getSaladaAzeitona();
                break;
                
            case "Pimentao":
                setSaladaPimentao("Salada de Pimentão");  
                this.TipoSalada = getSaladaPimentao();
                break;
        }    
        return TipoSalada;
     }
    
}
