package com.tms.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tms.bean.PackageDetails;
import com.tms.service.PackageDetailsService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class PackageDetailsController {

	@Autowired
	PackageDetailsService packservice;

	// to get all the data from the database
	@GetMapping("/getAllPackageDetailsList")
	public List<PackageDetails> getPackageDetails() {
		return packservice.getPackageDetails();
	}

	// get by id
	@GetMapping("/GetPackageId/{packageId}")
	public PackageDetails find(@PathVariable("packageId") int packageId) {
		return packservice.find(packageId);
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

		return packservice.regPack(packentity, image);

	}

	@PutMapping("/doPackageDetailsUpdate")
	public PackageDetails updatePack(@RequestParam("packageId") int packageId,
			@RequestParam("packageName") String packageName, @RequestParam("destinationPlace") String destinationPlace,
			@RequestParam("price") String price, @RequestParam("description") String description,
			@RequestParam("duration") String duration, @RequestParam("packageType") String packageType,
			@RequestParam("travelMode") String travelMode, @RequestParam("personsAlllowed") String personsAlllowed,
			@RequestParam("destImage") MultipartFile image) throws IOException {

		PackageDetails packentity = new PackageDetails();
		packentity.setPackageId(packageId);
		packentity.setPackageName(packageName);
		packentity.setDestinationPlace(destinationPlace);
		packentity.setPrice(price);
		packentity.setDescription(description);
		packentity.setDuration(duration);

		packentity.setPackageType(packageType);
		packentity.setTravelMode(travelMode);
		packentity.setPersonsAlllowed(personsAlllowed);

		packentity.setDestImage(image.getBytes());

		return packservice.updateProject(packentity, image);

	}

	@DeleteMapping("/deletePackage/{packageId}")
	public boolean deletePackage(@PathVariable("packageId") int packageId) {
		return packservice.deletePackage(packageId);

	}

}
