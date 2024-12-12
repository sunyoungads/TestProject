package com.test.project.data.model

data class Person(
    val id: Int, // 고유 식별자
    val name: String, // 이름
    val age: Int, // 나이
    val email: String?, // 이메일 (null 가능)
    val phoneNumber: String?, // 전화번호 (null 가능)
    val address: String?, // 주소 (null 가능)
    val isMarried: Boolean // 결혼 여부
)
