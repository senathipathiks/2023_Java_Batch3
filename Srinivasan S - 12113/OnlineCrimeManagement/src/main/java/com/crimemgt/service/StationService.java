package com.crimemgt.service;

import java.util.List;

import com.crimemgt.dto.StationDTO;
import com.crimemgt.entity.Station;

public interface StationService {

	public Station addStation(Station station);

	public List<StationDTO> getAllstations();
	
	public List<Integer> getAllstationId();
	
	public Station stationLogin(int stationId,String stationPassword);
	
	public List<Station> searchStation(int stationId);
	
	public Object getStationId(String stationLoc);


}
