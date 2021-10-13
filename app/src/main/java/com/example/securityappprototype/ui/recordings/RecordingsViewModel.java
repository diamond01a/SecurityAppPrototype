package com.example.securityappprototype.ui.recordings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecordingsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RecordingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the recordings fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}