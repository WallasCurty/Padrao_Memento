import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private ViagemEstado estado;
    private List<ViagemEstado> memento = new ArrayList<>();


    public ViagemEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ViagemEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public List<ViagemEstado> getEstados() {
        return this.memento;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

}
