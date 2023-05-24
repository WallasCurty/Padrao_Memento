public class ViagemProgramacao implements ViagemEstado{
    private ViagemProgramacao() {}
    private static ViagemProgramacao instance = new ViagemProgramacao();
    public static ViagemProgramacao getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em fase de programação";
    }
}
