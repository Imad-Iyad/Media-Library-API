package com.imad.medialibrary.model.entities;

import com.imad.medialibrary.model.entities.enums.MediaType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "media_files")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MediaFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    @Enumerated(EnumType.STRING)
    private MediaType fileType;

    private Long fileSize; // in bytes

    private String filePath;

    private LocalDateTime uploadDate;
}
