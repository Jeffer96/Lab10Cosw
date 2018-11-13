package co.edu.pdam.eci.persistenceapiintegration.ui.activity;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import co.edu.pdam.eci.persistenceapiintegration.data.AppDatabase_Impl;

import co.edu.pdam.eci.persistenceapiintegration.R;

public class MainActivity
    extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        AppDatabase_Impl db = Room.databaseBuilder(getApplicationContext(), AppDatabase_Impl.class, "database-name").build();
    }
}
