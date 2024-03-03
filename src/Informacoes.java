import java.util.Arrays;

public class Informacoes {


    private String ID;
    private String Nome;

    private String Cpf;

    private String Funcao;

    public Informacoes(String ID, String nome, String cpf, String funcao) {
        this.ID = ID;
        Nome = nome;
        Cpf = cpf;
        Funcao = funcao;
    }

    @Override
    public String toString() {
        return "Informacoes{" +
                "ID=" + ID +
                ", Nome='" + Nome + '\'' +
                ", Cpf='" + Cpf + '\'' +
                ", Funcao='" + Funcao + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String funcao) {
        Funcao = funcao;
    }
}
