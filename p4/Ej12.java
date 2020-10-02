public class Ej12 {
    public static void main(String[] args) {
    int i, md, dv, num, acum, aux;
	i = 1;
	long j = 0;
	acum = 0;
	num = 1;
    aux = num;
    
	while(j<6){
        while(i<num){
            md = num % aux;
			if (md==0){
                dv = num/aux;
				acum = acum+dv;
            }
			aux = aux-1;
			i = i+1;
        }
		if (acum == num){
			System.out.println(num + " Es un número perfecto");
			j = j+1;
        }
		acum = 0;
		i = 1;
		num = num + 1;
		aux = num;
        }
    }	
}