package yz.learning.springboot.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import yz.learning.springboot.entity.Score;

import javax.transaction.Transactional;
import java.util.List;

public interface IScoreDao extends CrudRepository<Score, Integer>{//类型需要写上，不然出现异常
    @Transactional
    @Modifying
    @Query(value = "UPDATE Score s SET s.score = :score WHERE s.id = :id")//JPQL与SQL不同
    int updateScoreById(@Param("score") final float score, @Param("id") final int id);

    @Query("SELECT s FROM Score s")
    List<Score> getList();
}
