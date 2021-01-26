package com.api.lecturerscheduling.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "class_timetable")
@Data
public class ClassTimetable implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "class_id")
    private String classId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "course_id")
    private String courseId;

}
