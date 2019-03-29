package interfazgrafica;

public class DosALaN implements Incrementable {
    public DosALaN() {
        cuenta = 2;
    }
    public int incrementar() {
        cuenta = cuenta * 2;
        return cuenta;
    }
    private int cuenta;
}
