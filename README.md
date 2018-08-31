### Fishbrain Catches List

The goal of this project is to assess Android development skills. It is designed to be challenging, and evaluate all aspects of development.

- **Project Name:** Fishbrain Catches List
- **Project Goal:** Creating a simplified version of the Fishbrain app that just includes a simple catches list.
- **Technology:** Kotlin/Java
- **Deliverables:** The solution should be sent using the greenhouse.io link that will be provided during the interview process.

**Mockups**: -

**Description**: Rebuild the catches view from the current Fishbrain app with filters in a master/details fashion. When opening the catch you should display some basic data and the full picture. Please skip the date/weight/length filters.


**API to consume**:

The networking and parsing for catches is already implemented in the base project in this Git-repo repo but here is some useful background info.

http://rutilus-staging.fishbrain.com is our staging REST JSON API, and since some endpoints are publicly available we can use them for this assignment.

The API has the concept of verbosity. When requesting a specific resource we can specify the amount of details we want to receive. It is easiest to play around with multiple levels of verbosity and see the output.

**Example querying of the API:**

- Get paged catches - https://rutilus-staging.fishbrain.com/catches?page=3
- Get specific catch - https://rutilus.fishbrain.com/catches/81?verbosity=3

- Filter by specific parameter - https://rutilus.fishbrain.com/catches/81?verbosity=3&q[species_id_eq]=258&q[s]=created_at%20desc

- supported filters: sort `q[s]=created_at desc`, species `q[species_id_eq]=id`, weight `weight_lt`, `weight_gt`, and owner `owner_id_eq`.

**Guidelines**

A base project is provided in this Git-repo as a starting point so you don't have to implement the networking part yourself. However, if you want to you can create a project from scratch.

The design/structure of the application code should be **production ready** and **extensible**.
Unit tests are optional but more than welcome.

Feel free to use the API level that you feel more comfortable with and any library that helps. Just be ready to explain the reasons behind your choices :)

The application has to be runnable and working without major issues.

Include a readme file explaining potential challenges you faced and issues you met during the assignment.

Ask any questions related to the implementation by sending an email to dimitris@fishbrain.com or kien@fishbrain.com, but Stack Overflow and Google are your first stops for any obvious questions.


### Tips & Tricks

Please use `q[s]=created_at desc` to get the latest catches.

For the images in the JSON body you can use the last image of the array to get the best quality.


**What is this?**

This repo contains the job assignment for potential Android developers at Fishbrain, you can apply for a job at: jobs@fishbrain.com

### FAQ

**Can I use frameworks/libraries?**

Yes.

**How much time should I spend?**

Don't overdo the assignment. We think 8 hours should be enough.

**Kotlin or Java?**

You're allowed to use either
