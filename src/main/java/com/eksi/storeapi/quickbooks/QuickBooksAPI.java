package com.eksi.storeapi.quickbooks;

public class QuickBooksAPI {
    private String BASE_QUICKBOOK_URL = "https://quickbooks.api.intuit.com";
    private String createPurchaseOrder = null;
    private String realmId = null;

    public String getCreatePurchaseOrder() {
        if (createPurchaseOrder == null) {
            createPurchaseOrder = "/v3/company/" + realmId + "/purchaseorder";
        }
        return createPurchaseOrder;
    }

//todo Check responsecode (should be 200)
}

/*
{
  "TotalAmt": 25.0,
  "Line": [
    {
      "DetailType": "ItemBasedExpenseLineDetail",
      "Amount": 25.0,
      "Id": "1",
      "ItemBasedExpenseLineDetail": {
        "ItemRef": {
          "name": "Garden Supplies",
          "value": "38"
        },
        "CustomerRef": {
          "name": "Cool Cars",
          "value": "3"
        },
        "Qty": 1,
        "TaxCodeRef": {
          "value": "NON"
        },
        "BillableStatus": "NotBillable",
        "UnitPrice": 25
      }
    }
  ],
  "APAccountRef": {
    "name": "Accounts Payable (A/P)",
    "value": "33"
  },
  "VendorRef": {
    "name": "Hicks Hardware",
    "value": "41"
  },
  "ShipTo": {
    "name": "Jeff's Jalopies",
    "value": "12"
  }
}
 */