public class ViagemInicio implements ViagemEstado {
    private ViagemInicio() {}
    private static ViagemInicio instance = new ViagemInicio();
    public static ViagemInicio getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Inicio da Viagem";
    }
}
