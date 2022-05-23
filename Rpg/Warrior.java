package rpg;

public class Warriors extends  Character {

    protected int porcao;

    public Warriors(int hp, int ataque, String status, int poderMagic, String atacar,int porcao) {
        this.hp = 20;
        this.ataque = 3;
        this.status = "normal";
        this.poderMagic = 5;
        this.porcao = 1;

    }
    public int getPorcao() {
        return porcao;
    }

    public void setPorcao(int porcao) {
        this.porcao = porcao;
    }
    public void atacar() {
    

    }

    public void recuperarHP() {

    }

    public void fortificar() {

    }
}
