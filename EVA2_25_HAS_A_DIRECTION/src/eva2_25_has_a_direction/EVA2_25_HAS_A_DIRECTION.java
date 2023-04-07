/*
 
 */
package eva2_25_has_a_direction;


public class EVA2_25_HAS_A_DIRECTION {


    public static void main(String[] args) {
  
//Direction direccion=new Direction("Industrias", 11101, "Complejo industrial Chihuahua", "31135", "Chihuahua", "Chihuahua");
//persona.setDireccion(direccion);  <--- no existe     
  
    Persona persona = new Persona();
      persona.setNombre("Juan");
      persona.setApellido("Hernandez");
      persona.setEdad(41);

      persona.imprimirData();
    }
    
}


class Direction {
private String calle; 
private int numero;
private String colonia;
private String CP;
private String ciudad;
private String estado;    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
//------------------------------------------------------------------------------
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
//------------------------------------------------------------------------------
    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
//------------------------------------------------------------------------------
    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }
//------------------------------------------------------------------------------
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
//------------------------------------------------------------------------------
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
//------------------------------------------------------------------------------

    public Direction(String calle, int numero, String colonia, String CP, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.CP = CP;
        this.ciudad = ciudad;
        this.estado = estado;
    }
//------------------------------------------------------------------------------
       public Direction() {
        this.calle = "---";
        this.numero = 0;
        this.colonia = "---";
        this.CP = "---";
        this.ciudad = "---";
        this.estado = "---";
    } 
//------------------------------------------------------------------------------
  public void imprimirData(){
      System.out.println("Dirección.");
      System.out.println("-Calle: "+calle);
      System.out.println("-Número: "+numero);
      System.out.println("-Colonia: "+colonia);
      System.out.println("-Código postal: "+CP);
      System.out.println("-Ciudad: "+ciudad);
      System.out.println("-Estado: "+estado);      
  }     
       
       
}



class Persona{
private String nombre;    
private String apellido;    
private int edad;    
 
//Has a
private Direction direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//------------------------------------------------------------------------------
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//------------------------------------------------------------------------------
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//------------------------------------------------------------------------------
    public Direction getDireccion() {
        return direccion;
    }

    public void setDireccion(Direction direccion) {
        this.direccion = direccion;
    }
//------------------------------------------------------------------------------

    public Persona(String nombre, String apellido, int edad, Direction direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
//------------------------------------------------------------------------------
        public Persona() {
        this.nombre = "---";
        this.apellido = "---";
        this.edad = 0;
        this.direccion = null; // <---- Nada creado todavía
    }
//------------------------------------------------------------------------------  

     public void imprimirData(){
         System.out.println("Persona.");
         System.out.println("-Nombre: "+nombre);
         System.out.println("-Apellido: "+apellido);
         System.out.println("-Edad: "+edad);
      
        if (direccion==null){
            System.out.println("-Sin dirección.");        
        } else {
           direccion.imprimirData();       
        }
        
     }

}



class Sucursal{
 private String nomSucursal;
 private Direction direccion;
}





