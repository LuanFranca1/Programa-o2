package rpg;

public class Monster extends Character {

    public Monster(String nome) {
        super(nome, 24, 4, "normal", 6);
    }
    public void atacar(Warrior jogador) {
        int hpJogador =  jogador.getHp();
        if (getAtacar()  >= 0) {
            jogador.setHp( hpJogador - this.getAtacar());
        } else {
            hpJogador = 0;
            jogador.setHp(hpJogador);
        }
    }
    public void recuperarHP() {
        int hpMonstro =  super.getHp();
        if ((hpMonstro + 2) > 24){
            hpMonstro = 24;
    }else{
        hpMonstro = hpMonstro + 2;
        super.setPoderMagico(super.getPoderMagico() - 1);
        super.setHp(hpMonstro);
    }
}
    public void endurecer(Warrior jogador, int turno) {
        if (turno == 1) {
            int poderM = super.getPoderMagico();
            if (poderM >= 0){
                poderM = poderM - 2;
                super.setStatus("Fortificado");
                super.setAtacar(super.getAtacar()+2);
                super.setPoderMagico(poderM);
            }
        }else if (turno == 4) {
            super.setStatus("Normal");
            super.setPoderMagico(getPoderMagico() -2);
        }
    }
}
