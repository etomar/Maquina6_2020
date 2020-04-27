/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina6_2020;

/**
 *
 * @author sergi
 */
public class DispensadorDeBotes {
    private int botes; 

public DispensadorDeBotes(int B) {
     iniciarDispensadorDeBotes(B);
 }
 
public void iniciarDispensadorDeBotes (int i) {
    botes = i;
    }
    
public boolean pulsarBoton () {
    boolean totalBotes = false;
        if(botes>0) {
           totalBotes= true;
           botes--;
        }
        else
            totalBotes = false;
        return totalBotes;
    }

    public int botesDisponibles () {
    return botes;
    }
}

