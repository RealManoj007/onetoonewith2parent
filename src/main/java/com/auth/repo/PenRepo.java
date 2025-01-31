package com.auth.repo;

import com.auth.entity.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PenRepo extends JpaRepository<Pen, Integer> {
}
