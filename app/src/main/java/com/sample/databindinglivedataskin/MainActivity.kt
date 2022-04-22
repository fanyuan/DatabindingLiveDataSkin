package com.sample.databindinglivedataskin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import com.sample.databindinglivedataskin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var themeJava:ThemeJava;
    lateinit var binding:ActivityMainBinding;
    val user = User()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.act = this

        themeJava = ViewModelProvider(this, AndroidViewModelFactory(getApplication()))
            .get(ThemeJava::class.java)
        binding.themeJava = themeJava;

        binding.user = user

    }

    fun switchColor(view: View) {
        AppTheme.update(Themes.Day)
        //themeJava.blue = 0xffff0000.toInt();

        Toast.makeText(this,"click",Toast.LENGTH_SHORT).show()
        android.R.color.system_accent1_50

        themeJava.color.value = AppUtil.getApp().resources.getColor(R.color.purple_500)//Color.BLUE//resources.getColor(R.color.red)//0xffffff00.toInt()

        themeJava.drawable.value = AppUtil.getApp().getDrawable(R.mipmap.ic_launcher)//AppUtil.getApp().resources.getDrawable(R.mipmap.ic_launcher)

        themeJava.name.value = "改动了"
        themeJava.count.value = 123

        user.name = "名字变动了"
        themeJava.text.set("观察值变动了")

    }

    fun toFragment(view: View) {
        startActivity(Intent(this,FragmentActivity::class.java))
    }
    fun test(msg:String){
        Toast.makeText(this,"test",Toast.LENGTH_SHORT).show()
        Log.d("tag",msg)
        var str = ""
        var flag1 = TextUtils.isEmpty(str)
        var str2 = null
        var flag2 = TextUtils.isEmpty(str2)
        Log.d("tag", "flag1 = $flag1---flag2 = $flag2")
    }
}