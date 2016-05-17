
package estudiantes;


public class control_notas {
    
      private final sql sen;
    
    public control_notas()
    {
      sen = new sql();  
    }
    
    
    
    public Object[][] consulta_materia_notas(String id)
       {
        String[] columnas={"cod_carnet","cod_materia", "nombre_materia"};
        Object[][] resultado = sen.datosTabla(columnas, "materiaxestudiante", "select * from materiaxestudiante, materia where cod_materia=id_materia  and cod_carnet='"+id+"';");
        return resultado;
       }
    
    public boolean ingresar_notas(String cod_carnetnota, String cod_materianota, Double nota)
    {               
           
            String datos[] = {cod_carnetnota, cod_materianota, Double.toString(nota)};           
            return sen.insertar(datos, "insert into nota(cod_carnetnota, cod_materianota, nota) values(?,?,?)");
                                  
        
    }
    
}
