package com.tms.repository;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.tms.bean.PackageDetails;

public interface PackageDetailsdao {

//	public PackageDetails insertPackageDetails(PackageDetails newPackageDetails);

	public List<PackageDetails> getPackageDetails();

	public PackageDetails find(int packageId);
	
	public List<Integer> getPackageDetailsIdlist();
	
	public PackageDetails regPack(PackageDetails pack, MultipartFile image)  throws IOException;


}
