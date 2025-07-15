package com.imad.medialibrary.Services;

import com.imad.medialibrary.model.entities.MediaFile;
import org.springframework.web.multipart.MultipartFile;

public interface MediaService {
    MediaFile uploadMedia(MultipartFile file);
    MediaFile getById(Long id);
}
