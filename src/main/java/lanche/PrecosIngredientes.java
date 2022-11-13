package lanche;

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

