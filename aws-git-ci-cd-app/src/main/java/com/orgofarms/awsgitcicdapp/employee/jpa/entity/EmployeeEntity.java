package com.orgofarms.awsgitcicdapp.employee.jpa.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(
        name = "employees",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_employees_personal_email", columnNames = "personal_email"),
                @UniqueConstraint(name = "uk_employees_phone_no", columnNames = "phone_no")
        },
        indexes = {
                //@Index(name = "index_employees_emp_id", columnList = "emp_id"),
                @Index(name = "index_employees_phone_no", columnList = "phone_no"),
                @Index(name = "index_employees_personal_email", columnList = "personal_email")
        }
)
public class EmployeeEntity {
    @Id
    @Column(name = "emp_id", nullable = false, unique = true)
    private Integer empId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dept")
    private String dept;

    @Column(name = "salary", columnDefinition = "decimal(12,2) not null default 0.0")
    private BigDecimal salary;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "personal_email")
    private String personalEmail;

    @Column(name = "last_mod_user", columnDefinition = "varchar(255) not null default 'SYSTEM'")
    private String lastModUser;

    @Column(name = "last_mod_time_date", columnDefinition = "timestamp not null default current_timestamp")
    private Timestamp lastModTimeDate;
}
