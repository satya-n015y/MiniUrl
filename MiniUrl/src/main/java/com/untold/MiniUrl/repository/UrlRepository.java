package com.untold.MiniUrl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.untold.MiniUrl.model.UrlMap;

@Repository
public interface UrlRepository extends CrudRepository<UrlMap, String> {

}
