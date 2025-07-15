
📁 Media Library API

A robust and scalable Spring Boot application for managing media files — upload, store, stream, and download images, videos, and audio.

🚀 Features

  - Upload media files using multipart/form-data
  - Save files on local disk storage (uploads/media/)
  - Store detailed metadata in the database (filename, size, type, path, upload date)
  - Stream media files by ID with correct MIME types
  - Force download files by ID with proper HTTP headers
  - Retrieve a list of all uploaded media files

💾 File Storage

   -> Media files saved in local directory: uploads/media/ 
   
   -> File metadata persisted in relational database (H2, MySQL, etc.)
   
🛠 Tech Stack

  - Java 17
  - Spring Boot 3
  - Spring Web
  - Spring Data JPA
  - Lombok
  - H2 or MySQL database
  - Swagger

📝 Implementation Notes

  - File uploads handled via Spring’s MultipartFile and saved using Files.copy()
  - Media streaming and downloads served using Spring’s Resource abstraction and UrlResource
  - Content types detected dynamically via Files.probeContentType() for proper response headers

💡 Future Improvements

- Add support for cloud storage (AWS S3, Azure Blob Storage, etc.)
- Add pagination and filtering for file listing
- Implement file type validation and size limits
- Add authentication & authorization for upload/download APIs
