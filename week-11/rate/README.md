# RateMyMentor

We are going to create the base of our very own mentor rating website where
students will be able to evaluate their mentors anonymously.

**Please read the whole description in order to understand how the application
is supposed to work.**

## `GET /`
![](assets/index.png)

- The main page should be rendered
- It should list the mentors that are already in the database as links
- The mentor links should point to `GET /mentor/{id}`
- To be able to extend the list of mentors we can rate, we should include a form
  on the main page as well
- The form should contain:
  - One input field with label
  - One drop-down menu with the following values: `Tiptop`, `Roboto`, `Really`
    and `Seadog`
- The form should be submitted to `POST /mentor`

## `POST /mentor`
- Save the mentor in the database
- Redirect to the page with the evaluation form of the given mentor
  `GET /mentor/{id}`

## `GET /mentor/{id}`
![](assets/rating.png)

- The page should render the details of the mentor that is specified in the path
- It should include:
  - The name of the mentor
  - Which Rueppellii class he/she belongs to
- In case the mentor with the given ID does not exist, the application should
  render a simple error page

## `PUT /api/mentors/{mentorId}`
- This endpoint should update the mentor specified in `mentorId`
- The name and class should be in the request's body in JSON format, this is how
  we will be able to modify its values
  ```json
  {
    "name": "Gabor",
    "className": "Tiptop"
  }
  ```
- The class must be one of the following values: `Tiptop`, `Roboto`, `Really`
    and `Seadog` otherwise the application should respond with `400` status code
- In case no mentor belongs to a given `mentorId`, the application must respond
  with `404` status code

## `DELETE /api/mentors/{mentorId}`
- This endpoint should delete the mentor specified in `mentorId`
- In case no mentor belongs to a given `mentorId`, the application must respond
  with `404` status code

## Question time
- What is the difference between a primary key and a foreign key in a database?
- What is the difference between unit and integration testing?

### Good luck, we still believe in you! :muscle: :green_heart:
