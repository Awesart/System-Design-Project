# D&D Character API + Auth - Scalable System Design Project

## Goal:
### Why am I making this project?
-   I want a strong portfolio project and a good introduction to system design and backend systems.
### Who is this project for?
- For me to learn and also for future employers to be able to look at.
### What is going to make it valuable?
- Later development especially the concept of scaling it up on an AWS bucket as a backend.  And further scaling it up to create a strong portfolio project.

## User Functionality
### Features:
#### Backend API Authentication Week 1
- Login/Logout and stay logged in.
- Interact with an api endpoint to be able to retrieve data. Specifically DnD character information. 
#### Authorization and Background Workers Week 2
- Add user roles like user and admin.
- Enforce job ownership on every read, cancel and result endpoint.
- Add admin only optional endpoints.
- Be able to access jobs asynchronously outside of HTTP requests.
#### Rabbit MQ + Multiple Workers WIP Week 3
- To be updated in the future once we reach past the first two sprints.

## Data Models:
### Define Data we need:
#### Users
- Users can have multiple characters but a character can only be defined with one user.
#### Characters
- Within each character there will be a set of options that are hard-set that can also form their own table or data relationship to the character sheet.
#### Graph: Add this in the future
- ….

## Nail an MVP	 (Minimum Viable Product)
- Create a character
- Update a character
- Delete a character

## Future of the Project?
- A few months of the project probably or hopefully just 1-2 months in order to understand scaling.
- If interesting enough could scale it up to be a genuine DnD tool application.

## Architecture of the Project
- Barebones REACT frontend
- Spring Boot REST API Backend ← Main focus of the project.
- PostGre SQL Database
