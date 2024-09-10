import java.util.*;


public class Sustitucion {
   private Date fechaAlta;
   private Date fechaBaja;


   public Sustitucion(){

    }

   public Sustitucion(Date fechaAlta, Date fechaBaja) {
      this.fechaAlta = fechaAlta;
      this.fechaBaja = fechaBaja;
      
   }

   public Date getFechaAlta() {
      
      return fechaAlta;
   
   }
   public Date getFechaBaja(){ 
      return fechaBaja;
   
   }
   public void setFechaAlta(Date fechaAlta) { 
      this.fechaAlta = fechaAlta;
   }
   public void setFechaBaja(Date fechaBaja) { 
      this.fechaBaja = fechaBaja;
   
   }




   
    
}
