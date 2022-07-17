This java microservice will provide a graphql endpoint for queries to the students and courses database tables. 
Clone this repo, open it in your java ide and run it. 
You can test your queries here: http://localhost:8080/graphiql

Queries:

{
  getStudentById(id: 1) {
    student_id
    first_name
    last_name
    email
    age
    dob
  }
}

{
  getAllStudents{
    student_id
    first_name
    last_name
    email
    age
    dob
  }
}

{
  test
}

{
  getCourseById(id: 1){
    course_id
    course_name
    description
    start
    finish
  }
}

{
  getAllCourses{
    course_id
    course_name
    description
    start
    finish
  }
}