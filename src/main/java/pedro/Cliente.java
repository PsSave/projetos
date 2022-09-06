package pedro;


public class Cliente {
    private String nome;
    private String cpf;
    private String profissão;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getProfissao(){
        return profissão;
    }
    public void setProfissao(String profissão){
        this.profissão = profissão;
    }
}
