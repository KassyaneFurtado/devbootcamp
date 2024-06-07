public class Cliente {
    int agencia = 123;
    int conta = 4345;
    double saldo = 0.0;
    
    public void criarConta(){
        conta++;
    }
    
    public int exibirAgencia(){
        return agencia;
    }
}
