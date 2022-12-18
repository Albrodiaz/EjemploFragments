package com.example.ejemplofragment.viewmodelcom;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentsViewModel extends ViewModel {
    //Comunicación entre Fragments
    private final MutableLiveData<String> sharedText = new MutableLiveData<>();

    public LiveData<String> getSharedText() {
        return sharedText;
    }

    public void setSharedText(String text) {
        sharedText.setValue(text);
    }

    //Comunicación Fragment-Activity
    private final MutableLiveData<String> toolbarTitle = new MutableLiveData<>();

    public LiveData<String> getToolbarTitle() {
        return toolbarTitle;
    }

    public void setToolbarTitle(String title) {
        toolbarTitle.setValue(title);
    }
}
