package com.glassbrowser.domain.model

data class DownloadItem(
    val id: String,
    val fileName: String,
    val url: String,
    val totalBytes: Long,
    val bytesDownloaded: Long,
    val progress: Int,
    val downloadSpeed: Long,
    val status: Status
) {
    enum class Status {
        PENDING, DOWNLOADING, PAUSED, COMPLETED, FAILED, CANCELLED
    }
}