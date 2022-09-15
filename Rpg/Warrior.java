package rpg;

public class Warriors extends  Character {

    private int porcao;
    public Warrior(String nome) {
        super(nome,20,3,"normal",5);
        this.porcao = 1;
    }
    public void atacar(Monster monstro) {
        int hpMonstro =  monstro.getHp();
        if(getAtacar()  >=0) {
            monstro.setHp(( hpMonstro - this.getAtacar())) ;
        }else{
            hpMonstro = 0;
            monstro.setHp(hpMonstro);
        }
    }
    public void recuperarHP() {
        if(porcao> 0){
            int hpJogador =  super.getHp();
            if((hpJogador + 10)  <=20) { // Para quando se curar não passar de 20;
                hpJogador = hpJogador + 10;
            }else {
                hpJogador = 20;
                this.porcao= 0;
                super.setHp(hpJogador);
            }
        }
    }
    public void endurecer(Monster inimigo,int turno) {
        int poderM = super.getPoderMagico();
        if (turno == 1) { // obrigo ele a começar no turno 1 fortificado pela questão de não achar outra forma de parar o enfurecer
            if (poderM  >= 0) {
                poderM = poderM - 5;
                super.setStatus("Fortificado");
                super.setAtacar(super.getAtacar() + 2);
                super.setPoderMagico(poderM);
            } else  if ((turno) == 6) {
                super.setStatus("normal");
                super.setPoderMagico(3);
            }
        }
    }
    @Override
    public String toString(){
        return
                super.toString() +
                        "\nPorção de cura:" + this.porcao;//método para continuar atualizando caso tome uma porção

    }
}
