package com.workerpro.v3;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class QualityControlActivity extends Activity {

    private LinearLayout mainLayout;
    private String language = "RU";

    private final int green = Color.rgb(0, 150, 80);
    private final int darkGreen = Color.rgb(0, 105, 60);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String lang = getIntent().getStringExtra("LANGUAGE");

        if (lang != null) {
            language = lang;
        }

        showMainScreen();
    }

    private void showMainScreen() {

        ScrollView scrollView = new ScrollView(this);
        scrollView.setBackgroundColor(Color.rgb(245, 248, 246));

        mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setPadding(16, 16, 16, 20);

        scrollView.addView(mainLayout);

        createHeader();
        createCards();
        createDeveloper();
        createBackButton();

        setContentView(scrollView);
    }

    private void createHeader() {

        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        header.setGravity(Gravity.CENTER);
        header.setPadding(10, 18, 10, 18);

        GradientDrawable headerBg = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{green, darkGreen}
        );

        headerBg.setCornerRadius(28);
        header.setBackground(headerBg);

        TextView title = new TextView(this);

        title.setText("✅  " + getHeaderTitle());
        title.setTextColor(Color.WHITE);
        title.setTextSize(24);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        header.addView(title);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(0, 0, 0, 12);

        mainLayout.addView(header, params);
    }

    private String getHeaderTitle() {

        if (language.equals("AZ")) {
            return "Keyfiyyətə nəzarət";
        }

        if (language.equals("EN")) {
            return "Quality Control";
        }

        return "Контроль качества";
    }

    private void createCards() {

        addCard(1, "🔍");
        addCard(2, "📏");
        addCard(3, "👀");
        addCard(4, "⚙️");
        addCard(5, "🧪");
        addCard(6, "❌");
        addCard(7, "📋");
        addCard(8, "🦺");
    }

    private void addCard(final int number, String icon) {

        TextView card = new TextView(this);

        card.setText(icon + "  " + getTitle(number));
        card.setTextSize(17);
        card.setTextColor(darkGreen);
        card.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        card.setGravity(Gravity.CENTER_VERTICAL);
        card.setPadding(20, 0, 20, 0);
        card.setClickable(true);

        GradientDrawable cardBg = new GradientDrawable();

        cardBg.setColor(Color.WHITE);
        cardBg.setCornerRadius(20);
        cardBg.setStroke(2, green);

        card.setBackground(cardBg);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        62
                );

        params.setMargins(0, 0, 0, 10);

        mainLayout.addView(card, params);

        card.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showDetails(number);
            }
        });
    }

    private String getTitle(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "Keyfiyyətə nəzarətin əsasları";

                case 2:
                    return "Ölçülərin yoxlanılması";

                case 3:
                    return "Vizual nəzarət";

                case 4:
                    return "Detalların yoxlanılması";

                case 5:
                    return "Dağıdıcı olmayan nəzarət";

                case 6:
                    return "Detalların qüsurları";

                case 7:
                    return "Sənədləşmə və ölçmələr";

                case 8:
                    return "Nəzarət zamanı təhlükəsizlik";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "Quality Control Basics";

                case 2:
                    return "Dimensional Inspection";

                case 3:
                    return "Visual Inspection";

                case 4:
                    return "Part Inspection";

                case 5:
                    return "Non-Destructive Testing";

                case 6:
                    return "Part Defects";

                case 7:
                    return "Documentation and Measurements";

                case 8:
                    return "Safety During Inspection";
            }
        }

        switch (number) {

            case 1:
                return "Основы контроля качества";

            case 2:
                return "Проверка размеров";

            case 3:
                return "Визуальный контроль";

            case 4:
                return "Контроль деталей";

            case 5:
                return "Неразрушающий контроль";

            case 6:
                return "Дефекты деталей";

            case 7:
                return "Документация и измерения";

            case 8:
                return "Безопасность при контроле";
        }

        return "";
    }

    private void showDetails(int number) {

        mainLayout.removeAllViews();

        TextView title = new TextView(this);

        title.setText("✅  " + getTitle(number));
        title.setTextSize(22);
        title.setTextColor(Color.WHITE);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(15, 20, 15, 20);

        GradientDrawable titleBg = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{green, darkGreen}
        );

        titleBg.setCornerRadius(25);
        title.setBackground(titleBg);

        mainLayout.addView(title);

        TextView info = new TextView(this);

        info.setText(getInfoText(number));
        info.setTextSize(17);
        info.setTextColor(Color.DKGRAY);
        info.setPadding(20, 25, 20, 25);

        GradientDrawable infoBg = new GradientDrawable();

        infoBg.setColor(Color.WHITE);
        infoBg.setCornerRadius(20);
        infoBg.setStroke(2, green);

        info.setBackground(infoBg);

        LinearLayout.LayoutParams infoParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        infoParams.setMargins(0, 15, 0, 15);

        mainLayout.addView(info, infoParams);

        TextView back = new TextView(this);

        if (language.equals("AZ")) {
            back.setText("← Geri");
        } else if (language.equals("EN")) {
            back.setText("← Back");
        } else {
            back.setText("← Назад");
        }

        back.setTextSize(17);
        back.setTextColor(Color.WHITE);
        back.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        back.setGravity(Gravity.CENTER);
        back.setClickable(true);

        GradientDrawable backBg = new GradientDrawable();

        backBg.setColor(green);
        backBg.setCornerRadius(18);

        back.setBackground(backBg);

        LinearLayout.LayoutParams backParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        58
                );

        mainLayout.addView(back, backParams);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showMainScreen();
            }
        });

        createDeveloper();
    }

    private String getInfoText(int number) {

        if (language.equals("AZ")) {

            switch (number) {

                case 1:
                    return "Keyfiyyətə nəzarət məhsulun və detalın texniki tələblərə uyğunluğunun yoxlanılmasıdır.\n\nÖlçülər, material, görünüş və digər göstəricilər yoxlanılır.";

                case 2:
                    return "Detalların ölçüləri ştangensirkul, mikrometr və digər ölçü alətləri ilə yoxlanılır.\n\nÖlçmədən əvvəl alətin sazlığını yoxlayın.";

                case 3:
                    return "Vizual nəzarət zamanı detalın səthi diqqətlə yoxlanılır.\n\nÇatlar, cızıqlar, deformasiya və digər görünən qüsurlar aşkar edilir.";

                case 4:
                    return "Detalın ölçüləri, forması və texniki vəziyyəti çertyoj və texniki sənədlərlə müqayisə edilir.";

                case 5:
                    return "Dağıdıcı olmayan nəzarət detalı zədələmədən qüsurları aşkar etməyə imkan verir.\n\nMəsələn: maqnit və ultrasəs nəzarəti.";

                case 6:
                    return "Əsas qüsurlara çatlar, deformasiyalar, ölçü uyğunsuzluğu, səth qüsurları və material problemləri daxildir.";

                case 7:
                    return "Ölçmə nəticələri və nəzarət məlumatları düzgün qeyd edilməlidir.\n\nSənədlər müəssisənin tələblərinə uyğun saxlanmalıdır.";

                case 8:
                    return "Nəzarət zamanı fərdi mühafizə vasitələrindən istifadə edin.\n\nÖlçü alətlərindən düzgün istifadə edin və təhlükəli avadanlığa yaxınlaşmayın.";
            }
        }

        if (language.equals("EN")) {

            switch (number) {

                case 1:
                    return "Quality control checks whether a product or part meets technical requirements.\n\nDimensions, material, appearance and other parameters are inspected.";

                case 2:
                    return "Part dimensions are checked using a caliper, micrometer and other measuring tools.\n\nCheck the tool condition before measuring.";

                case 3:
                    return "During visual inspection, the surface of the part is carefully checked.\n\nCracks, scratches, deformation and other visible defects are identified.";

                case 4:
                    return "The dimensions, shape and technical condition of the part are compared with the drawing and technical documentation.";

                case 5:
                    return "Non-destructive testing allows defects to be detected without damaging the part.\n\nExamples include magnetic and ultrasonic testing.";

                case 6:
                    return "Common defects include cracks, deformation, incorrect dimensions, surface defects and material problems.";

                case 7:
                    return "Measurement results and inspection data must be recorded correctly.\n\nDocuments should be stored according to company requirements.";

                case 8:
                    return "Use personal protective equipment during inspection.\n\nUse measuring tools correctly and do not approach dangerous equipment.";
            }
        }

        switch (number) {

            case 1:
                return "Контроль качества проверяет, соответствует ли изделие или деталь техническим требованиям.\n\nПроверяются размеры, материал, внешний вид и другие параметры.";

            case 2:
                return "Размеры деталей проверяются штангенциркулем, микрометром и другими измерительными инструментами.\n\nПеред измерением убедитесь, что инструмент исправен.";

            case 3:
                return "При визуальном контроле поверхность детали внимательно осматривается.\n\nВыявляются трещины, царапины, деформации и другие видимые дефекты.";

            case 4:
                return "Размеры, форма и техническое состояние детали сравниваются с чертежом и технической документацией.";

            case 5:
                return "Неразрушающий контроль позволяет обнаруживать дефекты без повреждения детали.\n\nНапример: магнитный и ультразвуковой контроль.";

            case 6:
                return "К основным дефектам относятся трещины, деформации, неправильные размеры, дефекты поверхности и проблемы с материалом.";

            case 7:
                return "Результаты измерений и данные контроля должны записываться правильно.\n\nДокументация хранится согласно требованиям предприятия.";

            case 8:
                return "При контроле используйте средства индивидуальной защиты.\n\nПравильно используйте измерительные инструменты и не приближайтесь к опасному оборудованию.";
        }

        return "";
    }

    private void createDeveloper() {

        TextView developer = new TextView(this);

        developer.setText("F.S");
        developer.setTextSize(13);
        developer.setTextColor(Color.GRAY);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 15, 0, 10);

        mainLayout.addView(developer);
    }

    private void createBackButton() {

        TextView back = new TextView(this);

        if (language.equals("AZ")) {
            back.setText("← Əsas menyu");
        } else if (language.equals("EN")) {
            back.setText("← Main Menu");
        } else {
            back.setText("← Главное меню");
        }

        back.setTextSize(17);
        back.setTextColor(Color.WHITE);
        back.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        back.setGravity(Gravity.CENTER);
        back.setClickable(true);

        GradientDrawable bg = new GradientDrawable();

        bg.setColor(green);
        bg.setCornerRadius(18);

        back.setBackground(bg);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        58
                );

        params.setMargins(0, 5, 0, 0);

        mainLayout.addView(back, params);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}