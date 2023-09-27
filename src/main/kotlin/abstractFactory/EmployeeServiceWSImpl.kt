package abstractFactory

class EmployeeServiceWSImpl: IEmployeeService {
    private val employees = listOf("SOA-Maria", "SOA-Rosalia", "SOA-Liliana")
    fun getEmployee(): List<String> {
        return this.employees
    }
}