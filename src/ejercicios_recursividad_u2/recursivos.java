package ejercicios_recursividad_u2;
import java.util.ArrayList;
public class recursivos
{
    private ArrayList<Double> datos;
    private boolean vacia = true;
    
    public void agregarDatos(double elDato)
    {
        datos = new ArrayList<>();
        datos.add(elDato);
        this.vacia = false;
    }
    
    public void mostrarDatosRecursivodes(int indice)
    {
        if(indice>-1)
        {
            System.out.println((indice+1) + " .- " + datos.get(indice));
            indice--;
            mostrarDatosRecursivodes(indice);
        }
    }
    
    public void mostrarDatosRecursivodesAs(int indice)
    {
        if(indice<datos.size())
        {
            System.out.println((indice+1) + " .- " + datos.get(indice));
            indice++;
            mostrarDatosRecursivodesAs(indice);
        }
    }
    
    public int getSize()
    {
        if(!vacia)
            return this.datos.size();
        else
            return -1;
    }
    
    public int elevarNumero(int num, int potencia)
    {
        if(potencia!=1)
        {
            num*=elevarNumero(num,potencia-1);
        }
        return num;
    }
    
    public int sumarNumeros(int numero)
    {
        if(numero < 10)
            return numero;
        else
            return (numero % 10) + sumarNumeros(numero/10);
    }
}