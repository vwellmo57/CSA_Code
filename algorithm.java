class Bases
{
    public static void main(String[] args)
    {
            //tests
        String l1 = "01010101"; //base 2, 85
        String l2 = "123123123"; // base 4, 112347
        String l3 = "FFFF"; //base 16, 65535

        System.out.println(rebase(l1,2));
        System.out.println(rebase(l2,4));
        System.out.println(rebase(l3,16));
    }

    //symbols array
    private static final String SYMBOLS = "0123456789ABCDEF";

    //actual algorithm 
    public static long rebase(String number, int base)
    {
        long result = 0;
        int position = number.length(); //we start from the last digit in a String (lowest value)
        for (char ch : number.toCharArray())
        {
            int value = SYMBOLS.indexOf(ch);
            result += value * pow(base,--position); //this is your 1x2(pow 0)+0x2(pow 1)+0x2(pow 2)+1x2(pow 3)

        }
        return result;
    }

    //power - don't know if this is needed?
    private static long pow(int value, int x)
    {
        if (x == 0) return 1;
        return value * pow(value,x-1);
    }
}
