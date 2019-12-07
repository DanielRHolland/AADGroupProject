package com.eksi.storeapi.blimpl;

import com.eksi.storeapi.bl.ProductsBl;
import com.eksi.storeapi.datatypes.ProductInformation;

public class ProductsBlImpl implements ProductsBl {
    @Override
    public int getQuantity(String id) {
        return 10;
    }
    @Override
    public ProductInformation getProduct(final String id) {
      return new ProductInformation(id);
    }
}
