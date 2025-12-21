package joobshet8.joobshet9.joobshet10;

public class Bioskop19 {

    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][1] = "Candra";
        penonton[2][0] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";

        for (String[] barisPenonton : penonton) {
            System.out.println("panjang baris: " + barisPenonton.length);
        }
        System.out.println("penonton pada baris ke-3: ");
        for (int i = 0; i < penonton.length; i++) {

            System.out.println(penonton[2][i]);
        }

        System.out.println(penonton.length);

        for (String[] barisPenonton : penonton) {
            System.out.println("panjang baris: " + barisPenonton.length);
            System.out.println("penonton pada baris ke-3: ");

            for (int i = 0; i < barisPenonton.length; i++) {
                System.out.println(penonton[2][i]);
            }
            
        }
        
    }
}
