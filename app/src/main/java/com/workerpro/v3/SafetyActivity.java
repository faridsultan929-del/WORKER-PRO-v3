package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SafetyActivity extends Activity {

private String language = "RU";
private LinearLayout root;
private LinearLayout content;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    String receivedLanguage = getIntent().getStringExtra("LANGUAGE");

    if (receivedLanguage != null) {
        language = receivedLanguage;
    }

    createScreen();
}

private void createScreen() {

    root = new LinearLayout(this);
    root.setOrientation(LinearLayout.VERTICAL);
    root.setBackgroundColor(Color.WHITE);
    root.setPadding(18, 12, 18, 10);

    // HEADER
    TextView title = new TextView(this);
    title.setText("🦺  " + getTitle());
    title.setTextSize(27);
    title.setTypeface(null, Typeface.BOLD);
    title.setTextColor(Color.rgb(0, 130, 70));
    title.setGravity(Gravity.CENTER);
    title.setPadding(0, 8, 0, 15);

    root.addView(title);

    // CONTENT
    ScrollView scrollView = new ScrollView(this);

    content = new LinearLayout(this);
    content.setOrientation(LinearLayout.VERTICAL);
    content.setPadding(0, 5, 0, 10);

    String[] cards = getCards();

    for (int i = 0; i < cards.length; i++) {

        final int number = i;

        TextView card = createCard(cards[i]);

        card.setOnClickListener(v -> showInfo(number));

        content.addView(card);
    }

    scrollView.addView(content);

    root.addView(
            scrollView,
            new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    0,
                    1
            )
    );

    // DEVELOPER
    TextView developer = new TextView(this);
    developer.setText("F.S");
    developer.setTextSize(16);
    developer.setTextColor(Color.GRAY);
    developer.setGravity(Gravity.CENTER);
    developer.setPadding(0, 5, 0, 5);

    root.addView(developer);

    setContentView(root);
}

private TextView createCard(String text) {

    TextView card = new TextView(this);

    card.setText(text);
    card.setTextSize(18);
    card.setTypeface(null, Typeface.BOLD);
    card.setTextColor(Color.rgb(0, 105, 60));
    card.setGravity(Gravity.CENTER_VERTICAL);
    card.setPadding(22, 0, 22, 0);

    GradientDrawable background = new GradientDrawable();
    background.setColor(Color.rgb(242, 248, 244));
    background.setCornerRadius(18);
    background.setStroke(2, Color.rgb(0, 130, 70));

    card.setBackground(background);

    LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    82
            );

    params.setMargins(0, 0, 0, 12);

    card.setLayoutParams(params);

    return card;
}

private String getTitle() {

    if (language.equals("AZ")) {
        return "Təhlükəsizlik";
    }

    if (language.equals("EN")) {
        return "Safety";
    }

    return "Безопасность";
}

private String[] getCards() {

    if (language.equals("AZ")) {

        return new String[]{
                "🦺 İş yerində təhlükəsizlik",
                "⚠️ Təhlükələr və risklər",
                "🛡️ Fərdi mühafizə vasitələri",
                "🔥 Yanğın təhlükəsizliyi",
                "⚡ Elektrik təhlükəsizliyi",
                "🚨 Fövqəladə hallar",
                "🩹 İlk yardım",
                "📋 Təhlükəsizlik təlimatları"
        };

    } else if (language.equals("EN")) {

        return new String[]{
                "🦺 Workplace Safety",
                "⚠️ Hazards and Risks",
                "🛡️ Personal Protective Equipment",
                "🔥 Fire Safety",
                "⚡ Electrical Safety",
                "🚨 Emergency Situations",
                "🩹 First Aid",
                "📋 Safety Instructions"
        };

    } else {

        return new String[]{
                "🦺 Безопасность на рабочем месте",
                "⚠️ Опасности и риски",
                "🛡️ Средства индивидуальной защиты",
                "🔥 Пожарная безопасность",
                "⚡ Электробезопасность",
                "🚨 Чрезвычайные ситуации",
                "🩹 Первая помощь",
                "📋 Инструкции по безопасности"
        };
    }
}

private void showInfo(int number) {

    content.removeAllViews();

    TextView title = new TextView(this);
    title.setText(getInfoTitle(number));
    title.setTextSize(23);
    title.setTypeface(null, Typeface.BOLD);
    title.setTextColor(Color.rgb(0, 130, 70));
    title.setGravity(Gravity.CENTER);
    title.setPadding(10, 20, 10, 20);

    content.addView(title);

    TextView info = new TextView(this);
    info.setText(getInfoText(number));
    info.setTextSize(18);
    info.setTextColor(Color.DKGRAY);
    info.setPadding(20, 10, 20, 30);

    content.addView(info);

    TextView back = new TextView(this);

    if (language.equals("AZ")) {
        back.setText("← Geri");
    } else if (language.equals("EN")) {
        back.setText("← Back");
    } else {
        back.setText("← Назад");
    }

    back.setTextSize(18);
    back.setTypeface(null, Typeface.BOLD);
    back.setTextColor(Color.rgb(0, 130, 70));
    back.setGravity(Gravity.CENTER);
    back.setPadding(20, 20, 20, 20);

    back.setOnClickListener(v -> createScreen());

    content.addView(back);
}

private String getInfoTitle(int number) {

    String[][] titles = {

            {
                    "Безопасность на рабочем месте",
                    "İş yerində təhlükəsizlik",
                    "Workplace Safety"
            },

            {
                    "Опасности и риски",
                    "Təhlükələr və risklər",
                    "Hazards and Risks"
            },

            {
                    "Средства индивидуальной защиты",
                    "Fərdi mühafizə vasitələri",
                    "Personal Protective Equipment"
            },

            {
                    "Пожарная безопасность",
                    "Yanğın təhlükəsizliyi",
                    "Fire Safety"
            },

            {
                    "Электробезопасность",
                    "Elektrik təhlükəsizliyi",
                    "Electrical Safety"
            },

            {
                    "Чрезвычайные ситуации",
                    "Fövqəladə hallar",
                    "Emergency Situations"
            },

            {
                    "Первая помощь",
                    "İlk yardım",
                    "First Aid"
            },

            {
                    "Инструкции по безопасности",
                    "Təhlükəsizlik təlimatları",
                    "Safety Instructions"
            }
    };

    return titles[number][getLanguageIndex()];
}

private String getInfoText(int number) {

    String[][] texts = {

            {
                    "Рабочее место должно быть чистым и безопасным. Перед началом работы проверьте станок, инструмент и защитные устройства.",
                    "İş yeri təmiz və təhlükəsiz olmalıdır. İşə başlamazdan əvvəl dəzgahı, alətləri və qoruyucu qurğuları yoxlayın.",
                    "The workplace must be clean and safe. Before starting work, check the machine, tools and safety guards."
            },

            {
                    "Перед началом работы определите возможные опасности и оцените риски. Не начинайте работу, если ситуация небезопасна.",
                    "İşə başlamazdan əvvəl mümkün təhlükələri müəyyən edin və riskləri qiymətləndirin. Vəziyyət təhlükəlidirsə, işə başlamayın.",
                    "Identify possible hazards and assess the risks before starting work. Do not start work if the situation is unsafe."
            },

            {
                    "Используйте каску, защитные очки, перчатки, защитную обувь и другие необходимые СИЗ в соответствии с работой.",
                    "İşə uyğun olaraq dəbilqə, qoruyucu eynək, əlcək, qoruyucu ayaqqabı və digər fərdi mühafizə vasitələrindən istifadə edin.",
                    "Use a helmet, safety glasses, gloves, safety shoes and other required PPE according to the job."
            },

            {
                    "Знайте расположение огнетушителей и пожарных выходов. При пожаре немедленно сообщите об опасности и покиньте опасную зону.",
                    "Yanğınsöndürənlərin və yanğın çıxışlarının yerini bilin. Yanğın zamanı dərhal təhlükə barədə məlumat verin və təhlükəli ərazini tərk edin.",
                    "Know the location of fire extinguishers and fire exits. In case of fire, report the danger immediately and leave the hazardous area."
            },

            {
                    "Не работайте с электрическим оборудованием с повреждёнными кабелями. Перед обслуживанием отключите питание.",
                    "Zədələnmiş kabelləri olan elektrik avadanlığı ilə işləməyin. Texniki xidmətdən əvvəl enerjini söndürün.",
                    "Do not work with electrical equipment that has damaged cables. Turn off the power before maintenance."
            },

            {
                    "При аварии остановите работу, если это безопасно, сообщите руководителю и следуйте плану эвакуации.",
                    "Qəza zamanı təhlükəsizdirsə işi dayandırın, rəhbərə məlumat verin və təxliyə planına əməl edin.",
                    "In an emergency, stop work if it is safe to do so, inform the supervisor and follow the evacuation plan."
            },

            {
                    "При травме окажите первую помощь в пределах своей подготовки и вызовите медицинскую помощь.",
                    "Xəsarət zamanı hazırlığınıza uyğun ilk yardım göstərin və tibbi yardım çağırın.",
                    "In case of injury, provide first aid within your training and call for medical assistance."
            },

            {
                    "Всегда соблюдайте инструкции по безопасности. Если вы не уверены в правильности действия, остановитесь и спросите руководителя.",
                    "Həmişə təhlükəsizlik təlimatlarına əməl edin. Əmin deyilsinizsə, işi dayandırın və rəhbərdən soruşun.",
                    "Always follow safety instructions. If you are unsure about an action, stop and ask your supervisor."
            }
    };

    return texts[number][getLanguageIndex()];
}

private int getLanguageIndex() {

    if (language.equals("AZ")) {
        return 1;
    }

    if (language.equals("EN")) {
        return 2;
    }

    return 0;
}

}