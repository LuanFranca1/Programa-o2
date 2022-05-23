package rpg;

public abstract class Character  {

    protected double hp;
    protected int ataque;
    protected String status;
    protected int poderMagic;
    //movimento
    protected String atacar;
//    public Character(double hp,int ataque, String status,
//                     int poderMagic, String atacar) {
//        this.hp = hp;
//        this.ataque = ataque;
//        this.status = status;
//        this.poderMagic = poderMagic;
//        this.atacar = atacar;
//    }
    public double getHp() {
        return hp;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getPoderMagic() {
        return poderMagic;
    }
    public void setPoderMagic(int poderMagic) {
        this.poderMagic = poderMagic;
    }
    public String getAtacar() {
        return atacar;
    }
    public void setAtacar(String atacar) {
        this.atacar = atacar;
    }
}
