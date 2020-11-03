package com.example.mvvm_room_demo_cgpa;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Semister.class}, version = 1, exportSchema = false)
public abstract class SemisterDatabase extends RoomDatabase {

    public abstract SemisterDao semisterDao();

    private static volatile SemisterDatabase INSTANCE;


    static SemisterDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (SemisterDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            SemisterDatabase.class, "semister_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
