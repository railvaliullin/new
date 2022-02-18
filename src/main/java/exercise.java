public class exercise {
    public static void main(String[] args){
        int a, b, c;
        float d;
        byte e;
        boolean f = false, g = true;
        boolean h = false, i = false;
        a = 10;
        b = 50;
        c = 7;
        d = 86.5F;
        e = -128;
        a += e;
        b /= c %= e;
        System.out.println("a + b = " + (a + b));
        System.out.println("c - d = " + (c - d));
        System.out.println("a * b / e = " + (a * b / e));
        System.out.println("b / a % c = " + (b / a % c));
        System.out.println("e-- =" + (e--));
        System.out.println("--e =" + (--e));
        System.out.println("b == d =" + (b == d));
        System.out.println("c != e =" + (c != e));

        System.out.println("f && g && h = " + (f && g && h));
        System.out.println("g || h && i = " + (g || h && i) );
        System.out.println("!(h && i) || f = " + (!(h && i) || f));

        System.out.println("a += e =" + a);
        System.out.println("b /= c %= e =" + b);
    }
}
