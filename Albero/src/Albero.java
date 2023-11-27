import java.util.ArrayList;

public class Albero {
    private int elemento;
    private Albero destro;
    private Albero sinistro;

    public Albero(int elemento, Albero destro, Albero sinistro) {
        this.elemento = elemento;
        this.destro = destro;
        this.sinistro = sinistro;
    }

    public String stampa(int d) {
        String tab = "";

        for (int i = 0; i < d; i++) {
            tab += "\t";
        }

        tab += elemento + "";

        if (this.sinistro != null) {
            tab += "\n" + sinistro.stampa((d + 1));
        }

        if (this.destro != null) {
            tab += "\n" + destro.stampa((d + 1));
        }

        return tab;
    }

    public String stampa() {
        return this.stampa(0);
    }

    public int max() {
        int max = this.elemento;
        if (destro != null && max < destro.max()) {
            max = destro.max();
        }

        if (sinistro != null && max < sinistro.max()) {
            max = sinistro.max();
        }

        return max;
    }
}
