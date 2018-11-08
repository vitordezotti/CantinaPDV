package model;

import java.util.List;

public class Aluno extends Pessoa {

	private Integer codAluno;
	private String ra;
        private Float saldo;
	
	public Aluno() {
	}

	public Integer getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(Integer codAluno) {
		this.codAluno = codAluno;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

        public Float getSaldo() {
                return saldo;
        }

        public void setSaldo(Float saldo) {
                this.saldo = saldo;
        }

        public void add(List<Aluno> alunos) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
	
    /*            @Override
        public String toString() {
                return getRa();
        }*/

                @Override
        public boolean equals(Object o) {
            if (o instanceof Aluno) {
                Aluno a = (Aluno) o;
            if (a.getRa() == this.getRa()) {
                return true;
            }
        }
        return false;
    }
	
        
}
