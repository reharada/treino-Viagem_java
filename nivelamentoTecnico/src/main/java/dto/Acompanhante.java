package dto;

public class Acompanhante {
    private String nome;
    private boolean confirmouCadastro;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome =  nome;
    }

    //usar is ao inves de get porque esta fazendo uma pergunta
    public boolean isConfirmouCadastro(){
        return this.confirmouCadastro;
    }

    public void setConfirmouCadastro(boolean confirmouCadastro){
        this.confirmouCadastro = confirmouCadastro;
    }
}
