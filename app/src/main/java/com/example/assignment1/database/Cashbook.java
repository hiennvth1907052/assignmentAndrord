package com.example.assignment1.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

@Entity(tableName = "cashbook")
public class Cashbook {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "des")
    public String des;

    @ColumnInfo(name = "price")
    public double price;

//    @ColumnInfo(name = "datecashbook")
//    @TypeConverters(DateConverter.class)
//    public Date datecashbook;
}
