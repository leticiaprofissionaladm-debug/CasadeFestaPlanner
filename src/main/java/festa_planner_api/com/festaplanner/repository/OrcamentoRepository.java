package festa_planner_api.com.festaplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import festa_planner_api.com.festaplanner.model.Orcamento;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
}