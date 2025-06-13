package in.tejas.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.tejas.entity.CitizenPlan;
import in.tejas.repo.CitizenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	private CitizenPlanRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		repo.deleteAll();
		//cash plan data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizename("John");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setBenefitAmt(5000.00);
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizename("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental income");;
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizename("Cathy");
		c3.setGender("Fe-Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(5000.00);
		c3.setTerminateDate(LocalDate.now());
		c3.setTerminationRsn("Employed");
		
		
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizename("David");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setBenefitAmt(5000.00);
		
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizename("Robert");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Property Income");;
		
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizename("Orlen");
		c6.setGender("Fe-Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(5000.00);
		c6.setTerminateDate(LocalDate.now());
		c6.setTerminationRsn("Employed");
		
		//medical plan data

		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizename("Charls");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setBenefitAmt(5000.00);
		
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizename("Robert");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Property Income");;
		
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizename("Neel");
		c9.setGender("Fe-Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(5000.00);
		c9.setTerminateDate(LocalDate.now());
		c9.setTerminationRsn("Govt Job");
		
		
		//Employment plan data

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizename("Manish");
		c11.setGender("Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Approved");
		c11.setPlanStartDate(LocalDate.now());
		c11.setBenefitAmt(5000.00);
		
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizename("Moriis");
		c12.setGender("Male");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Denied");
		c12.setDenialReason("Property Income");;
		
		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizename("Karan");
		c13.setGender("Fe-Male");
		c13.setPlanName("Employment");
		c13.setPlanStatus("Terminated");
		c13.setPlanStartDate(LocalDate.now().minusMonths(4));
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenefitAmt(5000.00);
		c13.setTerminateDate(LocalDate.now());
		c13.setTerminationRsn("Govt Job");

		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c11,c12,c13);
		
		repo.saveAll(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
