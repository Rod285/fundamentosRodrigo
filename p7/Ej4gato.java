import java.util.Scanner;

public class Ej4gato{

    static char tablero[][] = new char[3][3];

    public static void main(String[] args) {

        int ntusr = 0;
        int ntcpu = 0;
        int ntt = 0;
        int tiro[] = new int[2];
        Boolean gana = false;
        
        
        iniciaTablero();
        dibujaTablero();

        do{
            juegaUsuario(tiro);
            //actualizaTablero(tiro,'X');
            ntusr = ntusr + 1;
            gana = ganador(ntusr, "Usuario");
            if(gana == true){
                break;
            }
            juegaCPU(tiro);
            //actualizaTablero(tiro,'O');
            ntcpu = ntcpu + 1;
            gana = ganador(ntcpu, "CPU");
            if(gana == true){
                break;
            }
            dibujaTablero();
            ntt = ntt + 2;
        }while (ntt != 10);
        
        if (ntt == 10){
            System.out.println("No hay ganador");
        }
    }

    public static Boolean analiza(){
        Boolean Comp = false;
        int i = 0;
        int j = 0;
        
        for (i = 0; i < 3; i++){
            if (((tablero[i][0] != 219) && tablero[i][0] == tablero [i][1]) && (tablero [i][1] == tablero[i][2])){
                Comp = true;
                 //System.out.println(Comp + " Primer if");
                 break;
            }
        }

        for (j = 0; j < 3; j++){
            if (((tablero[0][j] != 219) && tablero[0][j] == tablero [1][j]) && (tablero [1][j] == tablero[2][j])){
                Comp = true;
                //System.out.println(Comp + " segundo if");
                break;
            }
        }

        if((((tablero[0][0] != 219) && tablero[0][0] == tablero[1][1]) && (tablero[1][1] == tablero[2][2])) || ((tablero[0][2] != 219) && (tablero[0][2] == tablero[1][1]) && (tablero[1][1] == tablero[2][0]))){
            Comp = true;
            //System.out.println(Comp + " diagonal");
        }

        return Comp;
    }
 
    public static void juegaCPU(int tiro[]){
        Boolean ocupado = true;
        do{
            tiro[0]=(int)(Math.random()*2);
            tiro[1]=(int)(Math.random()*2);
            ocupado = valtiro(tiro);
        }while(ocupado != false);
        
        actualizaTablero(tiro, 'O');  
        //generar fila y columna aleatorias, localidades descupadas.
    }

    public static void actualizaTablero(int tiro[],char c){

        if((tablero[tiro[0]][tiro[1]] != 'X') && (tablero[tiro[0]][tiro[1]] != 'O')){
            tablero[tiro[0]][tiro[1]] = c;        
        }   
    }

    public static void juegaUsuario(int tiro[]){
        Scanner sc = new Scanner(System.in);
        Boolean ocupado = true;

        System.out.println("Turno del usuario, Juega con X:");
        do{
            System.out.print("fil: ");
            tiro[0] = sc.nextInt();
            System.out.print("col: ");
            tiro[1] = sc.nextInt();
            ocupado = valtiro(tiro);
        }while(ocupado != false);
        
        actualizaTablero(tiro, 'X');

        //sc.close();
    }

    public static void dibujaTablero(){
        System.out.println("     c0   c1   c2 ");
        System.out.println("        |    |    ");
        System.out.println("f0   "+tablero[0][0]+"  | "+tablero[0][1]+"  | "+tablero[0][2]);
        System.out.println("    ____|____|____");
        System.out.println("        |    |    ");
        System.out.println("f1   "+tablero[1][0]+"  | "+tablero[1][1]+"  | "+tablero[1][2]);
        System.out.println("    ____|____|____");
        System.out.println("        |    |    ");
        System.out.println("f2   "+tablero[2][0]+"  | "+tablero[2][1]+"  | "+tablero[2][2]);
        System.out.println("        |    |    ");
    }

    public static void iniciaTablero(){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j] = 219;
            }
        }
    } 

    public static Boolean ganador(int cont, String jugador){
        Boolean gana = false;
        if (cont > 2){
            gana = analiza();
            if (gana == true){
                System.out.println("El ganador es " + jugador);
                dibujaTablero();
            }
        }
        return gana;
    }

    public static Boolean valtiro(int tiro[]){
        Boolean ocup = false;
        if((tablero[tiro[0]][tiro[1]] == 'X') || (tablero[tiro[0]][tiro[1]] == 'O')){
            ocup = true;        
        }
        return ocup; 
    }
}