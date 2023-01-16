public class LiveCoding1D {
    public static void main(String[] args) {
       int[] angka = new int[3];
       String[] nama = new String[4];

       angka[0] = 2;
       angka[2] = 4;

       int s = angka[2];

       nama[2] = "Udi";
       nama[3] = "Asi";

       String u = nama[2];
       String t = nama[3];

       int[] number = {1, 45, 7, 34, 89, 12};
       for (int index=0;index<number.length;index++){
           System.out.println("Angka dalam Array Number = " + number[index]);
       }
    }
}