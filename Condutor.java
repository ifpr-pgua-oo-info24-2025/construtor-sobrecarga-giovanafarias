public class Condutor {

    private String nome;
    private String numeroDaCNH;

    public Condutor (String nome, String numeroDaCNH){
        this.nome = nome;
        this.numeroDaCNH = numeroDaCNH;
    }

    public Condutor() {
        this.nome = "Não cadastrado";
        this.numeroDaCNH = "Não cadastrado";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String motoristaNome) {
        this.nome = motoristaNome;
    }

    public String getNumeroDaCNH() {
        return numeroDaCNH;
    }

    public void setNumeroDaCNH(String carroNumeroDaCNH) {
        this.numeroDaCNH = carroNumeroDaCNH;
    }

}