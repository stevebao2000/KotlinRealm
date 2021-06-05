package com.steve.realmkotlin.model

// mimic sql query feather for non-sql
class DataQuery {
    val invalidValue = -1
    private var valueA = invalidValue
    private var valueB = invalidValue
    private var increment = 0

    fun updateQuery(data: DataObj) {
        if (valueA != invalidValue)
            data.a = valueA

        if (valueB != invalidValue)
            data.b = valueB

        if (increment > 0) {
            data.amountIncrese(increment)
        }
    }
}