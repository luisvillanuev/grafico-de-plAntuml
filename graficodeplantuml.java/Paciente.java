public class Paciente {
   private String nombre;
   private String direccion;
   private String telefono;
   private String codigoPostal;
   private String nif;
   private String numSegSocial;
   private String medicoAsignado;


   public Paciente(){ 
      
   }

   public Paciente(String nombre, String direccion, String telefono, String codigoPostal, String nif, String numSegSocial, String medicoAsignado) {
      this.nombre = nombre;
      this.direccion = direccion;
      this.telefono = telefono;
      this.codigoPostal = codigoPostal;
      this.nif = nif;
      this.numSegSocial = numSegSocial;
      this.medicoAsignado = medicoAsignado;
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
    public String getCodigoPostal() {
      
      return codigoPostal; 
   }
    public String getNif() { 
      
      return nif; 
   }
    public String getNumSegSocial() {
      
      return numSegSocial;
   
   }
    public String getMedicoAsignado() { 
      
      return medicoAsignado;
   
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
   public void setCodigoPostal(String codigoPostal) {
      
      
      this.codigoPostal = codigoPostal;
   
   }
   public void setNif(String nif) { 
      
      this.nif = nif;
   
   
   }
   public void setNumSegSocial(String numSegSocial) { 
      
      
      this.numSegSocial = numSegSocial; 
   
   }
   public void setMedicoAsignado(String medicoAsignado) {
      
      this.medicoAsignado = medicoAsignado;
   
   }
   












}



