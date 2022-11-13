package lanche;

//Classe abstrata para montar ingredientes dos Lanches
abstract public class tipoLanche {
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
    private String lanche;
       
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

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }
        
}

