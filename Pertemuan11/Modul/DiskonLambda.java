interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args){
        // Tanpa Lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        // Dengan Lambda
        IDiskon diskonLebaran = (harga) -> (harga * 0.4);

        // Dengan Lambda Block Statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        int harga = 45000;
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(harga));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(harga));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(harga));
    }
}