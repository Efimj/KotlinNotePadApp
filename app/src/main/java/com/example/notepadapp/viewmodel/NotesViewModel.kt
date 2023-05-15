package com.example.notepadapp.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

data class NoteCard(
    var title: String,
    val description: String,
    var isSelected: Boolean = false
)

val NoteCards = listOf(
    NoteCard(
        "Покупки на неделю",
        "список продуктов, которые нужно купить на следующую неделю для ежедневных приготовлений пищи.",
    ),
    NoteCard(
        "Список задач на сегодня",
        "перечень задач, которые необходимо выполнить в течение дня для достижения целей.",
    ),
    NoteCard("Идеи для отпуска", "записи о потенциальных местах, которые можно посетить в следующем отпуске."),
    NoteCard("Список любимых книг", "перечень книг, которые прочитал и рекомендую другим для чтения."),
    NoteCard(
        "План тренировок",
        "программа тренировок на неделю, которую нужно выполнить для достижения целей в фитнесе.",
    ),
    NoteCard(
        "Планирование бюджета",
        "записи о расходах и доходах, которые нужно учесть при планировании бюджета на месяц.",
    ),
    NoteCard("Идеи для новых проектов", "идеи о новых проектах, которые можно начать в ближайшее время."),
    NoteCard("Список контактов", "перечень контактов, которые могут быть полезны в работе или личной жизни."),
    NoteCard("План поездки", "записи о дате, месте и бюджете планируемой поездки."),
    NoteCard("Список цитат", "перечень любимых цитат, которые вдохновляют и мотивируют на достижение целей."),
    NoteCard("Список целей на год", "перечень основных целей, которые нужно достичь в течение года."),
    NoteCard(
        "Список дел на выходные",
        "перечень дел, которые можно выполнить на выходных для отдыха и улучшения настроения."
    ),
    NoteCard("Список интересных фильмов", "перечень фильмов, которые рекомендуются к просмотру в свободное время."),
    NoteCard("План обучения новому навыку", "план обучения и практики нового навыка для его освоения."),
    NoteCard("Список желаемых покупок", "перечень вещей, которые хотелось бы приобрести в ближайшее время."),
    NoteCard("План обновления гардероба", "план покупок и обновления гардероба на сезон."),
    NoteCard("Список любимых рецептов", "перечень любимых рецептов, которые можно приготовить для себя и близких."),
    NoteCard("План обновления дома", "план обновления и ремонта дома на ближайшее время."),
    NoteCard("Список целей на месяц", "перечень целей, которые нужно достичь в течение месяца."),
    NoteCard("Идеи для подарков", "записи о потенциальных подарках для близких и друзей на различные праздники."),
    NoteCard("sss", "wddww")
)

class NotesViewModel : ViewModel() {
    private val _selectedNoteCardIndices = mutableStateOf(setOf<Int>())
    val selectedNoteCardIndices: State<Set<Int>> = _selectedNoteCardIndices
    val noteCards = NoteCards
    fun toggleSelectedNoteCard(index: Int) {
        _selectedNoteCardIndices.value = if (_selectedNoteCardIndices.value.contains(index))
            _selectedNoteCardIndices.value.minus(index)
        else
            _selectedNoteCardIndices.value.plus(index)
    }

    var searchText by mutableStateOf("")
}