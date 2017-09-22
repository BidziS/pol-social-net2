package com.cudnik.authority;

import com.cudnik.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Bidzis on 9/14/2017.
 */
@Entity
@Table(name = "authorities")
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_AUTHORITY_ID")
public class Authority extends BaseEntity {

    @NotNull
    private String name;

    public Authority() {
    }

    public Authority(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}