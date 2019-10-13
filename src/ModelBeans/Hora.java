/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aurelio Macie Junior
 */
public class Hora {
    
    public String hora;
    SimpleDateFormat horaFormatada = new SimpleDateFormat("hh:mm:ss");
    
    public void ler_hora(){
        Date horaActual = new Date();
        hora = horaFormatada.format(horaActual);
        
        
    }
    
    
    
    
}
