public class ViagemEmRota implements ViagemEstado {
    private ViagemEmRota() {}
    private static ViagemEmRota instance = new ViagemEmRota();
    public static ViagemEmRota getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em rota para chegar no destino da viagem";
    }
}
