package com.nerojust.conference_session.repositories;

import com.nerojust.conference_session.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
