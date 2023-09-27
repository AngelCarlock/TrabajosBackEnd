package abstractFactory

class RestServiceStackImpl: IServiceStackAbstractFactory {
    override fun getProductsService(): IProductService = ProductServiceRestImpl()

    override fun getEmployeeService(): IEmployeeService= EmployeeServiceRestImpl()
}