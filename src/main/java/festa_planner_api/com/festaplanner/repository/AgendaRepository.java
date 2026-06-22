package festa_planner_api.com.festaplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import festa_planner_api.com.festaplanner.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}