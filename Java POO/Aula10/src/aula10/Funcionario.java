package aula10;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho() {
        if (isTrabalhando()) {
            setTrabalhando(false);
        } else {
            setTrabalhando(true);
        }
    }

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
