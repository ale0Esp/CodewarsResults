import java.util.stream.Stream;
public class SpinWords {
  public String spinWords(String sentence) {
     StringBuilder sb= new StringBuilder();
        Stream.of(sentence.split(" ")).forEach(s -> {
            s = s.length()>=5? new StringBuffer(s).reverse().toString() : s;
            sb.append(s);
            sb.append(" ");
        });
        return sb.toString().trim();
  }
}
