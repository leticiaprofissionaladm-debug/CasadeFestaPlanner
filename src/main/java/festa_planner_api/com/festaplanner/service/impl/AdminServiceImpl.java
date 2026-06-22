package festa_planner_api.com.festaplanner.service.impl;
import festa_planner_api.com.festaplanner.model.Admin;
import festa_planner_api.com.festaplanner.repository.AdminRepository;
import festa_planner_api.com.festaplanner.service.AdminService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository repository;

    public AdminServiceImpl(AdminRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Admin> findAll() {
        return repository.findAll();
    }
    @Override
public Admin findById(Long id) {
    return repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Admin não encontrado"));
}

@Override
public Admin save(Admin admin) {
    return repository.save(admin);
}

@Override
public Admin update(Long id, Admin admin) {
    admin.setId(id);
    return repository.save(admin);
}

@Override
public void delete(Long id) {
    repository.deleteById(id);
}
}