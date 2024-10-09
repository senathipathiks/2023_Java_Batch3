package com.crimemgt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crimemgt.controller.StationController;
import com.crimemgt.dto.StationDTO;
import com.crimemgt.entity.Admin;
import com.crimemgt.entity.Station;
import com.crimemgt.entity.User;

@SpringBootTest
class JunitforStation {

	@Autowired
	StationController station;

	// for add station
	@Test
	@Disabled
	@Deprecated // deprecated
	void addStation() {
		Station stationEntity = new Station();
		Admin admin = new Admin();

		stationEntity.setStationName("AW1");
		stationEntity.setStationLoc("Anna nagar west");
		stationEntity.setStationPhn(8912476909L);
		stationEntity.setStationCity("Chennai");
		stationEntity.setStationPassword("AW!1");
		admin.setAdminId(1);
		stationEntity.setAdmin(admin);

		Station result = station.addStation(stationEntity);
		assertNotNull(result);

	}

	// for get station by id
	@Test
	void getStationbyId() {

		List<Station> stationid = station.getstationById(1);

		assertNotNull(stationid);
	}

	// get all stations
	@Test
	void getAllstations() {
		List<StationDTO> stations = station.getAllstations();

		assertNotNull(stations);
	}

	// get all stations IDs
	@Test
	void getAllStatonIds() {
		List<Integer> stationIds = station.getAllStationId();
		assertNotNull(stationIds);

	}

	// for get station name and id by location
	@Test
	void getStationnameLocbyId() {

		Object stationLoc = station.getallstationByIdandName("Maduravoyal");

		assertNotNull(stationLoc);
	}

	// check login
	@Test
	 void testLoginStation() {
		@SuppressWarnings("unused")
		Station stationEntity = new Station();
		stationEntity = station.stationLoginn(1001, "M!1");
		assertNotNull(stationEntity);
	}

}
