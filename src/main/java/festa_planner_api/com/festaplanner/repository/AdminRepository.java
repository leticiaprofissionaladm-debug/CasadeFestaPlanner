package festa_planner_api.com.festaplanner.repository;

import festa_planner_api.com.festaplanner.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
