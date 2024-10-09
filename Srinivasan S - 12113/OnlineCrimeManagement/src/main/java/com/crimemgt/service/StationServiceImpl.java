package com.crimemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crimemgt.dao.StationDAO;
import com.crimemgt.dto.StationDTO;
import com.crimemgt.entity.Station;

@Service
@Transactional
public class StationServiceImpl implements StationService{

	@Autowired
	StationDAO stationdao;
	
	
	@Override
	public List<StationDTO> getAllstations() {
		
		return stationdao.getAllStations();
	}


	@Override
	public Station addStation(Station station) {
		return stationdao.addStation(station);
	}


	@Override
	public List<Integer> getAllstationId() {
		return stationdao.getAllstationId();
	}


	@Override
	public Station stationLogin(int stationId, String stationPassword) {
		return stationdao.stationLogin(stationId, stationPassword);
	}


	@Override
	public List<Station> searchStation(int stationId) {
		return stationdao.searchStation(stationId);
	}


	@Override
	public Object getStationId(String stationLoc) {
		return stationdao.getstationId(stationLoc);
	}

}
