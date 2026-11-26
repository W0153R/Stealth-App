package com.cosmos.unreddit.data.model.preferences

import androidx.datastore.preferences.core.booleanPreferencesKey

data class MediaPreferences(
    val muteVideo: Boolean,
    val autoRotateVideo: Boolean
) {
    object PreferencesKeys {
        val MUTE_VIDEO = booleanPreferencesKey("mute_video")
        val AUTO_ROTATE_VIDEO = booleanPreferencesKey("auto_rotate_video")
    }
}
