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

public class StampingActivity extends Activity {

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
        title.setText("🔨  " + getStampingTitle());
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

    private String getStampingTitle() {

        if (language.equals("AZ")) {
            return "Ştamplama";
        }

        if (language.equals("EN")) {
            return "Stamping";
        }

        if (language.equals("TR")) {
            return "Presleme";
        }

        if (language.equals("DE")) {
            return "Stanzen";
        }

        return "Штамповка";
    }

    private String[] getCards() {

        if (language.equals("AZ")) {

            return new String[]{
                    "🔨 Ştamplama nədir?",
                    "❄️ Soyuq ştamplama",
                    "🔥 İsti ştamplama",
                    "⚙️ Ştamplama presləri",
                    "🔧 Ştamplama aləti",
                    "🔩 Materialın hazırlanması",
                    "✅ Keyfiyyətə nəzarət",
                    "🦺 Ştamplama zamanı təhlükəsizlik"
            };

        } else if (language.equals("EN")) {

            return new String[]{
                    "🔨 What is Stamping?",
                    "❄️ Cold Stamping",
                    "🔥 Hot Stamping",
                    "⚙️ Stamping Presses",
                    "🔧 Stamping Tools",
                    "🔩 Material Preparation",
                    "✅ Quality Control",
                    "🦺 Stamping Safety"
            };

        } else if (language.equals("TR")) {

            return new String[]{
                    "🔨 Presleme Nedir?",
                    "❄️ Soğuk Presleme",
                    "🔥 Sıcak Presleme",
                    "⚙️ Pres Tezgâhları",
                    "🔧 Presleme Kalıpları",
                    "🔩 Malzeme Hazırlama",
                    "✅ Kalite Kontrolü",
                    "🦺 Presleme Güvenliği"
            };

        } else if (language.equals("DE")) {

            return new String[]{
                    "🔨 Was ist Stanzen?",
                    "❄️ Kaltstanzen",
                    "🔥 Warmstanzen",
                    "⚙️ Stanzpressen",
                    "🔧 Stanzwerkzeuge",
                    "🔩 Materialvorbereitung",
                    "✅ Qualitätskontrolle",
                    "🦺 Sicherheit beim Stanzen"
            };

        } else {

            return new String[]{
                    "🔨 Что такое штамповка?",
                    "❄️ Холодная штамповка",
                    "🔥 Горячая штамповка",
                    "⚙️ Штамповочные прессы",
                    "🔧 Штамповочный инструмент",
                    "🔩 Подготовка материала",
                    "✅ Контроль качества",
                    "🦺 Безопасность при штамповке"
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
        } else if (language.equals("TR")) {
            back.setText("← Geri");
        } else if (language.equals("DE")) {
            back.setText("← Zurück");
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
                        "Что такое штамповка?",
                        "Ştamplama nədir?",
                        "What is Stamping?",
                        "Presleme Nedir?",
                        "Was ist Stanzen?"
                },

                {
                        "Холодная штамповка",
                        "Soyuq ştamplama",
                        "Cold Stamping",
                        "Soğuk Presleme",
                        "Kaltstanzen"
                },

                {
                        "Горячая штамповка",
                        "İsti ştamplama",
                        "Hot Stamping",
                        "Sıcak Presleme",
                        "Warmstanzen"
                },

                {
                        "Штамповочные прессы",
                        "Ştamplama presləri",
                        "Stamping Presses",
                        "Pres Tezgâhları",
                        "Stanzpressen"
                },

                {
                        "Штамповочный инструмент",
                        "Ştamplama aləti",
                        "Stamping Tools",
                        "Presleme Kalıpları",
                        "Stanzwerkzeuge"
                },

                {
                        "Подготовка материала",
                        "Materialın hazırlanması",
                        "Material Preparation",
                        "Malzeme Hazırlama",
                        "Materialvorbereitung"
                },

                {
                        "Контроль качества",
                        "Keyfiyyətə nəzarət",
                        "Quality Control",
                        "Kalite Kontrolü",
                        "Qualitätskontrolle"
                },

                {
                        "Безопасность при штамповке",
                        "Ştamplama zamanı təhlükəsizlik",
                        "Stamping Safety",
                        "Presleme Güvenliği",
                        "Sicherheit beim Stanzen"
                }
        };

        return titles[number][getLanguageIndex()];
    }

    private String getInfoText(int number) {

        String[][] texts = {

                {
                        "Штамповка — это технологический процесс обработки металла давлением с использованием штампа и пресса. Метод позволяет получать детали нужной формы и размеров.",

                        "Ştamplama metalın ştamp və pres vasitəsilə təzyiq altında emal prosesidir. Bu üsul tələb olunan forma və ölçüdə detallar almağa imkan verir.",

                        "Stamping is a metal forming process that uses a die and press. It allows parts with the required shape and dimensions to be produced.",

                        "Presleme, kalıp ve pres kullanılarak metale basınç uygulanan bir şekillendirme işlemidir. Bu yöntem, istenilen şekil ve ölçülerde parçalar üretmeyi sağlar.",

                        "Stanzen ist ein Verfahren zur Umformung von Metall mit einem Werkzeug und einer Presse. Damit können Teile mit der gewünschten Form und Größe hergestellt werden."
                },

                {
                        "Холодная штамповка выполняется без нагрева заготовки. Она применяется для получения деталей из листового и других металлических материалов.",

                        "Soyuq ştamplama material qızdırılmadan aparılır. Bu üsul təbəqə və digər metal materiallardan detallar hazırlamaq üçün istifadə olunur.",

                        "Cold stamping is performed without heating the workpiece. It is used to produce parts from sheet and other metal materials.",

                        "Soğuk presleme, iş parçası ısıtılmadan yapılır. Sac ve diğer metal malzemelerden parça üretmek için kullanılır.",

                        "Kaltstanzen wird ohne Erwärmung des Werkstücks durchgeführt. Es wird zur Herstellung von Teilen aus Blech und anderen Metallwerkstoffen eingesetzt."
                },

                {
                        "Горячая штамповка выполняется при повышенной температуре металла. Нагрев делает металл более пластичным и облегчает формирование детали.",

                        "İsti ştamplama metalın yüksək temperaturda emal edilməsidir. Qızdırma metalı daha plastik edir və detalın formalaşdırılmasını asanlaşdırır.",

                        "Hot stamping is performed at an elevated metal temperature. Heating makes the metal more plastic and easier to form.",

                        "Sıcak presleme, metal yüksek sıcaklıktayken yapılır. Isıtma metali daha plastik hale getirir ve parçanın şekillendirilmesini kolaylaştırır.",

                        "Warmstanzen wird bei erhöhter Metalltemperatur durchgeführt. Durch das Erwärmen wird das Metall plastischer und die Umformung erleichtert."
                },

                {
                        "Штамповочные прессы создают усилие, необходимое для деформации металла. Перед работой оператор должен проверить пресс, инструмент и защитные устройства.",

                        "Ştamplama presləri metalın deformasiyası üçün lazım olan qüvvəni yaradır. İşdən əvvəl operator presi, aləti və qoruyucu qurğuları yoxlamalıdır.",

                        "Stamping presses provide the force needed to form metal. Before operation, the operator must check the press, tool and safety guards.",

                        "Pres tezgâhları metali şekillendirmek için gerekli kuvveti oluşturur. Çalışmadan önce operatör presi, kalıbı ve koruyucu sistemleri kontrol etmelidir.",

                        "Stanzpressen erzeugen die Kraft, die zur Umformung des Metalls erforderlich ist. Vor der Arbeit muss der Bediener Presse, Werkzeug und Schutzeinrichtungen prüfen."
                },

                {
                        "Штамповочный инструмент определяет форму детали. Инструмент должен быть исправным, правильно установленным и соответствовать технологическому процессу.",

                        "Ştamplama aləti detalın formasını müəyyən edir. Alət saz vəziyyətdə olmalı, düzgün quraşdırılmalı və texnoloji prosesə uyğun olmalıdır.",

                        "The stamping tool determines the shape of the part. It must be in good condition, correctly installed and suitable for the process.",

                        "Presleme kalıbı parçanın şeklini belirler. Kalıp sağlam durumda olmalı, doğru şekilde takılmalı ve prosese uygun olmalıdır.",

                        "Das Stanzwerkzeug bestimmt die Form des Teils. Es muss in einwandfreiem Zustand sein, korrekt installiert werden und zum Prozess passen."
                },

                {
                        "Перед штамповкой необходимо проверить материал: размер, толщину, состояние поверхности и соответствие заданию.",

                        "Ştamplamadan əvvəl materialın ölçüsü, qalınlığı, səthinin vəziyyəti və tapşırığa uyğunluğu yoxlanılmalıdır.",

                        "Before stamping, check the material size, thickness, surface condition and compliance with the job requirements.",

                        "Presleme işleminden önce malzemenin ölçüsünü, kalınlığını, yüzey durumunu ve işe uygunluğunu kontrol edin.",

                        "Vor dem Stanzen müssen Größe, Dicke, Oberflächenzustand und Übereinstimmung des Materials mit dem Auftrag geprüft werden."
                },

                {
                        "Контролируйте размеры, форму и внешний вид детали. При обнаружении дефекта остановите процесс и сообщите ответственному специалисту.",

                        "Detalın ölçülərini, formasını və görünüşünü yoxlayın. Qüsur aşkar edilərsə prosesi dayandırın və məsul şəxsə məlumat verin.",

                        "Check the dimensions, shape and appearance of the part. If a defect is found, stop the process and inform the responsible person.",

                        "Parçanın ölçülerini, şeklini ve görünümünü kontrol edin. Bir kusur bulunursa işlemi durdurun ve sorumlu kişiye bildirin.",

                        "Kontrollieren Sie die Maße, Form und Oberfläche des Teils. Wenn ein Fehler festgestellt wird, stoppen Sie den Prozess und informieren Sie die zuständige Person."
                },

                {
                        "При работе на прессе используйте необходимые СИЗ. Не помещайте руки в опасную зону. Перед обслуживанием оборудования отключите энергию.",

                        "Presdə işləyərkən lazımi fərdi mühafizə vasitələrindən istifadə edin. Əllərinizi təhlükəli zonaya salmayın. Texniki xidmətdən əvvəl enerjini söndürün.",

                        "Use the required PPE when working with a press. Keep your hands out of the danger zone. Isolate the energy before maintenance.",

                        "Presle çalışırken gerekli KKD'leri kullanın. Ellerinizi tehlikeli bölgeye sokmayın. Bakım yapmadan önce enerjiyi izole edin.",

                        "Verwenden Sie bei der Arbeit an der Presse die erforderliche PSA. Halten Sie Ihre Hände aus dem Gefahrenbereich. Vor Wartungsarbeiten muss die Energie abgeschaltet und gesichert werden."
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

        if (language.equals("TR")) {
            return 3;
        }

        if (language.equals("DE")) {
            return 4;
        }

        return 0;
    }
}