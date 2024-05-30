package com.example.transloc.ui.addtrans;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddtransViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AddtransViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("Add Transformer Fragment");
    }

    public LiveData<String> getText() {return mText ;}

}
