package festa_planner_api.com.festaplanner.controller;

import festa_planner_api.com.festaplanner.model.Admin;
import festa_planner_api.com.festaplanner.service.AdminService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    // GET http://localhost:8080/api/admin
    @GetMapping
    public ResponseEntity<List<Admin>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    // GET http://localhost:8080/api/admin/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Admin> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    // POST http://localhost:8080/api/admin
    @PostMapping
    public ResponseEntity<Admin> save(@RequestBody Admin admin) {
        return ResponseEntity.ok(service.save(admin));
    }

    // PUT http://localhost:8080/api/admin/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Admin> update(@PathVariable Long id, @RequestBody Admin admin) {
        return ResponseEntity.ok(service.update(id, admin));
    }

    // DELETE http://localhost:8080/api/admin/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}