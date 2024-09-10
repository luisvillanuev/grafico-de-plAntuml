



public class Medico{

    private  String nombre;
    private  String direccion;
    private  String telefono;
    private String poblacion;
    private String provicion;
    private String codigoPostal;
    private String nif;
    private String numSegSocial;



    public Medico(){
        
     }


    public Medico(String nombre, String direccion, String telefono, String poblacion, String provincia, String codigoPostal, String nif, String numSegSocial) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.provicion = provincia;
        this.codigoPostal = codigoPostal;
        this.nif = nif;
        this.numSegSocial = numSegSocial;
    }


    public String getNombre() { 
        
        
        return nombre; 
    
    }
    public String getDireccion() {
        
        return direccion; 
    
    }
    public String getTelefono() {
        
        
        return telefono;
    
    
    }
    public String getPoblacion() {
        
        return poblacion; 
    
    }
    public String getProvincia() {
        
        
        return provicion;
    
    }
    public String getCodigoPostal() { 
        
        return codigoPostal;
    
    }
    public String getNif() {
        
        
        return nif;
    
    
    }
    public String getNumSegSocial() { 
        
        
        return numSegSocial;
    
    
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    
    }
    public void setDireccion(String direccion) {
        
        this.direccion = direccion; 
    }
    public void setTelefono(String telefono) {
         this.telefono = telefono;
        
    }
    public void setPoblacion(String poblacion) { 
        
        
        this.poblacion = poblacion; 
    
    }
    public void setProvincia(String provincia) { 
        
        
        this.provicion = provincia; 
    
    }
    public void setCodigoPostal(String codigoPostal) { 
        
        
        
        this.codigoPostal = codigoPostal;
    
    }
    public void setNif(String nif) { 
        
        this.nif = nif;
    
    }
    public void setNumSegSocial(String numSegSocial) { 
        
        
        this.numSegSocial = numSegSocial;
    
    
    }








    


}

    
