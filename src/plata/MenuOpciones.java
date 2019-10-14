package plata;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MenuOpciones{
    
    Scanner entrada = new Scanner(System.in);
    
    
    
    Retiro mensajeroRetiro = new Retiro();
    
    Deposito mensajeroDeposito = new Deposito();
    
    GetSet MensajeroGetSet = new GetSet();
    

    public void opciones(){
   
    int i = 0;
        
    do{       
        
        switch(i){
            case 0: 
                    i = Integer.parseInt(JOptionPane.showInputDialog
                    ("Por favor seleccione una opción \n" +
                    "1. Consulta de saldo \n" +
                    "2. Retiro de efectivo \n"+
                    "3. Depósito de efectivo \n" +
                    "4. Salir"        )) ;
                
                
                
                
                
                    /*System.out.println("Por favor seleccione una opcion");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Depósito de efectivo");
                    System.out.println("4. Salir");
                    i = entrada.nextInt();*/
                    break;
            case 1: 
                
                    MensajeroGetSet.setPlata(mensajeroRetiro.plata);
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + MensajeroGetSet.getPlata());
                
                
                
                
                    
                    /*System.out.print("Su saldo actual es de: ");
                    MensajeroGetSet.setPlata(mensajeroRetiro.plata);
                    System.out.println(MensajeroGetSet.getPlata());*/
                    
                    i = Integer.parseInt(JOptionPane.showInputDialog
                    ("Por favor seleccione una opción \n" +
                    "1. Consulta de saldo \n" +
                    "2. Retiro de efectivo \n"+
                    "3. Depósito de efectivo \n" +
                    "4. Salir"        )) ;
                    
                    /*System.out.println("Por favor seleccione una opcion");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Depósito de efectivo");
                    System.out.println("4. Salir");
                    i = entrada.nextInt();*/
                    
                    break;
            case 2: 
                
                    mensajeroRetiro.retiro = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto queres retirar?"));
                    mensajeroRetiro.Operacion();
                    JOptionPane.showMessageDialog(null, "Retiraste: " + mensajeroRetiro.retiro);
                    mensajeroRetiro.MostrarPlata();
                    mensajeroDeposito.plata = mensajeroRetiro.plata;
                    
                    /*System.out.println("¿Cuanto queres retirar?");
                    mensajeroRetiro.retiro = entrada.nextInt();
                    mensajeroRetiro.Operacion();
                    System.out.println("Resitaste: " + mensajeroRetiro.retiro);
                    System.out.print("Tu saldo es: ");
                    mensajeroRetiro.MostrarPlata();
                    mensajeroDeposito.plata = mensajeroRetiro.plata;*/
               
                    i = Integer.parseInt(JOptionPane.showInputDialog
                    ("Por favor seleccione una opción \n" +
                    "1. Consulta de saldo \n" +
                    "2. Retiro de efectivo \n"+
                    "3. Depósito de efectivo \n" +
                    "4. Salir"        )) ;
                    
                    /*System.out.println("Por favor seleccione una opcion");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Depósito de efectivo");
                    System.out.println("4. Salir");
                    i = entrada.nextInt();*/
                    break;
            case 3: 
                    
                    mensajeroDeposito.deposito = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto vas a depositar?"));
                    mensajeroDeposito.Operacion();
                    JOptionPane.showMessageDialog(null, "Depositaste: " + mensajeroDeposito.deposito);
                    mensajeroDeposito.MostrarPlata();
                    mensajeroRetiro.plata = mensajeroDeposito.plata;
                    
                    
                    
                    /*System.out.println("¿Cuanto vas a depositar?");
                    mensajeroDeposito.deposito = entrada.nextInt();
                    mensajeroDeposito.Operacion();
                    System.out.println("Depositaste: " + mensajeroDeposito.deposito);
                    System.out.println("Tu saldo es: ");
                    mensajeroDeposito.MostrarPlata();
                    mensajeroRetiro.plata = mensajeroDeposito.plata;*/
                     
                    i = Integer.parseInt(JOptionPane.showInputDialog
                    ("Por favor seleccione una opción \n" +
                    "1. Consulta de saldo \n" +
                    "2. Retiro de efectivo \n"+
                    "3. Depósito de efectivo \n" +
                    "4. Salir"        )) ;
                    
                    /*System.out.println("Por favor seleccione una opcion");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Depósito de efectivo");
                    System.out.println("4. Salir");
                    i = entrada.nextInt();*/
                    break;
                   
        }
        
    }while(i != 4);
        JOptionPane.showMessageDialog(null, "Chau, nos vemos");
        //System.out.println("Chau, nos vemos");
}
    
    
}