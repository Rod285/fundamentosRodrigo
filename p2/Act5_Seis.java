import java.util.Scanner;

public class Act5_Seis {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        short nip = 0;
        short din, saldo;
        short usr[] = {1234, 10000};
        byte ext = 1;

        System.out.println("Introduzca tarjeta");
        while(nip != usr[0]){
            System.out.println("Introduzca NIP");
            nip = s.nextShort();
            if(nip == usr[0]){
                while(ext == 1){
                    System.out.println("Introduzca cantidad a retirar");
                    din = s.nextShort();
                    if(din <= usr[1]){
                        System.out.println("Transacción en proceso");
                        System.out.println("Imprimiendo ticket, retirelo al concluir");
                        saldo = (short) (usr[1] - din);
                        usr[1] = saldo;
                        System.out.println("Su saldo es $" + saldo);
                        System.out.println("Por favor tome su dinero, verifique que es la cantidad correcta");
                    }
                    else{
                        System.out.println("Saldo insuficiente");
                    }
                    System.out.println("¿Desea hacer otra transacción? Si = 1, No = 0");
                    ext = s.nextByte();
                }    
            }
            else{
                System.out.println("NIP Incorrecto");
            }
        }
        System.out.println("Retire su tarjeta, que tenga un buen día");   
    }
}