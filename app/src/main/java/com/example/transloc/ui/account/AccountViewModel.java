package com.example.transloc.ui.account;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AccountViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AccountViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("The users Account Fragment");
    }

    public LiveData<String> getText() {return mText ;}

}
