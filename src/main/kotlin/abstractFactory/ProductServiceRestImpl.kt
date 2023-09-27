package abstractFactory

import abstractFactory.ApiRestProducts
import abstractFactory.IProductService

class ProductServiceRestImpl: IProductService {
    // private val products = listOf("REST-Teclado", "REST-Mouse", "REST-Monitor")
    override fun getProducts(): List<String> {
        //return this.products
        return ApiRestProducts.fetchAll()
    }

}