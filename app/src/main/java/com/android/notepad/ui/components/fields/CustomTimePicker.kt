package com.android.notepad.ui.components.fields

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.commandiron.wheel_picker_compose.WheelTimePicker
import com.commandiron.wheel_picker_compose.core.TimeFormat
import com.commandiron.wheel_picker_compose.core.WheelPickerDefaults
import com.android.notepad.ui.theme.CustomAppTheme
import java.time.LocalTime

@Composable
fun CustomTimePicker(
    startTime: LocalTime,
    minTime: LocalTime = LocalTime.MIN,
    maxTime: LocalTime = LocalTime.MAX,
    onTimeChange: (LocalTime) -> Unit,
) {
    WheelTimePicker(
        startTime = startTime,
        minTime = minTime,
        maxTime = maxTime,
        timeFormat = TimeFormat.HOUR_24,
        size = DpSize(150.dp, 250.dp),
        rowCount = 5,
        textStyle = MaterialTheme.typography.titleMedium,
        textColor = CustomAppTheme.colors.text,
        selectorProperties = WheelPickerDefaults.selectorProperties(
            enabled = true,
            shape = RoundedCornerShape(15.dp),
            color = CustomAppTheme.colors.secondaryBackground,
            border = BorderStroke(1.dp, CustomAppTheme.colors.active)
        )
    ) { snappedDateTime -> onTimeChange(snappedDateTime) }
}