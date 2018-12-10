package com.example.hc.design;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2018/5/25.
 */


public class Friend2DbOpenHelper extends SQLiteOpenHelper {

    public Friend2DbOpenHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int version) {

        super(context, name, factory, version);

    }
    public void onCreate(SQLiteDatabase mEmailsDb){
        ; //TODO
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

        ;
    }
}
