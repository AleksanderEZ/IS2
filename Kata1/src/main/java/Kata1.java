
import java.time.LocalDate;
import java.time.Month;

public class Kata1{
    public static void main(String[] args) {
        Persona juan = new Persona("Jose Juan", LocalDate.of(2000, Month.MARCH, 20));
        System.out.println(juan.getName());
        System.out.println(juan.getYears());
}
}