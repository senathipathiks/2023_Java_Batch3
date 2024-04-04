package com.image.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.image.model.Image;
import com.image.repository.ImageRepository;
import com.image.util.ImageCompress;

@Service
public class ImageService {

	@Autowired
	private ImageRepository imageRepo;

	public String uploadImage(MultipartFile file) throws IOException {
		Image imageData = imageRepo.save(Image.builder().imageName(file.getOriginalFilename())
				.type(file.getContentType()).imageData((file.getBytes())).build());

		if (imageData != null) {
			return "File uploaded successfully : " + file.getOriginalFilename();
		}

		return null;
	}

	public byte[] downloadImage(String fileName) {
		Optional<Image> dwImage = imageRepo.findByImageName(fileName);
		byte[] images = ImageCompress.decompressImage(dwImage.get().getImageData());
		return images;
	}
	
	
	public List<byte[]> getAllimages() {
		return imageRepo.getimages();
	}

}
