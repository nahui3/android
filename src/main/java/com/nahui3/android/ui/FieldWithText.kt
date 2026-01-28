package com.nahui3.android.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Простой компонент с текстовым полем и текстом под ним.
 *
 * [label] — текст-лейбл у поля ввода.
 */
@Composable
fun FieldWithText(
    modifier: Modifier = Modifier,
    label: String = "Введите текст"
) {
    var value by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = value,
            onValueChange = { value = it },
            label = { Text(text = label) },
            singleLine = true
        )

        Text(
            text = value,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun FieldWithTextPreview() {
    MaterialTheme {
        FieldWithText()
    }
}

