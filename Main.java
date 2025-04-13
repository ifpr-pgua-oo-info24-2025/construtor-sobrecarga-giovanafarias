import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Carro carroInstancia = new Carro();
        Motor motorInstancia = new Motor();
        Condutor condutorInstancia = new Condutor();
        
        Scanner scan = new Scanner(System.in);
        int op = -1, ans = 0;

        do {
            menu();
            op = scan.nextInt();
            scan.nextLine();

            switch (op){
                case 1:
                    System.out.println("> Marca: ");
                    carroInstancia.setMarca(scan.nextLine());

                    System.out.println("> Modelo: ");
                    carroInstancia.setModelo(scan.nextLine());

                    System.out.println("> Placa: ");
                    carroInstancia.setPlaca(scan.nextLine());

                    System.out.println("Gostaria de cadastrar o motor agora? 1) Sim, 2) Não ");
                    ans = scan.nextInt();
                    scan.nextLine();

                    if(ans == 1) {
                        System.out.println("> Tipo do motor: ");
                        motorInstancia.setTipo(scan.nextLine());
                    
                        System.out.println("> Potência do motor: ");
                        motorInstancia.setPotencia(scan.nextInt());
                        scan.nextLine();
                    } else {
                        System.out.println("Ok, você poderá cadastrar depois!");
                    }

                    carroInstancia.setMotor(motorInstancia);

                    System.out.println("Gostaria de cadastrar o condutor agora? 1) Sim, 2) Não ");
                    ans = scan.nextInt();
                    scan.nextLine();
        
                    if(ans == 1) {
                        System.out.println("> Nome do condutor: ");
                        condutorInstancia.setNome(scan.nextLine());
                        System.out.println("> Nº da CNH do condutor: ");
                        condutorInstancia.setNumeroDaCNH(scan.nextLine());
                    } else {
                        System.out.println("Ok, você poderá cadastrar depois!");
                    }

                    carroInstancia.setCondutor(condutorInstancia);
                    break;
                    
                case 2:
                    if(motorInstancia.getTipo().equals("Não cadastrado")) {
                        System.out.println("Adicione um tipo de motor! \n> ");
                        motorInstancia.setTipo(scan.nextLine());
                        System.out.println("Tipo adicionado com sucesso!");
                    } else {
                        System.out.println("Deseja atualizar o tipo do motor? 1) Sim, 2) Não \n");
                        ans = scan.nextInt();
                        scan.nextLine(); 
                        if(ans == 1){
                            System.out.println("Digite o novo tipo de motor: \n");
                            motorInstancia.setTipo(scan.nextLine());
                            System.out.println("Tipo atualizado com sucesso!");
                        }
                    }

                    if(motorInstancia.getPotencia() == (-1)) {
                        System.out.println("Adicione uma potência do motor! \n> ");
                        motorInstancia.setPotencia(scan.nextInt());
                        System.out.println("Potência adicionada com sucesso!");
                    } else {
                        System.out.println("Deseja atualizar a potência do motor? 1) Sim, 2) Não \n");
                        ans = scan.nextInt();
                        scan.nextLine(); 
                        if(ans == 1){
                            System.out.println("Digite a nova potência do motor: \n");
                            motorInstancia.setPotencia(scan.nextInt());
                            System.out.println("Potência atualizada com sucesso!");
                        }
                    }

                    carroInstancia.setMotor(motorInstancia);
                    break;

                case 3:
                    if(condutorInstancia.getNome().equals("Não cadastrado")) {
                        System.out.println("Adicione um nome de Condutor! \n> ");
                        condutorInstancia.setNome(scan.nextLine());
                        System.out.println("Nome adicionado com sucesso!");
                    } else {
                        System.out.println("Deseja atualizar o nome do condutor? 1) Sim, 2) Não \n");
                        ans = scan.nextInt();
                        scan.nextLine(); 
                        if(ans == 1){
                            System.out.println("Digite o novo nome de Condutor: \n");
                            condutorInstancia.setNome(scan.nextLine());
                            System.out.println("Nome atualizado com sucesso!");
                        }
                    }

                    if(condutorInstancia.getNumeroDaCNH().equals("Não cadastrado")) {
                        System.out.println("Adicione o Nº da CNH de Condutor! \n> ");
                        condutorInstancia.setNumeroDaCNH(scan.nextLine());
                        System.out.println("Nº da CNH adicionado com sucesso!");
                    } else {
                        System.out.println("Deseja atualizar o Nº da CNH do condutor? 1) Sim, 2) Não \n");
                        ans = scan.nextInt();
                        scan.nextLine(); 
                        if(ans == 1){
                            System.out.println("Digite o novo Nº da CNH de Condutor: \n");
                            condutorInstancia.setNumeroDaCNH(scan.nextLine());
                            System.out.println("Nº da CNH atualizado com sucesso!");
                        }
                    }

                    carroInstancia.setCondutor(condutorInstancia);
                    break;

                case 4:
                    System.out.println("DADOS DO CARRO!!!\n" + carroInstancia.toString());
                    break;

                case 0:
                    break;
            }

        } while(op != 0);

        scan.close();
    }

    public static void menu() {
        System.out.println("-------------------------------\n");
        System.out.println("------   MENU DO CARRO   ------\n");
        System.out.println("-------------------------------\n");
        System.out.println("-----  1) Cadastrar carro -----\n");
        System.out.println("-----  2) Atualizar motor -----\n");
        System.out.println("-----  3) Trocar condutor -----\n");
        System.out.println("-----  4) Listar dados    -----\n");
        System.out.println("-----  0) Sair            -----\n");
        System.out.println("-------------------------------\n");
    }
}
