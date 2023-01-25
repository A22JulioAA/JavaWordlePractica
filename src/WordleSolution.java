//Clase WordleSolution que hereda de Solution y representa una posible solución del juego

public class WordleSolution extends Solution{

    //Atributos de la clase
    private String word;

    //Constructores de la clase
    public WordleSolution(){

    }

    //Métodos de la clase
    //Métodos get y set
    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word = word;
    }

    //Implementación del método abstracto setVAlor de la clase Solution
    protected void setValor(){

    }

    @Override
    public String toString(){
        if(word != null){
            return word.toUpperCase();
        }else{
            return "";
        }
    }


}
