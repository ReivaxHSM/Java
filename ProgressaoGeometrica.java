import javax.swing.JOptionPane;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        String menu = "*****************************  MENU  ************************************\n\n" +
                        "O que você deseja calcular?\n\n" +
                        "1 - O enésimo termo de uma Progressão Geométrica\n" +
                        "2 - A razão de uma Progressão Geométrica\n" +
                        "3 - O valor da posição n numa Progressão Geométrica\n" +
                        "4 - A soma dos termos de uma PG finita\n" +
                        "5 - O valor de a1 a partir da Soma dos Termos de uma PG\n" +
                        "6 - O valor da razão a partir da Soma dos Termos de uma PG\n" +
                        "7 - Digite esse número para sair\n" +
                   "\n****************************************************************************\n\n";
        String opcaoStr = JOptionPane.showInputDialog(menu); // Exibindo o menu e lendo a opção do usuário
        int opcao = Integer.parseInt(opcaoStr); // Convertendo a opção para inteiro
        double a1, n, an, sn; // Declarando as variáveis
        double q; // Declarando a variável para a razão
      
        switch (opcao) {
            case 1:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º termo da PG: ")); // Lendo o primeiro termo da PG
                q = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PG: ")); // Lendo a razão da PG
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição n desejadana PG ")); // Lendo o valor de n

                an = a1*Math.pow(q, n - 1); // Calculando o enésimo termo da PG

                JOptionPane.showMessageDialog(null, "O valor do termo na posição " + n + " é: " + an); // Exibindo o resultado
                break;

            case 2:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro termo da PG: "));  // Lendo o primeiro termo da PG
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição n da PG: "));   // Lendo o valor de n
                an = Integer.parseInt(JOptionPane.showInputDialog("Digite o enésimo termo da PG ")); // Lendo o enésimo termo da PG

                q = Math.pow((an / a1), (1.0) / (n - 1)); // Calculando a razão da PG
                q = Math.round(q * 100.0) / 100.0; // Arredondando para 2 casas decimais

                JOptionPane.showMessageDialog(null, "A razão da PG é: " + q); // Exibindo o resultado
                break;
            
            case 3:
                an = Integer.parseInt(JOptionPane.showInputDialog("Digite o enésimo termo da PG: "));  // Lendo o primeiro termo da PG
                q = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PG ")); // Lendo o enésimo termo da PG
                
                n = (Math.log(an)) / (Math.log(q)); // Calculando o valor da posição n da PG usando divisão de logaritmos
                n = Math.round(n); // Arredondando para 0 casas decimais
               
                JOptionPane.showMessageDialog(null, "O valor da posição n da PG é: " + n); // Exibindo o resultado
                break;
            
             case 4:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro termo da PG: "));  // Lendo o primeiro termo da PG
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição n da PG: "));   // Lendo o valor de n
                q = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PG ")); // Lendo o enésimo termo da PG

                sn = a1 * ((Math.pow(q, n) - 1) / (q - 1)); // Calculando a soma dos termos da PG
                sn = Math.round(sn * 100.0) / 100.0; // Arredondando para 2 casas decimais  
               

                JOptionPane.showMessageDialog(null, "A soma dos termos da PG é: " + sn); // Exibindo o resultado
                break;

            case 5:
                sn = Integer.parseInt(JOptionPane.showInputDialog("Digite a soma dos termos da PG: "));  // Lendo a soma dos termos da PG   
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição n da PG: "));   // Lendo o valor de n
                q = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PG ")); // Lendo o enésimo termo da PG

                a1 = sn * ((q - 1) / (Math.pow(q, n) - 1)); // Calculando o primeiro termo da PG
                a1 = Math.round(a1 * 100.0) / 100.0; // Arredondando para 2 casas decimais  
               

                JOptionPane.showMessageDialog(null, "O primeiro termo da PG é: " + a1); // Exibindo o resultado
                break;

            case 6:
                a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a o primeiro termo da PG: "));  // Lendo a soma dos termos da PG   
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição n da PG: "));   // Lendo o valor de n
                sn = Integer.parseInt(JOptionPane.showInputDialog("Digite a soma dos termos da PG ")); // Lendo o enésimo termo da PG

                q = Math.pow((sn / a1), (1.0) / (n - 1)); // Calculando a razão da PG
                q = Math.round(q); // Arredondando para 2 casas decimais  

                JOptionPane.showMessageDialog(null, "A razão da PG é: " + q); // Exibindo o resultado
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "Você escolheu sair do programa"); // Exibindo o resultado;
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida, escolha entre 1 e 6 no menu");
                break;
        }
    }
}