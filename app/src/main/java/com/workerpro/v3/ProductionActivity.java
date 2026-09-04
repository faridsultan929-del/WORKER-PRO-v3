package com.workerpro.v3;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ProductionActivity extends Activity {

    private String language = "RU";
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

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);
        root.setPadding(18, 12, 18, 10);

        TextView title = new TextView(this);
        title.setText("🏭  " + getProductionTitle());
        title.setTextSize(27);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 130, 70));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 8, 0, 15);

        root.addView(title);

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

    private String getProductionTitle() {

        if (language.equals("AZ")) {
            return "İstehsalat";
        }

        if (language.equals("EN")) {
            return "Production";
        }

        return "Производство";
    }

    private String[] getCards() {

        if (language.equals("AZ")) {

            return new String[]{
                    "🏭 İstehsalatın əsasları",
                    "⚙️ İstehsalat avadanlığı",
                    "🔩 Metallar və materiallar",
                    "🔄 Texnoloji proseslər",
                    "💻 CNC dəzgahları",
                    "📄 660 vərəq",
                    "📋 İş prosesinə nəzarət",
                    "🦺 İstehsalatda təhlükəsizlik"
            };

        } else if (language.equals("EN")) {

            return new String[]{
                    "🏭 Production Basics",
                    "⚙️ Production Equipment",
                    "🔩 Metals and Materials",
                    "🔄 Manufacturing Processes",
                    "💻 CNC Machines",
                    "📄 Sheet 660",
                    "📋 Process Control",
                    "🦺 Production Safety"
            };

        } else {

            return new String[]{
                    "🏭 Основы производства",
                    "⚙️ Производственное оборудование",
                    "🔩 Металлы и материалы",
                    "🔄 Технологические процессы",
                    "💻 CNC станки",
                    "📄 Лист 660",
                    "📋 Контроль рабочего процесса",
                    "🦺 Безопасность на производстве"
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
                        "Основы производства",
                        "İstehsalatın əsasları",
                        "Production Basics"
                },

                {
                        "Производственное оборудование",
                        "İstehsalat avadanlığı",
                        "Production Equipment"
                },

                {
                        "Металлы и материалы",
                        "Metallar və materiallar",
                        "Metals and Materials"
                },

                {
                        "Технологические процессы",
                        "Texnoloji proseslər",
                        "Manufacturing Processes"
                },

                {
                        "CNC станки",
                        "CNC dəzgahları",
                        "CNC Machines"
                },

                {
                        "Лист 660",
                        "660 vərəq",
                        "Sheet 660"
                },

                {
                        "Контроль рабочего процесса",
                        "İş prosesinə nəzarət",
                        "Process Control"
                },

                {
                        "Безопасность на производстве",
                        "İstehsalatda təhlükəsizlik",
                        "Production Safety"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Производство включает подготовку материала, работу на оборудовании, контроль процесса и проверку готовой детали.",

                        "İstehsalat materialın hazırlanmasını, avadanlıqda işi, prosesə nəzarəti və hazır detalın yoxlanılmasını əhatə edir.",

                        "Production includes material preparation, equipment operation, process control and inspection of the finished part."
                },

                {
                        "Производственное оборудование должно использоваться только по инструкции. Перед началом работы проверьте состояние оборудования и защитных устройств.",

                        "İstehsalat avadanlığından yalnız təlimata uyğun istifadə edilməlidir. İşə başlamazdan əvvəl avadanlığın və qoruyucu qurğuların vəziyyətini yoxlayın.",

                        "Production equipment must be used according to instructions. Before starting work, check the equipment and safety guards."
                },

                {
                        "На производстве используются различные металлы и материалы. Важно знать их свойства, маркировку и требования к обработке.",

                        "İstehsalatda müxtəlif metallar və materiallardan istifadə olunur. Onların xüsusiyyətlərini, markalanmasını və emal tələblərini bilmək vacibdir.",

                        "Different metals and materials are used in production. It is important to know their properties, identification and processing requirements."
                },

                {
                        "Технологический процесс определяет последовательность операций: подготовка, обработка, контроль и получение готовой детали.",

                        "Texnoloji proses əməliyyatların ardıcıllığını müəyyən edir: hazırlıq, emal, nəzarət və hazır detalın alınması.",

                        "The manufacturing process defines the sequence of operations: preparation, machining, inspection and production of the finished part."
                },

                {
                        "CNC станки работают по управляющей программе. Оператор должен проверить программу, инструмент, заготовку и безопасную работу станка.",

                        "CNC dəzgahları idarəetmə proqramı ilə işləyir. Operator proqramı, aləti, materialı və dəzgahın təhlükəsiz işləməsini yoxlamalıdır.",

                        "CNC machines operate using a control program. The operator must check the program, tool, workpiece and safe machine operation."
                },

                {
                        "Лист 660 используется как производственный материал. Перед обработкой необходимо проверить его размер, состояние и соответствие заданию.",

                        "660 vərəqi istehsalat materialı kimi istifadə olunur. Emaldan əvvəl onun ölçüsü, vəziyyəti və tapşırığa uyğunluğu yoxlanılmalıdır.",

                        "Sheet 660 is used as a production material. Before processing, check its size, condition and compliance with the job requirements."
                },

                {
                        "Контроль рабочего процесса помогает избежать ошибок. Оператор должен следить за параметрами оборудования, качеством детали и соблюдением технологии.",

                        "İş prosesinə nəzarət səhvlərin qarşısını almağa kömək edir. Operator avadanlığın parametrlərinə, detalın keyfiyyətinə və texnologiyaya əməl olunmasına nəzarət etməlidir.",

                        "Process control helps prevent mistakes. The operator should monitor equipment parameters, part quality and compliance with the process."
                },

                {
                        "Соблюдайте инструкции, используйте необходимые СИЗ и не работайте на неисправном оборудовании. При опасной ситуации остановите работу и сообщите руководителю.",

                        "Təlimatlara əməl edin, lazımi fərdi mühafizə vasitələrindən istifadə edin və nasaz avadanlıqla işləməyin. Təhlükəli vəziyyətdə işi dayandırın və rəhbərə məlumat verin.",

                        "Follow safety instructions, use the required PPE and never operate faulty equipment. In a dangerous situation, stop work and inform your supervisor."
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