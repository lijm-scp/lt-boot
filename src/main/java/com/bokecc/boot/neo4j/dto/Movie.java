package com.bokecc.boot.neo4j.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijm on 2017/12/3.
 */
//查询数据时,防止引发递归访问效应
@JsonIdentityInfo(generator = JSOGGenerator.class)
//标志这是一个节点实体
@NodeEntity
public class Movie {
    @GraphId
    Long id;
    String title;
    String year;
    String tagline;
    //@Relationship表示roles是一个关系列表,tyoe设定了关系类型,direction设定这个关系的方向
    //Relationship.INCOMING表示以这个节点为终点
    @Relationship(type = "ACTS_IN", direction = Relationship.INCOMING)
    List<Role> roles = new ArrayList<Role>();

    public Role addRole(Actor actor, String name) {
        Role role = new Role(actor, this, name);
        this.roles.add(role);
        return role;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
