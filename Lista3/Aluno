
package aluno;

public class Aluno {

    private double nota1;
    private double nota2;

    public Aluno() {
        super();
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calculaMedia() {
        double m = (this.nota1 + this.nota2) / 2;
        return m;
    }

    public double precisaFinal() {
        double pf;
        if(calculaMedia()>= 7){
            return 0;
        }else  pf = 10 - calculaMedia();

        return pf;
    }

}

