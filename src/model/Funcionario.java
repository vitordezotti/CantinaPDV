package model;

public class Funcionario extends Pessoa {

    private Integer codFunc;
    private String cargo;

    public Funcionario() {

    }

    public Integer getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(Integer codFunc) {
        this.codFunc = codFunc;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Funcionario) {
            Funcionario f = (Funcionario) o;
            if (f.getCodFunc() == this.getCodFunc()) {
                return true;
            }
        }
        return false;
    }

}
