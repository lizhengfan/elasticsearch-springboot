package com.lovefinal.elasticsearch.repository;

import com.lovefinal.elasticsearch.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description TODO
 * @ClassName DocumentRepository
 * @Author lizhengfan
 * @Date 2019/5/24 17:58
 * @Version 1.0.0
 **/
public interface DocumentRepository extends JpaRepository<Document, Integer> {
}
