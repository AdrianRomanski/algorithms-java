package books.piotr_wroblewski.chapter_2;

public class PrimitiveToBits {




    public static void main(String[] args) {

        System.out.println(showBitsForByte((byte) -128));
        System.out.println(showBitsForByte((byte) 127));

        System.out.println(showBitsForChar('a'));
        System.out.println(showBitsForChar('b'));

        System.out.println(showBitsForShort((short) -32768));
        System.out.println(showBitsForShort((short) 32767));

        System.out.println(showBitsForInt(Integer.MAX_VALUE));
        System.out.println(showBitsForInt(Integer.MIN_VALUE));

        System.out.println(showBitsForLong(Long.MAX_VALUE));
        System.out.println(showBitsForLong(Long.MIN_VALUE));

    }

    // 8 bit
    static String showBitsForByte(byte b)  {
        StringBuilder sb = new StringBuilder();
        sb.append(b).append(" in binary: ");
        int count = 0;
        byte[] mask = {1,2,4,8,16,32,64,-128};
        for(int i=7; i >= 0; i--) {
            int bit = (mask[i] & b);
            count++;
            if(bit != 0)
                sb.append(1);
            else
                sb.append(0);
            if(count % 4 == 0)
                sb.append(" ");
        }
        return sb.toString();
    }


    // 16 bit
    static String showBitsForChar(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(" in binary: ");
        int count = 0;
        char[] mask = {1,2,4,8, 16,32,64,128, 256,512,1024,2048, 4096,8192,16384,32768};
        for(int i = 15; i >= 0; i--) {
            int bit = (mask[i] & c);
            count++;
            if(bit != 0)
                sb.append(1);
            else
                sb.append(0);
            if(count % 4 == 0)
                sb.append(" ");

        }
        return sb.toString();
    }

    // 16 bit
    static String showBitsForShort(short s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s).append(" in binary: ");
        int count = 0;
        short[] mask = {1,2,4,8, 16,32,64,128, 256,512,1024,2048, 4096,8192,16384,-32768};
        for(int i = 15; i >= 0; i--) {
            int bit = mask[i] & s;
            count++;
            if(bit != 0)
                sb.append(1);
            else
                sb.append(0);
            if(count % 4 == 0)
                sb.append(" ");
        }
        return sb.toString();
    }


    // 32 bit
    static String showBitsForInt(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number).append(" in binary ");
        int count = 0;
        int[] mask = {1,2,4,8, 16,32,64,128, 256,512,1024,2048, 4096,8192,16384,32768, 65536,131072,262144,524288,
                1048576,2097152,4194304,8388608, 16777216,33554432,67108864,134217728, 268435456,536870912,1073741824,-2147483648};
        for(int i = 31; i >=0; i--) {
            int bit = mask[i] & number;
            count++;
            if(bit != 0)
                sb.append(1);
            else
                sb.append(0);
            if(count % 4 == 0)
                sb.append(" ");
        }
        return sb.toString();
    }

    // 64 bit
    static String showBitsForLong(long number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number).append(" in binary ");
        int count = 0;
        long[] mask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824,
                2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L,
                35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L,
                72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 1152921504606846976L, 2305843009213693952L, 4611686018427387904L, -9223372036854775808L};
        for(int i = 63; i >=0; i--) {
            long bit = mask[i] & number;
            count++;
            if(bit != 0)
                sb.append(1);
            else
                sb.append(0);
            if(count % 4 == 0)
                sb.append(" ");
        }
        return sb.toString();
    }


}
