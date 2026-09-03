package com.workerpro.v3;

import java.util.ArrayList;
import java.util.List;

public class EnglishDictionary {

public static class Word {
    public String english;
    public String russian;
    public String azerbaijani;

    public Word(String english, String russian, String azerbaijani) {
        this.english = english;
        this.russian = russian;
        this.azerbaijani = azerbaijani;
    }
}

public static List<Word> getWords() {

    List<Word> words = new ArrayList<>();

    words.add(new Word("Production", "Производство", "İstehsalat"));
    words.add(new Word("Factory", "Завод", "Zavod"));
    words.add(new Word("Worker", "Рабочий", "İşçi"));
    words.add(new Word("Operator", "Оператор", "Operator"));
    words.add(new Word("Machine", "Станок", "Dəzgah"));
    words.add(new Word("Equipment", "Оборудование", "Avadanlıq"));
    words.add(new Word("Safety", "Безопасность", "Təhlükəsizlik"));
    words.add(new Word("Quality", "Качество", "Keyfiyyət"));
    words.add(new Word("Sensor", "Датчик", "Sensor"));
    words.add(new Word("Welding", "Сварка", "Qaynaq"));

    return words;
}

}