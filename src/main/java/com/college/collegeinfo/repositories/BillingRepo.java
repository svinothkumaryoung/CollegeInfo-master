package com.college.collegeinfo.repositories;

import com.college.collegeinfo.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepo extends JpaRepository<Billing,Integer> {
}
