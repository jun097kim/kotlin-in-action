package kim.jun0.ch03.ex6_2_LocalFunctionsAndExtensions3

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(name, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()

    // user를 데이터베이스에 저장한다.
}

fun main() {
    saveUser(User(1, "", ""))
}