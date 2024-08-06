package com.tms.repository;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.tms.bean.PackageDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class PackageDetailsDaoImpl implements PackageDetailsdao {

	@Autowired
	EntityManager entityMan;

//	@Override
//	public PackageDetails insertPackageDetails(PackageDetails newPackageDetails) {
//		entityMan.persist(newPackageDetails);
//		return newPackageDetails;
//	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PackageDetails> getPackageDetails() {
		return entityMan.createQuery("from PackageDetails").getResultList();

	}

	@Override
	public PackageDetails find(int packageId) {
		return entityMan.find(PackageDetails.class, packageId);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getPackageDetailsIdlist() {
		Query q = entityMan.createQuery("SELECT c.packageId FROM PackageDetails c");
		List<Integer> list = q.getResultList();
		return list;
	}

	@Override
	public PackageDetails regPack(PackageDetails pack, MultipartFile image) throws IOException {

		try {
			PackageDetails packentity = new PackageDetails();
			packentity.setPackageName(pack.getPackageName());
			packentity.setDestinationPlace(pack.getDestinationPlace());
			packentity.setPrice(pack.getPrice());
			packentity.setDescription(pack.getDescription());
			packentity.setDuration(pack.getDuration());
			packentity.setPackageType(pack.getPackageType());
			packentity.setTravelMode(pack.getTravelMode());
			packentity.setPersonsAlllowed(pack.getPersonsAlllowed());
			packentity.setDestImage(image.getBytes());
			entityMan.persist(packentity);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
