package com.glassbrowser.domain.model

data class Tab(
    val id: String,
    val url: String,
    val title: String,
    val favicon: String? = null,
    val isLoading: Boolean = false,
    val progress: Int = 0
)