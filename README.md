# HireVortex 🚀

A full-stack job listing application built with React frontend and Spring Boot backend, integrated with MongoDB for data persistence.

## 📋 Overview

HireVortex is a modern job listing platform that allows users to browse, create, and manage job postings. The application features a responsive React frontend with Material-UI components and a robust Spring Boot backend with MongoDB integration.

## 🏗️ Architecture

```
HireVortex/
├── frontend/           # React Application
│   ├── src/
│   │   ├── pages/     # React pages (Home, Dashboard, Feed, Create)
│   │   ├── App.js     # Main App component
│   │   └── index.js   # Entry point
│   ├── public/        # Static assets
│   └── package.json   # Dependencies & scripts
│
├── backend/           # Spring Boot Application
│   ├── src/main/java/com/ashray/joblisting/
│   │   ├── controller/    # REST Controllers
│   │   ├── model/        # Data models
│   │   ├── repository/   # Data access layer
│   │   └── JoblistingApplication.java
│   ├── pom.xml           # Maven dependencies
│   └── application.properties
│
└── README.md
```

## 🛠️ Technology Stack

### Frontend

- **React 18.2.0** - UI Library
- **Material-UI (MUI)** - Component Library
- **React Router DOM** - Client-side routing
- **Axios** - HTTP client for API calls
- **JSON Server** - Mock API server for development

### Backend

- **Spring Boot 3.5.3** - Java framework
- **Java 17** - Programming language
- **MongoDB** - NoSQL database
- **Maven** - Build tool

## 🚀 Features

- **Job Listings**: Browse and search through available job postings
- **Job Creation**: Create new job listings with detailed information
- **Dashboard**: Manage and view job statistics
- **Responsive Design**: Mobile-friendly interface
- **REST API**: Well-structured backend API endpoints

## 📦 Installation & Setup

### Prerequisites

- Node.js (v14 or higher)
- Java 17 or higher
- MongoDB
- Maven

### Frontend Setup

```bash
# Navigate to frontend directory
cd frontend

# Install dependencies
npm install

# Start the development server
npm start
```

The frontend will be available at `http://localhost:3000`

### Backend Setup

```bash
# Navigate to backend directory
cd backend

# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run
```

The backend API will be available at `http://localhost:8080`

### Database Setup

1. Install MongoDB locally or use MongoDB Atlas
2. Update the `application.properties` file with your MongoDB connection string
3. The application will automatically create the required collections

## 🔧 Development

### Frontend Development

```bash
cd frontend
npm start          # Start development server
npm run build      # Build for production
npm test           # Run tests
```

### Backend Development

```bash
cd backend
./mvnw spring-boot:run    # Run the application
./mvnw test              # Run tests
./mvnw clean package     # Build JAR file
```

## 📡 API Endpoints

The backend provides RESTful API endpoints for:

- `GET /posts` - Retrieve all job listings
- `POST /posts` - Create a new job listing
- `GET /posts/{id}` - Get specific job listing
- `PUT /posts/{id}` - Update job listing
- `DELETE /posts/{id}` - Delete job listing
- `GET /posts/search/{text}` - Search job listings
