package com.company.kt


class A {

    var Name: String? = null

    var Number: Int = 0

    var str: String? = null

    inner class InnerAa {
        var a: Int = 0
        var s: String? = null
        var ss: Short = 0
    }

    class InnerAb {
        var a: Int = 0
        var s: String? = null
        var ss: Short = 0
    }

    data class InnerAc(
            var Name: String? = null,
            var Number: Int = 0,
            var str: String? = null
    )
}

class B {

    var Name: String? = null

    var Number: Int = 0

    var str: String? = null

    inner class InnerBa {
        var a: Int = 0
        var s: String? = null
        var ss: Short = 0
    }

    class InnerBb {
        var a: Int = 0
        var s: String? = null
        var ss: Short = 0
    }

    data class InnerBc(
            var Name: String? = null,
            var Number: Int = 0,
            var str: String? = null
    )
}

data class C(
        var Name: String? = null,
        var Number: Int = 0,
        var str: String? = null
)