package com.spring.boot.graphql.SpringBootGraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.graphql.SpringBootGraphql.mode.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
