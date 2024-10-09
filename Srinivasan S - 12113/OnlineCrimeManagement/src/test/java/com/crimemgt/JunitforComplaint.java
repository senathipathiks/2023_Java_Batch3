package com.crimemgt;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crimemgt.controller.ComplaintController;
import com.crimemgt.entity.Complaint;
import com.crimemgt.entity.Station;
import com.crimemgt.entity.User;


@SpringBootTest
class JunitforComplaint {

	@Autowired
	ComplaintController complaintController;

	// for add complaint
	@Test
//	@Disabled
//	@Deprecated //deprecated
	void addComplaint() {
		
		Complaint complaint=new Complaint();
		User user=new User();
		
		Station station=new Station();
		
		complaint.setComplaintType("Other Complaints");
		complaint.setDescription("My laptop has missed");
		complaint.setIncidentTime(LocalDateTime.parse("2018-11-03T12:45:30"));
		complaint.setpriority("High");
		user.setUserId(1);
		station.setStationId(1001);
		complaint.setUser(user);

		complaint.setStation(station);
		
		Complaint result=complaintController.addComplaint(complaint);
		
		assertNotNull(result);
		
	}
	
	// for approve complaint
	@Test
	void approveComplaint() {

		boolean complaint1 = complaintController.updateComplaint(1);

		assertTrue(complaint1);
	}

	// for reject complaint
	@Test
	void rejectComplaint() {

		boolean complaint1 = complaintController.updateComplaint(2);

		assertTrue(complaint1);
	}

	// get complaints
	@Test
	void getAllcomplaints() {
		List<Complaint> list = complaintController.getAllcomplaints();
		assertNotNull(list);
	}

	// get pending complaints
	@Test
	void getPending() {
		List<Complaint> list1 = complaintController.getPendingcomplaints(1);
		assertNotNull(list1);

	}

	// get solved complaints
	@Test
	void getSolved() {
		List<Complaint> list2 = complaintController.getSolvedcomplaints(2);
		assertNotNull(list2);

	}

	// get withdrawn complaints
	@Test
	void getWithdrawn() {
		List<Complaint> list3 = complaintController.getRejectedcomplaints(1);
		assertNotNull(list3);

	}

	// to get pending count
	@Test
	void pendingCount() {
		Object pending = complaintController.pendingCount(1);
		assertNotNull(pending);
	}

	// get solved complaints
	@Test
	void solvedCount() {
		Object solved = complaintController.solvedCount(1);
		assertNotNull(solved);

	}

	// get withdrawn complaints
	@Test
	void withdrawnCount() {
		Object withdrawn = complaintController.withdrawCount(1);
		assertNotNull(withdrawn);

	}

	//get high priority complaints
	@Test
	void highPriority() {
		List<Complaint>high=complaintController.getHighPriorityComplaints();
		assertNotNull(high);
	}
	
	//get medium priority complaints
		@Test
		void mediumPriority() {
			List<Complaint>medium=complaintController.getMediumPriorityComplaints();
			assertNotNull(medium);
		}
		
		//get low priority complaints
				@Test
				void lowPriority() {
					List<Complaint>low=complaintController.getLowPriorityComplaints();
					assertNotNull(low);
				}

}
