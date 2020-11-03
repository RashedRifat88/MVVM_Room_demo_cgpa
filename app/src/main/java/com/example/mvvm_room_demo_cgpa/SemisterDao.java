package com.example.mvvm_room_demo_cgpa;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface SemisterDao {

    @Insert
    long[] insertSemister(Semister semister);

    @Update
    void updateSemister(Semister semister);

    @Delete
    void deleteSemister(Semister semister);

    @Query("select * from Semister order by semister_name")
    LiveData<List<Semister>> getAllSemister();

    @Query("delete from Semister")
    void deleteAllSemisterData();
}
