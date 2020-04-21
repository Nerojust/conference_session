package com.nerojust.conference_session.repositories;

import com.nerojust.conference_session.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
