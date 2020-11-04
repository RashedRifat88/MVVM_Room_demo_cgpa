package com.example.mvvm_room_demo_cgpa;

import android.app.Application;

import java.util.List;

import androidx.lifecycle.LiveData;

public class Repository {
    public SemisterDao semisterDao;
    LiveData<List<Semister>> allSemister;

    Repository(Application application){
        SemisterDatabase semisterDatabase = SemisterDatabase.getDatabase(application);
        semisterDao = semisterDatabase.semisterDao();
        allSemister = semisterDao.getAllSemister();
    }

    public LiveData<List<Semister>> getAllSemister() {
        return allSemister;
    }
}
