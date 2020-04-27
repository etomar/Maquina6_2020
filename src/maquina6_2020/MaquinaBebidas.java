/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina6_2020;

/**
 *
 * @author Hernán Ruiz García
 */
public class MaquinaBebidas {
    
       
    private ContadorDeMonedas contador;
    private DispensadorDeBotes cola, limon, naranja, tonica, agua;
    private float precio;
    public void iniciarMaquinaDeBebidas (float m, int b, float pvp) {
        
        contador = new ContadorDeMonedas();
        cola = new DispensadorDeBotes();
        limon = new DispensadorDeBotes();
        naranja = new DispensadorDeBotes();
        tonica = new DispensadorDeBotes();
        agua = new DispensadorDeBotes();
        contador.iniciarContadorDeMonedas(m);
        cola.iniciarDispensadorDeBotes(b);
        limon.iniciarDispensadorDeBotes(b);
        naranja.iniciarDispensadorDeBotes(b);
        tonica.iniciarDispensadorDeBotes(b);
        agua.iniciarDispensadorDeBotes(b);
        precio = pvp;
        
        
        
    }
    public void darOrden (char o) {
        
        switch (o) {
            
            case '1': case '2':  case '3': case '4': case '5':
            ordenSeleccion(o);
                
            break;
            
            case 'A':  case 'a': case 'B' :  case 'b': case 'C' :  case 'c': case 'D':  case 'd': case 'E':  case 'e': case 'R' :  case 'r':
            ordenMonedas(o);
            break;
            
            default :
                System.out.println("Ese valor no existe");
                
                break;
        }
       
        
    }
    public void visualizarMaquina () {
        
        System.out.println("Hay: "+cola.botesDisponibles() + " de cola");
        System.out.println("Hay: "+limon.botesDisponibles() + " de limón");
        System.out.println("Hay: "+naranja.botesDisponibles() + " de naranja");
        System.out.println("Hay: "+tonica.botesDisponibles() +" de tónica");
        System.out.println("Hay: "+agua.botesDisponibles()+ " de agua");
        System.out.println("El precio de las bebidas es: " + precio);
        System.out.println("El saldo que has insertado es de: " + contador.saldo());
        
    }
    private void ordenMonedas (char o) {
        
        switch (o) {
            
            case 'A' : case 'a': 
                
                contador.insertarMoneda(0.05F);
            
            break;
           
            case 'B' :  case 'b':
                contador.insertarMoneda(0.10F);
                
             break;
             
            case 'C':  case 'c':
                contador.insertarMoneda(0.20F);
                
                break;
                
                
            case 'D':  case 'd':
                
                contador.insertarMoneda(0.50F);
                
                break;
                
            case 'E':  case 'e':
                
                contador.insertarMoneda(1.00F);
                
                break;
                
            case 'R':  case 'r':
                
                contador.Retornar();
                
                break;
                
            default:
                
                System.out.println("El valor introducido no es válido");
                
        }
        
        
        
    }
    private void ordenSeleccion (char o) {
        
          switch (o) {
            
            case '1' :
                
               if ( cola.pulsarBoton()) {
                   
                   System.out.println("Seleccionado : Cola");
               }
               
               else
                   
                    System.out.println("No hay existencias de ese producto");
            
            break;
           
            case '2' :
                if ( limon.pulsarBoton()) {
                   
                   System.out.println("Seleccionado : Limon");
               }
               
               else
                   
                    System.out.println("No hay existencias de ese producto");
                
             break;
             
            case '3':
                if ( naranja.pulsarBoton()) {
                   
                   System.out.println("Seleccionado : Naranja");
               }
               
               else
                   
                    System.out.println("No hay existencias de ese producto");
                
                break;
                
                
            case '4':
                
                if ( tonica.pulsarBoton()) {
                   
                   System.out.println("Seleccionado : Tónica");
               }
               
               else
                   
                    System.out.println("No hay existencias de ese producto");
                
                break;
                
            case '5': 
                
                if ( agua.pulsarBoton()) {
                   
                   System.out.println("Seleccionado : Agua");
               }
               
               else
                   
                    System.out.println("No hay existencias de ese producto");
                
                break;
                
            
                
            default:
                
                System.out.println("El producto no existe");
                
        }
        
        
        
    }
    
}
