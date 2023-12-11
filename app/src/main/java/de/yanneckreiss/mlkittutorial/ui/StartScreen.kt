package de.yanneckreiss.mlkittutorial.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.rememberPermissionState
import de.yanneckreiss.mlkittutorial.ui.camera.CameraScreen


@Composable
fun StartScreen(
    onStartCameraClick: () -> Unit,
    onRequestPermission: () -> Unit,
    hasPermission: Boolean,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Start Camera")
        }

    }
}
//тут я пытался сделать стартовый экран, откуда был бы запуск камеры и раздел с бд, но чёт не вышло, по факту сейчас нигде не используется
