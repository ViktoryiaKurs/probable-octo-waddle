package homework.hw5streamapi;

import java.util.Arrays;
import java.util.List;

// Получить 5 последних сообщений
public class Limit {
    public static void main(String[] args) {
        List<String> chatMessages = Arrays.asList(
                "Привет!",
                "Как дела?",
                "Что нового?",
                "Встречаемся в 18:00",
                "Не забудь документы",
                "Хорошо, договорились",
                "Спасибо!",
                "До завтра",
                "Удачи!",
                "Пока!"
        );

//        Collections.reverse(chatMessages);

        System.out.println(chatMessages.stream()
                .skip(chatMessages.toArray().length - 5)
                .limit(5)
                .toList());
    }
}
