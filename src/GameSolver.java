//Clase abstracta GameSolver que representa el tipo de objeto que permite resolver juegos

import java.util.ArrayList;
import java.util.Collections;

public abstract class GameSolver {

    //Atributos de la clase
    private ArrayList<Solution> soluciones;
    private String nombre;

    //Métodos constructores de la clase
    public GameSolver(String nombre){
        this.nombre = nombre;
        soluciones = new ArrayList<Solution>();
    }

    //Métodos de la clase
    //Métodos get y set
    public ArrayList<Solution> getSoluciones(){
        return soluciones;
    }

    public String getNombre(){
        return nombre;
    }

    public void setSoluciones(ArrayList<Solution> soluciones){
        this.soluciones = soluciones;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Métodos para añadir y limpiar soluciones
    public boolean addSolucion(Solution solucion){
        return soluciones.add(solucion);
    }

    public void clearSoluciones(){
        soluciones.clear();
    }

    //Método abstracto para resolver el juego
    public abstract void solve();

    //Override del método toString
    @Override
    public String toString(){
        Collections.sort(soluciones);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < soluciones.size(); i++) {
            sb.append(soluciones.get(i)).append(System.getProperty("line.separator"));
        }

        return sb.toString();
    }


}
