import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Discos> d = new ArrayList<Discos>();
        CDs cd = new CDs();
        Vinis v = new Vinis();

        System.out.println("--- BEM VINDO A LOJA DE DISCOS ---\n");

        System.out.println("---- LOGIN ----");
        System.out.println("Usuário:");
        String user = sc.nextLine();
        System.out.println("Senha:");
        String password = sc.nextLine();

        System.out.println("Insira o tipo de conta");
        System.out.println("1. Cliente\n2. Vendedor\n");
        int resposta = sc.nextInt();

        switch (resposta) {
            case 1:
                Cliente c = new Cliente();
                c.login(user, password);
                System.out.println("--- OLA CLIENTE " + user + " ---");
                boolean end = false;
                
                while (end != true){
                    boolean auxi = false;

                    while (auxi != true){
                        System.out.println("O que deseja comprar?");
                        System.out.println("1. Vinil\n2. CD\n3.Finalizar");
                        int tipo = sc.nextInt();
                        if (tipo == 1){
                            System.out.println("--- VINIL ---");
                            sc.nextLine();
                            System.out.println("Insira o nome do vinil");
                            v.setNome(sc.nextLine());
                            System.out.println("Insira o artista");
                            v.setArtista(sc.nextLine());
                            System.out.println("Voce deseja comprar um disco novo ou usado?");
                            System.out.println("1.Novo\n2.Usado");
                            int x = sc.nextInt();
                            if (x == 1){
                                v.setCondicao(true);
                            }
                            d.add(v);
                            auxi = true;
                        } else if (tipo == 2) {
                            System.out.println("--- CD ---");
                            sc.nextLine();
                            System.out.println("Insira o nome do CD");
                            cd.setNome(sc.nextLine());
                            System.out.println("Insira o artista");
                            cd.setArtista(sc.nextLine());
                            System.out.println("Voce deseja comprar o cd edicao Deluxe ou não?");
                            System.out.println("1.Deluxe\n2.Normal");
                            int x = sc.nextInt();
                            if (x == 1){
                                cd.setEdicao(true);
                            }
                            d.add(cd);
                            auxi = true;
                        } else if(tipo == 3){
                            System.out.println("-----Finalizando----");
                            end = true;
                        } else {
                            System.out.println("INSIRA UM NUMERO VALIDO");
                            auxi = false;
                        }
                    }
                    System.out.println("Efetuar nova compra?\n1.Sim\n2.Nao");
                    int tipo = sc.nextInt();
                    if (tipo == 1 ){
                        end = false;
                    } else if (tipo == 2){
                        end = true;
                    }

                }
                System.out.println("--- CARRINHO ---");
                for (int i = 0; i < d.size(); i++) {
                    System.out.println(d.get(i));
                }

                break;
        
            case 2:
            Vendedor ve = new Vendedor();
            ve.login(user, password);
            System.out.println("--- OLA VENDEDOR " + user + " ---");
            boolean fim = false;
                
                while (fim != true){
                    boolean auxi = false;

                    while (auxi != true){
                        System.out.println("Qual produto deseja registrar?");
                        System.out.println("1. Vinil\n2. CD\n3.Finalizar");
                        int tipo = sc.nextInt();
                        if (tipo == 1){
                            System.out.println("--- VINIL ---");
                            sc.nextLine();
                            System.out.println("Insira o nome do vinil");
                            v.setNome(sc.nextLine());
                            System.out.println("Insira o artista");
                            v.setArtista(sc.nextLine());
                            System.out.println("O vinil é novo ou usado?");
                            System.out.println("1.Novo\n2.Usado");
                            int x = sc.nextInt();
                            if (x == 1){
                                v.setCondicao(true);
                            }
                            System.out.println("Insira o preço do vinil");
                            v.setPreco(sc.nextDouble());
                            d.add(v);
                            auxi = true;
                        } else if (tipo == 2) {
                            System.out.println("--- CD ---");
                            sc.nextLine();
                            System.out.println("Insira o nome do CD");
                            cd.setNome(sc.nextLine());
                            System.out.println("Insira o artista");
                            cd.setArtista(sc.nextLine());
                            System.out.println("O CD é Deluxe ou não?");
                            System.out.println("1.Deluxe\n2.Normal");
                            int x = sc.nextInt();
                            if (x == 1){
                                cd.setEdicao(true);
                            }
                            System.out.println("Insira o preço do CD");
                            cd.setPreco(sc.nextDouble());
                            d.add(cd);
                            auxi = true;
                        } else if(tipo == 3){
                            System.out.println("-----Finalizando----");
                            fim = true;
                        } else {
                            System.out.println("INSIRA UM NUMERO VALIDO");
                            auxi = false;
                        }
                    }
                    System.out.println("Registrar novo produto?\n1.Sim\n2.Nao");
                    int tipo = sc.nextInt();
                    if (tipo == 1 ){
                        fim = false;
                    } else if (tipo == 2){
                        fim = true;
                    }

                }
                System.out.println("--- PRODUTOS ---");
                for (int i = 0; i < d.size(); i++) {
                    System.out.println(d.get(i));
                }
                break;
        }

    }


}
