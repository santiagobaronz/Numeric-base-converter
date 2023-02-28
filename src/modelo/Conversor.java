package modelo;

/**
 *
 * @author aldanielago
 */
public class Conversor { 
    //Este convertirá los numeros entre 0 y 1
    public String conversor_base_pequeña(int base){
        String resultado = ""; 
        
        return resultado;
    }
    
    //Este convertirá los numeros mayores a 1 hasta el 9
    public String conversor_base_mediana(int numero, int base){
        String resultado = "";
        while (numero > 0) {
            int aux = numero % base;
            resultado = aux + resultado;
            numero = numero / base;
        }
        return resultado;
    }
    
    //Este convertirá los numeros después del 9
    public String conversor_base_grande(int decimal, int base){
        StringBuilder hexBuilder = new StringBuilder();
        while(decimal > 0){
            int aux = decimal % base; 
            decimal = decimal / base; 
            String letra = Integer.toHexString(aux); 
            hexBuilder.insert(0, letra);
        }
        String hex = hexBuilder.toString();
        return hex;
    }
}
