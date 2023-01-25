//Clase LetterStatus. Una enumeración de los posibles estados válidos de las letras del juego

public enum LetterStatus {

    //Elementos de la enumeración con sus respectivos caracteres
    CORRECT('c'), VALID('v'), BAD('b'), DESELECTED('d');

    private char caracter;

    //Método constructor que recoge un caracter
    private LetterStatus(char caracter){
        this.caracter = caracter;
    }

    //Métodos get y set que devuelven y establecen el caracter
    public char getCaracter(){
        return caracter;
    }

    public void setCaracter(char caracter){
        this.caracter = caracter;
    }

    //
    public static LetterStatus getLetterStatus(char c){
        switch (c){
            case 'c': return LetterStatus.CORRECT;
            case 'v': return LetterStatus.VALID;
            case 'b': return LetterStatus.BAD;
            default: return LetterStatus.DESELECTED;
        }
    }
}
