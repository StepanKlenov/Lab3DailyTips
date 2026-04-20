package com.example.lab3dailytips.data

import com.example.lab3dailytips.R

object TipsData {

    fun getAllTips(): List<Tip> = listOf(
        Tip(
            day = 1,
            title = "Ежедневная благодарность",
            shortDescription = "Запишите 3 вещи, за которые вы благодарны сегодня.",
            fullDescription = "Полное описание первого совета. Здесь можно написать более длинный текст.",
            imageResId = R.drawable.ic_launcher_foreground
        ),
        Tip(
            day = 2,
            title = "Утренняя прогулка",
            shortDescription = "Пройдитесь 15–20 минут на свежем воздухе.",
            fullDescription = "Полное описание второго совета...",
            imageResId = R.drawable.ic_launcher_foreground
        ),
        Tip(
            day = 3,
            title = "Планирование дня",
            shortDescription = "Составьте список задач на сегодняшний день.",
            fullDescription = "Полное описание третьего совета...",
            imageResId = R.drawable.ic_launcher_foreground
        ),
        Tip(
            day = 4,
            title = "Чтение книги",
            shortDescription = "Прочитайте хотя бы 10 страниц полезной книги.",
            fullDescription = "Полное описание четвёртого совета...",
            imageResId = R.drawable.ic_launcher_foreground
        ),
        Tip(
            day = 5,
            title = "Медитация",
            shortDescription = "Посвятите 5–10 минут медитации или осознанному дыханию.",
            fullDescription = "Полное описание пятого совета...",
            imageResId = R.drawable.ic_launcher_foreground
        )
        // Продолжайте добавлять до 30 советов. Пока достаточно 5 для тестирования.
    )
}