import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lab3 {
    /*
    0204
    c3 = 0; String
    c17 = 0; Знайти найбільшу кількість речень заданого тексту, в яких є однакові слова.
    */
    public static void main(String[] args) {
        String text = "Вочевидь, зараз не всі пригадають цю серпневу дату – вісімнадцяте святкування Дня Незалежності України. " +
                "Відлік десятилітньої історії Вишиванкового фестивалю розпочався саме тоді, коли сімдесят дев’ять людей, убраних у вишиванки, утворили вздовж Потьомкінських сходів так званий «живий ланцюг». " +
                "Амбітні плани організаторів повністю виправдалися: він сягнув-таки берега моря. " +
                "Простягаючись білою ниткою від п’єдесталу пам’ятника Рішельє, ланцюг із року в рік ставав усе довшим, а разом із цим зростало й усвідомлення Одеси як українського міста. " +
                "Зростало настільки, що в 2014 році, незважаючи на невпинну зливу, для участі в акції «Вишиванковий ланцюг» вишикувалася півторатисячна черга, утворивши нескінченне живе море вишиванок. ";
        String[] sentences = text.split("[.!?]\\s");
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String temp = sentences[i];
            sentences[i] = sentences[i].toLowerCase().replaceAll("[^а-яa-z'\\s\\-]", "");
            String[] words = sentences[i].split("\\s+");
            Set<String> set = new HashSet<>(Arrays.asList(words));
            if (set.size() < words.length) {
                System.out.println(temp);
                count++;
            }
        }
        System.out.println("Всього речень: " + sentences.length);
        System.out.println("Речень з повторюваними словами: " + count);
    }
}
