import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060122130090", "Asta");
        mahasiswa.put("24060123120021", "Bronya");
        mahasiswa.put("2406012140132", "Clara");
        mahasiswa.put("24060122130083", "Dan Heng");

        mahasiswa.forEach((nim, nama) -> System.out.printf("NIM : %s\nNama: %s\n====================================\n", nim, nama));
    }
}
