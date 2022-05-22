package animal;

public class Mamifero extends Animal {
    protected String especie;
    protected String ambiente = "Terrestre";

    public Mamifero(String nome,String especie,double altura,String ambiente){
        this.nome = "Elefante";
        this.especie = "Elefante-indiano";
        this.altura = 6;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public void dados(){
        System.out.println("O "+ getNome() + "da espécie " + getEspecie() + "mede "
                + getAltura()+ "m de altura"+ "e vive no ambiente " + getAmbiente());

    }
}
