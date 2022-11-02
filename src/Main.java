import java.util.*;

public class Main {

    //   private static final List<Task> tasks = new ArrayList<>();
    public static void main(String[] args) {
        Map<String, Integer> mapList = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            mapList.put("a" + Integer.toString(i + 1), list.get(i).get(0) + list.get(i).get(1) + list.get(i).get(2));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("a" + Integer.toString(i + 1) + " : " + mapList.get("a" + Integer.toString(i + 1)));
        }

        AddLinkedMap.fillLinkedMap("a", 1);
        AddLinkedMap.fillLinkedMap("b", 2);
        AddLinkedMap.fillLinkedMap("c", 3);
        AddLinkedMap.fillLinkedMap("d", 4);
        AddLinkedMap.fillLinkedMap("e", 5);
        AddLinkedMap.getLinkedMap();


        AddMap.fillMap("Четыре", 4);
        AddMap.fillMap("Десять", 10);

        AddMap.getMap();
    }


//    public static void addTask(){
//        for (int value1 = 2; value1 <= 9; value1++) {
//            for (int value2 = value1; value2 <= 9; value2++) {
//                tasks.add(new Task(value1, value2));
//            }
//        }
//        Collections.shuffle(tasks);
//        List<Task> chosenPairs = tasks.subList(0, 15);
//        System.out.println(chosenPairs);
//    }
//    static void example() {
//        List<List<String>> biDemArrList = new ArrayList<>();
//        for (int i = 0; i < 8; i++) {
//            biDemArrList.add(i, new ArrayList<>());
//            for (int j = 0; j < 8; j++) {
//                biDemArrList.get(i).add(j, (i + j) % 2 == 1 ? "◯" : "●");
//            }
//        }
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(biDemArrList.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
//    }
}