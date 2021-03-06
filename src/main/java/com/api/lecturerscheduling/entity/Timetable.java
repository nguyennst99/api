package com.api.lecturerscheduling.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "timetable")
@Data
public class Timetable implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "class_timetable_id", nullable = false)
    private Long classTimetableId;

    @Column(name = "slot_id")
    private String slotId;

    @Column(name = "room_id")
    private String roomId;

}
