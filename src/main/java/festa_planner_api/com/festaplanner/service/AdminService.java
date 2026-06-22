package festa_planner_api.com.festaplanner.service;

import festa_planner_api.com.festaplanner.model.Admin;
import java.util.List;

public interface AdminService {
    List<Admin> findAll();
    Admin findById(Long id);
    Admin save(Admin admin);
    Admin update(Long id, Admin admin);
    void delete(Long id);
}