package lanche;

import java.util.Arrays;
import java.util.Scanner;

class montaLanche extends tipoLanche{
    String TipoMolho = "null";
    String TipoQueijo = "null";
    String TipoCarne = "null";
    String TipoSalada = "null";

    boolean teste;
    String [] ListaLanches = new String[4];

    public String Lanche (){

        System.out.println(" SELECIONE AS OPÇÕES DESEJADAS NO MENU:\n");

        //Verificação de entradas
        while (this.teste == false) {
            Scanner lerLanche = new Scanner(System.in);
            System.out.println(" DIGITE O NOME DO ITEM PRINCIPAL DO PEDIDO (Pizza ou Lanche):");
            this.setLanche(lerLanche.nextLine());

            if (getLanche().equals("Pizza") || getLanche().equals("Lanche")){
                this.teste = true;
            }
        }
        this.teste = false;
        return this.getLanche();
    }

    public void Molho (){
        int cont =0;

        System.out.println(" \nDIGITE A OPÇÃO DE MOLHO DENTRE AS SEGUINTES OPÇÕES: Caesar, Molhotomate, Barbecue:\n");
        while (this.teste == false) {

            if (cont>0){
                System.out.println("Por favor digite uma opção válida!!!");
            }

            Scanner lerMolho = new Scanner(System.in);
            this.TipoMolho = lerMolho.nextLine();

            cont++;


            if (TipoMolho.equals("Caesar") || TipoMolho.equals("Molhotomate") || TipoMolho.equals("Barbecue")){
                this.teste = true;
            }
        }
        this.teste = false;

        switch (TipoMolho){
            case "Caesar":
                setMolhoCaesar("Molho Caesar");
                this.ListaLanches[0] = getMolhoCaesar();
                break;

            case "Molhotomate":
                setMolhoTomate("Molho de tomate");
                this.ListaLanches[0] = getMolhoTomate();

                break;

            case "Barbecue":
                setMolhoBarbecue("Molho Barbecue");
                this.ListaLanches[0] = getMolhoBarbecue();
                break;
        }
    }

    public void Queijo (){
        int cont =0;

        System.out.println(" \nDIGITE A OPÇÃO DE QUEIJO DENTRE AS SEGUINTES OPÇÕES: Prato, Cheddar, Mozzarella:\n");
        while (this.teste == false) {

            if (cont>0){
                System.out.println("Por favor digite uma opção válida!!!");
            }

            Scanner lerQueijo = new Scanner(System.in);
            this.TipoQueijo = lerQueijo.nextLine();
            cont++;

            if (TipoQueijo.equals("Prato") || TipoQueijo.equals("Cheddar") || TipoQueijo.equals("Mozzarella")){
                this.teste = true;
            }
        }
        this.teste = false;

        switch (TipoQueijo){
            case "Prato":
                setQueijoPrato ("Queijo prato");
                this.ListaLanches[1] = getQueijoPrato();
                break;

            case "Cheddar":
                setQueijoCheddar ("Queijo cheddar");
                this.ListaLanches[1] = getQueijoCheddar();
                break;

            case "Mozzarella":
                setQueijoMozzarella ("Queijo mozzarella");
                this.ListaLanches[1] = getQueijoMozzarella();
                break;
        }
    }

    public void Carne (){
        int cont =0;
        System.out.println(" \nDIGITE A OPÇÃO DE CARNE DENTRE AS SEGUINTES OPÇÕES: Flango, Pelanca, Rato, Peixe:\n");
        while (this.teste == false) {

            if (cont>0){
                System.out.println("Por favor digite uma opção válida!!!");
            }

            Scanner lerCarne = new Scanner(System.in);
            this.TipoCarne = lerCarne.nextLine();
            cont++;

            if (TipoCarne.equals("Pelanca") || TipoCarne.equals("Flango") || TipoCarne.equals("Rato")|| TipoCarne.equals("Peixe")){
                this.teste = true;
            }
        }
        this.teste = false;

        switch (TipoCarne){
            case "Flango":
                setCarneFlango ("Carne de flango");
                this.ListaLanches[2] = getCarneFlango();
                break;

            case "Pelanca":
                setCarnePelancaBovina ("Pelanca bovina");
                this.ListaLanches[2] = getCarnePelancaBovina();
                break;

            case "Rato":
                setCarneRato ("Carne de rato");
                this.ListaLanches[2] = getCarneRato();
                break;

            case "Peixe":
                setCarnepeixeGuanabara ("Peixe da Guanabara");
                this.ListaLanches[2] = getCarnepeixeGuanabara();
                break;
        }
    }
    public void Salada (){
        int cont =0;

        System.out.println(" \nDIGITE A OPÇÃO DE SALADA DENTRE AS SEGUINTES OPÇÕES: Alface, Tomate, Azeitona, Pimentão:\n");
        while (this.teste == false) {

            if (cont>0){
                System.out.println("Por favor digite uma opção válida!!!");
            }

            Scanner lerSalada = new Scanner(System.in);
            this.TipoSalada = lerSalada.nextLine();
            cont++;

            if (TipoSalada.equals("Alface") || TipoSalada.equals("Tomate") || TipoSalada.equals("Azeitona")|| TipoSalada.equals("Pimentao")){
                this.teste = true;
            }
        }

        switch (TipoSalada){
            case "Alface":
                setSaladaAlface("Salada de alface");
                this.ListaLanches[3] =getSaladaAlface();
                break;

            case "Tomate":
                setSaladaTomate("Salada de tomate");
                this.ListaLanches[3] = getSaladaTomate();
                break;

            case "Azeitona":
                setSaladaAzeitona("Salada de azeitona");
                this.ListaLanches[3] = getSaladaAzeitona();
                break;

            case "Pimentao":
                setSaladaPimentao("Salada de Pimentão");
                this.ListaLanches[3] = getSaladaPimentao();
                break;
        }
    }

    public void verLanche(){
        System.out.println("\nPedido selecionado: " + getLanche());
        System.out.println("Ingredientes: " + Arrays.toString(this.ListaLanches));

    }
}

