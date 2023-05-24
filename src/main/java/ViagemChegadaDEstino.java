public class ViagemChegadaDEstino implements ViagemEstado{
    private ViagemChegadaDEstino() {};
    private static ViagemChegadaDEstino instance = new ViagemChegadaDEstino();
    public static ViagemChegadaDEstino getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Chegada ao destino";
    }
}
