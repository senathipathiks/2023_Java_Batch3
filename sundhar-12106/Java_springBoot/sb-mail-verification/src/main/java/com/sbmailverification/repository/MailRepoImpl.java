package com.sbmailverification.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sbmailverification.entity.Mail;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository
public class MailRepoImpl implements MailRepo {

	@Autowired
	EntityManager entityManager;

	public MailRepoImpl() {

	}

	public MailRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public boolean saveMail(Mail mail) {
		boolean result = true;

		try {
			entityManager.persist(mail);
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
			throw new IllegalAccessError();
		} finally {
			entityManager.close();
		}

		return result;
	}

}
