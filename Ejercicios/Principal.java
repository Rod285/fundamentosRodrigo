public class Principal{
    int atributo1;
    int atributo2;

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int r;
        Boolean x= 5<2;
        Boolean y= 5>=5;
        Boolean z;
        z = x>z;
       
        System.out.println(z);

        procedimiento(a);
        r = funcion(b);
        System.out.println("r = " + r);
    }

    public static void procedimiento(int a){
        System.out.println("a = " + a);
    }

    public static int funcion(int b){
        return(b+5);
    }
}