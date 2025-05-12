package com.example.courselistapp

data class Course(
    val id: Int,
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)