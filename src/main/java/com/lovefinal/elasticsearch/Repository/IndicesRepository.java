package com.lovefinal.elasticsearch.Repository;

import com.lovefinal.elasticsearch.entity.Indices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @ClassName IndicesRepository
 * @Author lizhengfan
 * @Date 2019/5/22 10:33
 * @Version 1.0.0
 **/
@Repository
public interface IndicesRepository extends JpaRepository<Indices,Integer> {
}
