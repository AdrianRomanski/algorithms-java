package books.piotr_wroblewski.chapter_2;

public class BitOperations {

    public static void main(String[] args) {

        System.out.print("i\tbinarnie\tp.w lewo\tp.w prawo\tnegacja\n");
        for (int i=9; i<33; i++){
            System.out.printf(i+ "\t");
            showbits((char)i);  // reprezentacja binarna
            System.out.print("\t");

            int j= i << 1;  showbits((char)j); // przesunięcie o 1 bit w lewo
            System.out.print("\t");
            int h= i >> 1;  showbits((char)h); // przesunięcie o 1 bit w prawo
            System.out.print("\t");
            int k= ~i;      showbits((char)k); // negacja bitowa
            System.out.println("");
        }

    }

    static void showbits(char s){            // funkcja pokazuje reprezentację binarną znaku
        char wagi[]={1,2,4,8,16,32,64,128};  //  maska bitu wagi
        for(int i=7; i >= 0; i--) {
            int bit = (wagi[i] & s);
            if (bit !=0 )
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}

