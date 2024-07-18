package funcoes.telefone;

public class telefone {
    private String numero;

    public void setLigar(String numero){
        this.numero = numero;
    }
    public String getLigar(){
        return numero;
    }

    public void atender(){
        System.out.println("Atendido");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciado");
    }
}