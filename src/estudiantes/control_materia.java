
package estudiantes;


public class control_materia {
    
    sql sqlmat;
   
    public control_materia() {
        
        sqlmat = new sql();
    }

    
   
    
    public boolean ingresar_materia(String nombre_materia, int intensidad_horaria)
    {               
        
            String datos[] = {nombre_materia, Integer.toString(intensidad_horaria)};           
            return sqlmat.insertar(datos, "insert into materia(nombre_materia, intensidad_horaria) values(?,?)");
                                  
        
    }
    
}
