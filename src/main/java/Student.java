import lombok.Data;
import lombok.AllArgsConstructor;

@Data // Erzeugt Getter, Setter, equals(), hashCode() und toString()
@AllArgsConstructor // Erzeugt einen Konstruktor mit allen Attributen
public class Student {
    private String name;
    private int age;
}

