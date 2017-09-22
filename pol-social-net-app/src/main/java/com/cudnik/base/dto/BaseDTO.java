package com.cudnik.base.dto;

import java.util.Date;

/**
 * Created by Bidzis on 9/14/2017.
 */
public class BaseDTO {
    private Long id;
    private Date techDate;

    public BaseDTO() {
    }

    public BaseDTO(Long id, Date techDate) {
        this.id = id;
        this.techDate = techDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTechDate() {
        return techDate;
    }

    public void setTechDate(Date techDate) {
        this.techDate = techDate;
    }
}
