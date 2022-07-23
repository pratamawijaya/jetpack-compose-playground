package com.pwijaya.compose.basic.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pwijaya.compose.ui.theme.JetpackComposePlaygroundTheme

@Composable
fun OnboardingScreen(onContinueClicked:()->Unit) {

    Surface{
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome to basic codelabs")

            Button(onClick = onContinueClicked) {
                Text(text = "Continue")
            }
        }
    }

}

@Preview
@Composable
fun PreviewOnboardingScreen() {
    JetpackComposePlaygroundTheme {
        OnboardingScreen(onContinueClicked = {})
    }
}