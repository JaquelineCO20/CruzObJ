public class App {
    public static void main(String[] args) throws Exception {
        int a=1,b=2,c=10,Suma,iterador=0;
        System.out.println(a);
        System.out.println(b);
        while (iterador<c)
        {
            Suma= a+b;
            System.out.println(Suma);
            a=b;
            b=Suma;
            iterador++;
        }   
     }
}