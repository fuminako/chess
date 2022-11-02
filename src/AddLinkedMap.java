import java.util.LinkedHashMap;
import java.util.Map;

public class AddLinkedMap {
    private static final Map<String, Integer> linkedMap = new LinkedHashMap<>();

    public static void fillLinkedMap(String string, int number) {
        if (linkedMap.containsKey(string) && linkedMap.get(string).equals(number)) {
            throw new IllegalArgumentException("Уже существует");
        } else if (linkedMap.containsKey(string) && !linkedMap.containsValue(number)) {
            linkedMap.replace(string, linkedMap.get(string), number);
        } else {
            linkedMap.putIfAbsent(string, number);
        }
    }

    public static void getLinkedMap() {
        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
