# Keep model classes
-keep class com.glassbrowser.domain.model.** { *; }
-keep class com.glassbrowser.data.model.** { *; }

# Keep WebView JavaScript interfaces
-keepclassmembers class fqcn.of.javascript.interface.for.webview {
   public *;
}

# Keep Hilt
-keep class * extends androidx.hilt.lifecycle.ViewModelAssistedFactory { *; }