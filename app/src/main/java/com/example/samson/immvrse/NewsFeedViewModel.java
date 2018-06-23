package com.example.samson.immvrse;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

public class NewsFeedViewModel extends ViewModel {

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> description = new ObservableField<>();


    public NewsFeedViewModel(String name, String description) {
        this.name.set(name);
        this.description.set(description);
    }
}
