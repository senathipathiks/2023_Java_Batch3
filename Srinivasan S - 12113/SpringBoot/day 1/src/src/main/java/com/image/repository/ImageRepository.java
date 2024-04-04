package com.image.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.image.model.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {

	Optional<Image> findByImageName(String imageName);
	
	@Query("select i.imageData from Image i")
	List<byte[]> getimages();


}
