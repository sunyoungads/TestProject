package com.test.project.utils

import com.test.project.data.model.Person

object PersonProvider {
    fun getPersonA(): Person {
        return Person(
            id = 1,
            name = "Person A",
            age = 28,
            email = "person.a@example.com",
            phoneNumber = "010-1234-5678",
            address = "123 Alpha Street, Seoul",
            isMarried = false
        )
    }

    fun getPersonB(): Person {
        return Person(
            id = 2,
            name = "Person B",
            age = 35,
            email = "person.b@example.com",
            phoneNumber = "010-9876-5432",
            address = "456 Beta Road, Busan",
            isMarried = true
        )
    }
}
