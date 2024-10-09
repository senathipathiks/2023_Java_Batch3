package com.crimemgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crimemgt.dto.StationDTO;
import com.crimemgt.entity.Station;
import com.crimemgt.service.StationService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class StationController {

	@Autowired
	private StationService stationservice;

	@PostMapping("/addStation")
	public Station addStation(@RequestBody Station station) {

		return stationservice.addStation(station);

	}

	@GetMapping("/stationlogin/{stationId}/{stationPassword}")
	public Station stationLoginn(@PathVariable("stationId") int stationId,
			@PathVariable("stationPassword") String stationPassword) {
		return stationservice.stationLogin(stationId, stationPassword);
	}

	@GetMapping("/getStations")
	public List<StationDTO> getAllstations() {
		return stationservice.getAllstations();
	}

	@GetMapping("/getAllstationId")
	public List<Integer> getAllStationId() {
		return stationservice.getAllstationId();
	}

	@GetMapping("/getstationById/{stationId}")
	public List<Station> getstationById(@PathVariable("stationId") int stationId) {
		return stationservice.searchStation(stationId);
	}

	@GetMapping("/getstationByloc/{stationLoc}")
	public Object getallstationByIdandName(@PathVariable("stationLoc") String stationLoc) {
		return stationservice.getStationId(stationLoc);
	}

}
