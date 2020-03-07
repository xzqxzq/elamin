package me.zhengjie.gen.repository;

import me.zhengjie.gen.domain.GenTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author Zheng Jie
* @date 2020-03-07
*/
public interface GenTestRepository extends JpaRepository<GenTest, Integer>, JpaSpecificationExecutor<GenTest> {
}