package factoryMethod

import java.sql.Connection

interface IDBAdapter {
    fun getConnection(): Connection?
}