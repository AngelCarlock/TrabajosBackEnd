package abstractFactory

import abstractFactory.EmployeeServiceWSImpl
import abstractFactory.IEmployeeService
import abstractFactory.IProductService
import abstractFactory.IServiceStackAbstractFactory

class WSServiceStackImpl: IServiceStackAbstractFactory {
    override fun getEmployeeService(): IEmployeeService = EmployeeServiceWSImpl()
    override fun getProductsService(): IProductService = ProductServiceWSImpl()
}