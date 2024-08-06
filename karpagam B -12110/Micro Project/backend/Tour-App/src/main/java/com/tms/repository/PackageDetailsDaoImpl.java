package com.tms.repository;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import com.tms.bean.PackageDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class PackageDetailsDaoImpl implements PackageDetailsdao {

	@Autowired
	EntityManager entityMan;

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
		return q.getResultList();
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

	public boolean deletePackageDetails(int packageId) {
		Query query = entityMan.createQuery("DELETE PackageDetails p WHERE p.packageId= :packageId");
		query.setParameter("packageId", packageId);
		query.executeUpdate();
		return true;
	}

	@Override
	public PackageDetails updateProject(PackageDetails pack, MultipartFile image) throws IOException {
		try {
			PackageDetails packagedetails = new PackageDetails();
			packagedetails.setPackageId(pack.getPackageId());
			packagedetails.setPackageName(pack.getPackageName());
			packagedetails.setDestinationPlace(pack.getDestinationPlace());
			packagedetails.setPrice(pack.getPrice());
			packagedetails.setDescription(pack.getDescription());
			packagedetails.setDuration(pack.getDuration());
			packagedetails.setPackageType(pack.getPackageType());
			packagedetails.setTravelMode(pack.getTravelMode());
			packagedetails.setPersonsAlllowed(pack.getPersonsAlllowed());
			packagedetails.setDestImage(image.getBytes());
			entityMan.merge(packagedetails);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deletePackage(int packageId) {
		Query query = entityMan.createQuery("DELETE PackageDetails p WHERE p.packageId = :packageId");
		query.setParameter("packageId", packageId);
		query.executeUpdate();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PackageDetails> getDestination(String destinationPlace) {
		Query query = entityMan.createQuery(" from PackageDetails p WHERE p.destinationPlace = :destinationPlace");
		query.setParameter("destinationPlace", destinationPlace);
		return query.getResultList();

	}

}
