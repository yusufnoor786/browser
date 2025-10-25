package com.glassbrowser.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.glassbrowser.presentation.browser.BrowserScreen
import com.glassbrowser.presentation.theme.GlassBrowserTheme
import com.glassbrowser.service.DownloadService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        DownloadService.startService(this)
        
        setContent {
            GlassBrowserTheme {
                val isIncognito by viewModel.isIncognitoMode.collectAsState()
                
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BrowserScreen(
                        isIncognito = isIncognito,
                        onIncognitoToggle = { viewModel.toggleIncognitoMode() }
                    )
                }
            }
        }
    }
}