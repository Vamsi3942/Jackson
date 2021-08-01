package in.ashokit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXmlConverter 
{
	public static void main(String[] args) throws JAXBException {
		Product p=new Product();
		p.setProductId(101);
		p.setProductName("Laptop");
		p.setProductPrice(42000.00);
		
		/**
		 *  Converting Java Object To Xml Format
		 */
		
		JAXBContext context=JAXBContext.newInstance(Product.class);
		
		Marshaller marshaller = context.createMarshaller();
		
		marshaller.marshal(p, System.out);
	}
}
