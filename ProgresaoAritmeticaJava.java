import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String menu = "**************************  MENU  ******************************\n\n" +
                "O que você deseja calcular?\n\n" +
                "1 - O enésimo termo de uma Progressão Aritmética\n" +
                "2 - A razão de uma Progressão Aritmética\n" +
                "3 - O valor de n numa Progressão Aritmética\n" +
                "4 - A soma dos termos de uma PA\n" +
                "5 - O valor de an e da razão a partir da Somda dos termos de uma PA\n" +
                "\n*******************************************************************\n\n";
        String opcaoStr = JOptionPane.showInputDialog(menu);
        int opcao = Integer.parseInt(opcaoStr);
        int a1, n, r, an, sn;

        switch (opcao) {
            case 1:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                r = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PA: "));
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo da sequência da PA que deseja conhecer: "));

                an = a1 + (n - 1) * r;

                JOptionPane.showMessageDialog(null, "O valor do " + n + "º termo da PA é " + an);
                break;

            case 2:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                an = Integer.parseInt(JOptionPane.showInputDialog("Digite o enésimo termo da PA: "));
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da PA: "));

                r = (an - a1) / (n - 1);

                JOptionPane.showMessageDialog(null, "O valor da razão é " + r);
                break;

            case 3:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                an = Integer.parseInt(JOptionPane.showInputDialog("Digite o enésimo termo da PA: "));
                r = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PA: "));

                n = ((an - a1) / (r)) + 1;

                JOptionPane.showMessageDialog(null, "O valor de n corresponde " + n + " na sequência");
                break;

            case 4:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                r = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PA: "));
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição n da PA: "));

                an = a1 + (n - 1) * r;
                sn = ((a1 + an) * n) / 2;

                JOptionPane.showMessageDialog(null, "O valor da soma dos " + n + " primeiros números da PA é " + sn);
                break;

            case 5:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição n da PA: "));
                sn = Integer.parseInt(JOptionPane.showInputDialog("Digite a soma dos termos da PA: "));

                an = ((2 * sn - n * a1)) / (n);
                r = (an - a1) / (n - 1);

                JOptionPane.showMessageDialog(null, "an = " + an);
                JOptionPane.showMessageDialog(null, "razão = " + r);

                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida, escolha entre 1 e 5 no menu");
        }
    }
}