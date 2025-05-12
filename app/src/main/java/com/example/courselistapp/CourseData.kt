package com.example.courselistapp

object CourseData {
    val courses = listOf(
        Course(
            id = 1,
            title = "Introduction to Computer Science",
            code = "CS101",
            creditHours = 4,
            description = "Fundamentals of computer science and programming",
            prerequisites = "None"
        ),
        Course(
            id = 2,
            title = "Data Structures",
            code = "CS201",
            creditHours = 4,
            description = "Study of fundamental data structures and algorithms",
            prerequisites = "CS101"
        ),
        Course(
            id = 3,
            title = "Mobile App Development",
            code = "CS301",
            creditHours = 3,
            description = "Building mobile applications for Android platform",
            prerequisites = "CS201"
        ),
        // Add more courses as needed
    )
}
