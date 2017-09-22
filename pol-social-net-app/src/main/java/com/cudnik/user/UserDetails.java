package com.cudnik.user;

import com.cudnik.base.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by Bidzis on 9/14/2017.
 */
@Entity
@Table(name = "users_details")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_USER_DETAILS_ID")
public class UserDetails extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
