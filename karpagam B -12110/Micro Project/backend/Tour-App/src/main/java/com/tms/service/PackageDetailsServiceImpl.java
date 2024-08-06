package com.tms.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.tms.bean.PackageDetails;
import com.tms.repository.PackageDetailsdao;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PackageDetailsServiceImpl implements PackageDetailsService {

	@Autowired
	PackageDetailsdao packDao;

	@Override
	public List<PackageDetails> getPackageDetails() {
		return packDao.getPackageDetails();
	}

	@Override
	public PackageDetails find(int packageId) {
		return packDao.find(packageId);
	}

	@Override
	public List<Integer> getPackageDetailsIdlist() {
		return packDao.getPackageDetailsIdlist();
	}

	@Override
	public PackageDetails regPack(PackageDetails pack, MultipartFile image) throws IOException {
		return packDao.regPack(pack, image);
	}

	@Override
	public PackageDetails updateProject(PackageDetails pack, MultipartFile image) throws IOException {
		return packDao.updateProject(pack, image);
	}

	@Override
	public boolean deletePackage(int packageId) {
		return packDao.deletePackage(packageId);
	}

	@Override
	public List<PackageDetails> getDestination(String destinationPlace) {

		return packDao.getDestination(destinationPlace);
	}

}
