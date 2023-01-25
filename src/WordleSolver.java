//Clase WordleSolver que hereda de GameSolver

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordleSolver extends GameSolver{

    //Declaración de constantes de la clase
    private static final String SOLVER_NAME = "Wordle Solver";
    private static final int DEFAULT_SIZE = 26;
    private static final String DEFAULT_WORDS_FILE = "english.txt";

    //Atributos de la clase
    private Letter[] letras;
    private String wordsFile;
    private ArrayList<String> diccionario;

    //Constructores de la clase, uno por defecto que crea con el nombre, el array de letras, el diccionario y carga
    //las palabras en el diccionario
    public WordleSolver() throws FileNotFoundException {
        super(SOLVER_NAME);
        letras = new Letter[DEFAULT_SIZE];
        diccionario = new ArrayList<String>();
        Scanner sc = new Scanner(new File("C:\\Users\\julio\\OneDrive\\Documentos\\Programacion\\JavaWordlePractica\\src\\english.txt"));
        for (int i = 0; i < diccionario.size(); i++) {
            diccionario.add(sc.nextLine());
        }
    }

    //Métodos de la clase
    public String listLetters(){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < letras.length; i++) {
            if(letras[i] != null){
                sb.append(letras[i].toString()).append(System.getProperty("line.separator"));
            }
        }
        return sb.toString();
    }

    public boolean addLetter(Letter letra){
        for (int i = 0; i < letras.length; i++) {
            if(letras[i] == null){
                letras[i] = letra;
                return true;
            }
        }
            return false;
    }

    public boolean addLetters(String palabra, String estado){
        if (palabra.length() == estado.length()){
            for (int i = 0; i < palabra.length(); i++) {
                addLetter(new Letter(palabra.charAt(i), i, LetterStatus.getLetterStatus(estado.charAt(i))));
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean checkPalabra(String palabra){
        for (int i = 0; i < letras.length; i++) {
            if(letras[i] != null && letras[i].getEstado() == LetterStatus.DESELECTED){
                if (letras[i].getEstado() == LetterStatus.CORRECT){

                }else if(letras[i].getEstado() == LetterStatus.VALID){

                } else if (letras[i].getEstado() == LetterStatus.BAD) {

                }
            }else {
                return false;
            }
        }
    }

    public void solve(){
        clearSoluciones();
        for (int i = 0; i < diccionario.size(); i++) {
            if(checkPalabra(diccionario.get(i)) == true){
                addSolucion();
            }
        }
    }


}
