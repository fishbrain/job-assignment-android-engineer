### Fishbrain Catches List

The goal of this project is to assess Android development skills. It is designed to be challenging, and evaluate all aspects of development.

- **Project Name:** Fishbrain Catches List
- **Project Goal:** Creating a simplified version of the Fishbrain app that just includes a simple catches list.
- **Technology:** Java
- **Deliverables:** The solution should be sent using the greenhouse.io link that will be provided during the interview process. 

**Mockups**: -

**Description**: Create a list with the catches the user fetches from our Rutilus backend.
The user should be able to remove the catches he/she doesn't like.

**Some UI guidelines**:

The catch list item can have the following information:
- User's profile image
- *Johan* caught *a Pike* in *Trekanten* yesterday. All the italic can be clickable
- Image with description
- Like button

Don't restrict yourself by the guidelines though, feel free to be creative and implement the UI the way you prefer!


**API to consume**:

The networking and parsing for catches is already implemented in the base project in this Git-repo repo but here is some useful background info.

http://rutilus.fishbrain.com is our production REST JSON API, and since some endpoints are publicly available we can use them for this assignment.

The API has the concept of verbosity. When requesting a specific resource we can specify the amount of details we want to receive. It is easiest to play around with multiple levels of verbosity and see the output.

**Example querying of the API:**

- Get paged catches - https://rutilus.fishbrain.com/catches?page=3
- Get specific catch - https://rutilus.fishbrain.com/catches/81?verbosity=3

**General Guidelines**

A base project is provided in this Git-repo as a starting point so you don't have to implement the networking yourself. However, if you'd prefer - feel free to create a project from scratch.

The solution needs to contain tests and the design/structure of the application code should be production ready.

Feel free to use the API level that you feel more comfortable with and any library that helps. Just be ready to explain the reasons behind your choices :)

The application has to be runnable and working without major issues.

Include a readme file explaining potential challenges you faced and issues you met during the assignment.

Ask any questions related to the implementation by sending an email to dimitris@fishbrain.com or niklas@fishbrain.com, but Stack Overflow and Google are your first stops for any obvious questions.

**What is this?**

This repo contains the job assignment for potential Android developers at Fishbrain, you can apply for a job at: jobs@fishbrain.com

