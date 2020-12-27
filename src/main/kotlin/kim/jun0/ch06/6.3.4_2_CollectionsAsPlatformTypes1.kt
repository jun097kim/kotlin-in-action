package kim.jun0.ch06.collections_as_platform_types_1

import kim.jun0.ch06.DataParser
import kim.jun0.ch06.Person

class PersonParser : DataParser<Person> {
    override fun parseData(input: String, output: MutableList<Person>, errors: MutableList<String?>) {
        // ...
    }
}