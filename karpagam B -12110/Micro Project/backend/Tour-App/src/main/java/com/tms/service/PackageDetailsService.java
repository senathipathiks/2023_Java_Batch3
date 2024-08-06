package com.tms.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.tms.bean.PackageDetails;

public interface PackageDetailsService {

	public List<PackageDetails> getPackageDetails();

	public PackageDetails find(int packageId);

	public List<Integer> getPackageDetailsIdlist();

	public PackageDetails regPack(PackageDetails pack, MultipartFile image) throws IOException;

	public PackageDetails updateProject(PackageDetails pack, MultipartFile image) throws IOException;

	public boolean deletePackage(int packageId);

	public List<PackageDetails> getDestination(String destinationPlace);

}
