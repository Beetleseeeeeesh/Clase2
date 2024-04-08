package enumerandos;

public class calse_enum {
    public enum lista { Java, Salle, Comida, Estudiar}
    public lista alumnos;

public String datos (int numero){
    switch (numero){
        case 0:{
            alumnos = lista.Java;
            break;
        }
        case 1:{
            alumnos = lista.Salle;
            break;
        }
        case 2:{
            alumnos = lista.Comida;
            break;
        }
        case 3:{
            alumnos = lista.Estudiar;
            break;
        }
        default:{
            return "error";
        }
    }
    return alumnos.name();
}
}
