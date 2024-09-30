public class App {
    public static void main(String[] args) throws Exception {
        
        int n1 = 2;
        int n2 = 3;
        System.out.println(n1+n2);
        System.out.println(n1*n2);
        double n3 = (double) n1/n2;
        System.out.println(n3);
        System.out.println(n1*n2);
        double n4 = (double) n1 % n2;
        System.out.println(n4);
        float n5 = 0.5f;
        float n6 = 0.75f;
        System.out.println(n5+"+"+n6+"="+(n5+n6));
        System.out.println(n5+"+"+n6+"="+(n5-n6));
        float n7 = 10.0f;
        float n8 = 2.0f;
        System.err.println(n7 / n8);
        System.err.println(n7 * n8);
    }
}
