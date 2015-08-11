### FishBrain Catches Master/Detail

The goal of this project is to assess Android development skills. It is designed to be challenging, and evaluate all aspects of development.

- Project Name: FIBCatches
- Project Goal: Creating a simplified version of the FishBrain app that just includes a simplified catches master/detail view.
- Technology: Java
- Deliverables: The solution should be sent using the greenhouse.io link that will be provided during the interview process.

**Mockups**: https://s3-eu-west-1.amazonaws.com/fishbrain/misc/Mobile+task.jpg

**Description**: Rebuild the catches view from the current Fishbrain app with filters in a master/detail fashion. When opening the catch you should display some basic data and the full picture. Please skip the date/weight/length filters

**API to consume**: http://rutilus.fishbrain.com is our production REST JSON API, and since some endpoints are publicly available we can use them for this assignment.

The API has the concept of verbosity. When requesting a specific resource we can specify the amount of details we want to receive. It is easiest to play around with multiple levels of verbosity and see the output.

**Example querying of the API:**

- GET paged catches - https://rutilus.fishbrain.com/catches?page=3
- GET specific catch - https://rutilus.fishbrain.com/catches/81?verbosity=3
- GET Sorting the previous results by the property id in descending order  https://rutilus.fishbrain.com/catches?page=3&q[s]=id+desc 
- GET Filtering by specific parameter - https://rutilus.fishbrain.com/catches/81?verbosity=3&q[“nickname”]=Mathias


**Guidelines**

The solution needs to contain tests and the design/organization of the application code should be production ready. 

Feel free to use the API level that you feel more confortable and any library that helps.

The application has to be runnable and working without major issues.

Ask any questions related to the implementation by sending an email to victor@fishbrain.com or niklas@fishbrain.com, but stackoverflow and google are your first stop for any obvious questions.

**What is this?**

This repo contains the job assignment for potential Android developers at Fishbrain, you can apply for a job at: jobs@fishbrain.com


