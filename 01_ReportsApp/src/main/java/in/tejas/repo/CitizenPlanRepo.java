package in.tejas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.tejas.entity.CitizenPlan;

public interface CitizenPlanRepo  extends JpaRepository<CitizenPlan, Integer>{
	
//	@Query("select distict(planName) from citizenPlan")
//	public List<String>getPlanNames();
//	
//	@Query("select distinct (planStatus) from CitizenPlan")
//	public List<String> getPlanStatus();
}
