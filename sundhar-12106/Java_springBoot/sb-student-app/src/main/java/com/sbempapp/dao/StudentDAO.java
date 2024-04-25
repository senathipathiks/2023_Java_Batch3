package com.sbempapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.sbempapp.model.Student;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Repository
public class StudentDAO {

	StudentRepo repo;

	// save
	public String saveStudentPicture(Student student) {

		repo.save(student);
		return "success";

	}

	public ResponseEntity<byte[]> getImage(int id) {

		Student s = repo.findById(id).get();
		byte[] image = s.getPicture();
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.IMAGE_PNG).body(image);

	}

	public List<byte[]> getAllImage() {

		List<byte[]> ImageData = repo.findAllByPicture();

		return ImageData;
	}

}
