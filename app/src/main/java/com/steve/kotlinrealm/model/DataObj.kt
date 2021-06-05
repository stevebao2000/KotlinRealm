package com.steve.realmkotlin.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import java.lang.RuntimeException

class DataObj : RealmObject() {

    @PrimaryKey
    @Required
    var id: Long? = null
        set(value) {
            if(this.id != null) {
                throw RuntimeException("id can not be changed")
            }
            field = value
        }

    var a = 0
    var b = 0
    private var amount = 0
    fun amountIncrese(increment: Int) {
        amount += increment
    }
}