package kim.jun0.ch04.base_class_initialization

open class User(val nickname: String)

class TwitterUser(nickname: String) : User(nickname)

open class Button

class RadioButton : Button()