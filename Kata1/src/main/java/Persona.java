
import java.time.LocalDate;
import java.time.Month;

public class Persona{
    private String nombre;
    private LocalDate birthdate;

    public Persona(String nombre, LocalDate birthdate) {
        this.nombre = nombre;
        this.birthdate = birthdate;
    }

    public String getName() {
        return nombre;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getYears(){
        return years(LocalDate.now().toEpochDay() - birthdate.toEpochDay());
    }

    private int years(long l) {
        return (int) l/365;
    }   
}