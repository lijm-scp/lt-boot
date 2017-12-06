package com.bokecc.boot.neo4j.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by lijm on 2017/12/3.
 */
//查询数据时,防止引发递归访问效应
@JsonIdentityInfo(generator = JSOGGenerator.class)
//标志这是一个节点实体
@NodeEntity
public class Actor {
    @GraphId Long id;
    private String name;
    private int born;

    public Actor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }
}
