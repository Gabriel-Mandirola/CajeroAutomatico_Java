package plata;

import java.util.Scanner;


public class MenuOpciones{
    
    Scanner entrada = new Scanner(System.in);
    
    
    
    Retiro mensajeroRetiro = new Retiro();
    
    Deposito mensajeroDeposito = new Deposito();
    
    GetSet MensajeroAlPedo = new GetSet();
    

    public void opciones(){
   
    int i = 0;
        
    do{       
        
        switch(i){
            case 0: System.out.println("Por favor seleccione una opcion");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Depósito de efectivo");
                    System.out.println("4. Salir");
                    i = entrada.nextInt();
                    break;
            case 1: 
                    System.out.print("Su saldo actual es de: ");
                    MensajeroAlPedo.setPlata(mensajeroRetiro.plata);
                    System.out.println(MensajeroAlPedo.getPlata());
                    System.out.println("Por favor seleccione una opcion");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Depósito de efectivo");
                    System.out.println("4. Salir");
                    i = entrada.nextInt();
                    
                    break;
            case 2: 
                    System.out.println("¿Cuanto queres retirar?");
                    mensajeroRetiro.retiro = entrada.nextInt();
                    mensajeroRetiro.Operacion();
                    System.out.println("Resitaste: " + mensajeroRetiro.retiro);
                    System.out.print("Tu saldo es: ");
                    mensajeroRetiro.MostrarPlata();
                    mensajeroDeposito.plata = mensajeroRetiro.plata;
               
                
                    System.out.println("Por favor seleccione una opcion");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Depósito de efectivo");
                    System.out.println("4. Salir");
                    i = entrada.nextInt();
                    break;
            case 3: 
                    System.out.println("¿Cuanto vas a depositar?");
                    mensajeroDeposito.deposito = entrada.nextInt();
                    mensajeroDeposito.Operacion();
                    System.out.println("Depositaste: " + mensajeroDeposito.deposito);
                    System.out.println("Tu saldo es: ");
                    mensajeroDeposito.MostrarPlata();
                    mensajeroRetiro.plata = mensajeroDeposito.plata;
                     
                     
                    System.out.println("Por favor seleccione una opcion");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Depósito de efectivo");
                    System.out.println("4. Salir");
                    i = entrada.nextInt();
                    break;
                   
        }
        
    }while(i != 4);
        System.out.println("Chau, nos vemos");
}
    
    
}