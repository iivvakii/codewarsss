import java.util.List;

public class LineNumbering{
  public static List<String> number (List < String > lines) {
            for (int i = 0, j = 1; i < lines.size(); i++,j++){
                lines.set(i,j + ": " + lines.get(i));
            }
            return lines;
    }
}