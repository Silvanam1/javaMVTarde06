package interfazgrafica;

public class Contador implements Incrementable {
    public int incrementar() {
        ++cuenta;
        return cuenta;
    }
    private int cuenta;
}
