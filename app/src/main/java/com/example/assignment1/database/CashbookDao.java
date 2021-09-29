package com.example.assignment1.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CashbookDao {
    @Insert
    long insertCashbook(Cashbook cashbook);

    @Query("Select * from cashbook where id = :id")
    Cashbook findUser(int id);

    @Query("Select * from cashbook")
    List<Cashbook> getAllCashbook();
}
