package GB;
import java.util.*;

//      1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//      Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//      Посчитать сколько раз встречается каждое слово.


public class Main {

    public static void main(String[] args) {

        // решение первой задачи
        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        al.add("f");
        al.add("d");
        al.add("a");
        al.add("b");
        al.add("a");
        counter(al);
    }


    public static void counter(ArrayList<String> aw) {
        int count;

        HashMap<String, String> hm = new HashMap<>();
        String word, counchart;
        for (int i = 1; i < aw.size(); i++) {
            count = Collections.frequency(aw, aw.get(i));
            word = aw.get(i);
            counchart = String.valueOf(count);
            hm.put(word, counchart);
        }
        System.out.println(hm);

    }
  


}
