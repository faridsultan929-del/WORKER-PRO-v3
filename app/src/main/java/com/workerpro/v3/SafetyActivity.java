package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SafetyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(25, 25, 25, 25);
        layout.setBackgroundColor(Color.rgb(241, 248, 243));

        TextView title = new TextView(this);
        title.setText("🦺 SAFETY\nОХРАНА ТРУДА");
        title.setTextSize(26);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 25, 10, 25);
        title.setBackgroundColor(Color.rgb(27, 94, 32));

        layout.addView(title);

        TextView information = new TextView(this);
        information.setText(
                "ОСНОВНЫЕ ПРАВИЛА БЕЗОПАСНОСТИ\\n\\n" +

                "1. Перед началом работы\\n" +
                "• Проверь состояние оборудования.\\n" +
                "• Убедись, что защитные устройства установлены.\\n" +
                "• Проверь инструмент и рабочее место.\\n" +
                "• Используй необходимые СИЗ.\\n\\n" +

                "2. Средства индивидуальной защиты\\n" +
                "• Защитная каска.\\n" +
                "• Защитные очки.\\n" +
                "• Рабочие перчатки.\\n" +
                "• Спецодежда и защитная обувь.\\n" +
                "• Средства защиты слуха при необходимости.\\n\\n" +

                "3. Работа с оборудованием\\n" +
                "• Не работай на неисправном оборудовании.\\n" +
                "• Не удаляй защитные ограждения.\\n" +
                "• Не касайся движущихся деталей.\\n" +
                "• Не выполняй ремонт на работающем оборудовании.\\n" +
                "• Перед ремонтом отключи оборудование от источника энергии.\\n\\n" +

                "4. Электробезопасность\\n" +
                "• Не работай с поврежденными кабелями.\\n" +
                "• Не открывай электрические шкафы без разрешения.\\n" +
                "• При неисправности сообщи ответственному специалисту.\\n\\n" +

                "5. Пожарная безопасность\\n" +
                "• Знай расположение огнетушителей.\\n" +
                "• Не загромождай эвакуационные выходы.\\n" +
                "• При пожаре немедленно сообщи ответственным лицам.\\n" +
                "• Если безопасно, используй подходящий огнетушитель.\\n" +
                "• При опасности покинь помещение по маршруту эвакуации.\\n\\n" +

                "6. При аварии\\n" +
                "• Немедленно останови работу, если это безопасно.\\n" +
                "• Сообщи мастеру или ответственному лицу.\\n" +
                "• Не пытайся самостоятельно устранять опасную неисправность.\\n" +
                "• При травме обратись за медицинской помощью.\\n\\n" +

                "7. Главное правило\\n" +
                "БЕЗОПАСНОСТЬ ВАЖНЕЕ СКОРОСТИ РАБОТЫ.\\n\\n" +

                "Информация предназначена для обучения и не заменяет инструкции предприятия."
        );

        information.setTextSize(17);
        information.setTextColor(Color.rgb(40, 40, 40));
        information.setPadding(10, 25, 10, 25);

        layout.addView(information);

        setContentView(layout);
    }
}