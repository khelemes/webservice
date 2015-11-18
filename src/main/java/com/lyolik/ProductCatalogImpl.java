package com.lyolik;

//import javax.jws.WebService;
//import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leonid.khelemes on 29.10.2015.
 */
@WebService(name = "test")
public class ProductCatalogImpl implements ProductCatalog{

    public List<String> getProductCategories(){
        List<String> categories = new ArrayList<String>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }
}
