package percabangan;

public class PercabanganIfElseFalse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");
        }else{
            System.out.println("Uang cukup, berelaan lah");
        }
    }
}
