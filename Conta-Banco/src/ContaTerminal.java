public class ContaTerminal {
        public static void main(String[] args) {
            // Primeira execução
            double saldo = 25.0;
            double valorSolicitado = 18.0;
    
            // Verifica se há saldo suficiente para o saque
            if (saldo >= valorSolicitado) {
                saldo = saldo - valorSolicitado;  // Atualiza o saldo após o saque
            } else {
                System.out.println("Saldo insuficiente");
            }
    
            // Imprime o saldo atual
            System.out.println("Saldo após a primeira operação: " + saldo);
    
            // Segunda execução
            saldo = 15.0;
            valorSolicitado = 22.0;
    
            // Verifica se há saldo suficiente para o saque
            if (saldo >= valorSolicitado) {
                saldo = saldo - valorSolicitado;  // Atualiza o saldo após o saque
            } else {
                System.out.println("Saldo insuficiente");
            }
    
            // Imprime o saldo atual após a segunda operação
            System.out.println("Saldo após a segunda operação: " + saldo);
        }
    }
    
