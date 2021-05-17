package com.fujitsu.repository;

import com.fujitsu.domain.Filter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilterRepository extends JpaRepository<Filter, Integer> {

    Filter findFilterByName(String name);
    Filter findFilterById(int id);
}
