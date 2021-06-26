package com.micro.model.attendance;
/*
Created By Dilshan jayasinghe (OurMind Solution) 
Created At 6/24/21
ourmind.lk@gmail.com
+94764867071
*/

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "attendance")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Attendance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_no")
    @NotNull
    private Long employeeNo;

    @Column(name = "date_attend")
    @Temporal(TemporalType.DATE)
    private Date dateAttend;

    @Column(name = "time_in")
    @Temporal(TemporalType.TIME)
    private Date timeIn;

    @Column(name = "time_out")
    @Temporal(TemporalType.TIME)
    private Date timeOut;

    @Column(name = "status")
    private Integer status;

    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;

    @CreatedDate
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @LastModifiedBy
    @Column(name = "modified_by")
    private String modifiedBy;

    @LastModifiedDate
    @Column(name = "modified_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;
}
