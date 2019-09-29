# PerfilTicProject

Estructura de Microservicios utilizando el framework SpringBoot, sin frontend

Los servicios:

  *add-category-service (localhost:8081/cat/{atributos de la categoria a crear})
  *category-catalog-service (localhost:8082/cat/)
  *add-prodcut-service (localhost:8083/prod/{atributos del producto a crear})
  *product-catalog-service (localhost:8084/prod/)
  *price-converter-service (localhost:8085/price/{cantidad de COP a convertir})


Son los que alcance a Trabajar, se pueden descargar y ejecutar como SpringBoot project, y si se dirige a la URL localhost se pueden 
ver trabajando

{atributos de la categoria a crear}
                          /cat/categoryName-categoryPhoto-categoryFather 
                          /cat/categoryName-categoryPhoto


{atributos del producto a crear}:
                        /prod/prodName-prodDesc-prodWeirgt-prodPrice-prodCategory-prodPhoto  
		  	/prod/prodName-prodDesc-prodWeirgt-prodPrice-prodCategory
			/prod/prodName-prodDesc-prodWeirgt-prodPrice
