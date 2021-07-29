package com.example.paragon_automation.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenido al Sistema Lector de Silos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}