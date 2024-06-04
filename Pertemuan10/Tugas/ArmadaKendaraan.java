import java.util.ArrayList;
import java.util.Collection;

public class ArmadaKendaraan {
    private ArrayList<Vehicle> daftarArmada;

    public ArmadaKendaraan() {
        daftarArmada = new ArrayList<>();
    }

    public void tambahArmada(Collection<? extends Vehicle> armada) {
        daftarArmada.addAll(armada);
    }

    public ArrayList<Vehicle> getAllArmada() {
        return daftarArmada;
    }


}
