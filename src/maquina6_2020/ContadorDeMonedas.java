/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina6_2020;

public class ContadorDeMonedas {

	private float cantidad; //Dinero introducido por el usuario actual.
	private float disponible; 
         //Dinero almacenado en la maquina, se utiliza para dar cambio. 
        /* Inicializa el objeto y fija el cambio inicialmente disponible. */ 
        /* Entradas: float i, saldo inicialmente disponible para cambios */ 
        /* Salidas: Ninguna*/ 
	
	public void iniciarContadorDeMonedas (float i) {
	disponible=i;
	}
	
        
	public float saldo () {
		return cantidad;
	}
	/* Insertar la moneda m */
        /* Entrada: float m, la cantidad de dinero introducida */
        /* Salidas: Ninguna */
	public void insertarMoneda (float m) {
		this.cantidad+=m;
	}
	/* Devuelve el cambio, si es posible */ 
        /* Una vez entregado el cambio, el dinero introducido por el cliente */
        /* pasa a engrosar el disponible de la maquina 
        /* Entradas: float c, el precio del producto*/
        /* Salidas: el cambio, negativo si falta dinero */ 
	public float darCambioDe (float c) {
	    float cantOtra=cantidad;
        if (cantOtra - c>=0) {
            cantidad+=c;
            disponible-=c;
        }
        return cantOtra-c;
        /* El cliente recupera el dinero introducido si todavia */ 
        /* no se ha realizado la venta */ /* Entradas: Ninguna */
        /* Salidas: float, la cantidad devuelta */ 
}
        
        public float Retornar () {
            
            float valor = cantidad;
            cantidad = 0;
                    
            return valor;
            
        }
	

}