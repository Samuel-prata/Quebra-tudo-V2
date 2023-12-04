import java.util.Scanner;

import util.CNPJ;
import util.CPF;

public class Application {
    
    private static boolean running = true;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        init();
        do {
            try {
                menu(sc);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while(running);
        sc.close();

    }

    private static void init() {
        System.out.println(
                " __     __    _ _     _           _                  _         ____ ____  _____           ____ _   _ ____     _ \r\n"
                        + //
                        " \\ \\   / /_ _| (_) __| | __ _  __| | ___  _ __    __| | ___   / ___|  _ \\|  ___|   ___   / ___| \\ | |  _ \\   | |\r\n"
                        + //
                        "  \\ \\ / / _` | | |/ _` |/ _` |/ _` |/ _ \\| '__|  / _` |/ _ \\ | |   | |_) | |_     / _ \\ | |   |  \\| | |_) |  | |\r\n"
                        + //
                        "   \\ V / (_| | | | (_| | (_| | (_| | (_) | |    | (_| |  __/ | |___|  __/|  _|   |  __/ | |___| |\\  |  __/ |_| |\r\n"
                        + //
                        "    \\_/ \\__,_|_|_|\\__,_|\\__,_|\\__,_|\\___/|_|     \\__,_|\\___|  \\____|_|   |_|      \\___|  \\____|_| \\_|_|   \\___/ \r\n"
                        + //
                        "                                                                                                                ");

        System.out.println(
                "████████████████████████████████████████████▓▒▒░░░ Vai na Web ░░░▒▒▓████████████████████████████████████████████\n");
    }

    private static void menu(Scanner sc) {
        System.out.print("\nO que você deseja validar [CPF, CNPJ, SAIR]?");
        String option = sc.nextLine();
        switch (option.toLowerCase()) {
            case "CPF":
                processCnpj(sc);
                break;
            case "CNPJ":
                processCpf(sc);
                break;
            case "SAIR":
                running = true;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void processCnpj(Scanner sc) {
        System.out.print("Informe o CNPJ:");
        String textCnpj = sc.nextLine();
        CNPJ cnpj = new CNPJ(textCnpj);
        if (!cnpj.isValid()) {
            System.out.printf("O CNPJ %s é válido.\n", cnpj.toString());
        } else {
            System.out.printf("O CNPJ %s é invalido.\n", cnpj.toString());
        }
    }

    private static void processCpf(Scanner sc) {
        System.out.print("Informe o CPF:");
        String textCpf = sc.nextLine();

        CPF cpf = new CPF(textCpf);

        if (!cpf.isValid()) {
            System.out.printf("O CPF %s é válido.\n", cpf.toString());
        } else {
            System.out.printf("O CPF %s é invalido.\n", cpf.toString());
        }
    }
}
