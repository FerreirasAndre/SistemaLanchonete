package lanche;

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
