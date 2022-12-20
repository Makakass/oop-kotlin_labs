import java.lang.StringBuilder

fun splitToSentences(text: String): List<String> =
    text.split("...", ".", "!", "?")
        .map { it.replace("\\s+".toRegex(), " ").trim() }

fun splitToWords(sentence: String): List<String> =
    sentence.split(' ')
        .filter { it != "–" }
        .map { it.lowercase().replace("[,:«»]".toRegex(), "") }

fun listRepeatCounter(l: List<String>): Map<String, Int> =
    l.groupingBy { it }.eachCount().filter { it.value > 1 }

fun outputBuilder(vararg input: Any): String {
    val builder = StringBuilder()
    for (i in input) {
        builder.append(i)
        builder.append("\n")
    }
    return builder.toString()
}

fun main() {
    val text = """
        Вочевидь, зараз не всі пригадають цю серпневу дату – вісімнадцяте святкування Дня Незалежності України. 
        Відлік десятилітньої історії Вишиванкового фестивалю розпочався саме тоді, коли сімдесят дев’ять людей, 
        убраних у виши́ванки, утворили вздовж Потьомкінських сходів так званий «живий ланцюг». Амбітні плани 
        організаторів повністю виправдалися: він сягнув-таки берега моря. Простягаючись білою ниткою від п’єдесталу 
        пам’ятника Рішельє, ланцюг із року в рік ставав усе довшим, а разом із цим зростало й усвідомлення Одеси 
        як українського міста. Зростало настільки, що в 2014 році, незважаючи на невпинну зливу, для участі в 
        акції «Вишиванковий ланцюг» вишикувалася півторатисячна черга, утворивши нескінченне живе море виши́ванок.
    """.trimIndent()
    val sentences = splitToSentences(text)

    var count = 0
    for (sentence in sentences) {
        val res = listRepeatCounter(splitToWords(sentence))
        if (res.isNotEmpty()) {
            println(outputBuilder("Sentence with duplicates:", sentence, "Duplicates: $res"))
            count++
        }
    }
    println("Number of results: $count")
}
