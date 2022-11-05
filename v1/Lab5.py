import re


class Text:
    def __init__(self, text):
        self.txt = text

    def delete_punc(self):
        for i in Punctuation.sentence_punc:
            self.txt = self.txt.replace(i, "")

    def tolower(self):
        self.txt = self.txt.lower()

    def split_text(self):
        arr = []
        split_regex = re.compile(r'[.!?]')
        sentences = filter(lambda t: t, [t.strip() for t in split_regex.split(self.txt)])
        for s in sentences:
            arr.append(s)
        return arr


class Sentence:
    def __init__(self, splittedtext):
        self.sentences = splittedtext

    def split_sentence(self):
        arr = []
        for s in self.sentences:
            arr.append(s.split())
        return arr


class Word:
    def __init__(self, splittedsetntences):
        self.words = splittedsetntences

    def word_repeat(self):
        arr = []
        count = 0
        for s in self.words:
            if len(set(s)) < len(s):
                arr.append(" ".join(s))
                count += 1
        return arr, count


class Punctuation:
    text_punc = ".!?"
    sentence_punc = ":,«»"


class Main:
    a = "Вочевидь, зараз не всі пригадають цю серпневу дату – вісімнадцяте святкування Дня Незалежності України. " \
        "Відлік десятилітньої історії Вишиванкового фестивалю розпочався саме тоді, коли сімдесят дев’ять людей, " \
        "убраних у вишиванки, утворили вздовж Потьомкінських сходів так званий «живий ланцюг». Амбітні плани " \
        "організаторів повністю виправдалися: він сягнув-таки берега моря. Простягаючись білою ниткою від п’єдесталу" \
        " пам’ятника Рішельє, ланцюг із року в рік ставав усе довшим, а разом із цим зростало й усвідомлення Одеси " \
        "як українського міста. Зростало настільки, що в 2014 році, незважаючи на невпинну зливу, для участі в акції " \
        "«Вишиванковий ланцюг» вишикувалася півторатисячна черга, утворивши нескінченне живе море вишиванок."

    text1 = Text(a)
    text1.delete_punc()
    text1.tolower()
    splittedtext1 = text1.split_text()

    sentences1 = Sentence(splittedtext1)
    splittedsetntences1 = sentences1.split_sentence()

    words1 = Word(splittedsetntences1)
    arr, count = words1.word_repeat()

    print("Повторювані речення: ")
    for s in arr:
        print(s)
    print(f"Кількість повторюваних речень: {count}")


if __name__ == "__main__":
    Lab5 = Main()
