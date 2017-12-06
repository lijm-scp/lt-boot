package com.bokecc.boot.neo4j.dao;

import com.bokecc.boot.neo4j.dto.Movie;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lijm on 2017/12/3.
 */
@Repository
public interface MovieRepository extends GraphRepository<Movie> {
    Movie findByTitle(@Param("title") String title);
}
