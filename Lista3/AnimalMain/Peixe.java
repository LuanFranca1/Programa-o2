package animal;

public class Peixe extends Animal {
    protected String especie;
    public Peixe(String nome,String especie, double comprimento){
        this.nome = "Peixe";
        this.especie = "Tilapia";
        this. comprimento= 20;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void dados(){
        System.out.println("O "+ getNome() + "da espécie " + getEspecie()
                + "que tem  " + getComprimento() + "cm de comprimento");
    }

}
