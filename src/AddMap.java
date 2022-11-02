import java.util.*;

public class AddMap {
    private static final java.util.Map<String, Integer> map = new HashMap<>();

    public static void fillMap(String string, int number) {
        if (map.containsKey(string) && map.get(string).equals(number)) {
            throw new IllegalArgumentException("Уже существует");
        } else if (map.containsKey(string) && !map.containsValue(number)) {
            map.replace(string, map.get(string), number);
        } else {
            map.put(string, number);
        }
    }

    public static void getMap() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " —> " + entry.getValue());
        }
    }
}
