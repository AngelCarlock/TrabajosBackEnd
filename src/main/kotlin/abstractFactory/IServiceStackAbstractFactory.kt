package abstractFactory

import abstractFactory.IEmployeeService
import abstractFactory.IProductService

interface IServiceStackAbstractFactory {
    fun getEmployeeService() : IEmployeeService
    fun getProductsService(): IProductService
}