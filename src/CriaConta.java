public class CriaConta {
    public static void main(String[] args) {
        Cliente marcos = new Cliente("Marcos Oliveira", "885.452.857-56", "Programador");
        Conta primeiraConta = new Conta(48,333,1000, marcos);

        Cliente matheus = new Cliente("Matheus Oliveira", "045.551.289-99", "Estudante");
        Conta segundaConta = new Conta(48,333,0, matheus);

        primeiraConta.saca(100);

        if(primeiraConta.transfere(200, segundaConta)) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência não realizada!");
        }

        System.out.println("Agencia: " + primeiraConta.getAgencia());
        System.out.println("Numero: " + primeiraConta.getNumero());
        System.out.println("Saldo: " + primeiraConta.getSaldo());
        System.out.println("Titular: " + primeiraConta.getTitular().getNome());
        System.out.println("CPF: " + primeiraConta.getTitular().getCpf());
        System.out.println("Profissão: " + primeiraConta.getTitular().getProfissao());

        System.out.println("----------------------");
        System.out.printf("Total de conta %d", Conta.getTotal());

    }
}
