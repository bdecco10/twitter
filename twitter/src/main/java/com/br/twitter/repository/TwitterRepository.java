package com.br.twitter.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.twitter.model.TwitterEntity;

@Repository
public interface TwitterRepository extends CrudRepository<TwitterEntity, Long> {

	@Query("SELECT COUNT(v) FROM TwitterEntity v WHERE v.hour=:hour")
	public Long getAllPostByHour(@Param(value = "hour") Date hour);
	
	@Query("SELECT v FROM TwitterEntity v WHERE ROWNUM <= 5 order by v.followers desc ")
	public List<TwitterEntity> getTopFiveFollowers();
	
	@Query("SELECT v FROM TwitterEntity v WHERE v.id=:id")
	public List<TwitterEntity> getAllPostByTag(@Param(value = "id") Long id);

}
