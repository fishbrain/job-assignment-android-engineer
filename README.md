### Fishbrain Assignment

The goal of this project is to assess Android development skills. It is designed to be challenging, and evaluate all aspects of development.

- **Project Name:** Fishbrain Assignment
- **Project Goal:** Creating a simplified version of the Fishbrain app that just includes a simple catches list.
- **Technology:** Java
- **Deliverables:** The solution should be sent using the greenhouse.io link that will be provided during the interview process. 

**Mockups**: [TBD]

**Description**: Create a list with the catches the user fetches from our Rutilus backend.
The user should be able to remove the catches he/she doesn't like.

**Some UI guidelines**:
The catch list item can have the following information:
- User's profile image
- *Johan* caught *a Pike* in *Trekanten* yesterday. All the italic can be clickable
- Image with description
- Like button

Don't restrict yourself by the guidelines though, feel free to be creative and implement the UI the way you prefer!


**API to consume**: The networking and parsing for catches is already implemented for you but here is some information regarding the API, in case you want to edit this part!

http://rutilus.fishbrain.com is our production REST JSON API, and since some endpoints are publicly available we can use them for this assignment.

The API has the concept of verbosity. When requesting a specific resource we can specify the amount of details we want to receive. It is easiest to play around with multiple levels of verbosity and see the output.

**Example querying of the API:**
- Get paged catches - https://rutilus.fishbrain.com/catches?page=3
- Get specific catch - https://rutilus.fishbrain.com/catches/81?verbosity=3
- Filtering by specific parameter - https://rutilus.fishbrain.com/catches/81?verbosity=3&q[species_id_eq]=258
- supported filters: species_id_eq, weight_lt, weight_gt, owner_id_eq, description_cont and more.


**General Guidelines**

The solution needs to contain tests and the design/structure of the application code should be production ready.

Feel free to use the API level that you feel more comfortable with and any library that helps.

The application has to be runnable and working without major issues.

Include a readme file explaining potential challenges you faced and issues you met during the assignment.

Ask any questions related to the implementation by sending an email to dimitris@fishbrain.com or niklas@fishbrain.com, but Stack Overflow and Google are your first stops for any obvious questions.

**What is this?**

This repo contains the job assignment for potential Android developers at Fishbrain, you can apply for a job at: jobs@fishbrain.com

