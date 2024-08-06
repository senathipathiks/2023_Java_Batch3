package com.tms.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tms.bean.PackageDetails;
import com.tms.repository.PackageDetailsDaoImpl;
import com.tms.repository.PackageDetailsdao;

@RestController
@CrossOrigin("*")
public class PackageDetailsController extends PackageDetailsDaoImpl {

	@Autowired
	PackageDetailsdao Packagedao;

	// to insert the data
//	@PostMapping("/doPackageDetailsInsert")
//	public PackageDetails insertPackageDetails(@RequestBody PackageDetails newPackageDetails) {
//		return Packagedao.insertPackageDetails(newPackageDetails);
//
//	}

	// to get all the data from the database
	@GetMapping("/getAllPackageDetailsList")
	public List<PackageDetails> getPackageDetails() {
		return Packagedao.getPackageDetails();
	}

	// get by id
	@GetMapping("/GetId/{packageId}")
	public PackageDetails find(@PathVariable("packageId") int packageId) {
		return Packagedao.find(packageId);
	}

	// to get all the Id
	@GetMapping("/getPackageDetailsIdList")
	public List<Integer> getPackageDetailsIdlist() {
		return Packagedao.getPackageDetailsIdlist();
	}

	@PostMapping("/doPackageDetailsInsert")
	public PackageDetails regPack(@RequestParam("packageName") String packageName,
			@RequestParam("destinationPlace") String destinationPlace, @RequestParam("price") String price,
			@RequestParam("description") String description, @RequestParam("duration") String duration,
			@RequestParam("packageType") String packageType, @RequestParam("travelMode") String travelMode,
			@RequestParam("personsAlllowed") String personsAlllowed, @RequestParam("destImage") MultipartFile image)
			throws IOException {

		PackageDetails packentity = new PackageDetails();
		packentity.setPackageName(packageName);

		packentity.setDestinationPlace(destinationPlace);
		packentity.setPrice(price);
		packentity.setDescription(description);
		packentity.setDuration(duration);

		packentity.setPackageType(packageType);
		packentity.setTravelMode(travelMode);
		packentity.setPersonsAlllowed(personsAlllowed);

		packentity.setDestImage(image.getBytes());

		System.out.println(packentity);
		return Packagedao.regPack(packentity, image);

	}

}
