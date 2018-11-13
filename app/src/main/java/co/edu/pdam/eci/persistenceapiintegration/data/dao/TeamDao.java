package co.edu.pdam.eci.persistenceapiintegration.data.dao;

import java.util.List;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;

/**
 * @author Santiago Carrillo
 */

@Dao
public interface TeamDao{

    @Query ("SELECT * FROM team")
    List<Team> getAll();

}

