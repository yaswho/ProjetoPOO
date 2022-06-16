package inatel.br.cdg.Inimigo;

public abstract class Inimigo {

    int vida;
    int ataque;

    public Inimigo(int vida, int ataque) {
        this.vida = vida;
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
