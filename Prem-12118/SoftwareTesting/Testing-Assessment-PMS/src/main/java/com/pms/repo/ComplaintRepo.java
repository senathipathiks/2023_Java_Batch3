// ComplaintRepo.java
package com.pms.repo;

import com.pms.bean.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepo extends JpaRepository<Complaint, Long> {
}
