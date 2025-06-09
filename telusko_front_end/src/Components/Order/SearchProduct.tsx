import { useDispatch, useSelector } from "react-redux"
import axiosInstance from "../../Api/axiosConfig";
import { useEffect, useState } from "react";
import type ProductProp from "../../Props/productProp";

import { addProduct } from "../../features/products/Products";
import type { ProductWithQuantityProp } from "../../Props/productProp";


const SearchProduct=()=>{

  const [productId, setProductId] = useState<string>("");
  const [quantity,setQuantity]  =useState<number>(1)
  const [err,setErr]=useState<String>("")

  const dispatch=useDispatch()

  const handleAdd=async ()=>{
      
      try {
        const productData: ProductProp = await searchProduct(productId);

        if(productData){

        const productWithQuantity: ProductWithQuantityProp = {
          id:productData.id,
          name:productData.name,
          category:productData.category,
          brand:productData.brand,
          unitPrice:productData.unitPrice,      
          quantity:quantity
        };
      

        dispatch(addProduct(productWithQuantity));
              console.log(productWithQuantity)
        setProductId("");
        setQuantity(1);
        
      }
     
      } catch (error) {
        
        console.error("Product not found", error);
      }
      }

    const searchProduct = async (id: string): Promise<ProductProp> => {
        const response = await axiosInstance.get<ProductProp>(`/product/${id}`, {
          headers: {
            Authorization: `Bearer ${localStorage.getItem("token")}`
          }
  });
  return response.data;
};


return <>
    <div className="row">
        <div className="col-10 m-3" >
          <label className="form-label">
              Enter product id:
          </label>      
          <input
            className="form-control "
            type="text"
            value={productId}
            onChange={(e) => setProductId(e.target.value)}
          />
             
              
             
        </div>
          
        <div className="col-10 m-3">
          <label className="form-label">
              Enter Quantity:
          </label>
          <div>
          <input
                className="form-control"
                type="number"
                value={quantity}
                onChange={(e) => setQuantity(Number(e.target.value))}
            />
          </div>
          
         
        </div>
        <div className="row ">
            <button className="btn btn-success col-md-4 m-3" onClick={()=>handleAdd()}>Add</button>
            <button className="btn btn-warning col-md-4  m-3">Delete</button>
            
        </div>
        

    </div>

    
    </>

}
export default SearchProduct