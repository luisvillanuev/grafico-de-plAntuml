public class Horario {
    private String dia;
    private String horalnicio;



    public Horario(){

        
    }



    public  Horario(String dia, String horalnicio){
        this.dia = dia;
        this.horalnicio = horalnicio;


    }


    public String getDia() {
        
        
        return dia;
    
    
    }
    public String getHoraInicio() { 
        
        
        
        return horalnicio;
    
    }
    public void setDia(String dia) { 
        
        this.dia = dia;
    
    }
    public void setHoraInicio(String horaInicio) { 
        
        this.horalnicio = horaInicio; 
    
    }
    
}
