//Clase Letter que identifica la letra del juego con diferentes características
//Implementa la Interface Comparable<Letter> para comparar objetos de la clase Letter

public class Letter implements Comparable<Letter>{

    //Declaración de constantes
    private static final int DEFAULT_POSITION = -1;

    //Atributos de la clase
    private char caracter;
    private LetterStatus estado;
    private int posicion;

    //Constructores de la clase
    //Un costructor que recoge la letra, la posición y el estado y otro que recoge solo la letra
    public Letter (char caracter, int posicion, LetterStatus estado){

        //Comprobamos que el caracter es una letra
        if (!Character.isLetter(caracter)){
            caracter = 0;
        }else {
            this.caracter = Character.toUpperCase(caracter);
        }

        //Comprobamos el estado y si es DESELECTED o un número negativo le asignamos la posición por defecto

        if(estado.equals(LetterStatus.DESELECTED ) || posicion < 0){
            posicion = DEFAULT_POSITION;
        }else {
            this.posicion = posicion;
        }

        this.estado = estado;
    }

    public Letter(char caracter){

        //Comprobamos que el caracter es una letra
        if (!Character.isLetter(caracter)){
            caracter = 0;
        }else {
            this.caracter = Character.toUpperCase(caracter);
        }

        estado = LetterStatus.DESELECTED;
        posicion = DEFAULT_POSITION;
    }

    //Métodos de la clase
    //Métodos get y set para cada atributo
    public char getCaracter(){
        return caracter;
    }

    public LetterStatus getEstado(){
        return estado;
    }

    public int getPosicion(){
        return posicion;
    }

    public void setEstado(LetterStatus estado){
        this.estado = estado;
    }

    public void setPosicion(int posicion){
        if (posicion < 0){
            posicion = DEFAULT_POSITION;
        }else{
            this.posicion = posicion;
        }
    }

    //Override del método heredado de Object equals para comparar dos letras
    public boolean equals(Letter objeto){
        if (this == objeto) return true;
        if(objeto == null || this.getClass() != objeto.getClass()) return false;

        Letter nuevaLetra = (Letter) objeto;
        return this.caracter == nuevaLetra.caracter && this.posicion == nuevaLetra.posicion;
    }

    //Implantación del método compareTo de la interface

    public int compareTo(Letter letra){
        return 0;
    }

    @Override
    public String toString(){
        return caracter + "[" + posicion + "] " + "(" + estado + ")";
    }




}