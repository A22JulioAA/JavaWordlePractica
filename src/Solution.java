//Clase abstracta Solution que implemente la Interface Comparable <Solution>

public abstract class Solution implements Comparable<Solution>{

    //Atributos de la clase
    private int valor;

    //Métodos constructores de la clase, en este caso solo el por defecto.
    public Solution(){

    }


    //Métodos de la clase
    //Métodos get y set
    public int getValor(){
        return valor;
    }

    protected abstract void setValor();

    @Override
    public int compareTo(Solution solucion){
        if (this.valor == solucion.valor){
            return 0;
        } else if (this.valor > solucion.valor) {
            return 1;
        }else {
            return -1;
        }
    }


}
