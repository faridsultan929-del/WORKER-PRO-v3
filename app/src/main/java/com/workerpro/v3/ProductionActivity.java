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

        String receivedLanguage =
                getIntent().getStringExtra("LANGUAGE");

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

            card.setOnClickListener(
                    v -> showInfo(number)
            );

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

        GradientDrawable background =
                new GradientDrawable();

        background.setColor(
                Color.rgb(242, 248, 244)
        );

        background.setCornerRadius(18);

        background.setStroke(
                2,
                Color.rgb(0, 130, 70)
        );

        card.setBackground(background);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        82
                );

        params.setMargins(
                0,
                0,
                0,
                12
        );

        card.setLayoutParams(params);

        return card;
    }

    // =========================
    // TITLE
    // =========================

    private String getProductionTitle() {

        if (language.equals("AZ")) {
            return "İstehsalat";
        }

        if (language.equals("EN")) {
            return "Production";
        }

        if (language.equals("TR")) {
            return "Üretim";
        }

        if (language.equals("DE")) {
            return "Produktion";
        }

        return "Производство";
    }

    // =========================
    // CARDS
    // =========================

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

        }

        if (language.equals("EN")) {

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

        }

        if (language.equals("TR")) {

            return new String[]{
                    "🏭 Üretimin Temelleri",
                    "⚙️ Üretim Ekipmanları",
                    "🔩 Metaller ve Malzemeler",
                    "🔄 Üretim Süreçleri",
                    "💻 CNC Tezgâhları",
                    "📄 660 Sac Levha",
                    "📋 İş Süreci Kontrolü",
                    "🦺 Üretimde İş Güvenliği"
            };

        }

        if (language.equals("DE")) {

            return new String[]{
                    "🏭 Grundlagen der Produktion",
                    "⚙️ Produktionsanlagen",
                    "🔩 Metalle und Materialien",
                    "🔄 Fertigungsprozesse",
                    "💻 CNC-Maschinen",
                    "📄 Blech 660",
                    "📋 Prozesskontrolle",
                    "🦺 Arbeitssicherheit in der Produktion"
            };

        }

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

    // =========================
    // INFO
    // =========================

    private void showInfo(int number) {

        content.removeAllViews();

        TextView title = new TextView(this);

        title.setText(
                getInfoTitle(number)
        );

        title.setTextSize(23);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 130, 70));
        title.setGravity(Gravity.CENTER);
        title.setPadding(10, 20, 10, 20);

        content.addView(title);

        TextView info = new TextView(this);

        info.setText(
                getInfoText(number)
        );

        info.setTextSize(18);
        info.setTextColor(Color.DKGRAY);
        info.setPadding(20, 10, 20, 30);

        content.addView(info);

        TextView back = new TextView(this);

        if (language.equals("AZ")) {
            back.setText("← Geri");
        }
        else if (language.equals("EN")) {
            back.setText("← Back");
        }
        else if (language.equals("TR")) {
            back.setText("← Geri");
        }
        else if (language.equals("DE")) {
            back.setText("← Zurück");
        }
        else {
            back.setText("← Назад");
        }

        back.setTextSize(18);
        back.setTypeface(null, Typeface.BOLD);
        back.setTextColor(Color.rgb(0, 130, 70));
        back.setGravity(Gravity.CENTER);
        back.setPadding(20, 20, 20, 20);

        back.setOnClickListener(
                v -> createScreen()
        );

        content.addView(back);
    }

    // =========================
    // INFO TITLES
    // =========================

    private String getInfoTitle(int number) {

        String[][] titles = {

                {
                        "Основы производства",
                        "İstehsalatın əsasları",
                        "Production Basics",
                        "Üretimin Temelleri",
                        "Grundlagen der Produktion"
                },

                {
                        "Производственное оборудование",
                        "İstehsalat avadanlığı",
                        "Production Equipment",
                        "Üretim Ekipmanları",
                        "Produktionsanlagen"
                },

                {
                        "Металлы и материалы",
                        "Metallar və materiallar",
                        "Metals and Materials",
                        "Metaller ve Malzemeler",
                        "Metalle und Materialien"
                },

                {
                        "Технологические процессы",
                        "Texnoloji proseslər",
                        "Manufacturing Processes",
                        "Üretim Süreçleri",
                        "Fertigungsprozesse"
                },

                {
                        "CNC станки",
                        "CNC dəzgahları",
                        "CNC Machines",
                        "CNC Tezgâhları",
                        "CNC-Maschinen"
                },

                {
                        "Лист 660",
                        "660 vərəq",
                        "Sheet 660",
                        "660 Sac Levha",
                        "Blech 660"
                },

                {
                        "Контроль рабочего процесса",
                        "İş prosesinə nəzarət",
                        "Process Control",
                        "İş Süreci Kontrolü",
                        "Prozesskontrolle"
                },

                {
                        "Безопасность на производстве",
                        "İstehsalatda təhlükəsizlik",
                        "Production Safety",
                        "Üretimde İş Güvenliği",
                        "Arbeitssicherheit in der Produktion"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    // =========================
    // INFO TEXT
    // =========================

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Производство включает подготовку материала, работу на оборудовании, контроль процесса и проверку готовой детали.",

                        "İstehsalat materialın hazırlanmasını, avadanlıqda işi, prosesə nəzarəti və hazır detalın yoxlanılmasını əhatə edir.",

                        "Production includes material preparation, equipment operation, process control and inspection of the finished part.",

                        "Üretim; malzeme hazırlama, ekipman kullanımı, proses kontrolü ve bitmiş parçanın kontrolünü kapsar.",

                        "Die Produktion umfasst die Materialvorbereitung, den Betrieb der Anlagen, die Prozesskontrolle und die Prüfung des fertigen Teils."
                },

                {
                        "Производственное оборудование должно использоваться только по инструкции. Перед началом работы проверьте состояние оборудования и защитных устройств.",

                        "İstehsalat avadanlığından yalnız təlimata uyğun istifadə edilməlidir. İşə başlamazdan əvvəl avadanlığın və qoruyucu qurğuların vəziyyətini yoxlayın.",

                        "Production equipment must be used according to instructions. Before starting work, check the equipment and safety guards.",

                        "Üretim ekipmanları yalnız talimatlara uygun kullanılmalıdır. İşe başlamadan önce ekipmanın ve koruyucu sistemlerin durumunu kontrol edin.",

                        "Produktionsanlagen dürfen nur gemäß den Anweisungen verwendet werden. Prüfen Sie vor Arbeitsbeginn die Anlage und die Schutzeinrichtungen."
                },

                {
                        "На производстве используются различные металлы и материалы. Важно знать их свойства, маркировку и требования к обработке.",

                        "İstehsalatda müxtəlif metallar və materiallardan istifadə olunur. Onların xüsusiyyətlərini, markalanmasını və emal tələblərini bilmək vacibdir.",

                        "Different metals and materials are used in production. It is important to know their properties, identification and processing requirements.",

                        "Üretimde çeşitli metaller ve malzemeler kullanılır. Bunların özelliklerini, işaretlerini ve işleme gerekliliklerini bilmek önemlidir.",

                        "In der Produktion werden verschiedene Metalle und Materialien verwendet. Es ist wichtig, ihre Eigenschaften, Kennzeichnung und Bearbeitungsanforderungen zu kennen."
                },

                {
                        "Технологический процесс определяет последовательность операций: подготовка, обработка, контроль и получение готовой детали.",

                        "Texnoloji proses əməliyyatların ardıcıllığını müəyyən edir: hazırlıq, emal, nəzarət və hazır detalın alınması.",

                        "The manufacturing process defines the sequence of operations: preparation, machining, inspection and production of the finished part.",

                        "Üretim süreci işlemlerin sırasını belirler: hazırlık, işleme, kontrol ve bitmiş parçanın elde edilmesi.",

                        "Der Fertigungsprozess legt die Reihenfolge der Arbeitsgänge fest: Vorbereitung, Bearbeitung, Prüfung und Herstellung des fertigen Teils."
                },

                {
                        "CNC станки работают по управляющей программе. Оператор должен проверить программу, инструмент, заготовку и безопасную работу станка.",

                        "CNC dəzgahları idarəetmə proqramı ilə işləyir. Operator proqramı, aləti, materialı və dəzgahın təhlükəsiz işləməsini yoxlamalıdır.",

                        "CNC machines operate using a control program. The operator must check the program, tool, workpiece and safe machine operation.",

                        "CNC tezgâhları bir kontrol programı ile çalışır. Operatör programı, takımı, iş parçasını ve tezgâhın güvenli çalışmasını kontrol etmelidir.",

                        "CNC-Maschinen arbeiten mit einem Steuerungsprogramm. Der Bediener muss das Programm, das Werkzeug, das Werkstück und den sicheren Maschinenbetrieb prüfen."
                },

                {
                        "Лист 660 используется как производственный материал. Перед обработкой необходимо проверить его размер, состояние и соответствие заданию.",

                        "660 vərəqi istehsalat materialı kimi istifadə olunur. Emaldan əvvəl onun ölçüsü, vəziyyəti və tapşırığa uyğunluğu yoxlanılmalıdır.",

                        "Sheet 660 is used as a production material. Before processing, check its size, condition and compliance with the job requirements.",

                        "660 sac levha üretim malzemesi olarak kullanılır. İşleme başlamadan önce ölçüsünü, durumunu ve işe uygunluğunu kontrol edin.",

                        "Blech 660 wird als Produktionsmaterial verwendet. Prüfen Sie vor der Bearbeitung Größe, Zustand und Übereinstimmung mit dem Auftrag."
                },

                {
                        "Контроль рабочего процесса помогает избежать ошибок. Оператор должен следить за параметрами оборудования, качеством детали и соблюдением технологии.",

                        "İş prosesinə nəzarət səhvlərin qarşısını almağa kömək edir. Operator avadanlığın parametrlərinə, detalın keyfiyyətinə və texnologiyaya əməl olunmasına nəzarət etməlidir.",

                        "Process control helps prevent mistakes. The operator should monitor equipment parameters, part quality and compliance with the process.",

                        "İş sürecinin kontrolü hataların önlenmesine yardımcı olur. Operatör ekipman parametrelerini, parça kalitesini ve sürece uygunluğu takip etmelidir.",

                        "Die Prozesskontrolle hilft, Fehler zu vermeiden. Der Bediener sollte Anlagenparameter, Teilequalität und die Einhaltung des Prozesses überwachen."
                },

                {
                        "Соблюдайте инструкции, используйте необходимые СИЗ и не работайте на неисправном оборудовании. При опасной ситуации остановите работу и сообщите руководителю.",

                        "Təlimatlara əməl edin, lazımi fərdi mühafizə vasitələrindən istifadə edin və nasaz avadanlıqla işləməyin. Təhlükəli vəziyyətdə işi dayandırın və rəhbərə məlumat verin.",

                        "Follow safety instructions, use the required PPE and never operate faulty equipment. In a dangerous situation, stop work and inform your supervisor.",

                        "Talimatlara uyun, gerekli KKD'leri kullanın ve arızalı ekipmanla çalışmayın. Tehlikeli bir durumda işi durdurun ve amirinize haber verin.",

                        "Befolgen Sie die Sicherheitsanweisungen, verwenden Sie die erforderliche PSA und arbeiten Sie niemals mit defekten Anlagen. Halten Sie bei Gefahr die Arbeit an und informieren Sie Ihren Vorgesetzten."
                }
        };

        return texts[number][getLanguageIndex()];
    }

    // =========================
    // LANGUAGE INDEX
    // RU = 0
    // AZ = 1
    // EN = 2
    // TR = 3
    // DE = 4
    // =========================

    private int getLanguageIndex() {

        if (language.equals("AZ")) {
            return 1;
        }

        if (language.equals("EN")) {
            return 2;
        }

        if (language.equals("TR")) {
            return 3;
        }

        if (language.equals("DE")) {
            return 4;
        }

        return 0;
    }
}