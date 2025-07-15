package com.imad.medialibrary.Services.impl;

import com.imad.medialibrary.Services.FileStorageService;
import com.imad.medialibrary.Services.MediaService;
import com.imad.medialibrary.model.entities.MediaFile;
import com.imad.medialibrary.model.entities.enums.MediaType;
import com.imad.medialibrary.repositories.MediaFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MediaServiceImpl implements MediaService {

    private final FileStorageService fileStorageService;
    private final MediaFileRepository mediaFileRepository;

    @Override
    public MediaFile uploadMedia(MultipartFile file) {
        // حفظ الملف على السيرفر
        String filePath = fileStorageService.saveFile(file);

        // تحديد النوع من الامتداد
        String fileName = file.getOriginalFilename();
        MediaType type = determineMediaType(fileName);

        // إنشاء كائن MediaFile
        MediaFile media = MediaFile.builder()
                .fileName(fileName)
                .filePath(filePath)
                .fileSize(file.getSize())
                .fileType(type)
                .uploadDate(LocalDateTime.now())
                .build();

        return mediaFileRepository.save(media);
    }

    private MediaType determineMediaType(String fileName) {
                                                            // return the index of the last . (dot)
        String extension = fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase();
        return switch (extension) {
            case "jpg", "jpeg", "png", "webp" -> MediaType.IMAGE;
            case "mp4", "webm" -> MediaType.VIDEO;
            case "mp3", "aac" -> MediaType.AUDIO;
            default -> throw new IllegalArgumentException("Unsupported file type: " + extension);
        };
    }

    @Override
    public MediaFile getById(Long id) {
        return mediaFileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("File not found"));
    }

}
