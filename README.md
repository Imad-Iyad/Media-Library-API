# MEDIA LIBRARY API

A robust and scalable Spring Boot application for managing media files — upload, store, stream, and download images, videos, and audio.

![Last Commit](https://img.shields.io/badge/last%20commit-july-blue) 
![Java](https://img.shields.io/badge/java-100%25-blue) 
![Languages](https://img.shields.io/badge/languages-1-blue)

Built with the tools and technologies:

![Spring](https://img.shields.io/badge/Spring-green?logo=spring) 
![Docker](https://img.shields.io/badge/Docker-blue?logo=docker) 
![Swagger](https://img.shields.io/badge/Swagger-darkgreen?logo=swagger) 
![JPA](https://img.shields.io/badge/Spring%20Data%20JPA-orange) 
![Lombok](https://img.shields.io/badge/Lombok-red) 
![Database](https://img.shields.io/badge/H2%20%2F%20MySQL-lightblue)

---

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [File Storage](#file-storage)
- [Tech Stack](#tech-stack)
- [Implementation Notes](#implementation-notes)
- [Future Improvements](#future-improvements)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Testing](#testing)

---

## Overview
**Media Library API** is a backend solution designed to manage media content efficiently.  
It provides APIs to upload, store, stream, and download media files while ensuring proper metadata storage and flexible deployment options.

---

## Features
- 📤 **Upload Media Files** using `multipart/form-data`
- 💾 **Save Files** on local disk storage (`uploads/media/`)
- 🗂️ **Metadata Storage** in database (filename, size, type, path, upload date)
- 🎥 **Stream Media Files** by ID with correct MIME types
- 📥 **Force Download** by ID with proper HTTP headers
- 📃 **Retrieve File List** of all uploaded media

---

## File Storage
- Media files saved in:  
  ```
  uploads/media/
  ```
- File metadata persisted in relational databases: **H2, MySQL, etc.**

---

## Tech Stack
- ☕ **Java 17**  
- 🌱 **Spring Boot 3**  
- 🌐 **Spring Web**  
- 🗄️ **Spring Data JPA**  
- 🛠️ **Lombok**  
- 🛢️ **H2 / MySQL Database**  
- 📖 **Swagger**  

---

## Implementation Notes
- 📂 File uploads handled via **Spring MultipartFile** → saved with `Files.copy()`
- 🎬 Streaming & downloads via **Spring Resource / UrlResource**
- 🧾 Content type detection using `Files.probeContentType()` for proper headers

---

## Future Improvements
- ☁️ Add **cloud storage support** (AWS S3, Azure Blob Storage, etc.)
- 📑 Add **pagination & filtering** for file listing
- ✅ Implement **file type validation & size limits**
- 🔐 Add **authentication & authorization** for upload/download APIs

---

## Getting Started

### Prerequisites
This project requires:

- **Programming Language:** Java 17  
- **Build Tool:** Maven  
- **Database:** H2 or MySQL  
- **Container Runtime:** Docker (optional)  

---

### Installation
Clone the repository and build:

```bash
git clone https://github.com/YourUsername/MediaLibraryAPI
cd MediaLibraryAPI
```

Build with **Maven**:
```bash
mvn install
```

Or build with **Docker**:
```bash
docker build -t media-library-api .
```

---

### Usage
Run with **Maven**:
```bash
mvn spring-boot:run
```

Run with **Docker**:
```bash
docker run -it media-library-api
```

---

### Testing
Work in progress 🚧
