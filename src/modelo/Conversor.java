package modelo;

/**
 *
 * @author aldanielago
 */
public class Conversor {    
    public String Conversor_base2(int decimal, int base){
        if(base == 2 || base == 4 || base == 8){
            String resultado = "";
            while (decimal > 0) {
                int aux = decimal % base;
                resultado = aux + resultado;
                decimal = decimal / base;
            }
            return resultado;
        }
        else {
            String resultado = "";
            while (decimal > 0) {
                int aux = decimal % base;
                if(aux >= 10){
                   
                }
                resultado = aux + resultado;
                decimal = decimal / base;
            }
            return resultado;
        }
    }
    
    public int Conversor_base3(){
        
        return 0;
    }
    
    public int Conversor_base5(){
        
        
        return 0;
    }
    
    public int Conversor_baseN(){
        
        return 0;
    }
}
