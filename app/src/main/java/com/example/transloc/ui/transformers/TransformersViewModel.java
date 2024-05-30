package com.example.transloc.ui.transformers;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TransformersViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TransformersViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("The lis of transformers Fragment");
    }

    public LiveData<String> getText() {return mText ;}

}
