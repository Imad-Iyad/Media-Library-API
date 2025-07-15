package com.imad.medialibrary.repositories;

import com.imad.medialibrary.model.entities.MediaFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaFileRepository extends JpaRepository<MediaFile, Long> {
}
