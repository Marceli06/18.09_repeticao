public class ExemplosBasicos{
    public static void main (String ... args){
        // ident (identação)
        // for, while e do/while
        // repetição controlada por contador
        // declarar o contador
        // int cont = 4;
        // while(cont <= 3) {//booleana
        //     System.out.println(cont);
        //     cont = cont + 1;
        // }
        // for(int cont = 1; cont <= 2; cont = cont + 1){
        //     System.out.println(cont);
        // }

        int a = 4, b = 0;
        do{
            //%d é um placeholder 
            System.out.printf(" Valor da vez: %d\n ", a,b);
            a += 1; //cont = cont + 1;
        }while (b <= 3);
    }
}
