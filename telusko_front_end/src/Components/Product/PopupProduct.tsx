import { useDispatch, useSelector } from "react-redux";
import type { RootState } from "../../app/store";
import { addProduct } from "../../features/products/Products";
import { useState } from "react";
import type { ProductWithQuantityProp } from "../../Props/productProp";
import { setEditProduct } from "../../features/products/EditProduct";


const PopupProduct=()=>{
    
    const clickedProduct = useSelector((state: RootState) => state.editProduct);
     const dispatch=useDispatch()

    const [quantity,setQuantity]=useState<number>(clickedProduct.quantity)

    const handleCancel=()=>{
            dispatch(setEditProduct({
                    id:"",
                    name:"",
                    category:"",
                    brand:"",
                    unitPrice:0,      
                    quantity:0
                    }))
    }

    const handleSave=()=>{
    const productWithQuantity: ProductWithQuantityProp = {
          id:clickedProduct.id,
          name:clickedProduct.name,
          category:clickedProduct.category,
          brand:clickedProduct.brand,
          unitPrice:clickedProduct.unitPrice,      
          quantity:quantity
        };
        dispatch(addProduct(productWithQuantity))
        dispatch(setEditProduct({
          id:"",
          name:"",
          category:"",
          brand:"",
          unitPrice:0,      
          quantity:0
        }))
        

    }

    return<>
    <div className=" border border-gray-200 rounded-lg p-4 shadow-sm bg-light ">
      <ul className="list-unstyled p-2">
        <li>
          <span className="font-medium text-gray-500">ID:</span>
          <span className="text-gray-800">{clickedProduct.id}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Name:</span>
          <span className="text-gray-800">{clickedProduct.name}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Unit Price:</span>
          <span className="text-gray-800">${clickedProduct.unitPrice.toFixed(2)}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Brand:</span>
          <span className="text-gray-800">{clickedProduct.brand}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Category:</span>
          <span className="text-gray-800">{clickedProduct.category}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Quantity:</span>
          <input type="number" className="form-control" onChange={(e)=>setQuantity(Number(e.target.value))} value={quantity}/>
        </li>
      </ul>
      <div className="d-flex flex-row justify-content-between">
        <button className="btn btn-success"  onClick={()=>handleSave()} >save</button>
        <button className="btn btn-success"  onClick={()=>handleCancel()} >Cancel</button>
      </div>
      
    </div>
    
    
    </>


}

export default  PopupProduct;

