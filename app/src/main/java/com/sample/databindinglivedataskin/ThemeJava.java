package com.sample.databindinglivedataskin;

import android.database.Observable;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThemeJava extends ViewModel {
    private int blue = 0xff0000ff;
    public MutableLiveData<Integer> color = new MutableLiveData(0xff000000);
    public MutableLiveData<Drawable> drawable = new MutableLiveData<>(new ColorDrawable(Color.CYAN));
    public MutableLiveData<String> name = new MutableLiveData("name0");
    public MutableLiveData<Integer> count = new MutableLiveData(0);

    public ObservableField<String> text = new ObservableField<>("ObservableField初始值");

//    public String desc = "描述";
//    @Bindable
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//        notifyPropertyChanged(BR.desc);
//    }

//    @Bindable
//    public int getBlue() {
//        return blue;
//    }
//
//    public void setBlue(int blue) {
//        this.blue = blue;
//        notifyPropertyChanged(BR.blue);
//    }


}
