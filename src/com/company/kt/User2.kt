package com.company.kt


class User2 {

    var Name: String? = null

    var Number: Int = 0

    inner class InnerA {
        internal var a: Int = 0
        internal var s: String? = null
        internal var ss: Short = 0
    }

    class InnerB {
        internal var a: Int = 0
        internal var s: String? = null
        internal var ss: Short = 0
    }
}

internal class Test {

    var Name: String? = null

    var Number: Int = 0

    inner class InnerC {
        internal var a: Int = 0
        internal var s: String? = null
        internal var ss: Short = 0
    }

    class InnerB {
        internal var a: Int = 0
        internal var s: String? = null
        internal var ss: Short = 0
    }
}