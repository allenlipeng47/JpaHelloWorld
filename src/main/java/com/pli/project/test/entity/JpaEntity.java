package com.pli.project.test.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lipeng on 2016/11/26.
 */
@Data
@Entity
@Table
public class JpaEntity {

    @Id
    int id;
    String name;

}
