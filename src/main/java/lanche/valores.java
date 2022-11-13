package lanche;

import java.util.Scanner;
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
