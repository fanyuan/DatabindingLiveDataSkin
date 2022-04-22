package com.sample.databindinglivedataskin

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData

data class Theme(
    val content: Int,
    val background: Int,
)
object Themes{
    val Default = Theme(Color.RED,Color.GRAY)
    val Day = Theme(Color.BLACK, Color.MAGENTA)
    val Night = Theme(Color.MAGENTA, Color.BLACK)
}

object AppTheme {
    val background = MutableLiveData<ColorStateList>()
    val content = MutableLiveData<ColorStateList>()
    val test = MutableLiveData<Int>()
    val StringDesc = MutableLiveData<String>("abc")

    init {
        update(Themes.Default)
    }

    fun update(theme: Theme) {
        background.value = ColorStateList.valueOf(theme.background)
        content.value = ColorStateList.valueOf(theme.content)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            test.value = Color.BLUE
        };
    }
}