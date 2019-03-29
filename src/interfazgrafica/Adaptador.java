package interfazgrafica;

public class Adaptador implements Incrementable, Seleccionable {
    private Incrementable incrementadorDeA1 = null;
    private Incrementable incrementadorDosAlan = null;
    private Incrementable elQueEstaSeleccionado = null;
    private int selector = 0;
            
    public Adaptador() {
        incrementadorDeA1 = new Contador();
        incrementadorDosAlan = new DosALaN();
        elQueEstaSeleccionado = incrementadorDeA1;
    }
    
    @Override
    public int incrementar() {
        return elQueEstaSeleccionado.incrementar();
    }

    @Override
    public void seleccionar(int x) {
        switch (x) {
            case 0:
                elQueEstaSeleccionado = incrementadorDeA1;
                break;
            case 1:
                elQueEstaSeleccionado = incrementadorDosAlan;
                break;
        }
    }
    
}
