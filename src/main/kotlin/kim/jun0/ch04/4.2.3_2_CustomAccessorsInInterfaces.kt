package kim.jun0.ch04.custom_accessors_in_interfaces

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}

