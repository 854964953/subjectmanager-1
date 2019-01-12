package com.zp.subjectmanager.database.dao;

import com.zp.subjectmanager.database.table.SubjectEntity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;
import io.reactivex.Flowable;

@Dao
public interface SubjectDao {

    @Query("select * from subject")
    Flowable<List<SubjectEntity>> getAll();

    @Query("select * from subject where name = :name and teacher_name = :teacherName")
    Flowable<SubjectEntity> getOne(String name, String teacherName);

    void addOne(SubjectEntity... entities);
}
