package com.mymemor.mymemor.repository;

import com.mymemor.mymemor.model.Memory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoryRepository extends JpaRepository<Memory, Long> {
    List<Memory> findAllByOrderByCreatedAt();

    List<Memory> findAllByOrderByCreatedAtDesc();

    List<Memory> findAllByOrderByStartDate();

    List<Memory> findAllByOrderByStartDateDesc();
}
